/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit_counting;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Bit_counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1234;
        
        int[] a=new int[100];
        int i=0,t=0,f=0;
        while(n>0)
        {
            t=n%2;
            a[i]=t;
            i++;
            n=n/2;
            t=0;
        }
        for(int j=0;j<i;j++)
        {
            if(a[j]==1)
            {
                f++;
            }
        }
        
        
        System.out.println(f);
        
    }
    
}
