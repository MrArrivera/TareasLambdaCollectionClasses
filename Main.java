import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. PRUEBAS DE MULTIPLICADOR ===");
        testNumberUtils();

        System.out.println("\n=== 2. PRUEBAS DE FILTRO SELECTIVO ===");
        testFiltroSelectivo();

        System.out.println("\n=== 3. PRUEBAS DE CONVERSOR DE MAYÚSCULAS ===");
        testConversorMayusculas();

        System.out.println("\n=== 4. PRUEBAS DE CUADRADOS ÚNICOS ===");
        testCuadradosUnicos();

        System.out.println("\n=== 5. PRUEBAS DE MAPA DE LONGITUDES ===");
        testMapaDeLongitudes();

        System.out.println("\n=== 6. PRUEBAS DE MODIFICADOR DE INVENTARIO ===");
        testModificadorDeInventario();

        System.out.println("\n=== 7. PRUEBAS DE CONTADOR DE FRECUENCIAS ===");
        testContadorDeFrecuencias();

        System.out.println("\n=== 8. PRUEBAS DE CLASIFICADOR DE PALABRAS ===");
        testClasificadorDePalabras();

        System.out.println("\n=== 9. PRUEBAS DE DEDUPLICACIÓN DE PALABRAS ===");
        testDeduplicacionDePalabras();

        System.out.println("\n=== 10. PRUEBAS DE TOPE DE FRECUENCIAS ===");
        testTopeDeFrecuencias();
    }

    private static void testNumberUtils() {
        // 1. Caso Normal
        ArrayList<Integer> normalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Caso Normal - Antes: " + normalList);
        NumberUtils.multiplyElements(normalList, 10);
        System.out.println("Caso Normal - Después (x10): " + normalList);

        // 2. Caso Edge: Lista con valores nulos
        ArrayList<Integer> listWithNulls = new ArrayList<>(Arrays.asList(5, null, 15, null, 25));
        System.out.println("\nCaso Nulos - Antes: " + listWithNulls);
        NumberUtils.multiplyElements(listWithNulls, 2);
        System.out.println("Caso Nulos - Después (x2): " + listWithNulls);

        // 3. Caso Extremo: Lista vacía
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("\nCaso Vacío - Antes: " + emptyList);
        NumberUtils.multiplyElements(emptyList, 5);
        System.out.println("Caso Vacío - Después (x5): " + emptyList);

        // 4. Caso Extremo: Lista nula
        System.out.println("\nCaso Lista Nula - Procesando...");
        NumberUtils.multiplyElements(null, 3);
    }

    private static void testFiltroSelectivo() {
        // 1. Caso Normal
        // Condición: Eliminar si empieza con 'a' O si tiene menos de 4 caracteres
        ArrayList<String> normalStrings = new ArrayList<>(Arrays.asList(
                "arbol", "sol", "elefante", "pez", "avion", "computadora"));
        System.out.println("Caso Normal - Antes: " + normalStrings);
        StringUtils.filtroSelectivo(normalStrings, 'a', 4);
        System.out.println("Caso Normal - Después (Empiezan con 'a' o length < 4 eliminados): " + normalStrings);

        // 2. Caso Edge: Lista con valores nulos
        ArrayList<String> nullStrings = new ArrayList<>(Arrays.asList("agua", null, "luz", "mar", null, "montaña"));
        System.out.println("\nCaso Nulos - Antes: " + nullStrings);
        StringUtils.filtroSelectivo(nullStrings, 'a', 4);
        System.out.println("Caso Nulos - Después: " + nullStrings);

        // 3. Caso Extremo: Lista vacía
        ArrayList<String> emptyStrings = new ArrayList<>();
        System.out.println("\nCaso Vacío - Antes: " + emptyStrings);
        StringUtils.filtroSelectivo(emptyStrings, 'z', 5);
        System.out.println("Caso Vacío - Después: " + emptyStrings);

        // 4. Caso Extremo: Lista nula
        System.out.println("\nCaso Lista Nula - Procesando...");
        StringUtils.filtroSelectivo(null, 'b', 3);
    }

    private static void testConversorMayusculas() {
        // 1. Caso Normal
        ArrayList<String> normalStrings = new ArrayList<>(Arrays.asList("java", "stream", "lambda"));
        System.out.println("Caso Normal - Original: " + normalStrings);
        ArrayList<String> resultadoNormal = StringUtils.conversorMayusculas(normalStrings);
        System.out.println("Caso Normal - Nueva Lista (Mayúsculas): " + resultadoNormal);

        // 2. Caso Edge: Lista con valores nulos
        ArrayList<String> nullStrings = new ArrayList<>(Arrays.asList("hola", null, "mundo"));
        System.out.println("\nCaso Nulos - Original: " + nullStrings);
        ArrayList<String> resultadoNulos = StringUtils.conversorMayusculas(nullStrings);
        System.out.println("Caso Nulos - Nueva Lista: " + resultadoNulos);

        // 3. Caso Extremo: Lista vacía
        ArrayList<String> emptyStrings = new ArrayList<>();
        System.out.println("\nCaso Vacío - Original: " + emptyStrings);
        ArrayList<String> resultadoVacio = StringUtils.conversorMayusculas(emptyStrings);
        System.out.println("Caso Vacío - Nueva Lista: " + resultadoVacio);

        // 4. Caso Extremo: Lista nula
        System.out.println("\nCaso Lista Nula - Procesando...");
        ArrayList<String> resultadoNulo = StringUtils.conversorMayusculas(null);
        System.out.println("Caso Lista Nula - Resultado: " + resultadoNulo);
    }

    private static void testCuadradosUnicos() {
        // 1. Caso Normal: Lista con duplicados y números impares
        ArrayList<Integer> normalList = new ArrayList<>(Arrays.asList(2, 3, 2, 4, 5, 4, 6));
        System.out.println("Caso Normal - Original: " + normalList);
        HashSet<Integer> resultadoNormal = NumberUtils.cuadradosUnicos(normalList);
        System.out.println("Caso Normal - Cuadrados de pares únicos: " + resultadoNormal);

        // 2. Caso Edge: Lista con valores nulos y duplicados
        ArrayList<Integer> listWithNulls = new ArrayList<>(Arrays.asList(8, null, 2, null, 8, 3));
        System.out.println("\nCaso Nulos - Original: " + listWithNulls);
        HashSet<Integer> resultadoNulos = NumberUtils.cuadradosUnicos(listWithNulls);
        System.out.println("Caso Nulos - Resultado: " + resultadoNulos);

        // 3. Caso Extremo: Lista vacía
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("\nCaso Vacío - Original: " + emptyList);
        HashSet<Integer> resultadoVacio = NumberUtils.cuadradosUnicos(emptyList);
        System.out.println("Caso Vacío - Resultado: " + resultadoVacio);

        // 4. Caso Extremo: Lista nula
        System.out.println("\nCaso Lista Nula - Procesando...");
        HashSet<Integer> resultadoNulo = NumberUtils.cuadradosUnicos(null);
        System.out.println("Caso Lista Nula - Resultado: " + resultadoNulo);
    }

    private static void testMapaDeLongitudes() {
        // 1. Caso Normal: Lista de palabras únicas
        ArrayList<String> normalList = new ArrayList<>(Arrays.asList("java", "codigo", "programacion"));
        System.out.println("Caso Normal - Original: " + normalList);
        HashMap<String, Integer> resultadoNormal = GeneralUtils.mapaDeLongitudes(normalList);
        System.out.println("Caso Normal - Mapa: " + resultadoNormal);

        // 2. Caso Edge: Lista con duplicados
        ArrayList<String> listWithDuplicates = new ArrayList<>(Arrays.asList("hola", "mundo", "hola"));
        System.out.println("\nCaso Duplicados - Original: " + listWithDuplicates);
        HashMap<String, Integer> resultadoDuplicados = GeneralUtils.mapaDeLongitudes(listWithDuplicates);
        System.out.println("Caso Duplicados - Mapa: " + resultadoDuplicados);

        // 3. Caso Edge: Lista con valores nulos
        ArrayList<String> listWithNulls = new ArrayList<>(Arrays.asList("teclado", null, "raton"));
        System.out.println("\nCaso Nulos - Original: " + listWithNulls);
        HashMap<String, Integer> resultadoNulos = GeneralUtils.mapaDeLongitudes(listWithNulls);
        System.out.println("Caso Nulos - Mapa: " + resultadoNulos);

        // 4. Caso Extremo: Lista vacía
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("\nCaso Vacío - Original: " + emptyList);
        HashMap<String, Integer> resultadoVacio = GeneralUtils.mapaDeLongitudes(emptyList);
        System.out.println("Caso Vacío - Mapa: " + resultadoVacio);

        // 5. Caso Extremo: Lista nula
        System.out.println("\nCaso Lista Nula - Procesando...");
        HashMap<String, Integer> resultadoNulo = GeneralUtils.mapaDeLongitudes(null);
        System.out.println("Caso Lista Nula - Resultado: " + resultadoNulo);
    }

    private static void testModificadorDeInventario() {
        // 1. Caso Normal: Inventario con productos válidos
        HashMap<String, Double> inventarioNormal = new HashMap<>();
        inventarioNormal.put("Laptop", 1000.0);
        inventarioNormal.put("Mouse", 50.0);
        inventarioNormal.put("Teclado", 100.0);
        System.out.println("Caso Normal - Imprimiendo catálogo:");
        GeneralUtils.modificadorDeInventario(inventarioNormal); 

        // 2. Caso Edge: Producto con precio nulo
        HashMap<String, Double> inventarioConNulos = new HashMap<>();
        inventarioConNulos.put("Monitor", 200.0);
        inventarioConNulos.put("Cable HDMI", null);
        System.out.println("\nCaso Nulos - Imprimiendo catálogo:");
        GeneralUtils.modificadorDeInventario(inventarioConNulos);

        // 3. Caso Extremo: Inventario vacío
        HashMap<String, Double> inventarioVacio = new HashMap<>();
        System.out.println("\nCaso Vacío - Imprimiendo catálogo:");
        GeneralUtils.modificadorDeInventario(inventarioVacio);

        // 4. Caso Extremo: Inventario nulo
        System.out.println("\nCaso Lista Nula - Procesando...");
        GeneralUtils.modificadorDeInventario(null);
    }

    private static void testContadorDeFrecuencias() {
        // 1. Caso Normal: Lista con palabras repetidas
        ArrayList<String> normalList = new ArrayList<>(Arrays.asList(
            "manzana", "pera", "manzana", "naranja", "pera", "manzana"
        ));
        System.out.println("Caso Normal - Original: " + normalList);
        HashMap<String, Integer> resultadoNormal = GeneralUtils.contadorDeFrecuencias(normalList);
        System.out.println("Caso Normal - Frecuencias: " + resultadoNormal);

        // 2. Caso Edge: Lista con valores nulos intercalados
        ArrayList<String> listWithNulls = new ArrayList<>(Arrays.asList(
            "java", null, "python", "java", null
        ));
        System.out.println("\nCaso Nulos - Original: " + listWithNulls);
        HashMap<String, Integer> resultadoNulos = GeneralUtils.contadorDeFrecuencias(listWithNulls);
        System.out.println("Caso Nulos - Frecuencias: " + resultadoNulos);

        // 3. Caso Extremo: Lista vacía
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("\nCaso Vacío - Original: " + emptyList);
        HashMap<String, Integer> resultadoVacio = GeneralUtils.contadorDeFrecuencias(emptyList);
        System.out.println("Caso Vacío - Frecuencias: " + resultadoVacio);

        // 4. Caso Extremo: Lista nula
        System.out.println("\nCaso Lista Nula - Procesando...");
        HashMap<String, Integer> resultadoNulo = GeneralUtils.contadorDeFrecuencias(null);
        System.out.println("Caso Lista Nula - Resultado: " + resultadoNulo);
    }

    private static void testClasificadorDePalabras() {
        // 1. Caso Normal: Mapa con frecuencias variadas
        HashMap<String, Integer> mapaNormal = new HashMap<>();
        mapaNormal.put("java", 5);
        mapaNormal.put("python", 2);
        mapaNormal.put("c++", 1);
        mapaNormal.put("javascript", 8);
        System.out.println("Caso Normal - Original: " + mapaNormal);
        ArrayList<String> resultadoNormal = GeneralUtils.clasificadorDePalabras(mapaNormal, 3);
        System.out.println("Caso Normal - Palabras con frecuencia menor a 3: " + resultadoNormal);

        // 2. Caso Edge: Mapa con valores (frecuencias) nulos
        HashMap<String, Integer> mapaConNulos = new HashMap<>();
        mapaConNulos.put("ruby", 4);
        mapaConNulos.put("go", null);
        mapaConNulos.put("rust", 1);
        System.out.println("\nCaso Nulos - Original: " + mapaConNulos);
        ArrayList<String> resultadoNulos = GeneralUtils.clasificadorDePalabras(mapaConNulos, 2);
        System.out.println("Caso Nulos - Palabras con frecuencia menor a 2: " + resultadoNulos);

        // 3. Caso Extremo: Mapa vacío
        HashMap<String, Integer> mapaVacio = new HashMap<>();
        System.out.println("\nCaso Vacío - Original: " + mapaVacio);
        ArrayList<String> resultadoVacio = GeneralUtils.clasificadorDePalabras(mapaVacio, 5);
        System.out.println("Caso Vacío - Resultado: " + resultadoVacio);

        // 4. Caso Extremo: Mapa nulo
        System.out.println("\nCaso Mapa Nulo - Procesando...");
        ArrayList<String> resultadoNulo = GeneralUtils.clasificadorDePalabras(null, 5);
        System.out.println("Caso Mapa Nulo - Resultado: " + resultadoNulo);
    }

    private static void testDeduplicacionDePalabras() {
        // 1. Caso Normal: Frase larga con palabras repetidas y signos de puntuación
        String fraseNormal = "El veloz murciélago hindú comía feliz cardillo y kiwi. La cigüeña tocaba el saxofón, y el murciélago volaba feliz.";
        System.out.println("Caso Normal - Frase original: " + fraseNormal);
        HashSet<String> resultadoNormal = StringUtils.deduplicacionDePalabras(fraseNormal, 5);
        System.out.println("Caso Normal (N=5) - Palabras únicas: " + resultadoNormal);

        // 2. Caso Edge: Frase vacía o con puras palabras muy cortas
        String fraseCorta = "un pez en un río, un sol en la paz.";
        System.out.println("\nCaso Palabras Cortas - Frase: " + fraseCorta);
        HashSet<String> resultadoCorto = StringUtils.deduplicacionDePalabras(fraseCorta, 6);
        System.out.println("Caso Palabras Cortas (N=6) - Resultado: " + resultadoCorto);

        // 3. Caso Edge: Múltiples espacios y caracteres raros
        String fraseRara = "   hola!!!   hola... JAVA   java  -- hola ";
        System.out.println("\nCaso Caracteres Raros - Frase: '" + fraseRara + "'");
        HashSet<String> resultadoRaro = StringUtils.deduplicacionDePalabras(fraseRara, 4);
        System.out.println("Caso Caracteres Raros (N=4) - Resultado: " + resultadoRaro);

        // 4. Caso Extremo: String nulo
        System.out.println("\nCaso Frase Nula - Procesando...");
        HashSet<String> resultadoNulo = StringUtils.deduplicacionDePalabras(null, 3);
        System.out.println("Caso Frase Nula - Resultado: " + resultadoNulo);
    }

    private static void testTopeDeFrecuencias() {
        // 1. Caso Normal: Mapa con frecuencias superiores e inferiores al tope
        HashMap<String, Integer> mapaNormal = new HashMap<>();
        mapaNormal.put("java", 15);
        mapaNormal.put("python", 5);
        mapaNormal.put("c++", 10);
        mapaNormal.put("javascript", 2);
        System.out.println("Caso Normal - Antes: " + mapaNormal);
        // Aplicamos un tope de 10
        GeneralUtils.topeDeFrecuencias(mapaNormal, 10);
        System.out.println("Caso Normal - Después (Tope = 10): " + mapaNormal);

        // 2. Caso Edge: Mapa con valores nulos
        HashMap<String, Integer> mapaConNulos = new HashMap<>();
        mapaConNulos.put("ruby", 25);
        mapaConNulos.put("go", null);
        mapaConNulos.put("rust", 8);
        System.out.println("\nCaso Nulos - Antes: " + mapaConNulos);
        GeneralUtils.topeDeFrecuencias(mapaConNulos, 15);
        System.out.println("Caso Nulos - Después (Tope = 15): " + mapaConNulos);

        // 3. Caso Extremo: Mapa vacío
        HashMap<String, Integer> mapaVacio = new HashMap<>();
        System.out.println("\nCaso Vacío - Antes: " + mapaVacio);
        GeneralUtils.topeDeFrecuencias(mapaVacio, 5);
        System.out.println("Caso Vacío - Después: " + mapaVacio);

        // 4. Caso Extremo: Mapa nulo
        System.out.println("\nCaso Mapa Nulo - Procesando...");
        GeneralUtils.topeDeFrecuencias(null, 5);
    }
}