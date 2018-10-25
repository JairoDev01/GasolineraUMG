
package gasolinera;

/**
 *
 * @author Jairo
 */
public class ColaN {

    Nodo home, fin;
    int size;

    public ColaN() {
        home = null;
        fin = null;
        size = 0;
    }

    public boolean empty() {
        return home == null;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (empty()) {
            home = nuevo;
        } else {
            fin.next = nuevo;
        }
        fin = nuevo;
        size++;
    }

    public int pop() {
        int aux = home.auto;
        home = home.next;
        size--;
        return aux;
    }

    public int homeC() {
        return home.auto;
    }

    public int sizeC() {
        return size;
    }

//    public void datosCola() {
//        for (int i = 0; i < tamaño; i++) {
//            int aux = inicio.dato;
//            inicio = inicio.siguiente;
//            System.out.println(aux);
//        }
//    }

}
