const port = 9999;


// const http = require('http');

// const hostname = '127.0.0.1';

// const server = http.createServer((req, res) => {
//   res.statusCode = 200;
//   res.setHeader('Content-Type', 'text/plain');
//   res.end('Hello World');
// });

// server.listen(port, hostname, () => {
//   console.log(`Server running at http://${hostname}:${port}/`);
// });


var express = require('express');
var app = express();

app.get('/', function(req, res){
  if(typeof req.query.id == "undefined"){
    res.send('Hello world');
  } else {
  res.send('Hello ' + req.query.id);
  }
});

app.listen(port);