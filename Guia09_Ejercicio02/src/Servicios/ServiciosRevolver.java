package Servicios;

import Entidades.Revolver;

public class ServiciosRevolver {

    public boolean mojar (Revolver revolver){
        boolean seDisparo=false;
        if(revolver.getPosicionActual()==revolver.getPosicionAgua()){
            seDisparo=true;  
        }
      return seDisparo;
    }
    
    public Revolver siguienteChorro(Revolver revolver){
        if (revolver.getPosicionActual()<5) {
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }else{
            revolver.setPosicionActual(0);
        }
        return revolver;
    }
}
