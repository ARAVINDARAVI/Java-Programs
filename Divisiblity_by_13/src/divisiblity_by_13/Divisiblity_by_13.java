/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiblity_by_13;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Divisiblity_by_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long n=85299258;
        
        
        long q=fn(n);
        long q1=fn(q);
        for(int p=0;p<10;p++)
        {
            q=q1;
            q1=fn(q1);
            if(q==q1)
            {
                break;
            }
        }
        System.out.println(q);
        
        
        /*for(int j=0;j<i;j++)
        {
            System.out.println(n1[j]);
        }*/
    }
    public static long fn(long n)
    {
        long[] a={1,10,9,12,3,4};
        long[] n1 =new long[100];
        int i=0;
        while(n>0)
        {
            n1[i]=n%10;
            i++;
            n=n/10;
        }
        int t=0;
        long f=0;
        for(int l=0;l<n1.length;l++)
        {
            f=f+(n1[l]*a[t]);
            if(t==5)
            {
                t=0;
                //break;
            }
            else
            {
                t++;
            }
        }
        return f;
    }
    
}
