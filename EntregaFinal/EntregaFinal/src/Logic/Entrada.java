package Logic;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
@Entity
public class Entrada {

    //Atribustos Principales
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    @OneToMany(mappedBy = "entrada")
    List<Cliente> clientes;
    @OneToMany(mappedBy = "entrada")
    List<Juego> juegos;
    //Atributos Basicos
    Date fecha;
    Time hora;

    /**
     * Constructor Vacio
     */
    public Entrada() {
    }

    /**
     * Constructor con Atributos
     *
     * @param id
     * @param clientes
     * @param juegos
     * @param fecha
     * @param hora
     */
    public Entrada(int id, List<Cliente> clientes, List<Juego> juegos, Date fecha, Time hora) {
        this.id = id;
        this.clientes = clientes;
        this.juegos = juegos;
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
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Seteamos los Clientes de la Entrada
     *
     * @param clientes
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Obtenemos los Juegos de la Entrada
     *
     * @return juegos
     */
    public List<Juego> getJuegos() {
        return juegos;
    }
    /**
     * Seteamos los Juegos de la Entrada
     *
     * @param juegos
     */
    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }

}
