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
        matrizC.setFilas(matrizA.getFilas());
        matrizC.setColumnas(matrizA.getColumnas());
        matrizC.setTamañoMatriz();
        float matrizTemp[][]=matrizC.getMatriz() ;
        for(int i=0; i<matrizA.getFilas(); i++ ){
            for(int j=0; j<matrizA.getColumnas(); j++ ){
                matrizTemp[i][j]=(float)matrizA.getMatriz()[i][j]+(float)matrizB.getMatriz()[i][j];
            }
        }
        matrizC.setMatriz(matrizTemp);
    }
    
    return matrizC;
    };
    
    Matriz restaDeMatrices(Matriz matrizA, Matriz matrizB){
    Matriz matrizC=new Matriz();
    if(verificarTamañoSuma(matrizA, matrizB)==false){
        return matrizC;
    }
    else{
        matrizC.setFilas(matrizA.getFilas());
        matrizC.setColumnas(matrizA.getColumnas());
        matrizC.setTamañoMatriz();
        float matrizTemp[][]=matrizC.getMatriz() ;
        for(int i=0; i<matrizA.getFilas(); i++ ){
            for(int j=0; j<matrizA.getColumnas(); j++ ){
                matrizTemp[i][j]=(float)matrizA.getMatriz()[i][j]-(float)matrizB.getMatriz()[i][j];
            }
        }
        matrizC.setMatriz(matrizTemp);
    }
    
    return matrizC;
    };
    
    
    Matriz multiplicaciónDeMatrices(Matriz matrizA, Matriz matrizB){
    Matriz matrizC=new Matriz();
    if(verificarTamañoMultiplicación(matrizA, matrizB)==false){
        return matrizC;
    }
    else{
        matrizC.setFilas(matrizA.getFilas());
        matrizC.setColumnas(matrizA.getColumnas());
        matrizC.setTamañoMatriz();
        float matrizTemp[][]=matrizC.getMatriz() ;
        for(int i=0; i<matrizA.getFilas(); i++ ){
            for(int j=0; j<matrizA.getColumnas(); j++ ){
                matrizTemp[i][j]=(float)matrizA.getMatriz()[i][j]+(float)matrizB.getMatriz()[i][j];
            }
        }
        matrizC.setMatriz(matrizTemp);
    }
    
    return matrizC;
    };
    
}
