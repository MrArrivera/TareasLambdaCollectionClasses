import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

class StringUtils {

    /**
     * 2. El Filtro Selectivo
     * Elimina las cadenas que comiencen con la letra dada o cuya longitud sea menor
     * a N.
     */
    public static void filtroSelectivo(ArrayList<String> strings, char letraInicial, int n) {
        if (strings == null) {
            System.out.println("Error: La lista de cadenas es nula.");
            return;
        }

        String prefijo = String.valueOf(letraInicial);
        strings.removeIf(s -> s == null || s.startsWith(prefijo) || s.length() < n);
    }

    /**
     * 3. Conversor de Mayúsculas
     * Convierte una lista de palabras a mayúsculas usando Stream y map()
     */
    public static ArrayList<String> conversorMayusculas(ArrayList<String> strings) {
        if (strings == null) {
            System.out.println("Error: La lista de cadenas es nula.");
            return null;
        }
        
        return strings.stream()
                .map(s -> (s != null) ? s.toUpperCase() : null)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * 9. Deduplicación de Palabras
     * Divide una frase en un arreglo de palabras, limpia puntuación, 
     * filtra palabras menores a N letras, las convierte a minúsculas.
     */
    public static HashSet<String> deduplicacionDePalabras(String frase, int minLetras) {
        if (frase == null) {
            System.out.println("Error: La frase es nula.");
            return null;
        }
        
        String[] arregloPalabras = frase.split("[\\s,.;:!?]+");

        return Arrays.stream(arregloPalabras)
                .map(palabra -> palabra.replaceAll("[^\\p{L}]", ""))
                .filter(palabra -> palabra.length() >= minLetras)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }
}