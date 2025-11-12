const http = require('http')
const server = http.createServer((req, res) => {
    res.writeHead(200, {"Content-Type": "application/json" })
    res.write(JSON.stringify({"country": "VietNam"}))
    res.write(JSON.stringify({"capital": "Hanoi"}))
})
var port = 8888
server.listen(port, () => {
    console.log("Server is running at http://localhost:" + port)
})