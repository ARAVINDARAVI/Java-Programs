/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket_issue;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Ticket_issue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a={25,25,50};
        
        int b=0;
        int c=0;
        if(a[0]!=25)
        {
            System.out.println("No");
        }
        else
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==25)
                    b++;
                if(a[i]==50)
                {
                    if(b>0)
                    {
                        b--;
                        c++;
                    }
                    else
                    {
                        System.out.println("No");
                        break;
                    }
                }
                if(a[i]==100)
                {
                    if(b>0&&c>0)
                    {
                        b--;
                        c--;
                    }
                    else
                    {
                        System.out.println("No");
                        break;
                    }
                }
                if(i==a.length-1)
                {
                    System.out.println("Yes");
                }
            }
        }
    }
    
}
