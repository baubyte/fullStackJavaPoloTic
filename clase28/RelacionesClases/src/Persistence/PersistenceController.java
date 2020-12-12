package Persistence;

import Logic.Empleado;
import Logic.Juego;
import Logic.Usuario;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class PersistenceController {

    /**
     * JPA Controller Usuario
     */
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    /**
     * JPA Controller Empleado
     */
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    /**
     * JPA Controller Juego
     */
    JuegoJpaController juegoJPA = new JuegoJpaController();

    public void crearUsuario(Usuario usuario) {

        usuarioJPA.create(usuario);
    }

    public void crearEmpleado(Empleado empleado) {

        empleadoJPA.create(empleado);
    }

    public int contarEmpleado() {

        return empleadoJPA.getEmpleadoCount();
    }

    public int contarEmpleado(int idJuego) {

        return empleadoJPA.getEmpleadoCount(idJuego);
    }

    public void crearJuego(Juego juego) {

        juegoJPA.create(juego);
    }

}
