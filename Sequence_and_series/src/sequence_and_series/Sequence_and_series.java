/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence_and_series;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Sequence_and_series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n=10000;
        int s=50;
        long r=0;
        for(int i=1;i<=n;i++)
        {
            r=r+(s*i);
        }
        
        System.out.println(r);
    }
    
}
