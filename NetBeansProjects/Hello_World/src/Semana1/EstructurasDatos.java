/*
El concepto de estructuras de Datos aplica en la creación de estructuras con diferentes
tipos de datos enlazados a través de punteros.  Un puntero es un variable que almacena
la dirección de memoria de una variable.

Por ejemplo tengo la variable X que almacena el valor 8:

X=8;  Cuando se declara X se reserva un espacio en memoria para almacenar dicho valor (8)

Si declaramos X como entero:

int X=8;  El compilador reserva 2 bytes en la memoria para esa variable.

Ese espacio en memoria tiene un valor (dirección Hexadecimal), se puede decir por
ejemplo que X esta en la posición de memoria A32CF81.

Los punteros no almacena valores sino posiciones de memoria.

Cuando se crean estructuras de datos se crean Nodos con tipos de datos.

struct node{
    int salario;
    float Comision;
    String Nombre;
    int *puntero;
}

Se deben definir funciones para crear nodo, para enlazar nodo, para recorrer nodo..

Pila, Cola, Listas, Arboles.

EL CONCEPTO COMO TAL DE ESTRUCTURA DE DATOS NO APLICA PARA ESTE NIVEL.

Lo que aplica es el Concepto de Datos compuestos.

VECTORES.

Vectores Unidimensionales.  En python se trabaja como listas, pero en JAVA no son
Heterógeneas.  PORQUE EN JAVA se especifica el tipo de dato cuando se crea la variable.

Sintaxis:

Declarar el vector:

tipo_de_dato[] nombreVariable = new tipo_de_dato[longitud];

La clave de trabajar Vectores es recorrerlos mediante las iteraciones.  La iteración
más usada por los desarrolladores para recorrer vectores es el for, pero se puede
usar cualquier ciclo.

Vectores Bidimensionales.

Sintaxis:

Declarar el vector:

tipo_de_dato[][] nombreVariable = new tipo_de_dato[filas][Columnas];
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class EstructurasDatos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int longitud = 3, i, j, fil = 2, col = 3;
        int[] vector = new int[longitud]; // Vector de longitud 3 de datos Enteros
        float[][] vecBid = new float[fil][col];

        // Vector Unidimensional
        for (i = 0; i < longitud; i++) {
            System.out.println("Digite un valor para el vector[" + i + "]: ");
            vector[i] = leer.nextInt();
        }

        // Vector Bidimensional
        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("Digite un valor para el vecBid[" + i + "][" + j + "]: ");
                vecBid[i][j] = leer.nextInt();
            }
        }

        // Recorremos ahora el vector para imprimirlo
        for (i = longitud - 1; i >= 0; i--) {
            System.out.println("Vector[" + i + "]: " + vector[i]);
        }

        // Vector Bidimensional
        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("Digite un valor para el vecBid[" + i + "][" + j + "]: " + vecBid[i][j]);

            }
        }
    }

}
