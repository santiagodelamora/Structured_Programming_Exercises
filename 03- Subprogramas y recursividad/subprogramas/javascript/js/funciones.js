/**
 * Descripción: Funciones en JavaScript.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 19/02/2026
 */

// Declaración de función (función clásica)
console.warn("Declaración de función (clásica)");

/*
function saludar() {
    console.log("Hola a todos");
}
saludar();

function saludar2(nombre) {
    console.log("Hola " + nombre);
}
saludar2("Chucho");

function sumar(a, b) {
    return a + b;
}
const suma = sumar(56, 89);
console.log({suma});

function multiplicar(a, b) {
    return "La multiplicación de " + a + ' x ' + b + ' = ' + (a * b);
}
const mensaje = multiplicar(5, 6);
console.log(mensaje);

function dividir(a, b) {
    if (b === 0) {
        console.log("El denominador no puede ser 0");
        return;
    }

    return `La división de ${a} / ${b} = ${a / b}`;
}
const mensaje2 = dividir(9, 4);
console.log(mensaje2);
*/

// Expresion de función (funcion anónima)
console.warn("Funciones anónimas");

const saludar3 = function() {
    console.log("Hola");
}
saludar3();

const sumar2 = function(a, b) {
    return a + b;
}
const suma2 = sumar2(9, 8);
console.log(suma2);

const dividir2 = function(a, b) {
    return (b === 0) ? '' : (a / b);
}
const division = dividir2(10, 3);
console.log(division);


// Expresión de función (función "flecha")
console.warn("Funciones flecha (arrow functions)");

const mensaje3 = () => {
    return "Hola mundo arrow";
}
console.log(mensaje3);

const saludar4 = (nombre) => {
    return `Hola como estás ${nombre}`;
}
console.log(saludar4("Floriberto"));

const saludar5 = nombre => {
    return `Hola como estás ${nombre}`;
}
console.log(saludar5("Heriberto"));

const saludar6 = nombre => `Hola cómo estas ${nombre}`;
console.log(saludar6("Gilberto"))

const dividir3 = (a, b) => a / b;
console.log(dividir3(20, 10));