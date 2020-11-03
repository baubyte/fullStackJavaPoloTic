package Logic;

import java.util.Date;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjemploPDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alumno alu = new Alumno();
       Alumno alu2 = new Alumno("12345678", "metodos", "prueba", "Hola Mundo", new Date(), "123");
       alu2.mostrarNombre();
       String nombreDesdeFunc = alu2.obtenerNombre();
        System.out.println("El Nombre del Alumno desde Funcion: "+nombreDesdeFunc);
    }
    
}
