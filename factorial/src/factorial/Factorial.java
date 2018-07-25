/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.math.BigInteger;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=13;
        
        BigInteger s=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++)
        {
            s=s.multiply(BigInteger.valueOf(i));
        }
        System.out.println(s);
    }
    
}
