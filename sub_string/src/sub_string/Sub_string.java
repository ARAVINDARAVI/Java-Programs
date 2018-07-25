/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub_string;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Sub_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int res=0,p = 0;
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            if(a[i]==b[0])
            {
                int k=0;
                for(int j=i;j<(i+s2.length());j++)
                {
                    p=i;
                    try
                    {
                    if(a[j]==b[k])
                    {
                        res=1;
                        k++;
                    }
                    else
                    {
                        res=0;
                        break;
                    }
                    }
                    catch(Exception e)
                    {
                        System.out.println("False: -1");
                        exit(0);
                    }
                }
            }
            else
                continue;
        }
        if(res==1)
            System.out.println("True: "+p);
        else
            System.out.println("False: -1");
        // TODO code application logic here
    }
    
}
