package Entidades;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;
    
    public Revolver(){    
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public Revolver llenarRevolver(){
        posicionAgua =(int)(Math.random()*6);
        setPosicionAgua(posicionAgua);
        posicionActual=(int)(Math.random()*6);
        setPosicionActual(posicionActual);
        return new Revolver (posicionAgua, posicionActual);
    }
    
    @Override
    public String toString() {
        return "\nDatos de la pistola de agua:\n"
                + "     depósito a descargarse con el disparo: " + posicionActual + "\n"
                + "     depósito que contiene el agua: " + posicionAgua ;
    }
    
    
    
}
