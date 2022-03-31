package Entidades;

import java.util.Date;

public class Perro {
private String nombre;
private String raza;
private Date fNacim;
private String tamanio;
private Persona adoptante;

//constructores
public Perro (){
    
}

public Perro (String nombre, String raza, Date fNacim, String tamanio, Persona adoptante){
    this.nombre=nombre;
    this.raza=raza;
    this.fNacim= fNacim;
    this.tamanio=tamanio;
    this.adoptante=adoptante;
   
    
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
    
    public Persona getAdoptante(){
        return adoptante;
    }
      public void setAdoptante(Persona adoptante){
        this.adoptante=adoptante;
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
                + "   Tamaño=" + tamanio+"\n"
                + "   Adoptante="+ adoptante+"\n";
    }
            
   
}
