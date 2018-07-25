/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect_power;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Perfect_power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=8;
        
        int[] s=new int[2];
        for(int i=2;i<Math.sqrt(n)+1;i++)
        {
            for(int j=2;j<Math.sqrt(n)+1;j++)
            {
                if(Math.pow(i, j)==n)
                {
                    s[0]=i;
                    s[1]=j;
                }
            }
        }
        
        
        
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
    
}
