import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        // Crear un Map mutable y llenarlo con algunos pares clave-valor
        Map<String, Integer> mutableMap = new HashMap<>();
        mutableMap.put("Alice", 30);
        mutableMap.put("Bob", 25);

        // Convertir el Map en un Map inmutable usando Collections.unmodifiableMap
        Map<String, Integer> immutableMap = Collections.unmodifiableMap(mutableMap);

        // Mostrar el contenido del Map inmutable
        System.out.println("Contenido del Map inmutable: " + immutableMap);

        // Intentar modificar el Map inmutable y manejar la excepción
        try {
            immutableMap.put("Charlie", 35);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: No se puede modificar un Map inmutable.");
        }
    }
}