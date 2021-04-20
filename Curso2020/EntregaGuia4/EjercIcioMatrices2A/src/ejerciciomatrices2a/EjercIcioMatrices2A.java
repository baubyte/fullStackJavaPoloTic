/** "Consigna del Ejercicio"
 * Llevar a cabo un programa que permite cargar completamente con números 5 una matriz de 4x5 (4 filas, 5 columnas).
 */
package ejerciciomatrices2a;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercIcioMatrices2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matriz de de 4 x 5
        int matrizNumeros[][] = new int[4][5];
        /**
         * Recorremos la Matriz y la Vamos llenando con Numeros 5
         */
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                matrizNumeros[f][c] = 5;
            }
        }
        //Mostramos la Matriz que se lleno con Numeros 5
        System.out.println("Los Datos Almacenado en la Matriz son:");
        for (int f = 0; f < 4; f++) {
            System.out.print("|");
            for (int c = 0; c < 5; c++) {
                System.out.print(matrizNumeros[f][c]);
              //Si No es la ultima columna agregamos un TAB para seprar
                if (c != matrizNumeros[f].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

}
