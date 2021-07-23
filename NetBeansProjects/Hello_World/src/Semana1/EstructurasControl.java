/*
En JAVA se manejan dos estructuras de control de flujo.

SENTENCIA IF

Que permite controlar la ejecución de un bloque de código mediante la aplicación de una
condición.

Sintaxis:

if(Condición)
{
    Bloque de Código;
}
else
{
    Bloque de Código;
}

El else es opcional.

Se pueden utilizar sentencias anidadas en JAVA:

if(Condición)
{
    if(Condición)
    {
        Bloque de Código
    }
    else
    {
        if(Condición)
        {
            Bloque de Código
        }
        else
        {
            Bloque de Código
        }
    }
}
else
{
    Bloque de Código
}

Al igual que en python se puede simplificar las sentencias anidadas con if múltiples:

if(Condición)
{
    Bloque de Código;
}
else if (Condición)
{
    Bloque de Código;
}
else if (Condición)
{
    Bloque de Código;
}
else
{
    Bloque de Código;
}

SENTENCIA SWITCH

Permite ejecutar un bloque de código ante posibles valores que pueda contener una variable

Sintaxis:

switch(variable)
{
    case valor1:
        {
            Bloque de Código;
            break;
        }
        .
        .
        .
        .
    case valorN:
        {
            Bloque de Código;
            break;
        }
    default:
        {
            Bloque de Código;
        }
}

El default es opcional.
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class EstructurasControl {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero = 0, opcion = 0;

        System.out.println("Digite un valor Entero: ");
        numero = Integer.parseInt(leer.nextLine());

        if (numero == 0) {
            System.out.println("Cero es un número neutro!");
        } else if (numero > 0) {
            System.out.println("El Número es positivo");
        } else {
            System.out.println("El Número es negativo");
        }

        System.out.println("1. suma, 2. Resta, 3. Producto");
        System.out.println("Digite una Opción: ");
        opcion = Integer.parseInt(leer.nextLine());

        switch (opcion) {
            case 1: {
                System.out.println("Ud seleccionó la suma");
                break;
            }
            case 2: {
                System.out.println("Ud seleccionó la Resta");
                break;
            }
            case 3: {
                System.out.println("Ud seleccionó el Producto");
                break;
            }
            default: {
                System.out.println("Opción no válida!!");

            }
        }
    }
}
