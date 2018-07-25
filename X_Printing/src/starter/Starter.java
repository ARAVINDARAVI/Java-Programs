/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starter;
import java.io.*;
/**
 *
 * @author SUBRAMANIYAN
 */
class A
{
           int i,j,k;
           void a1(String a)
           {
               char[] m=new char[10];
               m=a.toCharArray();
               for(i=0;i<a.toString().length();i++)
               {
                   j=a.toString().length()-1-i;
                   for(k=0;k<a.toString().length();k++)
                   {
                       if(k==i || k==j)
                       {
                           System.out.print(m[k]);
                       }
                       else
                       {
                           System.out.print(" ");
                       }
                   }
                   System.out.println("\n");
               }
           }
}
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A obj=new A();
        String abc="SAIRAMM";
        char[] arr=new char[10];
        arr = abc.toCharArray();
        obj.a1(abc);
    }
    
}
