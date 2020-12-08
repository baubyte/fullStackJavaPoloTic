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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Basic
    String dni;
    String nombre;
    String apellido;
    String cargo;
    @OneToOne
    Usuario usuario;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String cargo, Usuario usuario) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.usuario = usuario;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
