/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withdraw;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Withdraw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=260;
        
        int a=0,b=0,c=0;
        
            a=n/100;
            n=n%100;
            
        
            b=n/50;
            n=n%50;
            
        
            c=n/20;
            n=n%20;
            
        System.out.println(a);
                System.out.println(b);
                        System.out.println(c);


    }
    
}
