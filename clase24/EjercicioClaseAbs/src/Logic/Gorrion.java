
package Logic;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Gorrion extends Animal implements Volador {

    @Override
    public void volar() {
        System.out.println("Estoy Volando y Soy un Gorrion");
    }

    @Override
    public void cambiarPlumas() {
        System.out.println("Estoy Cambiando Plumas y Soy un Gorrion");
    }

}
