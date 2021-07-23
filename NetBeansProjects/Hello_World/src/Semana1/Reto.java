/*
Hacer un Algoritmo en Java (Utilizar esta clase) que almacene las calificaciones de los periodos Academicos de las asignaturas de 
un estudiante del colegio HighSchool.  Las asignaturas son:

1. Matemàticas
2. Ciencias
3. Ingles
4. Informática
5. Deportes

La escala de calificación es en porcentaje 0 a 100.

El programa permite realizar 4 opciones al usuario a través de un menú:

1. Cargar calificaciones Estudiante.
2. Imprimir Boletin (Todas las Asignaturas)
3. Imprimir Estado  Asignatura (Ver calificaciones de la Asignatura seleccionada)
4. Salir

 */
package Semana1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import Semana2.Estudiante;  // Importo la clase Estudiante del Paquete Semana2
import Semana2.Tripulante;  // Importo la clase Tripulante del Paquete Semana2


/**
 *
 * @author miguelangelperezvillamizar
 */
public class Reto {
    
    public static Scanner leer = new Scanner(System.in);
    public static int[][] estudiante = new int[5][4];
    
    public static Map<Integer, String> asignaturas  = new TreeMap<Integer, String>();
      
    //Estudiante est = new Estudiante("Miguel");
    
    //Tripulante trip = new Tripulante(0);
                
   
    
    public static void main(String[] args)
    {
        // Declaración de variables
        int op;
        
        //trip.
        
        //est.  //Al ver los elementos del obejto est, solo se visualiza los que se definieron public (El objeto est es definido por la clase estudiante que se encuentra en el paquete Semana2
        
        // Desarrollo del Algoritmo (llamado a las funciones)
        asignaturas.put(0, "Matemáticas");
        asignaturas.put(1, "Ciencias");
        
        op = menu();
        
        switch(op)
        {
            case 1: {
                cargarCal();
                break;
            }
            case 2:{
                boletin();
            }
           
            
        }
    }    
    
    public static int menu()
    {
        int opcion;
        System.out.println("*************************************");
        System.out.println("                MENU");
        System.out.println("*************************************");
        System.out.println(" 1. Cargar Calificación");
        System.out.println(" 2. Imprimir Boletín");
        
        System.out.println("Seleccione una opción: ");
        opcion = leer.nextInt();
        return opcion;
        
    }
   
    public static void cargarCal(){
        
        
    }
    
    public static void boletin()
    {
        int i, j, periodo;
        for(i=0; i<5; i++)
        {
            System.out.println("\n\n"+asignaturas.get(i));
            for(j=0; j<4; j++)
            {
               periodo=j+1;
               System.out.println("Periodo "+periodo+": ");
            }
        }
    }
    
    
    // Definir Función Estado Asignatura
}
