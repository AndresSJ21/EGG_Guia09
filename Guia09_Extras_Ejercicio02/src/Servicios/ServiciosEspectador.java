package Servicios;

import Entidades.Espectador;

public class ServiciosEspectador {

    private String[] nombresEspectadores = {"Andres", "Genaro", "Pedro", "Ismael", "Luca", "Paola", "Jimena", "Luana", "Jazmín", "Valentino", "Victoria", "Santino", "Carmela", "Diego", "Camilo", "Abi", "Magalí", "Pedro", "Octavio", "Lorenzo", "Isabela", "Paula", "Irene", "Paola", "Mary", "Jorge", "Sebastián", "Elena", "Sol", "Mariana"};
    private String[] apellidosEspectadores = {"Gonzalez", "Papalardo", "Gimenez", "Santoro", "Lanata", "Crubelier", "Zapala", "García", "Maldonado", "Riquelme", "Messi", "Agüero", "Batistuta", "Maradona", "Di Maria"};

    //crea un espectador con datos aleatorios
    public Espectador creaEspectador() {
        String nombre = formaNombre(nombresEspectadores, apellidosEspectadores);
        int edad = generaEdad();
        double dinero = asignaFondos();
        return new Espectador(nombre, edad, dinero);
    }

    //genera un nombre de espectador de forma aleatoria tomando nombres y apellidos preestablecidos
    public String formaNombre(String[] nombresEspectadores, String[] apellidosEspectadores) {
        
        int indiceNombre=(int)(Math.random()*30);
        int indiceApellido=(int)(Math.random()*15);
        String nombreEspectador= nombresEspectadores[indiceNombre]+" "+apellidosEspectadores[indiceApellido];
        return nombreEspectador;
    }

    //genera edad espectador de forma aleatoria
    public int generaEdad() {
        int aniosEspectador = 0;
        do {
            aniosEspectador = (int) (Math.random() * 60);
        } while (aniosEspectador < 4);
        return aniosEspectador;
    }
    
    //asigna fondos al espectador
    public double asignaFondos(){
        double dineroDisponible = (int)(((Math.random()*100))+(100*(Math.random()*10)*(Math.random()*5)));
        return dineroDisponible;
    }
}
