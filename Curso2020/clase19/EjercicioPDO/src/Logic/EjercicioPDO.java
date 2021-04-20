package Logic;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercicioPDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente("12345678", "Martin", "BAUBYTE", "12345644454");
        
        Cliente clienteVacio = new Cliente();
        System.out.println("-------ANTES----------");
        System.out.println(cli.getApellido());
        System.out.println(clienteVacio.getApellido());
        
        
        clienteVacio.setDni("1231474787");
        clienteVacio.setNombre("test");
        clienteVacio.setApellido("testig");
        clienteVacio.setCelular("12147777");
        
        System.out.println("-------DESPUES----------");
        System.out.println(clienteVacio.getApellido());
    }
    
}
