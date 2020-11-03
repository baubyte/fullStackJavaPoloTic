package Logic;

import java.util.Date;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Alumno {
    String dni;
    String apellido;
    String nombre;
    String direccion;
    Date fechaNacimiento;
    String telefono;

    public Alumno() {
    }

    public Alumno(String dni, String apellido, String nombre, String direccion, Date fechaNacimiento, String telefono) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }
    

    
    
    public void mostrarNombre(){
        System.out.println("El Nombre dek Alumno es "+nombre);
    }
    public String obtenerNombre(){
        return (nombre);
    } 
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
}
