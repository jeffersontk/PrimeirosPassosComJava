/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Jeff
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "jeff";
        String nome2 = "jeff";
        String nome3 = new String ("jeff");
        String res = nome1.equals(nome3)?"igual":"diferente";
        System.out.println(res);
    }
    
}
