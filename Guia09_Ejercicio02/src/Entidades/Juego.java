package Entidades;

import java.util.TreeSet;

public class Juego {
private TreeSet<Jugador> jugadores;
private Revolver revolver;

    public Juego(TreeSet<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }

    public TreeSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(TreeSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver.getPosicionActual()+"," + revolver.getPosicionAgua();
    }


    
}
