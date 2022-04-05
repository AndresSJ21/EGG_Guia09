package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPelicula {

    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    Pelicula peli;

    public ArrayList<Pelicula> creaPelicula() {
        listaPeliculas.add(new Pelicula("Transformers", 120, 13, "Michaes Bay"));
        listaPeliculas.add(new Pelicula("El señor de los anillos", 150, 16, "otro"));
        listaPeliculas.add(new Pelicula("La era del hielo", 117, 3, "El ratón Mickey"));

        return listaPeliculas;
    }

    public Pelicula eligePelicula() {
        listaPeliculas = creaPelicula();
        Pelicula peli = null;
        int id = 1;
        for (Pelicula listaMovy : listaPeliculas) {
            System.out.println(id + " " + listaMovy.toString() + "\n");
            id++;
        }
        String nroPelicula;
        do {
            System.out.println("Elija la película a reproducir en la sala");
            Scanner lee = new Scanner(System.in);
            nroPelicula = lee.nextLine();
            switch (nroPelicula) {
                case "1":
                    peli = listaPeliculas.get(0);
                    break;
                case "2":
                    peli = listaPeliculas.get(1);
                    break;
                case "3":
                    peli = listaPeliculas.get(2);
                    break;
                default:
                    System.out.println("Elija alguna de las indicadas");
                    break;
            }

        } while (!((nroPelicula.equals("1")) || (nroPelicula.equals("2")) || (nroPelicula.equals("3"))));
        System.out.println("\n    La película seleccionada fue :\n"
                + peli.toString() + "\n");
        return peli;
    }
}
