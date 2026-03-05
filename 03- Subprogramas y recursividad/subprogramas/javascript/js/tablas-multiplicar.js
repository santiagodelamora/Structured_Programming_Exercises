/**
 * Descripción: Tablas de multiplicar con funciones en JavaScript.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 19/02/2026
 */

const solicitarValor = () => {
    let esValido = true;
    let valor, numero;

    do {
        valor = prompt("Ingresa el valor");
        numero = parseInt(valor);

        console.log(Number.isInteger(numero));
        
        if (!isNaN(numero) && Number.isInteger(numero) && numero > 0) {
            esValido = true;
        } else {
            alert("NO es un número entero, introduce otra vez.");
            esValido = false;
        }
    } while (!esValido);

    return valor;
}


const generarTablas = (numeroTabla) => {
    let tabla = '';

    for (let i = 0; i <= 10; i++) {
        tabla += `${numeroTabla} x ${i} = ${numeroTabla * i}\n`;
    }

    return tabla;
}

const valor = solicitarValor();
const salida = generarTablas(valor);
alert(salida);