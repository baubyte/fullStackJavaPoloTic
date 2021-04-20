/*
*Cunata regresiva de para el año nuevo desde el 10 al 0
*
 */
package ejercicio4;


/**
 *
 * @author Martin Pared Baez <paredbaez.martin@gmail.com>
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 10;
        System.out.println("Cuenta Regresiva Para Año Nuevo");
        while (contador >=0 && contador<=10) {
            System.out.println(contador);
            contador--;
        }

    }

}
