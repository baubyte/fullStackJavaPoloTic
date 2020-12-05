package Logic;

import Persistence.PersistenceController;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Controller {
    
        /**Instancia de la Persistencia*/
    PersistenceController persistenceController = new PersistenceController();
    
    /**Crear un Participante
     * @param participante
     */
    public void crearParticipante(Participante participante){
        /**Creamos el Participante*/
    persistenceController.crearParticipante(participante);
    }
    
}
