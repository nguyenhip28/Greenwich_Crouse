// import controller
const todoController = require('../controllers/todoListController')
//declare routes
const todoRoute = (app) => {
    app.route('/todo')
    .get(todoController.ViewAllTodos)
    .post(todoController.AddNewTodo)
    .delete(todoController.DeleteAllTodos)

    app.route('/todo/:id')
        .get(todoController.ViewTodo)
        .put(todoController.EditTodo)
     .delete(todoController.DeleteTodo)
}
//export route
module.exports = todoRoute 