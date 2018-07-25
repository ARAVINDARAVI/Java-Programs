/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scramblies;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Scramblies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a="scriptjavx";
        String b="javascript";
        
        int r=0;
        char[] s1=a.toCharArray();
        char[] s=b.toCharArray();
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s1.length;j++)
            {
                if(s1[j]==s[i])
                {
                    s1[j]=0;
                    r++;
                    break;
                }
            }
        }
        if(r==s.length)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}
