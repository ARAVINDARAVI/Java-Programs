/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get_the_middle_char;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Get_the_middle_char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="abcdefgh";
        
        String s1="";
        int a=s.length();
        char[] c=s.toCharArray();
        if(a%2!=0)
        {
            int b=(a/2);
            s1=s1+c[b];
        }
        else
        {
            int b=a/2;
            s1=s1+c[b-1]+c[b];
        }
        System.out.println(s1);

        
        // TODO code application logic here
    }
    
}
