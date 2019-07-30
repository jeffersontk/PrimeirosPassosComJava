/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaspernas;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class ProgramasPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        System.out.print("quantas pernas? ");
        int perna = tc.nextInt();
        String tipo;
        switch (perna){
            case 1:
                tipo = "perneta";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 3:
                tipo = "tripe";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
