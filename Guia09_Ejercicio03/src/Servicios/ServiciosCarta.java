package Servicios;

import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiciosCarta {

    public ArrayList<Carta> descartadas = new ArrayList();
//crea baraja 1 al 12 sin 8 y 9 (espada, basto, oro, copa), 40 cartas

    public ArrayList<Carta> creaBaraja() {
        ArrayList<Carta> baraja = new ArrayList();
        String palo;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 12; i++) {
                int nroCarta = i + 1;
                if ((nroCarta == 8) || (nroCarta == 9)) {
                    //estas cartas no se incluyen en la baraja  
                } else {
                    switch (j) {
                        case 0:
                            palo = "Oro";
                            baraja.add(new Carta(nroCarta, palo));
                            break;
                        case 1:
                            palo = "Copa";
                            baraja.add(new Carta(nroCarta, palo));
                            break;
                        case 2:
                            palo = "Basto";
                            baraja.add(new Carta(nroCarta, palo));
                            break;
                        case 3:
                            palo = "Espada";
                            baraja.add(new Carta(nroCarta, palo));
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        for (Carta naipe : baraja) {
            System.out.println(naipe.toString());
        }
        return baraja;
    }

    //barajar: cambia la posicion de todas las cartas de manera aleatoria
    public ArrayList<Carta> mezcla(ArrayList<Carta> baraja) {
        Collections.shuffle(baraja);
        System.out.println("\n--------Ahora las mezclamos--------");
        for (Carta carta : baraja) {
            System.out.println(carta.toString());
        }
        return baraja;
    }

    //siguienteCarta: devuelve la siguiente carta que está en la baraja, si no hay más o
//se llegó al final, se debe informar al jugador
    public Carta siguienteCarta(ArrayList<Carta> baraja, ArrayList<Carta> descartadas) {
        int cartaSup = baraja.size();
        Carta cartaEntregada = new Carta();
        if (cartaSup > 0) {
            cartaEntregada = baraja.get(cartaSup - 1);
            descartadas.add(cartaEntregada);
            baraja.remove(cartaEntregada);
        } else {
            System.out.println("No quedan cartas para entregar");
            cartaEntregada.setNumero(0);
            cartaEntregada.setPalo("ninguno");
        }

        return cartaEntregada;
    }

    //cartasDisponibles: indica el numero de cartas que aún se pueden repartir
    public int cartasDisponibles(ArrayList<Carta> baraja) {
        return baraja.size();
    }

    //darCartas: recibe cantidad de cartas a repartir, entregamos usando siguienteCarta las cartas que nos solicitan
//si las que quedan no son suficientes no se entrega ninguna y se informa
    public ArrayList<Carta> darCartas(ArrayList<Carta> baraja) {
        ArrayList<Carta> cartasRepartidas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int cartasArepartir = 0;

        String sigoRepartiendo;

        if (cartasArepartir <= cartasDisponibles(baraja)) {
            do {
                System.out.println("\nIngrese la cantidad de cartas a repartir");
                cartasArepartir = leer.nextInt();
                for (int i = 0; i < cartasArepartir; i++) {
                    cartasRepartidas.add(siguienteCarta(baraja, descartadas));
                }
                for (int i = (cartasRepartidas.size() - cartasArepartir); i < cartasRepartidas.size(); i++) {
                    System.out.println(cartasRepartidas.get(i).toString());
                }

                System.out.println("las cartas disponibles son " + cartasDisponibles(baraja));
                System.out.println("Si desea repartir nuevamente presione 'S'\n"
                        + "o cualquier otra tecla para continuar\n");
                Scanner lee = new Scanner(System.in);
                sigoRepartiendo = lee.nextLine();
            } while (sigoRepartiendo.equalsIgnoreCase("s"));
        } else {
            System.out.println("No quedan cartas suficientes para repartir\n"
                    + "NO LE ENTREGAREMOS NINGUNA, QUEDÓ CLARO????!!!!!");
        }

        return cartasRepartidas;
    }

    //cartasMonton: mostramos aquellas cartas que ya han salido
    //, si no ha salido ninguna se lo indicamos al jugador
    public String cartasMonton(ArrayList<Carta> baraja) {
        if (descartadas.size() > 0) {
            String descarte = "Las cartas descartadas son:\n";
            for (Carta descartada : descartadas) {
                descarte += descartada.toString() + "\n";
            }
            return descarte;
        } else {
            return "no se han descartado cartas aún";
        }
    }

    //mostrarBaraja: muestra todas las cartas presentes en la baraja.
    public String mostrarBaraja(ArrayList<Carta> baraja) {
        if (baraja.size() > 0) {
            String remanente = "Las cartas que quedan en el mazo son:\n";
            for (Carta quedan : baraja) {
                remanente += quedan.toString() + "\n";
            }
            return remanente;
        } else {
            return "NO QUEDAN CARTAS EN EL MAZO";
        }

    }

}
