package arboles;

import javax.swing.JOptionPane;

public class Menu {

    Arbol a = new Arbol();

    public void mosMenu() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu principal\n"
                + "1. Agregar nodos\n"
                + "2. Mostrar nodos\n"
                + "3. PreOrden\n"
                + "4. InOrden\n"
                + "5. PostOrden\n"
                + "6. Salir\n"
                + "\n----------------------\n"));
        switch (op) {
            case 1:
                a.crearRaiz();
                mosMenu();
                break;
            case 2:
                a.mostrarRaiz();
                mosMenu();
                break;
            case 3:
                a.preorden();
                mosMenu();
                break;
            case 4:
                a.inorden();
                mosMenu();
                break;
            case 5:
                a.postorden();
                mosMenu();
                break;
            case 6:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Error!, Opción invalida");
        }
    }
}
