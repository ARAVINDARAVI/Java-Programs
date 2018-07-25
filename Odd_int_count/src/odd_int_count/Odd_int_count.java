/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd_int_count;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Odd_int_count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] n={1,1,2,-2,5,2,4,4,-1,-2,5};
        
        for(int i=0;i<n.length;i++)
        {
            int s=0;
            for(int j=0;j<n.length;j++)
            {
                if(n[i]==n[j])
                {
                    s++;
                }
            }
            if(s%2!=0)
            {
                System.out.println(n[i]);
                break;
            }
        }
    }
    
}
