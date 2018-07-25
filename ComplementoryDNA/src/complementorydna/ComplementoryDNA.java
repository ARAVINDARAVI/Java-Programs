/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementorydna;

/**
 *
 * @author SUBRAMANIYAN
 */
public class ComplementoryDNA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="TTCTT";
        
        String f="";
        char[] a=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
           if(a[i]=='T')
           f=f+'A';
           else if(a[i]=='A')
           f=f+'T';
           else if(a[i]=='C')
           f=f+'G';
           else if(a[i]=='G')
           f=f+'C';
        }
        
        
        System.out.println(f);
    }
    
}
