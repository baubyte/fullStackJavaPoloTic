package Logic;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
@Entity
public class HorarioJuego implements Serializable {

    //Atributos Principal
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    //Atributos Basicos
    @Basic
    Time hora_desde;
    Time hora_hasta;
    String descripcion;

    /**
     * Constructor Vacio
     */
    public HorarioJuego() {
    }

    /**
     * Constructor con Atributos
     *
     * @param id
     * @param hora_desde
     * @param hora_hasta
     * @param descripcion
     */
    public HorarioJuego(int id, Time hora_desde, Time hora_hasta, String descripcion) {
        this.id = id;
        this.hora_desde = hora_desde;
        this.hora_hasta = hora_hasta;
        this.descripcion = descripcion;
    }

    /**
     * Obtenemos ID del Horario del Juego
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Seteamos ID del Horario del Juego
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenemos Hora Desde del Juego
     *
     * @return hora_desde
     */
    public Time getHora_desde() {
        return hora_desde;
    }

    /**
     * Seteamos Hora Desde del Juego
     *
     * @param hora_desde
     */
    public void setHora_desde(Time hora_desde) {
        this.hora_desde = hora_desde;
    }

    /**
     * Obtenemos Hora Hasta del Juego
     *
     * @return hora_hasta
     */
    public Time getHora_hasta() {
        return hora_hasta;
    }

    /**
     * Seteamos Hora Hasta del Juego
     *
     * @param hora_hasta
     */
    public void setHora_hasta(Time hora_hasta) {
        this.hora_hasta = hora_hasta;
    }

    /**
     * Obtenemos la Descripcion del Horario del Juego
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Seteamos la Descripcion del Horario del Juego
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
