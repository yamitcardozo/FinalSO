/* requerimos nuestro http */
var http = require("http");
/*
    requerimos ahora el sistema de archivos para leer la
    informacion externa osea la informacion directamente del json
*/
var fs = require("fs");
/* parseamos nuestro json y lo convertimos a tipo objetos de JS */
var config = JSON.parse(fs.readFileSync("config.json"));
var host   = config.host;
var port   = config.port;
 
/* lo demas se queda igual por consiguiente no lo explicare */
var server = http.createServer(function(request, response){
    response.writeHead(200,{"Content-type":"text/plain"});
    response.write("mi primera respuesta");
    response.end();
});
server.listen(port,host);


