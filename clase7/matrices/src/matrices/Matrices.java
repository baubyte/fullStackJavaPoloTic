package matrices;

import java.util.Scanner;

/**
 *
 * @author Pared Beaz Martin Jose <paredbaez.matin@gmail.com>
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notas[][] = new double [4][4];
        Scanner teclado = new Scanner(System.in);
        
        /**Recorremos Para carcgar las Notas*/
        for (int f = 0; f < 4; f++) {
            System.out.println("Ingrese las Notas del Alumno " + (f+1) + " : ");
            for (int c = 0; c < 3; c++) {
                notas[f][c] = teclado.nextDouble();
            }
        }
        /**Variable para Sumar las Notas*/
        double suma;
        /*Recorremos para Calcular el Promedio*/;
        for (int f = 0; f < 4; f++) {
            /**Variable para Sumar las Notas lo Ponemos en 0 en cada Vuelta*/
            suma =0;
            for (int c = 0; c < 3; c++) {
                suma = suma + notas[f][c];
            }
            /**Calculamos el Promedio*/
            notas[f][3] = suma / 3;
        }
        /**Mostramos las Noras*/
        for (int f = 0; f < 4; f++) {
            System.out.println("Las Notas del Alumno "+(f+1) +" fueron: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("La Nota  " +(c+1) + " es:  " +notas[f][c]);
            }
            System.out.println("El Promedio es: " + notas[f][3]);
        }
    }
    
}
