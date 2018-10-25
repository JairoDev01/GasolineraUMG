
package gasolinera;

/**
 *
 * @author Jairo
 */
public class Nodo {
    int dato;
    Nodo siguiente;
    public Nodo(int d){
        dato=d;
        siguiente = null;
    }

    @Override
    public String toString() {
        return "dato=" + dato ;
    }
    
    
    
    
    
}
