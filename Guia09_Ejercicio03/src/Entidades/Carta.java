package Entidades;

public class Carta {
//atributos
    private int numero;
    private String palo;
    
//constructores
    public Carta(){
        
    }
    public Carta(int numero, String palo){
        this.numero=numero;
        this.palo=palo;
    }
    
    //getters y setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    
    
    //toString
    @Override
    public String toString(){
        return " "+numero+" de "+palo;
    }
    
    
}
