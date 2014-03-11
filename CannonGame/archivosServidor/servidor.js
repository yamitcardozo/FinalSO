
/* requerimos nuestro http */
var http = require("http");
/*
    requerimos ahora el sistema de archivos para leer la
    informacion externa osea la informacion directamente del json
*/
var fs = require("fs");
/* parseamos nuestro json y lo convertimos a tipo objetos de JS */
//var config = JSON.parse(fs.readFileSync("config.json"));

//var host   = config.host;
//var port   = config.port;

// /////montando datos a node
/*
    ahora para leer un archivo de forma sincrona solo tenemos que cambiar
    fs.readFile por fs.readFileSync quedaria de la siguiente manera
*/
//var fs = require("fs");
/*
    aqui es donde cambiamos fs.readFile por fs.readFileSync y hay que
    indicarle la codificacion en la que se encuentra en este caso
    es UTF8
*/
var archivo = fs.readFileSync("/export/estudiantes/yamit.cardozo/Escritorio/LeerFormaSincrona.txt", "utf8");
/* lo imprimimos en consola */
console.log("contenido: " + archivo); 

/* lo demas se queda igual por consiguiente no lo explicare */
var server = http.createServer(function(request, response){
    response.writeHead(200,{"Content-type":"text/plain"});
    response.write("Puntajes juego \n"+ archivo);
    response.end();
});
//&server.listen(port,host);
server.listen(1337, '127.0.0.1');
