package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import Utilidades.Comparadores;
import java.util.Date;
import java.util.TreeSet;

import java.util.Scanner;

public class ServiciosPersona {

    public Persona creaPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese datos de la persona");
        System.out.println("Nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Apellido: ");
        String apellido = leer.nextLine();
        System.out.println("DNI: ");
        String dni = leer.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        Date fechaNac = ingresaFecha();

        return new Persona(nombre, apellido, dni, fechaNac);
    }

    public Date ingresaFecha() {
        int anio;
        int mes;
        int dia;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese:\ndia\nmes\naño\n");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return fecha;
    }

    public TreeSet<Persona> llenaListaPersonas(TreeSet<Persona> persona) {

        Scanner leer = new Scanner(System.in);
        String carga = "s";
        do {
            persona.add(creaPersona());
            System.out.println("Para cargar otro Adoptante presiones 'S'");
        } while (carga.equalsIgnoreCase(leer.nextLine()));

        return persona;
    }
    
   
}
