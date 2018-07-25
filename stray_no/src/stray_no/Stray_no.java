/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stray_no;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Stray_no {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a={4,1,1,1,1};
        
        int b=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[0]==a[i])
            {
                b=a[i];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b)
            {
                b=a[i];
                break;
            }
        }
        
        System.out.println(b);
    }
    
}
