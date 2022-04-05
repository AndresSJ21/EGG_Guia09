package Utilidades;

import Entidades.Butaca;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Sala;
import Servicios.ServiciosButaca;
import Servicios.ServiciosEspectador;
import Servicios.ServiciosSala;
import java.util.ArrayList;
import java.util.Scanner;

public class OtrasUtilidades {

    Sala sala = new Sala();
    ServiciosSala servRoom = new ServiciosSala();
    ServiciosButaca servButaca = new ServiciosButaca();
    ServiciosEspectador servWatcher = new ServiciosEspectador();
    ArrayList<Butaca> listaBut;

    public boolean llenarSala() {
        boolean salaLlena = false;

        System.out.println(bienvenida());
        sala = servRoom.creaSala();
        String option;
        listaBut = sala.getButaca();

        do {

            if (servRoom.disponibilidadButacas(listaBut)) {

                System.out.println("Presione una tecla para ingresar espectador");
                Scanner leer = new Scanner(System.in);
                leer.nextLine();

                Espectador watcher = servWatcher.creaEspectador();

                System.out.println("los datos generados son: \n"
                        + watcher.toString());

                if (tieneEdadSuficiente(watcher, sala.getPelicula())) {
                    System.out.println("La edad de " + watcher.getNombre() + "(" + watcher.getEdad() + ") le permite ver la película");

                    if (tieneDinero(watcher, sala)) {
                        System.out.println(watcher.getNombre()+ " tiene dinero disponible para ver la película :"+watcher.getDineroDisponible()+" Pesos");

                        servButaca.ubicamosEspectador(watcher, listaBut);
                        servButaca.muestraDistribucion(listaBut);
                        servRoom.disponibilidadButacas(listaBut);
                        System.out.println("");
                    } else {
                        System.out.println("El dinero de su billetera virtual no alcanza para abonar\n");
                        
                    }
                } else {
                    System.out.println("No tiene la edad suficiente para ver la película\n");
                }

            } else {
                System.out.println("Lo sentimos la sala está llena, vuelva en otra oportunidad\n");
                salaLlena = true;
                break;
            }
           

            System.out.println("Para ingresar otro espectador presiones 'S' ");
            Scanner lee = new Scanner(System.in);
            option = lee.nextLine();
        } while (option.equalsIgnoreCase("s"));
        servButaca.muestraDistribucion(listaBut);
        System.out.println("");
            servRoom.disponibilidadButacas(listaBut);
        for (Butaca butaca : listaBut) {
            System.out.println(butaca.toString());
        }
        return salaLlena;
    }

    public String bienvenida() {

        return "Bienvenido a Relax's time cinema\n";
    }

    public boolean tieneEdadSuficiente(Espectador espectador, Pelicula pelicula) {
        boolean puedeVerLaPeli = false;
        if (espectador.getEdad() >= pelicula.getEdadMinima()) {
            puedeVerLaPeli = true;
        }
        return puedeVerLaPeli;
    }

    public boolean tieneDinero(Espectador espectador, Sala sala) {
        boolean tieneDinero = false;
        if (espectador.getDineroDisponible() >= sala.getPrecioEntrada()) {
            tieneDinero = true;
        }
        return tieneDinero;
    }

}
