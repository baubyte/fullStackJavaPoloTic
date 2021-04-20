package Logic;

import Percistence.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class JpaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**Creamos un Alumno*/
        //Alumno alumno = new Alumno("5454545454", "Pared Baez", "Martin Jose", new Date("02/24/1990"));
        //Alumno alumno2 = new Alumno("123", "BAUBYTE", "BAUBYTE", new Date("02/24/1990"));
        
        ControladoraPersistencia control  = new ControladoraPersistencia();
        
        /**Insertamos un Alumno*/
        //control.crearAlumno(alumno2);
        /**Eliminar Alumno*/
        //control.eliminarAlumno("35001377");
        /**Editar Un Alumno*/
        //alumno2.setApellido("BAUBYTE2");
        //alumno2.setNombre("BAUBYTE2");
        //control.modificarAlumno(alumno2);
        
        /**Listar Alumnos*/
        
        //List <Alumno> listaAlumnos = control.traerAlumnos();
        //for (Alumno alumno : listaAlumnos) {
         //       System.out.println(alumno.getDni() +" "+ alumno.getApellido()+" "+ alumno.getNombre());
         //}
         
         /**Buscar un Alumno*/
        Alumno alumno = control.buscarAlumno("123");
        System.out.println(alumno.getDni() +" "+ alumno.getApellido()+" "+ alumno.getNombre());
        
    }
    
}
