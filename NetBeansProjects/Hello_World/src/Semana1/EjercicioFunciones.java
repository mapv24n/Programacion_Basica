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
public class EjercicioFunciones {

    /* * To change this license header, choo... de Jhonatan Andrey Veloza Malaver

Jhonatan Andrey Veloza Malaver9:53 p.m.
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
     */
 
        public static void main(String[] args) {
            int op = 0;
            int numero, result;
            Scanner leer = new Scanner(System.in);
            System.out.println("FUNCIONES ");
            System.out.println("1. Factorial. ");
            System.out.println("2. Sumatoria 2i-1. ");
            System.out.println("3. SALIR.");
            System.out.println("Opción: ");
            op = Integer.parseInt(leer.nextLine());
            if (op == 1) {
                System.out.println("Digite un número: ");
                numero = Integer.parseInt(leer.nextLine());
                result = factorial(numero);
            } else if (op == 2) {
                System.out.println("Digite un número: ");
                numero = leer.nextInt();
                result = sumatoria(numero);
            } else {
                System.out.println("Bye Bye. ");
            }
        }

        public static int factorial(int num) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("El factorial de " + num + " es: " + fact);
            return fact;
        }

        public static int sumatoria(int num) {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum = sum + ((2 * i) - 1);
            }
            System.out.println("La sumatoria de " + num + " es: " + sum);
            return sum;
        }
    }
