
package gasolinera;

/**
 *
 * @author Jairo
 */
public class Nodo {
    int auto;
    Nodo next;
    public Nodo(int d){
        auto=d;
        next = null;
    }

    @Override
    public String toString() {
        return "dato=" + auto ;
    }
    
    
    
    
    
}
