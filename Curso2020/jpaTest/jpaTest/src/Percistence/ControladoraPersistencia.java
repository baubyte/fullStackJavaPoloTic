package Percistence;

import Logic.Alumno;
import Percistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class ControladoraPersistencia {

    AlumnoJpaController alumnoJpa = new AlumnoJpaController();
    
    public void crearAlumno (Alumno alumno){
        try {
            alumnoJpa.create(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarAlumno(String idAlumno){
        try {
            alumnoJpa.destroy(idAlumno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarAlumno(Alumno alumno2) {
        try {
            alumnoJpa.edit(alumno2);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Alumno> traerAlumnos() {
        List<Alumno> listaAlumnos = alumnoJpa.findAlumnoEntities();
        return listaAlumnos;
    }

    public Alumno buscarAlumno(String id) {
        Alumno alumno = alumnoJpa.findAlumno(id);
        return alumno;
    }
    
}
