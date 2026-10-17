import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GeneralUtils {

    /**
     * 5. Mapa de Longitudes
     * Crea un HashMap donde la clave es la palabra y el valor es su longitud.
     */
    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> palabras) {
        if (palabras == null) {
            System.out.println("Error: La lista de palabras es nula.");
            return null;
        }
        
        return palabras.stream()
                .filter(s -> s != null)
                .collect(Collectors.toMap(
                        s -> s,                 
                        String::length,         
                        (v1, v2) -> v1,          
                        HashMap::new       
                ));
    }


    /**
     * 6. Modificador de Inventario
     * Imprime un catálogo de productos aplicando un 10% de descuento al precio, 
     */
    public static void modificadorDeInventario(HashMap<String, Double> inventario) {
        if (inventario == null) {
            System.out.println("Error: El inventario es nulo.");
            return;
        }
        
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        System.out.println("--- Catálogo con 10% de descuento ---");
        inventario.forEach((producto, precio) -> {
            if (precio != null) {
                double precioConDescuento = precio * 0.90;
                System.out.printf("Producto: %s | Precio original: $%.2f | Con descuento: $%.2f%n", 
                                  producto, precio, precioConDescuento);
            } else {
                System.out.printf("Producto: %s | Precio: No disponible%n", producto);
            }
        });
        System.out.println("-------------------------------------");
    }

    /**
     * 7. Contador de Frecuencias
     * Construye un mapa de frecuencias a partir de una lista de palabras con repeticiones
     */
    public static HashMap<String, Integer> contadorDeFrecuencias(ArrayList<String> palabras) {
        if (palabras == null) {
            System.out.println("Error: La lista de palabras es nula.");
            return null;
        }

        HashMap<String, Integer> frecuencias = new HashMap<>();
        
        for (String palabra : palabras) {
            if (palabra != null) {
                frecuencias.merge(palabra, 1, (valorAntiguo, valorNuevo) -> valorAntiguo + valorNuevo);
            }
        }
        
        return frecuencias;
    }

    /**
     * 8. Clasificador de Palabras
     * Utiliza entrySet().stream() para filtrar las palabras de un mapa cuya 
     * frecuencia sea estrictamente inferior a un límite dado, devolviendo un ArrayList.
     */
    public static ArrayList<String> clasificadorDePalabras(HashMap<String, Integer> frecuencias, int limiteInferior) {
        if (frecuencias == null) {
            System.out.println("Error: El mapa de frecuencias es nulo.");
            return null;
        }

        return frecuencias.entrySet().stream()
                .filter(entry -> entry.getValue() != null && entry.getValue() < limiteInferior)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * 10. El Tope de Frecuencias
     * Limita todas las frecuencias en el mapa a un valor máximo N.
     */
    public static void topeDeFrecuencias(HashMap<String, Integer> frecuencias, int maximoN) {
        if (frecuencias == null) {
            System.out.println("Error: El mapa de frecuencias es nulo.");
            return;
        }
    
        frecuencias.replaceAll((palabra, frecuencia) -> 
            (frecuencia != null) ? Math.min(frecuencia, maximoN) : null
        );
    }
}
