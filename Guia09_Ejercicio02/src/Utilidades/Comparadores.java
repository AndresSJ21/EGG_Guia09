package Utilidades;

import Entidades.Jugador;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Jugador> comparaNombre = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            return j1.getNombre().compareToIgnoreCase(j2.getNombre());
        }
    };
}
