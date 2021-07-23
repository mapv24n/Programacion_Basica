/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class TripulanteMT {
    
    private float notaCurso;

    public TripulanteMT(float notaCurso) {
        this.notaCurso = notaCurso;
    }
    
    public void asignarNota(float n)
    {
        this.notaCurso = n;
    }
    
    public float obtenerNota()
    {
        return this.notaCurso;
    }
    
}
