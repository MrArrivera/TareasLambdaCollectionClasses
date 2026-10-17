# Tareas Lambda

## Descripción del Proyecto
Este proyecto es una colección de utilidades en Java diseñadas para demostrar el poder y la flexibilidad de la programación funcional. El código está organizado en clases modulares (`NumberUtils`, `StringUtils`, `GeneralUtils`) y cuenta con una clase `Main` que somete cada método a rigurosas pruebas, incluyendo casos normales y extremos (como valores o colecciones nulas).

## Lista de los 10 Métodos

1. **El Multiplicador (`ArrayList<Integer>`)**
   - Utiliza `replaceAll()` para multiplicar cada elemento de la lista por un factor dado, manejando valores nulos de forma segura.
2. **El Filtro Selectivo (`ArrayList<String>`)**
   - Emplea `removeIf()` para eliminar cadenas que comiencen con una letra específica o que tengan una longitud inferior a un límite `N`.
3. **Conversor de Mayúsculas (`ArrayList<String>`)**
   - Utiliza `Stream` y `map()` para convertir una lista de palabras a mayúsculas, devolviendo un `ArrayList` completamente nuevo.
4. **Cuadrados Únicos (`HashSet<Integer>`)**
   - Filtra los números pares de una lista, los eleva al cuadrado y los guarda en un `HashSet` usando `Collectors.toSet()` para garantizar que no haya duplicados.
5. **Mapa de Longitudes (`HashMap<String, Integer>`)**
   - Transforma una lista de palabras en un mapa donde la clave es la palabra y el valor es su longitud, usando `Collectors.toMap()`.
6. **Modificador de Inventario (`HashMap<String, Double>`)**
   - Itera sobre un catálogo de productos con sus precios usando `forEach()` y un `BiConsumer` para imprimir el inventario con un descuento aplicado.
7. **Contador de Frecuencias (`HashMap<String, Integer>`)**
   - Cuenta las ocurrencias de palabras en una lista utilizando el método `merge()` de los Mapas junto con una expresión lambda.
8. **Clasificador de Palabras (`HashMap<String, Integer>`)**
   - Filtra un mapa de frecuencias usando `entrySet().stream()` para extraer y devolver en una lista solo aquellas palabras cuya frecuencia sea menor a un valor estipulado.
9. **Deduplicación de Palabras (`HashSet<String>`)**
   - Toma una frase completa, la divide, limpia caracteres, filtra por longitud, convierte a minúsculas y almacena los resultados únicos en un `HashSet`.
10. **El Tope de Frecuencias (`HashMap<String, Integer>`)**
    - Recorre un mapa de frecuencias usando `replaceAll()` y una lambda para limitar (topar) los valores a un máximo `N` establecido.

## Instrucciones de Compilación y Ejecución

Asegúrate de tener instalado el [JDK de Java (versión 8 o superior)](https://www.oracle.com/java/technologies/downloads/).

1. Abre una terminal o consola de comandos.
2. Navega hasta el directorio donde se encuentran los archivos `.java` (`Main.java`, `NumberUtils.java`, `StringUtils.java`, `GeneralUtils.java`).
3. Compila todos los archivos ejecutando el siguiente comando:
   ```bash
   javac *.java
   ```
4. Ejecuta la clase principal (`Main`) con:
   ```bash
   java Main
   ```

## Ejemplo de Salida

Al ejecutar el programa, verás el reporte de pruebas de cada método mostrando los datos antes y después de aplicar las lambdas. Aquí tienes un pequeño fragmento de lo que observarás en la consola:

```text
=== 1. PRUEBAS DE EL MULTIPLICADOR ===
Caso Normal - Antes: [1, 2, 3, 4, 5]
Caso Normal - Después (x10): [10, 20, 30, 40, 50]

...

=== 6. PRUEBAS DE MODIFICADOR DE INVENTARIO ===
Caso Normal - Imprimiendo catálogo:
--- Catálogo con 10% de descuento ---
Producto: Mouse | Precio original: $50.00 | Con descuento: $45.00
Producto: Laptop | Precio original: $1000.00 | Con descuento: $900.00
Producto: Teclado | Precio original: $100.00 | Con descuento: $90.00
-------------------------------------

...

=== 10. PRUEBAS DE TOPE DE FRECUENCIAS ===
Caso Normal - Antes: {java=15, c++=10, python=5, javascript=2}
Caso Normal - Después (Tope = 10): {java=10, c++=10, python=5, javascript=2}
```
