package Servicios;

import Entidades.Butaca;
import Entidades.Espectador;
import Entidades.Ubicacion;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosButaca {
//

    ArrayList<Butaca> listaButacas = new ArrayList<>();
    ArrayList<Ubicacion> listaUbicaciones = new ArrayList<>();
    ServiciosUbicacion servUb = new ServiciosUbicacion();
//    ServiciosEspectador servEsp =new ServiciosEspectador();
//    ServiciosSala servSala = new ServiciosSala();
//    Butaca asiento = new Butaca();
//    Ubicacion ubicacion = new Ubicacion();

    public ArrayList<Butaca> creaButacas() {

        listaUbicaciones = servUb.creaUbicaciones();
        Ubicacion place;
        String idButaca;
        boolean disponible;

        for (Ubicacion ubic : listaUbicaciones) {

            place = ubic;
            idButaca = String.valueOf(ubic.getFila()) + String.valueOf(ubic.getColumna());
            disponible = true;
            Butaca asiento = new Butaca(place, idButaca, disponible);
            listaButacas.add(asiento);

        }
        System.out.println(muestraDistribucion(listaButacas));
        return listaButacas;
    }

    public String muestraDistribucion(ArrayList<Butaca> litadoButacas) {
        System.out.println("\n------- Distribución y ocupación de butacas en la sala -------\n");
        for (int i = 0; i < litadoButacas.size(); i++) {

            if (i < (litadoButacas.size()-1)) {
                if (litadoButacas.get(i).getUbicacion().getFila() == litadoButacas.get(i + 1).getUbicacion().getFila()) {
                    if (litadoButacas.get(i).getDisponible()) {
                        System.out.print(litadoButacas.get(i).getIdButaca() + "   ");
                    } else {
                        System.out.print(litadoButacas.get(i).getIdButaca() + "X" + "  ");
                    }

                } else {
                    if (litadoButacas.get(i).getDisponible()) {
                        System.out.println(litadoButacas.get(i).getIdButaca() + "   ");
                    } else {
                        System.out.println(litadoButacas.get(i).getIdButaca() + "X" + "  ");
                    }
                }
            } else {
                if (litadoButacas.get(i).getDisponible()) {
                    if (litadoButacas.get(i).getDisponible()) {
                        System.out.print(litadoButacas.get(i).getIdButaca() + "   \n");
                    } else {
                        System.out.print(litadoButacas.get(i).getIdButaca() + "X" + "  \n");
                    }
                }  else {
                    if (litadoButacas.get(i).getDisponible()) {
                        System.out.println(litadoButacas.get(i).getIdButaca() + "   ");
                    } else {
                        System.out.println(litadoButacas.get(i).getIdButaca() + "X" + "  ");
                    }
                }
            }

        }
        return "\n";
    }

    public ArrayList<Butaca> ubicamosEspectador(Espectador espectador, ArrayList<Butaca> butacas) {

        int pos;

        System.out.println("\nPresione una tecla para ubicar al espectador");
        Scanner leer = new Scanner(System.in);
        leer.nextLine();

        boolean reubicar = false;
        boolean salaLlena = false;

        do {

            pos = (int) (Math.random() * (butacas.size()));
            if (butacas.get(pos).getDisponible() == false) {
                System.out.println("La butaca seleccionada ya está ocupada\n"
                        + butacas.get(pos).getIdButaca()
                        + "le asignaremos alguna disponible");
                reubicar = true;

            } else {
                System.out.println("La butaca elegida está disponible");
                butacas.get(pos).setEspectador(espectador);
                butacas.get(pos).setDisponible(false);
                System.out.println("la butaca asignada es: " + butacas.get(pos).getIdButaca());
                reubicar = false;
            }

        } while (reubicar);

        return butacas;
    }
}
