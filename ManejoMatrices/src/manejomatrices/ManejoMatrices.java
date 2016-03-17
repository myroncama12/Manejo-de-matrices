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
public class ManejoMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz a=new Matriz();
        Matriz b=new Matriz();
        a.setFilas(5);
        a.setColumnas(5);
        a.setTamañoMatriz();
        
        b.setFilas(5);
        b.setColumnas(5);
        b.setTamañoMatriz();
        float tempA[][]=a.getMatriz();
        float tempB[][]=b.getMatriz();
        for(int i=0; i<a.getFilas(); i++ ){
            for(int j=0; j<a.getColumnas(); j++ ){
               tempA[i][j]=(float)(3+j)/4; 
               tempB[i][j]=(float)(2+i)/7;
            }   
        }
        a.setMatriz(tempA);
        b.setMatriz(tempB);
        
        Operaciones c=new Operaciones();
        Matriz d=c.sumaDeMatrices(a, b);
        
        
        for(int i=0; i<d.getFilas(); i++ ){
            for(int j=0; j<a.getColumnas(); j++ ){
                System.out.print(a.getMatriz()[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(" ");
        
        for(int i=0; i<d.getFilas(); i++ ){
            for(int j=0; j<b.getColumnas(); j++ ){
                System.out.print(b.getMatriz()[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println(" ");
        
        for(int i=0; i<d.getFilas(); i++ ){
            for(int j=0; j<d.getColumnas(); j++ ){
                System.out.print(d.getMatriz()[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
}
