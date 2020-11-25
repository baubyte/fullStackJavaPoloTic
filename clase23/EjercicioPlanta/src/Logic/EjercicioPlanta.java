/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercicioPlanta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arbol arbol = new Arbol();
        Flor flor = new Flor();
        Arbusto arbusto = new Arbusto();
        
        /**Llamamos lo metodos*/
        arbol.motrarMensaje();
        flor.motrarMensaje();
        arbusto.motrarMensaje();
        
    }
    
}
