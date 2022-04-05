package Servicios;

import Entidades.Ubicacion;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosUbicacion {

    public ArrayList<Ubicacion> ubicaciones = new ArrayList<>();


    public ArrayList<Ubicacion> creaUbicaciones() {
        System.out.println("Ingrese cantidad de filas");
        Scanner leer =new Scanner (System.in);
        int cantFilas=leer.nextInt();
    
        int[] fila = new int [cantFilas];
        for (int i = 0; i < cantFilas; i++) {
            fila[i]=i+1;
        }
        System.out.println("Ingrese cantidad de columnas");
        Scanner lee=new Scanner(System.in);
        int cantColumnas=lee.nextInt();
        
        
        char[] columna = new char [cantColumnas]; //{'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < cantColumnas; i++) {
           columna[i]= (char) (65+i);
        }
        
        
        
        int row;
        char column;
        for (int i = 0; i < fila.length; i++) {
            for (int j = 0; j < columna.length; j++) {

                row = fila[i];
                column = columna[j];
                Ubicacion lugar=new Ubicacion(row, column);
                ubicaciones.add(lugar);
            }
        }
        return ubicaciones;
    }
    

}
