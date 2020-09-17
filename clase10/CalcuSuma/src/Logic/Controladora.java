package Logic;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Controladora {

    /**
     *
     * @param num1
     * @param num2
     * @return resultado
     */
    public double sumar(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    public double restar(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public double multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    public double dividir(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }
}
