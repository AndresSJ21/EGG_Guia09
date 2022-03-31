package Entidades;

//atributos

import java.util.Date;

public class Perro {
private String nombre;
private String raza;
private Date fNacim;
private String tamanio;

//constructores
public Perro (){
    
}

public Perro (String nombre, String raza, Date fNacim, String tamanio){
    this.nombre=nombre;
    this.raza=raza;
    this.fNacim= fNacim;
    this.tamanio=tamanio;
}

//getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getfNacim() {
        return fNacim;
    }

    public void setfNacim(Date fNacim) {
        this.fNacim = fNacim;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int calculaEdadPerro(){
        Date hoy = new Date();
        int edad= hoy.getYear()-fNacim.getYear();
        if (fNacim.getMonth()>hoy.getMonth()) {
            edad--;
        }
        
        return edad;
    }

    @Override
    public String toString() {
        return "Perro\n"
                + "   Nombre= " + nombre + " , Edad= " + calculaEdadPerro() + " , Raza= " + raza + "\n"
                + "   Tamaño=" + tamanio;
    }
            
   


}
