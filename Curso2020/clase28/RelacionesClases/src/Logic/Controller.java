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

    public int contarEmpleado() {
        return persistenceController.contarEmpleado();
    }

    public int contarEmpleado(int idJuego) {
        return persistenceController.contarEmpleado(idJuego);
    }

    public void crearJuego(Juego juego) {
        persistenceController.crearJuego(juego);
    }
}
