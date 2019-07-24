/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opearit;

/**
 *
 * @author Jeff
 */
public class OpeArit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (((n1+n2) * (n2-n1)) /2)%3;
        System.out.println(" calculando n1, n2 : " + m);
        // incremento e decremento
        int num = 6;
        int num2 = 3;
        num++;
        num2--;
        System.out.println(num);
        System.out.println(num2);
        int valor3 = 4 + num++;
        System.out.println("valor " + valor3);
        System.out.println("num depois do incremento " + num);
        
        //pre incrimendo pre decremento
        int n = 4;
        int nu = 10; 
        int valor = 5 + ++n;
        int valor2 = 10 + --nu;
        System.out.println(valor);
        System.out.println(valor2);
        
    }
    
}
