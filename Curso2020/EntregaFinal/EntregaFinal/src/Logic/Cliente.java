package Logic;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
public class Cliente implements Serializable {
    //Atributos Principales
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @OneToMany(mappedBy = "cliente")
    private List<Entrada> entradas;
    //Atributos Basicos
    @Basic
    private String apellido;
    private String nombre;
    private String email;
    private String nro_tarjeta;

    /**
     * Constructor Vacio
     */
    public Cliente() {
    }

    /**
     * Constructor con Atributos
     *
     * @param id
     * @param entradas
     * @param apellido
     * @param nombre
     * @param nro_tarjeta
     * @param email
     */
    public Cliente(int id, List<Entrada> entradas, String apellido, String nombre, String email, String nro_tarjeta) {
        this.id = id;
        this.entradas = entradas;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.nro_tarjeta = nro_tarjeta;
    }

    /**
     * Obtenemos el id del Cliente
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Seteamos el id del Cliente
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenemos el Apellido del Cliente
     *
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Seteamos el Apellido del Cliente
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtenemos el Nombre del Cliente
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Seteamos el Nombre del Cliente
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtenemos el Email del Cliente
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Seteamos el Email del Cliente
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtenemos el Nro de Terjeta del Cliente
     *
     * @return nro_tarjeta
     */
    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    /**
     * Seteamos el Nro de Terjeta del Cliente
     *
     * @param nro_tarjeta
     */
    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    /**
     * Obtenemos las Entradas del Cliente
     *
     * @return entradas
     */
    public List<Entrada> getEntradas() {
        return entradas;
    }

    /**
     * Seteamos las Entradas del Cliente
     *
     * @param entradas
     */
    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

}
