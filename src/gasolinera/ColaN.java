package gasolinera;

/**
 *
 * @author JairoDev
 */
public class ColaN {

    class Node {

        int elem;
        Node Next;

        public Node(int o) {
            elem = o;
            Next = null;
        }
    }

    Node first;
    Node end;
    int size;

    public ColaN() {
        end = null;
        size = 0;
    }

    public void push(int o) {
        Node new_node = new Node(o);
        if (first == null) {
            first = new_node;
            end = new_node;
        } else {
            end.Next = new_node;
            end = new_node;
        }
        size++;
    }

    ; // inserts an object onto the queue

  public int pop() {
        if (first == null) {
            
        }
        
        int o = first.elem;
        first = first.Next;
        size--;
        return o;
    } // gets the object from the queue

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public int first() {
        if (first == null) {
           
        } else {
            return first.elem;
        }
        return 0;
    }

//    Nodo home, fin;
//  
//    public ColaN() {
//        home = null;
//        fin = null;
//        
//    }
//
//    public boolean empty() {
//        if (home == null)
//            return true;
//        else
//            return false;
//        
//    }
//
//    public void push(int dato) {
//        Nodo nuevo;
//        nuevo = new Nodo();
//        nuevo.auto = dato;
//        nuevo.next = null;
//        if (empty ()) {
//            home = nuevo;
//            fin = nuevo;
//        } else {
//            home.next = nuevo;
//            fin = nuevo;
//        }        
//    }
//
//    public int pop() {
//        if (!empty ())
//        {
//            int informacion = home.auto;
//            if (home == fin){
//                home = null;
//                fin = null;
//            } else {
//                home = home.next;
//            }
//            return informacion;
//        } else{
//            return Integer.MAX_VALUE;
//        }
//           
//    }
//
//    public int homeC() {
//        if(!empty()){
//            return home.auto;
//        }else{
//            return Integer.MAX_VALUE;
//        }
//      
//    }
//
//    public int sizeC() {
//        int cant=0;
//        Nodo reco=home;
//        while (reco!=null) {
//            cant++;
//            reco=reco.next;
//        }
//        return cant;
//    }
//
////    public void datosCola() {
////        for (int i = 0; i < tamaño; i++) {
////            int aux = inicio.dato;
////            inicio = inicio.siguiente;
////            System.out.println(aux);
////        }
////    }
}
