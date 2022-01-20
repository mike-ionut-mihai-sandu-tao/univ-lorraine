const port = 9999;


var express = require('express');
var app = express();

app.get('/', function(req, res){
  if(typeof req.query.id == "undefined"){
    res.send('Hello world');
  } else {
  res.send('Hello ' + req.query.id);
  }
});

app.listen(port, () => {
  console.log(`nicoapp listening at http://localhost:${port} \n
  please wash your hands after use.`)
})