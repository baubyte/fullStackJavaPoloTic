package Logic;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercicioClaseAbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Mono mono = new Mono();
        mono.soyAnimal();
        System.out.println("-------------------------------------------------------------------------------------------");
        Gorrion gorrion = new Gorrion();
        gorrion.soyAnimal();
        gorrion.cambiarPlumas();
        gorrion.volar();
        System.out.println("-------------------------------------------------------------------------------------------");
        Pato pato = new Pato();
        pato.soyAnimal();
        pato.cambiarPlumas();
        pato.volar();
        System.out.println("-------------------------------------------------------------------------------------------");
        Tiburon tiburon = new Tiburon();
        tiburon.soyAnimal();
        tiburon.nadar();
        tiburon.respirarBajoAgua();
    }

}
