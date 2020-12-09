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
     * Instancias de los de los JPA Controller de Cada Entidad
     */
    //JPA Controller Cliente
    ClienteJpaController clienteJPA = new ClienteJpaController();
    //JPA Controller Empleado
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    //JPA Controller Entrada
    EntradaJpaController entradaJPA = new EntradaJpaController();
    //JPA Controller Horario Juego
    HorarioJuegoJpaController horarioJuegoJPA = new HorarioJuegoJpaController();
    //JPA Controller Juego
    JuegoJpaController juegoJPA = new JuegoJpaController();
    //JPA Controller Rol
    RolJpaController rolJPA = new RolJpaController();
    //JPA Controller Usuario
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();

    /**
     * Crear un Usuario
     * @param usuario
     */
    public void crearUsuario(Usuario usuario) {

        usuarioJPA.create(usuario);
    }

    public void crearEmpleado(Empleado empleado) {

        empleadoJPA.create(empleado);
    }

    public void crearJuego(Juego juego) {

        juegoJPA.create(juego);
    }

}
