package com.example.code_comp1786.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBConnection(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "mhike.db"
        const val DATABASE_VERSION = 1

        const val TABLE_HIKE = "hike"
        const val TABLE_OBSERVATION = "observation"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createHikeTable = """
            CREATE TABLE $TABLE_HIKE (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                name TEXT NOT NULL,
                location TEXT NOT NULL,
                date TEXT NOT NULL,
                parking TEXT NOT NULL,
                length REAL NOT NULL,
                difficulty TEXT NOT NULL,
                description TEXT,
                extra1 TEXT,
                extra2 TEXT
            );
        """.trimIndent()

        val createObservationTable = """
            CREATE TABLE $TABLE_OBSERVATION (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                hike_id INTEGER,
                observation TEXT NOT NULL,
                time TEXT NOT NULL,
                comment TEXT,
                FOREIGN KEY(hike_id) REFERENCES $TABLE_HIKE(id) ON DELETE CASCADE
            );
        """.trimIndent()

        db.execSQL(createHikeTable)
        db.execSQL(createObservationTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_OBSERVATION")
        db.execSQL("DROP TABLE IF EXISTS $TABLE_HIKE")
        onCreate(db)
    }

    // -------------------------
    // HÀM CRUD CHO BẢNG HIKES
    // -------------------------
    fun insertHike(
        name: String,
        location: String,
        date: String,
        parking: String,
        length: Double,
        difficulty: String,
        description: String?,
        extra1: String?,
        extra2: String?
    ): Long {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("name", name)
            put("location", location)
            put("date", date)
            put("parking", parking)
            put("length", length)
            put("difficulty", difficulty)
            put("description", description)
            put("extra1", extra1)
            put("extra2", extra2)
        }
        return db.insert(TABLE_HIKE, null, values)
    }

    fun getAllHikes(): Cursor {
        val db = readableDatabase
        return db.rawQuery("SELECT * FROM $TABLE_HIKE", null)
    }

    fun deleteHike(id: Int): Int {
        val db = writableDatabase
        return db.delete(TABLE_HIKE, "id=?", arrayOf(id.toString()))
    }

    fun deleteAllHikes(): Int {
        val db = writableDatabase
        return db.delete(TABLE_HIKE, null, null)
    }

    // -------------------------
    // HÀM CRUD CHO BẢNG OBSERVATION
    // -------------------------
    fun insertObservation(hikeId: Int, observation: String, time: String, comment: String?): Long {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("hike_id", hikeId)
            put("observation", observation)
            put("time", time)
            put("comment", comment)
        }
        return db.insert(TABLE_OBSERVATION, null, values)
    }

    fun getObservationsByHike(hikeId: Int): Cursor {
        val db = readableDatabase
        return db.rawQuery(
            "SELECT * FROM $TABLE_OBSERVATION WHERE hike_id = ?",
            arrayOf(hikeId.toString())
        )
    }

    fun deleteObservation(id: Int): Int {
        val db = writableDatabase
        return db.delete(TABLE_OBSERVATION, "id=?", arrayOf(id.toString()))
    }
}
