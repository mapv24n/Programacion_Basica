/*
En JAVA se debe Declarar e Inicializar las variables a utilizar. 
Para ello se debe tener en cuenta los tipos de datos a utilizar.

Los tipos de Datos en JAVA son:

int -> Valores enteros entre -2^31 hasta (2^31)-1
short -> Valores enteros cortos entre -32768 hasta 32767
long -> Valores enteros entre -2^63 hasta (2^63)-1
float -> Valores reales -2^31 hasta (2^31)-1
double -> Valores reales -2^63 hasta (2^63)-1
Boolean -> Los Valores true o false
char -> 1 caracter alfanúmerico.
String (objeto) -> Almacenar cadenas de caracteres
  
Para declarar variables se utiliza la siguiente sintaxis:

tipo_de_dato Nombre_variable;
tipo_de_dato Nombre_variable=valor_inicial;
tipo_de_dato Nombre_variable, Nombre_variable2, ...., Nombre_variableN=Valor_inicialN;

También se maneja el concepto de Variables globales y locales

ENTRADA Y SALIDA DE DATOS (CONSOLA)

IMPRIMIR DATOS:

System.out.println(mensaje);  El mensaje puede estar compuestos por valores contenidas en variables.

LEER DATOS:

Se debe importar el elemento java.util.Scanner

Se debe crear un objeto tipo Scanner

Sintaxis:

import java.util.Scanner;  // Fuera de la clase

Scanner nombre_Objeto = new Scanner(System.in);

variable = nombre_Objeto.nextLine(); // La captura siempre es una cadena debo tener presente 
si se debe castear el tipo de dato.

En el caso de valores enteros:

variable = Integer.parseInt(nombre_Objeto.nextLine());  //Lo mismo para los otros tipos de datos


*/
package Semana1;
import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class DatosJava {
    
    float nota;  // Variable global (Se puede usar en todas las funciones de la clase
    
    public static void main(String[] args)
    {
        // Ejemplo de declaración de Variables en JAVA:
        
        int num1, num2, suma=0;
        short porcentaje, comision;
        long Salario;
        float coordenada;
        double saldo;
        boolean continuar = true;
        char cont = 'S';
        String continua = "Si"; // Todas estas variables son locales del main()
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite un valor Entero: ");
        num1 = Integer.parseInt(leer.nextLine());
        System.out.println("Digite otro valor Entero: ");
        num2 = Integer.parseInt(leer.nextLine());
        
        suma = num1 + num2;
        
        System.out.println("El resultado de la suma es: "+suma);
    }
    
    public static int calculo()
    {
        int producto=1;  // Producto es una variable local de la función calculo
        return producto;
    }
    
}
