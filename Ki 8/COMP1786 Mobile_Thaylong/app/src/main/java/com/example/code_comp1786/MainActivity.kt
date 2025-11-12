package com.example.code_comp1786

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.code_comp1786.database.DBConnection

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // --- Test database ---
        val db = DBConnection(this)

        val result = db.insertHike(
            name = "Mount Snowdon",
            location = "Wales",
            date = "2025-11-12",
            parking = "Yes",
            length = 10.5,
            difficulty = "Hard",
            description = "Test insert from MainActivity",
            extra1 = "Weather: Sunny",
            extra2 = "Group size: 4"
        )

        if (result > 0) {
            println("✅ Insert hike thành công! ID = $result")
        } else {
            println("❌ Insert thất bại!")
        }
    }
}
