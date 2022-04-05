package Entidades;

import java.util.ArrayList;


public class Sala {
//atributos
private Pelicula pelicula;
private ArrayList<Butaca> butaca;
private Double precioEntrada;    

    public Sala(Pelicula pelicula, ArrayList<Butaca> butaca, Double precioEntrada) {
        this.pelicula = pelicula;
        this.butaca = butaca;
        this.precioEntrada = precioEntrada;
    }

    public Sala() {
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Butaca> getButaca() {
        return butaca;
    }

    public void setButaca(ArrayList<Butaca> butaca) {
        this.butaca = butaca;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Sala{" + "pelicula=" + pelicula + ", butaca=" + butaca + ", precioEntrada=" + precioEntrada + '}';
    }
   

}
