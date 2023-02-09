package arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author Ana Salas
 */
public class Arbol {

    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public boolean vacio() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void crearNodo(Nodo raiz, Nodo nuevo) {
        if (nuevo.getElemento().getNum() <= raiz.getElemento().getNum()) {
            if (raiz.getNodoIzq() == null) {
                raiz.setNodoIzq(nuevo);
            } else {
                crearNodo(raiz.getNodoIzq(), nuevo);
            }
        } else {
            if (raiz.getNodoDer() == null) {
                raiz.setNodoDer(nuevo);
            } else {
                crearNodo(raiz.getNodoDer(), nuevo);
            }
        }
    }

    public void crearRaiz() {
        Dato d = new Dato();
        d.setNum(Integer.parseInt(JOptionPane.showInputDialog("Digite un valor: ")));
        Nodo nuevo = new Nodo();
        nuevo.setElemento(d);
        if (vacio()) {
            raiz = nuevo;
        } else {
            crearNodo(raiz, nuevo);
        }
    }

    public void mostrarNodo(Nodo n) {
        if (n != null) {
            mostrarNodo(n.getNodoIzq());
            System.out.print(n.getElemento().getNum() + " ");
            mostrarNodo(n.getNodoDer());
        }
    }

    public void mostrarRaiz() {
        if (!vacio()) {
            mostrarNodo(raiz);
        } else {
            System.out.println("Imposible mostrar, árbol vacío");
        }
    }

    public void preorden(Nodo n) {
        if (n != null) {
            System.out.print(n.getElemento().getNum() + " ");
            mostrarNodo(n.getNodoIzq());
            mostrarNodo(n.getNodoDer());
        }
    }

    public void preorden() {
        System.out.println("\n***PreOrden***\n");
        this.preorden(this.raiz);
    }

    public void inorden(Nodo n) {
        if (n != null) {
            mostrarNodo(n.getNodoIzq());
            System.out.print(n.getElemento().getNum() + " ");
            mostrarNodo(n.getNodoDer());
        }
    }

    public void inorden() {
        System.out.println("\n***InOrden***\n");
        this.inorden(this.raiz);
    }

    public void postorden(Nodo n) {
        if (n != null) {
            mostrarNodo(n.getNodoIzq());
            mostrarNodo(n.getNodoDer());
            System.out.print(n.getElemento().getNum() + " ");
        }
    }

    public void postorden() {
        System.out.println("\n***PostOrden***\n");
        this.postorden(this.raiz);
    }
}
