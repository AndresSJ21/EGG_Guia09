/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
*/

package guia09_ejercicio01;

import Entidades.Juego;

import Servicios.ServiciosJuego;



public class Guia09_Ejercicio01 {

    public static void main(String[] args) {
    ServiciosJuego servGame=new ServiciosJuego();
 
    Juego newGame;
    
    newGame=servGame.llenarJuego();
    servGame.ronda(newGame);
    
    
    
    
    
//   System.out.println( newGame.getRevolver().getPosicionActual());
//   System.out.println( newGame.getRevolver().getPosicionAgua());
//    servGame.ronda(newGame);
//    
//    

    
    }

}
