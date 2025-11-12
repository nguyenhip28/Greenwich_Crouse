const mongoose = require('mongoose')
//declare schema(table design/structure)
const todoSchema = mongoose.Schema({
    name:{
        type: String,
        required: "name can not be empty",},
    deadline: Date,
    status: String
})

// declare model (define table name)
const todoModel = mongoose.model("todos", todoSchema)
//export model
module.exports = todoModel