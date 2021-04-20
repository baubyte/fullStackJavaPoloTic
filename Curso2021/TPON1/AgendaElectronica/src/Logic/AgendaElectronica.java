package Logic;

import GUI.FormAgenda;

/**
 *
 * @author baubyte
 */
public class AgendaElectronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Instancia del Formulario de Carga de la Agenda*/
       FormAgenda formAgenda = new FormAgenda();
       /**Se hace visible el Formulario*/
       formAgenda.setVisible(true);
       /**Se estable que el fromulario se posicione el centro*/
       formAgenda.setLocationRelativeTo(null);
       
    }
    
}
