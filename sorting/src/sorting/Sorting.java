/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt(); 
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i=i+2)
        {
            for(int j=i+2;j<n;j=j+2)
            {
                if(a[i]<a[j])
                {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int i=1;i<n;i=i+2)
        {
            for(int j=i+2;j<n;j=j+2)
            {
                if(a[i]>a[j])
                {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
        // TODO code application logic here
    }
    
}
