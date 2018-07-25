/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character_printing;

import java.util.Scanner;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Character_printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] a=str.toCharArray();
        for(int i=0;i<str.length();i=i+2)
        {
            char t=a[i];
            if((a[i+2]-48)>=0 && (a[i+2]-48)<=9)
            {
                int x=((a[i+1]-48)*10)+(a[i+2]-48);
                for(int j=0;j<x;j++)
                {
                    System.out.print(t);
                }
                i++;
            }
            else
            {
                for(int j=0;j<(a[i+1]-48);j++)
                {
                    System.out.print(t);
                }
            }
        }
        // TODO code application logic here
    }
    
}
