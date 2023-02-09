package arboles;

/**
 *
 * @author Ana Salas
 */
public class Nodo {

    private Dato elemento;
    private Nodo nodoIzq;
    private Nodo nodoDer;

    public Nodo() {
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(Nodo nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }

}
