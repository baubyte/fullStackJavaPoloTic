package Logic;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Controladora {

    String nombres[] = new String[5];
    int posicionLibre = 0;

    /**
     * Agregar Nombres al Vector
     *
     * @param agregarNombre
     */
    public void agregarNombre(String agregarNombre) {
        if (posicionLibre < nombres.length) {
            nombres[posicionLibre] = agregarNombre;
            posicionLibre += 1;
        }
        /*Opcion 2
        if (agregarNombre[posicionLibre] == null ) {
            nombres[posicionLibre] = agregarNombre;
            posicionLibre += 1;
        }
         */
    }

    /**
     * Buscar Nombre en el Vector
     *
     * @param buscarNombre
     * @return nombreEncontrado
     */
    public boolean buscarNombre(String buscarNombre) {
        boolean nombreEncontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(buscarNombre)) {
                nombreEncontrado = true;
            }
        }
        return nombreEncontrado;
    }
}
