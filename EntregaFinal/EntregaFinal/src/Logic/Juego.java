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

    //Atributos Principal
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @OneToMany
    private List<Empleado> empleados;
    @OneToMany
    private List<HorarioJuego> horarios;
    @OneToMany(mappedBy = "juego")
    private List<Entrada> entradas;
    //Atributos Basicos
    @Basic
    private String nombre;
    private String descripcion;
    private int capacidad;
    private int edad_minima;

    /**
     * Constructor Vacio
     */
    public Juego() {
    }

    /**
     * Constructor con Atributos
     *
     * @param id
     * @param empleados
     * @param horarios
     * @param entradas
     * @param nombre
     * @param descripcion
     * @param capacidad
     * @param edad_minima
     */
    public Juego(int id, List<Empleado> empleados, List<HorarioJuego> horarios, List<Entrada> entradas, String nombre, String descripcion, int capacidad, int edad_minima) {
        this.id = id;
        this.empleados = empleados;
        this.horarios = horarios;
        this.entradas = entradas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.edad_minima = edad_minima;
    }

    /**
     * Obtenemos el id del Juego
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Seteamos el id del Juego
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenemos los Empleados del Juego
     *
     * @return empleados
     */
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Seteamos los Empleados del Juego
     *
     * @param empleados
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Obtenemos los Horarios del Juego
     *
     * @return horarios
     */
    public List<HorarioJuego> getHorarios() {
        return horarios;
    }

    /**
     * Seteamos los Horarios del Juego
     *
     * @param horarios
     */
    public void setHorarios(List<HorarioJuego> horarios) {
        this.horarios = horarios;
    }

    /**
     * Obtenemos el Nombre del Juego
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Seteamos el Nombre del Juego
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtenemos la Descripcion del Juego
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Seteamos la Descripcion del Juego
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtenemos la Capacidad del Juego
     *
     * @return capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Seteamos la Capacidad del Juego
     *
     * @param capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Obtenemos la Edad Minima del Juego
     *
     * @return edad_minima
     */
    public int getEdad_minima() {
        return edad_minima;
    }

    /**
     * Seteamos la Edad Minima del Juego
     *
     * @param edad_minima
     */
    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    /**
     * Obtenemos las Entradas del Juego
     *
     * @return entradas
     */
    public List<Entrada> getEntradas() {
        return entradas;
    }

    /**
     * Seteamos las Entradas del Juego
     *
     * @param entradas
     */
    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

}
