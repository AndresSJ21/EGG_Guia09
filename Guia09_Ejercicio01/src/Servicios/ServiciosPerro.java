package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import Utilidades.Comparadores;
import java.util.Date;
import java.util.TreeSet;

import java.util.Scanner;

public class ServiciosPerro {

    public Perro creaPerro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos del Perro");
        System.out.println("--Nombre: ");
        String nombre = leer.nextLine();
        System.out.println("--Raza: ");
        String raza = leer.nextLine();
        System.out.println("--Fecha de Nacimiento: dd/mm/aaaa");
        Date fNacim = ingresaFecha();
        System.out.println("--Tamaño: ");
        String tamanio = leer.nextLine();
        return new Perro(nombre, raza, fNacim, tamanio);
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

    public TreeSet<Perro> llenaListaPerros(TreeSet<Perro> dogsList) {
        
        Scanner leer = new Scanner(System.in);
        String carga = "S";
        do {
            dogsList.add(creaPerro());
            System.out.println("Si desea ingresar otro perro presiones 'S'");
        } while (carga.equalsIgnoreCase(leer.nextLine()));
        return dogsList;
    }

 
}
