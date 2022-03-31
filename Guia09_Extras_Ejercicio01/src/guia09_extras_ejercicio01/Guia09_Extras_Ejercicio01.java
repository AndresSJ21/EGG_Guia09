package guia09_extras_ejercicio01;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.ServiciosPerro;
import Servicios.ServiciosPersona;
import Utilidades.Comparadores;
import java.util.Scanner;
import java.util.TreeSet;

public class Guia09_Extras_Ejercicio01 {

    public static void main(String[] args) {

        ServiciosPersona servPers = new ServiciosPersona();
        ServiciosPerro servDog = new ServiciosPerro();

        TreeSet<Persona> personList = new TreeSet(Comparadores.comparaAz);
        TreeSet<Perro> dogList = new TreeSet(Comparadores.comparaNombrePerroAZ);

        System.out.println(servPers.llenaListaPersonas(personList));

        System.out.println(servDog.llenaListaPerros(dogList));

        for (Persona persona : personList) {
           servPers.adoptaPerro(persona, dogList); 
           
        }
        for (Persona persona: personList) {
            if (persona.getPerro()==null) {
                System.out.println (persona.getApellido()+" "+persona.getNombre()+", "+persona.calculaEdad()+" Años"+"\n"
            + "DNI: "+persona.getDni()+"\n"
                    + "no pudo adoptar perro");
            }else{
            System.out.println (persona.getApellido()+" "+persona.getNombre()+", "+persona.calculaEdad()+" Años"+"\n"
            + "DNI: "+persona.getDni()+"\n"
                    + "Perro Adoptado: "+ persona.getPerro().getNombre()+" , Raza: "+persona.getPerro().getRaza()+"\n"
                    + "Edad: "+persona.getPerro().calculaEdadPerro());
            }
        }

  
        }
   
}
