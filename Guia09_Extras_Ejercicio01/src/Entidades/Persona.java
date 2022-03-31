package Entidades;

import java.util.Date;

public class Persona {

 private String nombre;
private String apellido;
private String dni;
private Date fechaNac;
private Perro perro;
        

//constructores
public Persona (){
    
}

public Persona (String nombre, String apellido, String dni, Date fechaNac){
    this.nombre=nombre;
    this.apellido=apellido;
    this.dni=dni;
    this.fechaNac=fechaNac;
}

//getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

        public int calculaEdad(){
        Date hoy = new Date();
        int edad= hoy.getYear()-fechaNac.getYear();
        if (fechaNac.getMonth()>hoy.getMonth()) {
            edad--;
        }
        
        return edad;
    }

    @Override
    public String toString() {
        return "Adoptante: \n"
                + "    Apellido= " + apellido +" ;  Nombre= " + nombre + " ;  DNI= " + dni + "\n"
                + "    Edad= " + calculaEdad() + "\n"
                + "    Perro Adoptado= " + perro + "\n\n";
    }
    
        
           
    
}
