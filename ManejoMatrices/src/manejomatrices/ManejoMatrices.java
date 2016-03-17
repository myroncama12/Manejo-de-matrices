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
        a.setFilas(2);
        a.setColumnas(3);
        a.setTamañoMatriz();
        
        b.setFilas(2);
        b.setColumnas(2);
        b.setTamañoMatriz();
        float tempA[][]=a.getMatriz();
        float tempB[][]=b.getMatriz();
        for(int i=0; i<a.getFilas(); i++ ){
            for(int j=0; j<a.getColumnas(); j++ ){
               tempA[i][j]=(float)Math.random() * 10; 
              
            }   
        }
        a.setMatriz(tempA);
        b.setMatriz(tempB);
        
        Operaciones c=new Operaciones();
        Matriz d=c.multiplicaciónEscalarDeMatrices(a, 5);
        
        
        for(int i=0; i<a.getFilas(); i++ ){
            for(int j=0; j<a.getColumnas(); j++ ){
                System.out.print(a.getMatriz()[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(" ");
        
        for(int i=0; i<b.getFilas(); i++ ){
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
