package Logic;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Tiburon extends Animal implements Acuatico {

    public Tiburon() {
    }
    @Override
    public void nadar() {
        System.out.println("Soy un Tiburon y puedo Nadar.");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("Soy un Tiburon y puedo Respirar Bajo el Agua.");
    }

    @Override
    public void soyAnimal() {
        System.out.println("Soy un Animal y soy un Tiburon.");
    }

}
