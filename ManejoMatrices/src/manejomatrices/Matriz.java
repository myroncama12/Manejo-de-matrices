/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejomatrices;

/**
 *
 * @author Valakuth
 */
public class Matriz {

   private int filas, columnas;
   private float matriz[][];

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public float[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(float[][] matriz) {
        this.matriz = matriz;
    }
    
    public Matriz() {
    matriz= new float[filas][columnas];   
    }
    
    int lenght(){  
    return columnas*filas;
    };
    
    
}
