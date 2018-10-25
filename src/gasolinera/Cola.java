/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolinera;

/**
 *
 * @author Jairo
 */
public class Cola {

    Nodo inicio, fin;
    int tamaño;

    public Cola() {
        inicio = null;
        fin = null;
        tamaño = 0;
    }

    public boolean estVacio() {
        return inicio == null;
    }

    public void insertar(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (estVacio()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamaño++;
    }

    public int quitar() {
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tamaño--;
        return aux;
    }

    public int incioCola() {
        return inicio.dato;
    }

    public int tamañoCola() {
        return tamaño;
    }

    public void datosCola() {
        for (int i = 0; i < tamaño; i++) {
            int aux = inicio.dato;
            inicio = inicio.siguiente;
            System.out.println(aux);
        }
    }

}
