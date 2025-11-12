const http = require('http')

const server = http.createServer((req, res) => {
    res.writeHead(200, {"Content-Type": "text/html" })
    res.write("Hello Word. I am running NodeJS server <br>")
    res.write("<i>COMP182-Web Programming 2<i>")
    res.write("<p style='color: red; background: yellow;'>Greenwich VietNam - 2 Pham Van Bach</p>")
    res.end()
})

var port = 2874
server.listen(port)