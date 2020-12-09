package Logic;

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
public class Usuario {

    //Atribustos Principales
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    //Atributos Basicos
    @Basic
    String usuario;
    String password;
    @OneToOne
    Rol rol;

    /**
     * Constructor Vacio
     */
    public Usuario() {
    }

    /**
     * Constructor con Atributos
     *
     * @param id
     * @param usuario
     * @param password
     * @param rol
     */
    public Usuario(int id, String usuario, String password, Rol rol) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }

    /**
     * Obtenemos el ID del Usuario
     *
     * @return ID
     */
    public int getId() {
        return id;
    }

    /**
     * Seteamos el ID del Usuario
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenemos el Usuario
     *
     * @return usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Seteamos el Usuario
     *
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtenemos la Contraseña
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Seteamos la Contraseña
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtemos el Rol del Usuario
     *
     * @return rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * Seteamos el Rol del Usuario
     * @param rol
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
