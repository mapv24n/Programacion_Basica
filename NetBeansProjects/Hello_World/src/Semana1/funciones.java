/*
Las Funciones me permiten estructurar el código en bloques que se ejecutan cuando son referenciados

Al igual que en Python las funciones pueden ser:

- No retorna valores recibe parametros

public static void nombre_funcion(tipo_dato parametro1, tipo_dato parametro2, ..., tipo_dato parametroN)

- No retorna valores no reciben parametros

public static void nombre_funcion()

- Retorna valores recibe parametros

public static tipo_datoRetorna nombre_funcion(tipo_dato parametro1, tipo_dato parametro2, ..., tipo_dato parametroN)

- Retorna valores no recibe parametros

public static tipo_datoRetorna nombre_funcion()

 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class funciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Digite un valor Entero: ");
        num1 = Integer.parseInt(leer.nextLine());
        System.out.println("Digite otro valor Entero: ");
        num2 = leer.nextInt();
        result = calcular(num1, num2);
        System.out.println("El resultado de la suma es: "+result);
    }

    public static int calcular(int n1, int n2) // definición de a función.
    {
        int suma;
        suma = n1 + n2;
        return suma;
    }

}
