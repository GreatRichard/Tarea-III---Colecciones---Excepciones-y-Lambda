import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> list = new ArrayList<>();

    // Método para agregar un elemento a la lista
    public void add(T element) {
        list.add(element);
    }

    // Método para eliminar un elemento de la lista
    public void remove(T element) {
        list.remove(element);
    }

    // Método para buscar un elemento en la lista
    public T find(T element) {
        int index = list.indexOf(element);
        if (index != -1) {
            return list.get(index);
        }
        return null;
    }

    // Método para obtener el tamaño de la lista
    public int size() {
        return list.size();
    }

    // Método para obtener la lista completa
    public List<T> getAll() {
        return list;
    }
}

//Explicación:
//Clase Genérica: GenericList<T> es una clase genérica donde T representa el tipo de datos almacenados en la lista.
//List<T> list: Una lista interna que almacena los elementos.
//add(): Agrega un elemento a la lista.
//remove(): Elimina un elemento de la lista.
//find(): Busca un elemento en la lista y lo devuelve si lo encuentra.
//size(): Devuelve el tamaño de la lista.
//getAll(): Devuelve todos los elementos de la lista.