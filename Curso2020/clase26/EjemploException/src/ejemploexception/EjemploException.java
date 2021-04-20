package ejemploexception;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjemploException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
                double resultado = 10/0;
        } catch (Exception e) {
            System.out.println("No se Puede Dividir por Cero");
        }
        
        try {
             String array [] = {"1","2","3"};
             System.out.println("La edad de la Posicion 4 es: " + array [4]);
        } catch (Exception e) {
            System.out.println("La Posicion no Existe.");
        }
        
    }
    
}
