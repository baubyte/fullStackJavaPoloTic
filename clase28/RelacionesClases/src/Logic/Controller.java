package Logic;

import Persistence.PersistenceController;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
class Controller {

    /**
     * Instancia de la Persistencia
     */
    PersistenceController persistenceController = new PersistenceController();

    public void crearUsuario(Usuario usuario) {

        persistenceController.crearUsuario(usuario);

    }

    public void crearEmpleado(Empleado empleado) {

        persistenceController.crearEmpleado(empleado);
    }

    public void crearJuego(Juego juego) {
        persistenceController.crearJuego(juego);
    }
}
