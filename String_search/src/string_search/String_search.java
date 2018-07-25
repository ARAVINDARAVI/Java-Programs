/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string_search;

import java.util.Scanner;

/**
 *
 * @author SUBRAMANIYAN
 */
public class String_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] s2=s1.toCharArray();
        char[][] a=new char[5][5];
        int i,j,k=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5 && k<s1.length();j++)
            {
                a[i][j]=s2[k];
                k++;
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5 && j<a[i].length;j++)
            {
                if(j!=5 && j!=4)
                if(a[i][j]=='t' && a[i][j+1]=='o' && a[i][j+2]=='o')
                {
                    int m=j+2;
                    System.out.println("Starting Index: <"+i+","+j+">");
                    System.out.println("Ending Index: <"+i+","+m+">");
                }
                
            }
        }
for(i=0;i<5;i++)
        {
            //System.out.println("i="+i+"a="+a[i].toString().length);
            for(j=0;j<5;j++)
            {
                if(i!=5 && i!=4)
                if(a[i][j]=='t' && a[i+1][j]=='o' && a[i+2][j]=='o')
                {
                    System.out.println("Starting index: <"+i+","+j+">");
                    int m=i+2;
                    System.out.println("Ending Index: <"+m+","+j+">");

                }
            }
        }
// TODO code application logic here
    }
    
}
