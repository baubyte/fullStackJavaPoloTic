package Persistence;

import Logic.Participante;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class PersistenceController {

    /**Controlador JPA de la Entidad Participante*/
    ParticipanteJpaController participanteJpa = new ParticipanteJpaController();
    
    /**Crear Participante
     * @param participantet
     */
    public void crearParticipante(Participante participante){
        participanteJpa.create(participante);
    }
}
