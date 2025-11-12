//declare & import "express" library => express framework

const express = require('express')
//create web server with expres
const app = express()
//test some routes
app.get('/', (req, res)=>{
    res.json({"message" :"server is running ar port 3000"})
})

// app.get('/mobile', (req,res) =>{
//     let mobile =
//         {
//             "name":"iphone",
//             "price":1999.9,
            
//         }
        
//         res.json(mobile)
    
// })
// app/get('/mobiles', (req, res) =>{
//     var mobiles= [
//         {
//             "name": "galaxy s25 ultra",
//             "price": 1500
//         },
//         {
//             "name": "iphone 16 pro",
//             "price": 1444
//         },
//         {
//             "name": "xiaomi note 10",
//             "price": 1588
//         }
//     ]
//         res.json(mobiles)
    
// })
// //run web server (listening port)

const mongoose = require('mongoose')
const db_uri = "mongodb://localhost:27017/todo_db"
mongoose.connect(db_uri)
    .then(() => console.log("success"))
.catch((err) => console.error("error: " + err))

const bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: false}))
app.use(bodyParser.json())


const router = require('./api/routers/todoListRouter')
router(app)

var port = 3000  //default: 3000
app.listen(port, () =>{
    console.log("ExpressJS server is running at port " + port)
})

// how to run ? npm start, node server, nodemon server