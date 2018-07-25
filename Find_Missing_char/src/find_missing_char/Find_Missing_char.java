/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find_missing_char;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Find_Missing_char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] c={ 'a','b','c','d','f' };
        
        int m = 0;
        for(int i=0;i<c.length-1;i++)
        {
            if(c[i+1]!=c[i]+1)
            {
                 m=c[i]+1;
            }
        }
        
        
        
        System.out.println((char)m);
    }
    
}
