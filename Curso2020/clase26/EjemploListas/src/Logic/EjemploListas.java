package Logic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjemploListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ArrayList
        /*List<Persona> lista = new ArrayList<Persona>();
        Persona persona1 = new Persona(1, "Martin1", 30);
        lista.add(persona1);
        lista.add(new Persona(2, "Martin2", 31));
        lista.add(new Persona(3, "Martin3", 32));
        lista.add(new Persona(2, "Martin2", 31));

        System.out.println("Forma 2 de Recorrer");
        for (Persona person : lista) {
            System.out.println(person.getNombre()); 
        }
        System.out.println("Forma 2 de Recorrer");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }*/
        //LinkedList
        /*List<Persona> lista = new LinkedList<Persona>();

        Persona persona1 = new Persona(1, "Martin1", 30);
        lista.add(persona1);
        lista.add(new Persona(2, "Martin2", 31));
        lista.add(new Persona(3, "Martin3", 32));
        lista.add(new Persona(2, "Martin2", 31));
        lista.add(0, new Persona(4, "Martin4", 33));

        System.out.println("Forma 2 de Recorrer");
        for (Persona person : lista) {
            System.out.println(person.getNombre());
        }
        System.out.println("Forma 2 de Recorrer");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }*/
        //Stack
        Stack<Integer> listaStack = new Stack<Integer>();

        System.out.println("¿Esta vacia la Pila? " + listaStack.isEmpty());

        listaStack.push(1);
        listaStack.push(2);
        listaStack.push(3);
        listaStack.push(4);

        for (Integer numero : listaStack) {
            System.out.println(numero);
        }
        System.out.println("¿Esta vacia la Pila? " + listaStack.isEmpty());

        listaStack.pop();

        for (Integer numero : listaStack) {
            System.out.println(numero);
        }

        System.out.println("El Ultimo Elemento es: " + listaStack.peek());
    }
}
