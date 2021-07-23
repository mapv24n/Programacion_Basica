/*
En JAVA podemos trabajar iteraciones a través de las instrucciones:

while, do while, for

Sintaxis:

while(Condición)
{
    Bloque de Código;
}

do
{
    Bloque de Código;
}while(Condición);


while y do while se diferencia en que el primero se ejecuta si la condición se cumple.
El segundo primero ejecuta y luego pregunta si la condición se cumple para seguir repitiendo.
Es decir que por lo menos se va a ejecutar 1 vez la iteración.

for(inicio; fin; variación)
{
    Bloque de Código;
}
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class BuclesJava {
    public static void main(String[] args)
    {
        int continuar = 0;
        Scanner leer = new Scanner(System.in);

        while(continuar == 1)
        {
            System.out.println("Ingresa al ciclo 1!");
            System.out.println("Desea continuar?: 1. Si, 0. No");
            continuar = Integer.parseInt(leer.nextLine());
        }
        
       do
        {
            System.out.println("Ingresa al ciclo 2!");
            System.out.println("Desea continuar?: 1. Si, 0. No");
            continuar = Integer.parseInt(leer.nextLine());
        }while(continuar == 1);     
       
       for(int i=5; i>=2; i--)
       {
           System.out.println(i);
       }
    }
}
