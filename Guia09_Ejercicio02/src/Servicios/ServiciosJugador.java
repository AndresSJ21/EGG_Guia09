package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import Utilidades.Comparadores;
import java.util.Scanner;
import java.util.TreeSet;

public class ServiciosJugador {

    TreeSet<Jugador> jugadores = new TreeSet(Comparadores.comparaNombre);
    ServiciosRevolver gunServ = new ServiciosRevolver();

    public TreeSet<Jugador> armaEquipo() {
        Jugador player = new Jugador();
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese jugador");
            jugadores.add(player.creaJugador());
            if (jugadores.size() < 6) {
                System.out.println("Si desea agregar otro jugador presione 'S'");
            } else {
                System.out.println("No se admiten más jugadores");
            }
        } while (("s").equalsIgnoreCase(leer.nextLine()));
        return jugadores;
    }

    public boolean disparo(Revolver gun, Jugador player) {
        boolean seMojo = false;
        
                System.out.println(player.toString());
                 System.out.println(gun.toString());
                System.out.println("presiones cualquier tecla para mojar\n\n");
//                
//                Scanner leer=new Scanner(System.in);
//                String seDisparo = leer.nextLine();
               
                if (gunServ.mojar(gun)==true) {
                    seMojo=true;
                    player.setMojado(seMojo);
                                
                } else {
                    gunServ.siguienteChorro(gun);
                    
                }
 
        return seMojo;
    }
}
