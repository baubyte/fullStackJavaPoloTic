package Logic;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Pato extends Animal implements Volador {

    public Pato() {
    }
    
    @Override
    public void volar() {
        System.out.println("Estoy Volando y Soy un Pato");
    }

    @Override
    public void cambiarPlumas() {
        System.out.println("Estoy Cambiando Plumas y Soy un Pato");
    }
    
    @Override
    public void soyAnimal(){
        System.out.println("Soy un Animal y soy un Pato.");
    }
}
