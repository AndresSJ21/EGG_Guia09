package Entidades;

public class Butaca {
private Ubicacion ubicacion;
private String idButaca;
private Espectador espectador;
private boolean disponible;

    public Butaca() {
    }

    public Butaca(Ubicacion ubicacion, String idButaca, boolean disponible) {
        this.ubicacion = ubicacion;
        this.idButaca = idButaca;

        this.disponible = disponible;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(String idButaca) {
        this.idButaca = idButaca;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Butaca{" + " fila=" + ubicacion.getFila()+ " columna=" + ubicacion.getColumna() + ", idButaca=" + idButaca + "\n espectador=" + espectador + ", disponible=" + disponible + '}'+"\n\n";
    }









}
