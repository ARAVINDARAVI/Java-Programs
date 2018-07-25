/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Persistence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="abcdefghijklmnopqrstv";
        char[] c=s.toCharArray();
        int a=s.length();
        String s1="";
        for(int i=0;i<a;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                if(j==1)
                {
                    s1=s1+Character.toUpperCase(c[i]);
                }
                else
                {
                    s1=s1+c[i];
                }
            }
            if(i!=(a-1)) 
            {
                s1=s1+'-';
            }
        }
        System.out.println(s1);
    }
    
}
