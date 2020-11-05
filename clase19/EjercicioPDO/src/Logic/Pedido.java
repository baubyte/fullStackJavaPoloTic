package Logic;

import java.util.Date;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Pedido {
    //Atributos
    int numero;
    Date fechaPedido;

    public Pedido() {
    }

    public Pedido(int numero, Date fechaPedido) {
        this.numero = numero;
        this.fechaPedido = fechaPedido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
}
