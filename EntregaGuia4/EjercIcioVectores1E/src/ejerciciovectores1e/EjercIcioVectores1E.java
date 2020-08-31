/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovectores1e;

import java.util.Scanner;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercIcioVectores1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Vectores Necesarios
         */
        //Vector para las Ciudades
        String[] ciudades = new String[5];
        //Vector para las Temperaturas Minimas
        double[] temperaturaMin = new double[5];
        //Vector para las Temperaturas Maximas
        double[] temperaturaMax = new double[5];
        //Scanner para el Ingreso de la Informacion
        Scanner ingresoDatos = new Scanner(System.in);

        /**
         * Variables para poder comparar la Temperatura mas Baja y las Mas Alta
         */
        double menor = 0, mayor = 0;
        /**
         * Variable para Guardar la Posicion en la que se Ecuntra la Ciudad con
         * la Temperatura mas Baja y las Mas Alta
         */
        /**/
        int posicionTempMen = 0, posicionTempMay = 0;

        //Ingrsamos las Cidades con sus respectivas Temperaturas
        for (int i = 0; i < ciudades.length; i++) {
            //Ingresamos la Ciudad
            System.out.println("Ingrese una Ciudad de Misiones ");
            ciudades[i] = ingresoDatos.nextLine();
            //Ingresamos la Temperatura Minima
            System.out.println("Ingrese la Temperatura Minima para la Ciudad Ingresada");
            temperaturaMin[i] = ingresoDatos.nextDouble();
            /**Solo en la Primer Vuelta del "FOR" guardamos la Temperatura Minima Ingresada
             * Minima en la Variable menor para despues comparar
             */
            if (i==0) {
                menor = temperaturaMin[i];
            }
            /**
             * Conprobamos si el Menor de la Temperaturas Minimas
             */
            if (temperaturaMin[i] < menor) {
                menor = temperaturaMin[i];
                posicionTempMen = i;
            }
            //Ingresamos la Temperatura Maxima
            System.out.println("Ingrese la Temperatura Maxima para la Ciudad Ingresada");
            temperaturaMax[i] = ingresoDatos.nextDouble();
            /**
             * Conprobamos si el Mayor de la Temperaturas Maximas
             */
            if (temperaturaMax[i] > mayor) {
                mayor = temperaturaMax[i];
                posicionTempMay = i;
            }
            ingresoDatos.nextLine();
        }
        System.out.println("*********************************************************************************************");
        System.out.println("*********************************************************************************************");
        System.out.println("La Ciudad con la Temperatura Minimas mas Baja es: " + ciudades[posicionTempMen] + " con: " + temperaturaMin[posicionTempMen]);
        System.out.println("La Ciudad con la Temperatura Maxima mas Alta es: " + ciudades[posicionTempMay] + " con: " + temperaturaMax[posicionTempMay]);
        System.out.println("*********************************************************************************************");
        System.out.println("*********************************************************************************************");
    }

}
