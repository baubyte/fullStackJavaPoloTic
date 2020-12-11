package Persistence;

import Logic.Cliente;
import Logic.Empleado;
import Logic.Entrada;
import Logic.HorarioJuego;
import Logic.Juego;
import Logic.Rol;
import Logic.Usuario;
import Persistence.exceptions.NonexistentEntityException;
import java.sql.Time;
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
     *
     * @return totalEntradas
     */
    public int contarEntradas() {
        int totalEntradas = entradaJPA.getEntradaCount();
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
        int totalEntradas = entradaJPA.getEntradaCount(horaEntrada);
        return totalEntradas;
    }

    /*---------------------------------- Metodos de la Entidad HorarioJuego ---------------------------------------------*/
    /**
     * Crea un Horario para un Juego
     *
     * @param horarioJuego
     */
    public void crearHorarioJuedo(HorarioJuego horarioJuego) {
        horarioJuegoJPA.create(horarioJuego);

    }

    /**
     * Edita un Horario de un Juego
     *
     * @param horarioJuego
     * @throws java.lang.Exception
     */
    public void editarHorarioJuego(HorarioJuego horarioJuego) throws Exception {
        horarioJuegoJPA.edit(horarioJuego);
    }

    /**
     * Borrar un Horario de un Juego
     *
     * @param idHorarioJuego
     * @throws Persistence.exceptions.NonexistentEntityException
     */
    public void borrarHorarioJuego(int idHorarioJuego) throws NonexistentEntityException {
        horarioJuegoJPA.destroy(idHorarioJuego);
    }

    /**
     * Obtiene todos los Horarios de los Juegos
     *
     * @return horarioJuegos
     */
    public List<HorarioJuego> obtenerHorarioJuegos() {
        List<HorarioJuego> horarioJuegos = horarioJuegoJPA.findHorarioJuegoEntities();
        return horarioJuegos;
    }

    /**
     * Busca un Horario de Juego por id
     *
     * @param idHorarioJuego
     * @return horarioJuego
     */
    public HorarioJuego buscarHorarioJuego(int idHorarioJuego) {
        HorarioJuego horarioJuego = horarioJuegoJPA.findHorarioJuego(idHorarioJuego);
        return horarioJuego;
    }

    /**
     * Cuenta todos los Horario de los Juegos
     *
     * @return totalHorarioJuegos
     */
    public int contarHorarioJuegos() {
        int totalHorarioJuegos = horarioJuegoJPA.getHorarioJuegoCount();
        return totalHorarioJuegos;
    }

    /*---------------------------------- Metodos de la Entidad Juego ---------------------------------------------*/
    /**
     * Crea un Juego
     *
     * @param juego
     */
    public void crearJuego(Juego juego) {
        juegoJPA.create(juego);
    }

    /**
     * Edita un Juego
     *
     * @param juego
     * @throws java.lang.Exception
     */
    public void editarJuego(Juego juego) throws Exception {
        juegoJPA.edit(juego);
    }

    /**
     * Borra un Juego por el id
     *
     * @param idJuego
     * @throws Persistence.exceptions.NonexistentEntityException
     */
    public void borrarJuego(int idJuego) throws NonexistentEntityException {
        juegoJPA.destroy(idJuego);
    }

    /**
     * Obtener todos los Juegos
     *
     * @return juegos
     */
    public List<Juego> obtenerJuegos() {
        List<Juego> juegos = juegoJPA.findJuegoEntities();
        return juegos;
    }

    /**
     * Busca un Juego por id
     *
     * @param idJuego
     * @return juego
     */
    public Juego buscarJuego(int idJuego) {
        Juego juego = juegoJPA.findJuego(idJuego);
        return juego;
    }

    /**
     * Cuenta todos los Juegos Disponibles
     *
     * @return totalJuegos
     */
    public int contarJuegos() {
        int totalJuegos = juegoJPA.getJuegoCount();
        return totalJuegos;
    }

    /*---------------------------------- Metodos de la Entidad Rol ---------------------------------------------*/
    /**
     * Crea un Rol para asignar a los Usuarios
     *
     * @param rol
     */
    public void crearRol(Rol rol) {
        rolJPA.create(rol);
    }

    /**
     * Editar un Rol
     *
     * @param rol
     * @throws java.lang.Exception
     */
    public void editarRol(Rol rol) throws Exception {
        rolJPA.edit(rol);
    }

    /**
     * Borra un Rol por di
     *
     * @param idRol
     * @throws Persistence.exceptions.NonexistentEntityException
     */
    public void borrarRol(int idRol) throws NonexistentEntityException {
        rolJPA.destroy(idRol);
    }

    /**
     * Obtiene todos los Roles disponibles
     *
     * @return roles
     */
    public List<Rol> obtenerRoles() {
        List<Rol> roles = rolJPA.findRolEntities();
        return roles;
    }

    /**
     * Busca un Rol por el id
     *
     * @param idRol
     * @return rol
     */
    public Rol buscarRol(int idRol) {
        Rol rol = rolJPA.findRol(idRol);
        return rol;
    }

    /**
     * Cuenta todos los Roles Disponibles
     *
     * @return totalRoles
     */
    public int contarRoles() {
        int totalRoles = rolJPA.getRolCount();
        return totalRoles;
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

    /**
     * Borra un Usuario por id
     *
     * @param idUsuario
     * @throws Persistence.exceptions.NonexistentEntityException
     */
    public void borrarUsuario(int idUsuario) throws NonexistentEntityException {
        usuarioJPA.destroy(idUsuario);
    }

    /**
     * Obtiene todos los Usuarios
     *
     * @return usuarios
     */
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = usuarioJPA.findUsuarioEntities();
        return usuarios;
    }

    /**
     * Buscar un Usuario por id
     *
     * @param idUsuario
     * @return usuario
     */
    public Usuario buscarUsuario(int idUsuario) {
        Usuario usuario = usuarioJPA.findUsuario(idUsuario);
        return usuario;
    }

    /**
     * Cuneta todos los Usuarios
     * @return totalUsuarios
     */
    public int contarUsuarios() {
        int totalUsuarios = usuarioJPA.getUsuarioCount();
        return totalUsuarios;
    }
}
