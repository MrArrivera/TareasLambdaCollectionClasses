import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

class NumberUtils {
    
    /**
     * 1. El Multiplicador
     * Multiplica cada elemento de un ArrayList por el factor dado usando replaceAll y lambdas.
     * Maneja valores nulos de forma segura.
     */
    public static void multiplyElements(ArrayList<Integer> numbers, int factor) {
        if (numbers == null) {
            System.out.println("Error: La lista es nula.");
            return;
        }
        numbers.replaceAll(n -> (n != null) ? n * factor : null);
    }

    /**
     * 4. Cuadrados Únicos
     * Filtra los números pares, los eleva al cuadrado y retorna un HashSet 
     * para garantizar que sean únicos.
     */
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros) {
        if (numeros == null) {
            System.out.println("Error: La lista de números es nula.");
            return null;
        }
        
        return numeros.stream()
                .filter(n -> n != null && n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));
    }
}