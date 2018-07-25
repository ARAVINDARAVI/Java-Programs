/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels_twice;

import java.util.Scanner;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Vowels_twice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] a=s1.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
            {
                for(int j=0;j<2;j++)
                {
                    System.out.println(a[i]);
                }
            }
            else
            {
                System.out.println(a[i]);
            }
        }
        // TODO code application logic here
    }
    
}
