/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Jeff
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        Scanner t = new Scanner(System.in);
        System.out.print("informe o ano de Nascimento: ");
        int nasc = t.nextInt();
        int idade = anoAtual - nasc;
        System.out.println(idade +" anos");
        if(idade<18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
        if((idade>=16 && idade<18)|| idade>70){
            System.out.println("voto opcional");
        }else if(idade<16){
            System.out.println("não pode votar");
        }else{
            System.out.println("voto obrigatorio");
        }
        
    }
    
}
