package Persistence;

import Logic.Cliente;
import Logic.Empleado;
import Logic.Entrada;
import Logic.Juego;
import Logic.Usuario;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;

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

    /*---------------------------------- Metodos de la Entidad Cliente ---------------------------------------------*/
    /**
     * Crea un Cliente
     *
     * @param cliente
     */
    public void crearCliente(Cliente cliente) {
        clienteJPA.create(cliente);
    }

    /**
     * Edita un Cliente
     *
     * @param cliente
     * @throws java.lang.Exception
     */
    public void editarCliente(Cliente cliente) throws Exception {
        clienteJPA.edit(cliente);
    }

    /**
     * Elimina un Cliente
     *
     * @param idCliente
     * @throws Persistence.exceptions.NonexistentEntityException
     */
    public void borrarCliente(int idCliente) throws NonexistentEntityException {
        clienteJPA.destroy(idCliente);
    }

    /**
     * Obtiene todos los Clientes
     *
     * @return clientes
     */
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteJPA.findClienteEntities();
        return clientes;
    }

    /**
     * Busca un cliente por el id
     *
     * @param idCliente
     * @return Cliente
     */
    public Cliente buscarCliente(int idCliente) {
        Cliente cliente = clienteJPA.findCliente(idCliente);
        return cliente;
    }

    /**
     * Cuenta todos los Clientes disponibles
     *
     * @return totalClientes
     */
    public int contarClientes() {
        int totalClientes = clienteJPA.getClienteCount();
        return totalClientes;
    }

    /*---------------------------------- Metodos de la Entidad Empleado ---------------------------------------------*/
    /**
     * Crea un Empleado
     *
     * @param empleado
     */
    public void crearEmpleado(Empleado empleado) {

        empleadoJPA.create(empleado);
    }

    /**
     * Edita un Empleado
     *
     * @param empleado
     * @throws java.lang.Exception
     */
    public void editarEmpleado(Empleado empleado) throws Exception {
        empleadoJPA.edit(empleado);
    }

    /**
     * Elimina un Empleado
     *
     * @param idEmpleado
     * @throws Persistence.exceptions.NonexistentEntityException
     */
    public void borrarEmpleado(int idEmpleado) throws NonexistentEntityException {
        empleadoJPA.destroy(idEmpleado);
    }

    /**
     * Obtiene todos los Empleados
     *
     * @return empleados
     */
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = empleadoJPA.findEmpleadoEntities();
        return empleados;
    }

    /**
     * Busca un Empleado por el id
     *
     * @param idEmpleado
     * @return empleado
     */
    public Empleado buscarEmpleado(int idEmpleado) {
        Empleado empleado = empleadoJPA.findEmpleado(idEmpleado);
        return empleado;
    }

    /**
     * Cuenta todos los Empleados
     *
     * @return totalEmpleados
     */
    public int contrarEmpleados() {
        int totalEmpleados = empleadoJPA.getEmpleadoCount();
        return totalEmpleados;
    }

    /*---------------------------------- Metodos de la Entidad Entrada ---------------------------------------------*/
    /**
     * Crea una Entrada
     *
     * @param entrada
     */
    public void crearEntrada(Entrada entrada) {
        entradaJPA.create(entrada);
    }

    /**
     * Edita una Entrada
     *
     * @param entrada
     * @throws java.lang.Exception
     */
    public void editarEntrada(Entrada entrada) throws Exception {
        entradaJPA.edit(entrada);
    }

    /**
     * Elimina una Entrada por id
     *
     * @param idEntrada
     * @throws Persistence.exceptions.NonexistentEntityException
     */
    public void borrarEntrada(int idEntrada) throws NonexistentEntityException {
        entradaJPA.destroy(idEntrada);
    }

    /**
     * Obtiene todas las Entradas
     *
     * @return entradas
     */
    public List<Entrada> obtenerEntradas() {
        List<Entrada> entradas = entradaJPA.findEntradaEntities();
        return entradas;
    }

    /**
     * Busca una Entrada por id
     *
     * @param idEntrada
     * @return entrada
     */
    public Entrada buscarEntrada(int idEntrada) {
        Entrada entrada = entradaJPA.findEntrada(idEntrada);
        return entrada;
    }

    /**
     * Cuenta todas las Entradas
     * @return totalEntradas
     */
    public int contarEntradas() {
        int totalEntradas = entradaJPA.getEntradaCount();
        return totalEntradas;
    }

    /*---------------------------------- Metodos de la Entidad Usuario ---------------------------------------------*/
    /**
     * Crear un Usuario
     *
     * @param usuario
     */
    public void crearUsuario(Usuario usuario) {

        usuarioJPA.create(usuario);
    }

    /**
     * Edita un Usuario
     *
     * @param usuario
     * @throws java.lang.Exception
     */
    public void editarUsuario(Usuario usuario) throws Exception {
        usuarioJPA.edit(usuario);
    }

    public void crearJuego(Juego juego) {

        juegoJPA.create(juego);
    }
}
