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
public class Arbol extends Planta {
    
        String variedad;
        String tipoTronco;
        String color;
        String tipoHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoTronco, String color, String tipoHojas, String nombre, Double alto, Boolean tieneHojas, String clima) {
        super(nombre, alto, tieneHojas, clima);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }
    
    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
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
        System.out.println("Hola Soy un Arbol");
    }    
    
}

