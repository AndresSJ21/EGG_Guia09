package guia09_ejercicio03;

import Entidades.Carta;
import Servicios.ServiciosCarta;
import java.util.ArrayList;



public class Guia09_Ejercicio03 {

    public static void main(String[] args) {
        ServiciosCarta servCard = new ServiciosCarta();
        ArrayList<Carta> naipes, descartados=new ArrayList();
        
        
        naipes=servCard.creaBaraja();
        servCard.mezcla(naipes);
        servCard.darCartas(naipes);
        System.out.println(servCard.cartasMonton (naipes));
        System.out.println(servCard.mostrarBaraja(naipes));
    }
    }
