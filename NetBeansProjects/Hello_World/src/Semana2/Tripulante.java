/*
Hacer un Algoritmo en JAVA que permita calcular la edad promedio de n Tripulantes. Aplicar el paradigma POO en especial el concepto de 
contructores.

Clases: Tripulante, promedio(clase principal)
Atributos: edad, promedio, n
Métodos: Calcular

*********************
Tripulante
*********************
edad

---------------------
constructor
asignarEdad
obtenerEdad
*********************


*********************
Promedio
*********************
promedio
n
--------------------
main
*********************
 */
package Semana2;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class Tripulante {

   
    protected int edad;
    
    public Tripulante(int edad) {
        this.edad = edad;
        //this.
    }
    
    public Tripulante()
    {
    
    }
    
    public void asignarEdad(int edad)
    {
        this.edad=edad;
    }
    
    public int obtenerEdad()
    {
        return this.edad;
    }
    
}
