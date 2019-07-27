/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Jeff
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 9;
        z = 14;
        boolean r1, r2, r3, r4;
        r1 = (x<y && x==z)?true:false;
        System.out.println(r1);
        r2 = (x<y || y>z)?true:false;
        System.out.println(r2);
         r3 = (x<y ^ y<z)?true:false;
        System.out.println(r3);
        
    }
    
}
