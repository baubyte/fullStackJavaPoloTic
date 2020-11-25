package Logic;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Pato extends Animal implements Volador {
    
    @Override
    public void volar() {
        System.out.println("Estoy Volando y Soy un Pato");
    }

    @Override
    public void cambiarPlumas() {
        System.out.println("Estoy Cambiando Plumas y Soy un Pato");
    }
}
