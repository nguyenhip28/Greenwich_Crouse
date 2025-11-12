# How to Run the Web Server ?

1. **Open MongoDB Compass** and connect to the local database.
2. **Create a new database**:
   - Database name: `todoList`
   - Collection name: `tasks`
3. **Import data** into the `tasks` using JSON file `tasks.json`.
4. **Import the code folder** `todoListAPI` into VS Code.
5. **Open the integrated terminal** from this folder.
   - Install libraries: `npm install`
   - Run web server: `npm start`