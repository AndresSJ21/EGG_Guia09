package guia09_ejercicio01;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.ServiciosPerro;
import Servicios.ServiciosPersona;
import Utilidades.Comparadores;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Guia09_Ejercicio01 {

    public static void main(String[] args) {

        ServiciosPersona servPers = new ServiciosPersona();
        ServiciosPerro servDog = new ServiciosPerro();

        TreeSet<Persona> personList = new TreeSet(Comparadores.comparaAz);
        TreeSet<Perro> dogList = new TreeSet(Comparadores.comparaNombrePerroAZ);

        System.out.println(servPers.llenaListaPersonas(personList).toString());

        System.out.println(servDog.llenaListaPerros(dogList).toString());

        for (Persona adoptante : personList) {
            System.out.println("Los perros disponibles para adopción son");
            Perro adoptado = new Perro();
            for (Perro auxPerro : dogList) {
                System.out.println(auxPerro.getNombre());
            }

            System.out.println("Ingrese nombre del perro a adoptar");
            Scanner leer = new Scanner(System.in);
            String dogName = leer.nextLine();

            for (Perro perro : dogList) {
                if (perro.getNombre().equalsIgnoreCase(dogName)) {
                    adoptante.setPerro(perro);
                    dogList.remove(perro);
                    System.out.println(adoptante.toString() + adoptante.getPerro());
                    System.out.println("Le conseguimos casa a otro perrito");
                    break;
                }

            }
            for (Persona persona : personList) {
                persona.toString();
            }

        }

    }

}
