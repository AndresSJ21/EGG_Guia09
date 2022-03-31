package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.Scanner;
import java.util.TreeSet;

public class ServiciosJuego {

    ServiciosJugador playerServices = new ServiciosJugador();
    ServiciosRevolver gunServices = new ServiciosRevolver();

    public Juego llenarJuego() {
        Revolver pistola = new Revolver().llenarRevolver();

        TreeSet<Jugador> team;
        team = playerServices.armaEquipo();

        for (Jugador jugador : team) {
            System.out.println(jugador.toString());
        }
        System.out.println(pistola.toString());
        return new Juego(team, pistola);
    }

    public String ronda(Juego game) {
        boolean seMojo = false;
        System.out.println("\n\n------------------EMPIEZA LA COMPETENCIA--------------------\n");
        System.out.println("El primero en empezar es.....");
        TreeSet<Jugador> equipo1=game.getJugadores();
        Revolver revolver1=game.getRevolver();
        do {
            for (Jugador jugador : equipo1) {
                System.out.println(jugador.toString());
                System.out.println(revolver1.toString());

                System.out.println("presiones cualquier tecla para mojar\n\n");
                Scanner leer = new Scanner(System.in);
                String seDisparo = leer.nextLine();

                if (playerServices.disparo(revolver1, jugador)) {
                    seMojo = true;
                    System.out.println(jugador.getNombre().toUpperCase() + " ya no está seco, juego terminado");
                    break;
                } else {
                    System.out.println(jugador.getNombre() + " te salvaste!!!!!!\n\n que dispare el siguiente!!!!!");
                }
            }
        } while (!seMojo);
        return "Juego Finalizado";
    }

}
