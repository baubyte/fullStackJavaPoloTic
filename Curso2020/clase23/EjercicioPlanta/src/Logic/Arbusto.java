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
public class Arbusto extends Planta {
        
    Double ancho;
    Boolean esDomestico;
    String variedad;
    String color;
    Boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(Double ancho, Boolean esDomestico, String variedad, String color, Boolean sePoda, String nombre, Double alto, Boolean tieneHojas, String clima) {
        super(nombre, alto, tieneHojas, clima);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.color = color;
        this.sePoda = sePoda;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Boolean getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(Boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getSePoda() {
        return sePoda;
    }

    public void setSePoda(Boolean sePoda) {
        this.sePoda = sePoda;
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
        System.out.println("Hola Soy un Arbusto");
    }    
    
}
