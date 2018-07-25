/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package number_weight;

import com.sun.org.apache.bcel.internal.Constants;
import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.util.Scanner;
class A
{
      int abc(int l)
        {
            for(int j=1;j<l/2;j++)
            {
                int k=j*j;
                if(k==l)
                {
                    return 1;
                }
            }
            return 0;
        }
}
/**
 *
 * @author SUBRAMANIYAN
 */
public class Number_weight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,k;
        A obj=new A();
        int[] val=new int[100];
        int[] wt=new int[100];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            val[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int m=obj.abc(val[i]);
            if(m==1)
            {
                wt[i]=5;
                GOTO x;
            }
            else if(val[i]%4==0 && val[i]%6==0)
            {
                wt[i]=4;
                GOTO x;
            }
            else if(val[i]%2==0)
            {
                wt[i]=3;
                GOTO x;
            }
        }
       
        x:for(i=0;i<n;i++)
        {
            System.out.println("<"+val[i]+","+wt[i]+">");
        }
        
    }
  
}
