package Logic;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
@Entity
public class Entrada implements Serializable {

    //Atributos Principales
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Juego juego;
    //Atributos Basicos
    @Basic
    private Date fecha;
    private Time hora;

    /**
     * Constructor Vacio
     */
    public Entrada() {
    }

    /**
     * Constructor con Atributos
     *
     * @param id
     * @param cliente
     * @param juego
     * @param fecha
     * @param hora
     */
    public Entrada(int id, Cliente cliente, Juego juego, Date fecha, Time hora) {
        this.id = id;
        this.cliente = cliente;
        this.juego = juego;
        this.fecha = fecha;
        this.hora = hora;
    }

    /**
     * Obtenemos el id de la Entrada
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Seteamos el id de la Entrada
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenemos la Fecha de la Entrada
     *
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Seteamos la Fecha de la Entrada
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtenemos la Hora de la Entrada
     *
     * @return hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * Seteamos la Hora de la Entrada
     *
     * @param hora
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }
    /**
     * Obtenemos los Clientes de la Entrada
     *
     * @return clientes
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Seteamos los Clientes de la Entrada
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Obtenemos los Juegos de la Entrada
     *
     * @return juego
     */
    public Juego getJuego() {
        return juego;
    }
    /**
     * Seteamos los Juegos de la Entrada
     *
     * @param juego
     */
    public void setJuego(Juego juego) {
        this.juego = juego;
    }

}
