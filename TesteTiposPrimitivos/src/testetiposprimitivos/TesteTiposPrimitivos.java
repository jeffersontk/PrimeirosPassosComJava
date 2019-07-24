/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetiposprimitivos;

/**
 *
 * @author Jeff
 */
public class TesteTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int idade = 30;
        * //um tipo string não consegue receber diretamente um valor int.
        * // String valor = idade;
        * //só usando o metodo wrapper class e convertendo atraves do toString o valor de idade
        * String valor = Integer.toString(idade);
        * System.out.println(valor);
        */
       
      /* String valor = "30";
       * // int valor = idade; não funciona da conflito de tipos primitivos
       * // int valor (int)idade; nem usanto tapcast funciona
       * //é preciso usar wrapper class
       * int idade = Integer.parseInt(valor);
       * System.out.println(idade);
       */
      //a mesma coisa serve para converter string para float
        String valor = "30.5";
       // int valor = idade; não funciona da conflito de tipos primitivos
       // int valor (int)idade; nem usanto tapcast funciona
       //é preciso usar wrapper class
       float idade = Float.parseFloat(valor);
       System.out.println(idade); 
    }
    
}
