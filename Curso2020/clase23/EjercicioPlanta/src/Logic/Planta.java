package Logic;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Planta {
    
        String nombre;
        Double alto;
        Boolean tieneHojas;
        String clima;

    public Planta() {
    }

    public Planta(String nombre, Double alto, Boolean tieneHojas, String clima) {
        this.nombre = nombre;
        this.alto = alto;
        this.tieneHojas = tieneHojas;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Boolean getTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(Boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
        
}
