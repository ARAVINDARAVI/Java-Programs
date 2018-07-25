/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weights_for_weights;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Weights_for_Weights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="2000 10003 1234000 44444444 9999 11 11 22 123";
        
        String[] a=s.split(" ");
        int f = 0;
        String[] q=new String[a.length];
        int[] n=new int[a.length];
        int[] l=new int[a.length];
        int[] k=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            n[i]=Integer.parseInt(a[i]);
            k[i]=Integer.parseInt(a[i]);
        }
        
        for(int i=0;i<n.length;i++)
        {
            while(n[i]>0)
            {
                f=f+(n[i]%10);
                n[i]=n[i]/10;
            }
            l[i]=f;
            f=0;
        }
        
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(l[j]<l[i])
                {
                    int temp = k[i];
                    k[i]=k[j];
                    k[j]=temp;
                    int temp1=l[i];
                    l[i]=l[j];
                    l[j]=temp1;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            q[i]=Integer.toString(k[i]);
        }
        
        String w=String.join(" ",q);
        System.out.println(w);
        
        
        
    }
    
}
