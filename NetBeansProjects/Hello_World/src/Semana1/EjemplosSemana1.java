/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class EjemplosSemana1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Ejemplo de Datos en Java
        System.out.println("Ejemplo de Datos en Java");
        float nota1, nota2, definitiva;

        System.out.println("Digite la nota del primer corte: ");
        nota1 = Float.parseFloat(leer.nextLine());
        System.out.println("Digite la nota del Segundo corte: ");
        nota2 = Float.parseFloat(leer.nextLine());

        definitiva = (nota1 + nota2) / 2;

        System.out.println("La Definitiva es: " + definitiva);

        // Ejemplo de Estructuras de Control
        System.out.println("\n\nEjemplo de Estructuras de Control");
        int n1 = 0, n2 = 0, opcion = 0, resultado = 0;

        System.out.println("Digite un valor Entero: ");
        n1 = Integer.parseInt(leer.nextLine());

        System.out.println("Digite otro valor Entero: ");
        n2 = Integer.parseInt(leer.nextLine());

        System.out.println("Que operación desea realizar: \n 1. suma, 2. Resta, 3. Producto");
        System.out.println("Digite una Opción: ");
        opcion = Integer.parseInt(leer.nextLine());

        switch (opcion) {
            case 1: {
                resultado = n1 + n2;
                System.out.println("La suma es igual a: " + resultado);
                break;
            }
            case 2: {
                resultado = n1 - n2;
                System.out.println("La resta es igual a: " + resultado);
                break;
            }
            case 3: {
                resultado = n1 * n2;
                System.out.println("El Producto es igual a: " + resultado);
                break;
            }
            default: {
                System.out.println("Opción no válida!!");

            }
        }

        // Ejemplo de Ciclos
        System.out.println("\n\nEjemplo de Ciclos");
        int num, i, fac = 1;

        System.out.println("Digite un valor Entero: ");
        num = Integer.parseInt(leer.nextLine());

        if (num >= 0) {
            for (i = 1; i <= num; i++) {
                fac = fac * i;
            }

            System.out.println("El factorial de " + num + " es igual a: " + fac);
        } else {
            System.out.println("No existe Factorial para Números Negativos");
        }
    }
}
