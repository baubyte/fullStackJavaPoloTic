package Logic;

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
public class Rol {

    //Atribustos Principales
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    //Atributos Basicos
    @Basic
    String nombre;
    String descripcion;

    /**
     * Constructor Vacio
     */
    public Rol() {
    }

    /**
     * Constructor con Atributos
     *
     * @param id
     * @param nombre
     * @param descripcion
     */
    public Rol(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtenemos el id del Rol
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Seteamos el id del Rol
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenemos el Nombre del Rol
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Seteamos el Nombre del Rol
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtenemos el Descripcion del Rol
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Seteamos el Descripcion del Rol
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
