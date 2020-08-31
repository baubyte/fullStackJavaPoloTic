/** "Consigna del Ejercicio" 
 * Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3
 * (3 filas, 3 columnas) con razas de perros. Una vez cargada la misma, será necesario realizar un recorrido por la misma
 * y mostrar los datos cargados por pantalla.
 */
package ejerciciomatrices2b;

import java.util.Scanner;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercIcioMatrices2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matriz de de 4 x 3 para Almacenar las Razas de Perros
        String matrizRazas[][] = new String[3][3];
        //Scanner para el Ingreso de la Informacion
        Scanner ingresoDatos = new Scanner(System.in);
        /**
         * Recorremos la Matriz y la Vamos llenando con las Razas Ingredas por
         * teclado
         */
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Ingrese una Raza de Perro: ");
                matrizRazas[f][c] = ingresoDatos.nextLine();
            }
        }
        System.out.println("*********************************************************************************************");
        System.out.println("*********************************************************************************************");
        System.out.println("                    Las Razas Ingresadas Fueron");
        
        for (int f = 0; f < 3; f++) {
            System.out.print("|");
            for (int c = 0; c < 3; c++) {
                System.out.print(matrizRazas[f][c]);
                //Si No es la ultima columna agregamos un TAB para seprar
                if (c != matrizRazas[f].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

}
