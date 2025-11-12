const http = require('http')
const { json } = require('stream/consumers')
const server = http.createServer((req, res) => {
    if (req.url === "/"){
        res.writeHead(200, { "Content-Type": "text/html"})
        res.write("<h3 style='color: red;'>This is Home page</h3>")
        res.end()
    } else if (req.url === "/student") {
        res.writeHead(200, { "Content-Type": "text/html"})
        res.write("<h3 style='color: red;'>This is Student page</h3>")
        res.end()
    } else if (req.url === "/admin") {
        res.writeHead(200, { "Content-Type": "text/html"})
        res.write("<h3 style='color: red;'>This is Admin page</h3>")
        res.end()
    } else if (req.url === "/greenwich") {
        res.writeHead(200, { "Content-Type": "application/json"})
        res.write(JSON.stringify({"university": "Greenwich VietNam"}))
        res.end()
    } else 
        res.end('Invalid Request');
})
var port = 2874
server.listen(port, () => {
    console.log("http://localhost:" + port)
})