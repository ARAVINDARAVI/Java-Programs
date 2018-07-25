/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highest_scoring_word;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Highest_scoring_word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="man i need a taxi up to ubud";
        
        int[] n=new int[100];
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            char[] c=a[i].toCharArray();
            for(int j=0;j<a[i].length();j++)
            {
                int k=(int)c[j]-96;
                n[i]=n[i]+k;
            }
        }
        int max=0;
        String word="";
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>max)
            {
                max=n[i];
                word=a[i];
            }
        }
        
        
                
        
        System.out.println(max);
        System.out.println(word);
        
    }
    
}
