/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Flor extends Planta {

    String colorPetalos;
    int cantidadPetalos;
    String variedad;
    String estacion;

    public Flor() {
    }

    public Flor(String colorPetalos, int cantidadPetalos, String variedad, String estacion, String nombre, Double alto, Boolean tieneHojas, String clima) {
        super(nombre, alto, tieneHojas, clima);
        this.colorPetalos = colorPetalos;
        this.cantidadPetalos = cantidadPetalos;
        this.variedad = variedad;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantidadPetalos() {
        return cantidadPetalos;
    }

    public void setCantidadPetalos(int cantidadPetalos) {
        this.cantidadPetalos = cantidadPetalos;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Double getAlto() {
        return alto;
    }

    @Override
    public void setAlto(Double alto) {
        this.alto = alto;
    }

    @Override
    public Boolean getTieneHojas() {
        return tieneHojas;
    }

    @Override
    public void setTieneHojas(Boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    @Override
    public String getClima() {
        return clima;
    }

    @Override
    public void setClima(String clima) {
        this.clima = clima;
    }
    
    public void motrarMensaje(){
        System.out.println("Hola Soy una Flor");
    }    
}
