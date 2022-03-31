package Utilidades;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Persona> comparaAz = new Comparator<Persona>(){
      @Override
      public int compare(Persona p1, Persona p2){
          return p1.getApellido().compareToIgnoreCase(p2.getApellido());
      }
    };
    
        public static Comparator<Perro> comparaNombrePerroAZ = new Comparator<Perro>(){
      @Override
      public int compare(Perro p1, Perro p2){
          return p1.getNombre().compareToIgnoreCase(p2.getNombre());
      }
    };
}
