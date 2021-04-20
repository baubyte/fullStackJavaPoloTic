package Logic;

import GUI.Principal;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class IGU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * * Creo la Ventana Principal
         */
        Principal ventana = new Principal();

        /**
         * Hago Visible la Ventana
         */
        ventana.setVisible(true);

        /**
         * Centramos la Ventana Principal
         */
        ventana.setLocationRelativeTo(null);

    }

}
