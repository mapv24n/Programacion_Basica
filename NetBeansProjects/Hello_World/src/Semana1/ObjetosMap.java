/*
Con el Objeto MAP especificamente TreeMap se puede trabajar datos compuestos que 
almacena pares "Clave/Valor" conocidos como diccionarios.

Para ello se debe importar 3 librerias:

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

 */
package Semana1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class ObjetosMap {

    public static void main(String[] args) {
        Map<Integer, String> diccionario = new TreeMap<Integer, String>();
        diccionario.put(75, "Cúcuta");
        diccionario.put(76, "Bucaramanga");
        diccionario.put(41, "Medellín");
        diccionario.put(10, "Bogotá");
        diccionario.put(11, "Calí");

        // Recorrer el diccionario utilizo iteraciones con el objeto iterator.
        Iterator<Integer> i = diccionario.keySet().iterator();

        while (i.hasNext()) {
            Integer clave = i.next();
            System.out.println("Clave: " + clave + "/ Valor: " + diccionario.get(clave));
        }

        // Métodos del Objeto TreeMap:
        System.out.println(diccionario.size()); // Tamaño del diccionario
        System.out.println(diccionario.isEmpty()); // Verifica si el diccionario esta vacio
        System.out.println(diccionario.get(11)); // Retorna el valor de la clave
        diccionario.remove(11); // Elimina el elemento con clave 11
        System.out.println(diccionario.containsKey(11)); // Verifica si existe el elemento con la clave 11

    }

}
