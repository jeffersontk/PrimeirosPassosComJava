/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("media: " + m);
        if(m>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("reprovado");
        }
    }
    
}
