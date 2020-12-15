package Logic;

import Persistence.PersistenceController;
import Persistence.exceptions.NonexistentEntityException;
import java.sql.Time;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Controller {

    /**
     * Instancia del Contralador de Persistencia. Tiene todos los metodos de los
     * controladores JPA de cada Entidad
     */
    PersistenceController persistenceController = new PersistenceController();

    /*---------------------------------- Metodos de la Entidad Cliente ---------------------------------------------*/
    /**
     * Crea un Cliente
     *
     * @param cliente
     */
    public void crearCliente(Cliente cliente) {
        persistenceController.crearCliente(cliente);
    }

    /**
     * Edita un Cliente
     *
     * @param cliente
     */
    public void editarCliente(Cliente cliente) {
        try {
            persistenceController.editarCliente(cliente);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Elimina un Cliente
     *
     * @param idCliente
     */
    public void borrarCliente(int idCliente) {
        try {
            persistenceController.borrarCliente(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene todos los Clientes
     *
     * @return clientes
     */
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = persistenceController.listarClientes();
        return clientes;
    }

    /**
     * Busca un cliente por el id
     *
     * @param idCliente
     * @return Cliente
     */
    public Cliente buscarCliente(int idCliente) {
        Cliente cliente = persistenceController.buscarCliente(idCliente);
        return cliente;
    }

    /**
     * Cuenta todos los Clientes disponibles
     *
     * @return totalClientes
     */
    public int contarClientes() {
        int totalClientes = persistenceController.contarClientes();
        return totalClientes;
    }

    /*---------------------------------- Metodos de la Entidad Empleado ---------------------------------------------*/
    /**
     * Crea un Empleado
     *
     * @param empleado
     */
    public void crearEmpleado(Empleado empleado) {
        persistenceController.crearEmpleado(empleado);
    }

    /**
     * Edita un Empleado
     *
     * @param empleado
     */
    public void editarEmpleado(Empleado empleado) {
        try {
            persistenceController.editarEmpleado(empleado);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Elimina un Empleado
     *
     * @param idEmpleado
     */
    public void borrarEmpleado(int idEmpleado) {
        try {
            persistenceController.borrarEmpleado(idEmpleado);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene todos los Empleados
     *
     * @return empleados
     */
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = persistenceController.obtenerEmpleados();
        return empleados;
    }

    /**
     * Busca un Empleado por el id
     *
     * @param idEmpleado
     * @return empleado
     */
    public Empleado buscarEmpleado(int idEmpleado) {
        Empleado empleado = persistenceController.buscarEmpleado(idEmpleado);
        return empleado;
    }

    /**
     * Cuenta todos los Empleados
     *
     * @return totalEmpleados
     */
    public int contrarEmpleados() {
        int totalEmpleados = persistenceController.contrarEmpleados();
        return totalEmpleados;
    }

    /*---------------------------------- Metodos de la Entidad Entrada ---------------------------------------------*/
    /**
     * Crea una Entrada
     *
     * @param entrada
     */
    public void crearEntrada(Entrada entrada) {
        persistenceController.crearEntrada(entrada);
    }

    /**
     * Edita una Entrada
     *
     * @param entrada
     */
    public void editarEntrada(Entrada entrada) {
        try {
            persistenceController.editarEntrada(entrada);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Elimina una Entrada por id
     *
     * @param idEntrada
     */
    public void borrarEntrada(int idEntrada) {
        try {
            persistenceController.borrarEmpleado(idEntrada);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene todas las Entradas
     *
     * @return entradas
     */
    public List<Entrada> obtenerEntradas() {
        List<Entrada> entradas = persistenceController.obtenerEntradas();
        return entradas;
    }

    /**
     * Busca una Entrada por id
     *
     * @param idEntrada
     * @return entrada
     */
    public Entrada buscarEntrada(int idEntrada) {
        Entrada entrada = persistenceController.buscarEntrada(idEntrada);
        return entrada;
    }

    /**
     * Cuenta todas las Entradas
     *
     * @return totalEntradas
     */
    public int contarEntradas() {
        int totalEntradas = persistenceController.contarEntradas();
        return totalEntradas;
    }

    /**
     * Cuenta todas las Entradas por un Horario especifico (aplicamos
     * sebrecarga)
     *
     * @param horaEntrada
     * @return totalEntradas
     */
    public int contarEntradas(Time horaEntrada) {
        int totalEntradas = persistenceController.contarEntradas(horaEntrada);
        return totalEntradas;
    }

    /*---------------------------------- Metodos de la Entidad HorarioJuego ---------------------------------------------*/
    /**
     * Crea un Horario para un Juego
     *
     * @param horarioJuego
     */
    public void crearHorarioJuedo(HorarioJuego horarioJuego) {
        persistenceController.crearHorarioJuedo(horarioJuego);
    }

    /**
     * Edita un Horario de un Juego
     *
     * @param horarioJuego
     */
    public void editarHorarioJuego(HorarioJuego horarioJuego) {
        try {
            persistenceController.editarHorarioJuego(horarioJuego);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Borrar un Horario de un Juego
     *
     * @param idHorarioJuego
     */
    public void borrarHorarioJuego(int idHorarioJuego) {
        try {
            persistenceController.borrarHorarioJuego(idHorarioJuego);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene todos los Horarios de los Juegos
     *
     * @return horarioJuegos
     */
    public List<HorarioJuego> obtenerHorarioJuegos() {
        List<HorarioJuego> horarioJuegos = persistenceController.obtenerHorarioJuegos();
        return horarioJuegos;
    }

    /**
     * Busca un Horario de Juego por id
     *
     * @param idHorarioJuego
     * @return horarioJuego
     */
    public HorarioJuego buscarHorarioJuego(int idHorarioJuego) {
        HorarioJuego horarioJuego = persistenceController.buscarHorarioJuego(idHorarioJuego);
        return horarioJuego;
    }

    /**
     * Cuenta todos los Horario de los Juegos
     *
     * @return totalHorarioJuegos
     */
    public int contarHorarioJuegos() {
        int totalHorarioJuegos = persistenceController.contarHorarioJuegos();
        return totalHorarioJuegos;
    }

    /*---------------------------------- Metodos de la Entidad Juego ---------------------------------------------*/
    /**
     * Crea un Juego
     *
     * @param juego
     */
    public void crearJuego(Juego juego) {
        persistenceController.crearJuego(juego);
    }

    /**
     * Edita un Juego
     *
     * @param juego
     */
    public void editarJuego(Juego juego) {
        try {
            persistenceController.editarJuego(juego);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Borra un Juego por el id
     *
     * @param idJuego
     */
    public void borrarJuego(int idJuego) {
        try {
            persistenceController.borrarJuego(idJuego);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtener todos los Juegos
     *
     * @return juegos
     */
    public List<Juego> obtenerJuegos() {
        List<Juego> juegos = persistenceController.obtenerJuegos();
        return juegos;
    }

    /**
     * Busca un Juego por id
     *
     * @param idJuego
     * @return juego
     */
    public Juego buscarJuego(int idJuego) {
        Juego juego = persistenceController.buscarJuego(idJuego);
        return juego;
    }

    /**
     * Cuenta todos los Juegos Disponibles
     *
     * @return totalJuegos
     */
    public int contarJuegos() {
        int totalJuegos = persistenceController.contarJuegos();
        return totalJuegos;
    }

    /*---------------------------------- Metodos de la Entidad Rol ---------------------------------------------*/
    /**
     * Crea un Rol para asignar a los Usuarios
     *
     * @param rol
     */
    public void crearRol(Rol rol) {
        persistenceController.crearRol(rol);
    }

    /**
     * Editar un Rol
     *
     * @param rol
     */
    public void editarRol(Rol rol) {
        try {
            persistenceController.editarRol(rol);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Borra un Rol por di
     *
     * @param idRol
     */
    public void borrarRol(int idRol) {
        try {
            persistenceController.borrarRol(idRol);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene todos los Roles disponibles
     *
     * @return roles
     */
    public List<Rol> obtenerRoles() {
        List<Rol> roles = persistenceController.obtenerRoles();
        return roles;
    }

    /**
     * Busca un Rol por el id
     *
     * @param idRol
     * @return rol
     */
    public Rol buscarRol(int idRol) {
        Rol rol = persistenceController.buscarRol(idRol);
        return rol;
    }

    /**
     * Cuenta todos los Roles Disponibles
     *
     * @return totalRoles
     */
    public int contarRoles() {
        int totalRoles = persistenceController.contarRoles();
        return totalRoles;
    }

    /*---------------------------------- Metodos de la Entidad Usuario ---------------------------------------------*/
    /**
     * Crear un Usuario
     *
     * @param usuario
     */
    public void crearUsuario(Usuario usuario) {
        persistenceController.crearUsuario(usuario);
    }

    /**
     * Edita un Usuario
     *
     * @param usuario
     */
    public void editarUsuario(Usuario usuario) {
        try {
            persistenceController.editarUsuario(usuario);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Borra un Usuario por id
     *
     * @param idUsuario
     */
    public void borrarUsuario(int idUsuario) {
        try {
            persistenceController.borrarUsuario(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene todos los Usuarios
     *
     * @return usuarios
     */
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = persistenceController.obtenerUsuarios();
        return usuarios;
    }

    /**
     * Buscar un Usuario por id
     *
     * @param idUsuario
     * @return usuario
     */
    public Usuario buscarUsuario(int idUsuario) {
        Usuario usuario = persistenceController.buscarUsuario(idUsuario);
        return usuario;
    }

    /**
     * Cuneta todos los Usuarios
     *
     * @return totalUsuarios
     */
    public int contarUsuarios() {
        int totalUsuarios = persistenceController.contarUsuarios();
        return totalUsuarios;
    }
}
