package Logic;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
@Entity
public class Empleado implements Serializable {

    //Atributos Principales
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @OneToOne
   private  Usuario usuario;
    //Atributos Basicos
    @Basic
    private String dni;
    private String apellido;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;

    /**
     * Constructor Vacio
     */
    public Empleado() {
    }

    /**
     * Constructor con Atributos
     *
     * @param id
     * @param dni
     * @param apellido
     * @param nombre
     * @param telefono
     * @param direccion
     * @param usuario
     * @param email
     */
    public Empleado(int id, Usuario usuario, String dni, String apellido, String nombre, String telefono, String direccion, String email) {
        this.id = id;
        this.usuario = usuario;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    /**
     * Obtenemos el id del empleado
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Obtenemos el id del empleado
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenemos el DNI del empleado
     *
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Seteamos el DNI del empleado
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtenemos el Apellido del empleado
     *
     * @return APELLIDO
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Seteamos el Apellido del empleado
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtenemos el nombre del empleado
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Seteamos el nombre del empleado
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtenemos el Teledono del empleado
     *
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Seteamos el Telefonodel empleado
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtenemos la Direccion del empleado
     *
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Seteamos el Direccion del empleado
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtenemos el Email del empleado
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Seteamos el Email del empleado
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtenemos el Usuario del empleado
     *
     * @return usuario;
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Seteamos el Usuario del empleado
     *
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
