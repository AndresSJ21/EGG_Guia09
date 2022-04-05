package Servicios;

import Entidades.Butaca;
import Entidades.Pelicula;
import Entidades.Sala;
import java.util.ArrayList;


public class ServiciosSala {

    ServiciosPelicula servPeli = new ServiciosPelicula();
    ServiciosButaca servBut = new ServiciosButaca();
    ArrayList<Pelicula> peliculas;
    Pelicula peli;
    ArrayList<Butaca> asientitos;
    double precio;

    public Sala creaSala() {
        peli = servPeli.eligePelicula();
        asientitos = servBut.creaButacas();
        precio = 250.0;
        System.out.println("El precio de la butaca en esta sala es: "+ precio +" Pesos");
        return new Sala(peli, asientitos, precio);
        
    }
  

    public Boolean disponibilidadButacas(ArrayList<Butaca> butacas){
        boolean quedanDisponibles=true;
        int countDisponibles=0;
        for (Butaca butaca : butacas) {
            if(butaca.getDisponible()==true)
                countDisponibles++;
        }
        if (countDisponibles==0) {
            quedanDisponibles=false;
        }
        System.out.println("total butacas sala: "+ butacas.size());
        System.out.println("total butacas vacías: "+countDisponibles);
        
        return quedanDisponibles;
    }
}
