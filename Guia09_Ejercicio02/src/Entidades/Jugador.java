package Entidades;

import java.util.Scanner;

public class Jugador {
private int ID;
private String nombre;
private boolean mojado;

    public Jugador() {
    }

    public Jugador(int ID, String nombre, boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Jugador creaJugador(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Nro Identificador(ID): ");
        ID=leer.nextInt();
        System.out.println("Nombre: ");
        Scanner lee = new Scanner(System.in);
        nombre=lee.nextLine()+" "+String.valueOf(ID);
        mojado=false;
        return new Jugador(ID, nombre, mojado);
    }
    
    @Override
    public String toString() {
        return "Jugador:\n"
                + "   ID: " + ID + "\n"
                + "   Nombre: " + nombre + "\n"
                + "   Estado(mojado): " + mojado ;
    }




}
