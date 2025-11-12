const todoModels = require("../models/todoListModels");

const ViewAllTodos = async (req, res) => {
   try {
      const todos = await todoModels.find({});
      res.json(todos);
   } catch (err) {
      console.log(err);
      res.status(500).json({ error: "Internal Server Error" });
   }
};

const ViewTodo = async (req, res) => {
   try {
      const id = req.params.id;
      const todo = await todoModels.findById(id);
      if (!todo) {
         return res.status(404).json({ error: "Todo not found" });
      }
      res.json(todo);
   } catch (err) {
      console.log(err);
      res.status(500).json({ error: "Internal Server Error" });
   }
};

const AddNewTodo = async (req, res) => {
   try {
      await todoModels.create(req.body);
      res.json({ message: "Add succeed!" });
   } catch (err) {
      console.log(err);
      res.status(500).json({ error: "Internal Server Error" });
   }
};

const DeleteAllTodos = async (req, res) => {
   try {
      await todoModels.deleteMany();
      res.json({ message: "Delete all todos succeed!" });
   } catch (err) {
      console.log(err);
      res.status(500).json({ error: "Internal Server Error" });
   }
};

const EditTodo = async (req, res) => {
   try {
      const updated = await todoModels.findByIdAndUpdate(req.params.id, req.body, { new: true });
      if (!updated) {
         return res.status(404).json({ error: "Todo not found" });
      }
      res.json({ message: "Edit succeed!", todo: updated });
   } catch (err) {
      console.log(err);
      res.status(500).json({ error: "Internal Server Error" });
   }
};

const DeleteTodo = async (req, res) => {
   try {
      const deleted = await todoModels.findByIdAndDelete(req.params.id);
      if (!deleted) {
         return res.status(404).json({ error: "Todo not found" });
      }
      res.json({ message: "Delete todo succeed!" });
   } catch (err) {
      console.log(err);
      res.status(500).json({ error: "Internal Server Error" });
   }
};

module.exports = {
   ViewAllTodos,
   ViewTodo,
   AddNewTodo,
   DeleteAllTodos,
   EditTodo,
   DeleteTodo
};
