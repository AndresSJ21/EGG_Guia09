package Entidades;

public class Ubicacion {
    private int fila;
    private char columna;

    public Ubicacion(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Ubicacion() {
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "fila=" + fila + ", columna=" + columna + '}';
    }
    
    
}
