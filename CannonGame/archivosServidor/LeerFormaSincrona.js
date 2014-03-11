/*
    ahora para leer un archivo de forma sincrona solo tenemos que cambiar
    fs.readFile por fs.readFileSync quedaria de la siguiente manera
*/
var fs = require("fs");
/*
    aqui es donde cambiamos fs.readFile por fs.readFileSync y hay que
    indicarle la codificacion en la que se encuentra en este caso
    es UTF8
*/
var archivo = fs.readFileSync("LeerFormaSincrona", "utf8");
/* lo imprimimos en consola */
console.log("contenido: " + archivo);
