package language.collections;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayLists {
    public static void main(String[] args) {
        //instanciar lista con elementos de tipo String
        List<String> lista = new ArrayList<>();

        //añadir con .add
        lista.add("elemento 1.");
        lista.add("elemento 2.");
        lista.add("elemento 3.");
        lista.add("elemento 4.");
        lista.add("elemento 5.");

        //recorrer lista
        for (String elemento: lista){
            System.out.println(elemento);
        }

        //añadir un elemento en una posicion específica
        lista.add(5, "agregar elemento en una posicio");

        //obtener elemento que esta en la posicion del índice
        String elemento = lista.get(1);
        System.out.println("elemento en la posicion 1: " + elemento);

        //reemplaza un elemento en una posicion del arrayList
        lista.set(2, "posicion sobreescrita.");

        //remover un elemento de la lista
        lista.remove(0);

        //numero de elementos de la lista
        int tamanio = lista.size();
        System.out.println("tamaño de la lista: " + tamanio);

        //verifica si contiene el elemento especificado
        boolean estaEnLista = lista.contains("elemento 4.");
        System.out.println("el elemento 4 esta en la lista: " + estaEnLista);

        //traer un elemeto específico de una lista. - 1 si no esta
        int posicion = lista.indexOf("elemento 4.");
        System.out.println("posicion del elemento 4: " + posicion);

        //devuelve la posicion de la ultima ocurrencia del elemento. - 1 si no esta
        int ultimaPosicion = lista.lastIndexOf("elemento 1.");
        System.out.println("ultima posicion del elemento 1: " + ultimaPosicion);

        System.out.println("lista actualizada: ");
        for (String cadena: lista){
            System.out.println(cadena);
        }

        //elimina todos los elementos de la lista
        lista.clear();
    }
}
