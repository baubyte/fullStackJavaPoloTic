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
public class Juego implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
     @Basic
    String nombre;
    int capacidad;
    int edad_minima;
    @OneToMany(mappedBy = "juego")
    List<Empleado> empleados ;

    public Juego() {
    }

    public Juego(int id, String nombre, int capacidad, int edad_minima, List<Empleado> empleados) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.edad_minima = edad_minima;
        this.empleados = empleados;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    

}
