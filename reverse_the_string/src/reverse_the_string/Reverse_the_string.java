/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_the_string;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Reverse_the_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="I like eating";
        
        String[] s1=s.split(" ");
        String f="";
        for(int i=s1.length-1;i>=0;i--)
        {
            f=f+s1[i];
            if(i!=0)
            {
                f=f+" ";
            }
        }
        
                    System.out.println(f);

    }
    
}
