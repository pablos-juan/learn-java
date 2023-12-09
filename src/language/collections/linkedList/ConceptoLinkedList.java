package language.collections;
import java.util.LinkedList;

public class ConceptoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        // Métodos de adición
        lista.add("Manzana");
        lista.add("Plátano");
        lista.add("Cereza");

        // Métodos de inserción
        lista.add(1, "Naranja");

        // Obtener elementos
        String elemento = lista.get(2);
        System.out.println("Elemento en la posición 2: " + elemento);

        // Reemplazar elementos
        lista.set(0, "Uva");

        // Eliminar elementos
        lista.remove(3);

        // Tamaño de la lista
        int tamaño = lista.size();
        System.out.println("Tamaño de la lista: " + tamaño);

        // Verificar si la lista está vacía
        boolean estaVacia = lista.isEmpty();
        System.out.println("¿La lista está vacía? " + estaVacia);

        // Verificar si un elemento está en la lista
        boolean contieneUva = lista.contains("Uva");
        System.out.println("¿La lista contiene 'Uva'? " + contieneUva);

        // Índice de un elemento
        int indiceUva = lista.indexOf("Uva");
        System.out.println("Índice de 'Uva': " + indiceUva);

        // Eliminar todos los elementos
        lista.clear();

        // Agregar una colección de elementos
        LinkedList<String> nuevaLista = new LinkedList<>();
        nuevaLista.add("Perro");
        nuevaLista.add("Gato");
        lista.addAll(nuevaLista);

        // Eliminar el primer elemento
        lista.removeFirst();

        // Eliminar el último elemento
        lista.removeLast();

        // Obtener el primer y último elemento
        String primerElemento = lista.getFirst();
        String ultimoElemento = lista.getLast();
        System.out.println("Primer elemento: " + primerElemento);
        System.out.println("Último elemento: " + ultimoElemento);

        // Ofrecer un elemento (usado comúnmente en implementaciones de Queue)
        lista.offer("Conejo");

        // Convertir a un array
        Object[] array = lista.toArray();
    }
}
