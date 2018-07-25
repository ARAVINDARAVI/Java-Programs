/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd_man_out;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Odd_man_out {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a={1,2,4,6};
        int c=a[0]%2;
        int d=a[1]%2;
        int e=a[2]%2;
        int b=a.length;
        if((c==0&&d==0)||(c==0&&e==0)||(d==0&&e==0))
        {
        for(int i=0;i<b;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }
        }        
            
        }
        
        
        if((c!=0&&d!=0)||(c!=0&&e!=0)||(d!=0&&e!=0))
        {
        for(int i=0;i<b;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }        
            
        }
        // TODO code application logic here
    }
    
}
