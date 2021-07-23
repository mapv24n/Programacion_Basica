/*
Hacer un Algoritmo en JAVA que me solicite datos flotantes para un vector 2X2 y me almacene en un vector unidimensional de longitud 2, 
los promedios de los números de cada fila del vector Bidimensional
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class EjercicioClase3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int longitud = 2, i, j, fil = 2, col = 2;
        float[] promedios = new float[longitud];
        float[][] vecValores = new float[fil][col];
        float acumValores = 0;

        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("Digite un valor para el vecValores[" + i + "][" + j + "]: ");
                vecValores[i][j] = leer.nextInt();
            }
        }

        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                acumValores = acumValores + vecValores[i][j];
            }
            promedios[i] = (acumValores / j);
            acumValores = 0;
        }

        for (i = 0; i < longitud; i++) {
            System.out.println("promedios[" + i + "]: " + promedios[i]);
        }

    }
}
