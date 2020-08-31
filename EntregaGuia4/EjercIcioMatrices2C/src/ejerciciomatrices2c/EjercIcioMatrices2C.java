/** "Consigna del Ejercicio"
 * En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario. Cada fila corresponde a
 * las notas y al promedio de cada alumno.
 *      Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones de cada fila las notas del
 *      alumno y que en la última columna se calculen los promedios.
 *
 *      Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente
 *      recorriendo la matriz.
 */
package ejerciciomatrices2c;

import java.util.Scanner;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercIcioMatrices2C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matriz de de 4 x 3 para Almacenar las Razas de Perros
        double matrizNotas[][] = new double[4][4];
        //Scanner para el Ingreso de la Informacion
        Scanner ingresoDatos = new Scanner(System.in);
        //Variable para Sumar las Notas
        double sumaNotas;
        /**
         * Recorremos la Matriz y la Vamos llenando con las Notas de los Alumnos
         * Ingredas por teclado
         */
        for (int f = 0; f < 4; f++) {
            //Igualamos a 0 para cuando Pasamos al Siguiente Alumno
            sumaNotas = 0;
            for (int c = 0; c < 3; c++) {
                System.out.print("Ingrese las Notas del Alumno " + (f + 1) + " :  ");
                matrizNotas[f][c] = ingresoDatos.nextDouble();
                //Sumamos las Notas a Medida que se Van ingresando
                sumaNotas = sumaNotas + matrizNotas[f][c];
            }
            //Calculamos el Promedio para el Alumno y lo Gurdamos en la Ultima Columna
            matrizNotas[f][3] = sumaNotas / 3;
        }
        System.out.println("*********************************************************************************************");
        for (int f = 0; f < 4; f++) {
            System.out.println("Las Notas del Alumno " + (f + 1) + " fueron: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("La Nota  " + (c + 1) + " es:  " + matrizNotas[f][c]);
            }
            System.out.println("El Promedio es: " + matrizNotas[f][3]);
            System.out.println("*********************************************************************************************");
        }
    }

}
