package Logic;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercicioMuebles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Mueble mueb = new Mueble("Mesa", 1.00, 0.50, "Aglomerado", 5);
       Mueble mueb1 = new Mueble("Silla", 0.60, 0.70, "MDF", 20);
       Mueble mueb2 = new Mueble("Cama", 2.10, 0.90, "Madera", 20);
       Mueble mueb3 = new Mueble();
       
        mueb3.setNombre("Banco");
        mueb3.setAlto(1.00);
        mueb3.setAncho(0.30);
        mueb3.setMaterial("Metal");
        mueb3.setCantidad(5);
       
        System.out.println("Nombre: " + mueb.getNombre() + " Material: " +mueb.getMaterial());
        System.out.println("Nombre: " + mueb1.getNombre() + " Material: " +mueb1.getMaterial());
        System.out.println("Nombre: " + mueb.getNombre() + " Material: " +mueb2.getMaterial());
        System.out.println("Nombre: " + mueb3.getNombre() + " Material: " +mueb3.getMaterial());
    }
    
}
