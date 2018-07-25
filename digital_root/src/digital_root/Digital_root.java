/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_root;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Digital_root {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=493193;
        
        int s;
        s = q(n);
        while(s>9)
        {
            s=q(s);
        }
        System.out.println(s);
    }
     public static int q(int n)
    {
        int r=0;
        while(n>0)
        {
           r=r+(n%10);
           n=n/10;
        }
       return r; 
    }
    
}
