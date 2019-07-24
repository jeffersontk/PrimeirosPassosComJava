/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivosjava;

import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class TiposPrimitivosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
        System.out.print("sua nota é: " + nota);
        System.out.println(" sua nota é: " + nota);
        System.out.printf("sua nota de %s é: %.2f \n",nome, nota);
        System.out.format("a nota de %s é %.1f\n", nome, nota);
    }
    
}
