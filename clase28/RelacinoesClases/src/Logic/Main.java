
package Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario();
        usuario.setUsuario("baubyte");
        usuario.setPassword("123456");
        
         Usuario usuario2 = new Usuario();
        usuario2.setUsuario("baubyte2");
        usuario2.setPassword("123456");
        
        Empleado empleado = new Empleado();
        empleado.setNombre("BAUBYTE");
        empleado.setApellido("BAUBYTE");
        empleado.setDni("12345678");
        empleado.setCargo("Vendedor");
        empleado.setUsuario(usuario);
        
         Empleado empleado2 = new Empleado();
        empleado2.setNombre("BAUBYTE2");
        empleado2.setApellido("BAUBYTE2");
        empleado2.setDni("123456789");
        empleado2.setCargo("Vendedor 2");
        empleado2.setUsuario(usuario2);
        
        Controller controller = new Controller();
        
        controller.crearUsuario(usuario);
        controller.crearEmpleado(empleado);
        
        controller.crearUsuario(usuario2);
        controller.crearEmpleado(empleado2);
        
        Juego juego = new Juego();
        juego.setNombre("calecita");
        juego.setEdad_minima(4);
        juego.setCapacidad(30);
        
        List<Empleado> empleados = new ArrayList<Empleado>();
               empleados.add(empleado);
               empleados.add(empleado2);
                
        juego.setEmpleados(empleados);
        
        controller.crearJuego(juego);
        
        
    }
    
}
