/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejomatrices;

import java.util.ArrayList;

/**
 *
 * @author Valakuth
 */
public class Operaciones {

    public Operaciones() {
    }
    
    
    boolean verificarTamañoSuma(Matriz matrizA, Matriz matrizB){
    if((matrizA.getFilas()==matrizB.getFilas())&&(matrizA.getColumnas()==matrizB.getColumnas())){
        return true;
    }
    else{
        return false;
    }   
    };
    
    boolean verificarTamañoMultiplicación(Matriz matrizA, Matriz matrizB){
    if(matrizA.getColumnas()==matrizB.getFilas()){
        return true;
    }
    else{
        return false;
    }   
    };
    
    
    Matriz sumaDeMatrices(Matriz matrizA, Matriz matrizB){
    Matriz matrizC=new Matriz();
    if(verificarTamañoSuma(matrizA, matrizB)==false){
        return matrizC;
    }
    else{
        for(int i=0; i<matrizA.lenght(); i++ ){
            for(int j=0; j<matrizB[i].length; j++ ){
                System.out.println(b[i][j]);
            }
        }
    }
    
    
    return matrizC;
    };
    
}
