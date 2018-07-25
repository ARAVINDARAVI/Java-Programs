/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_readable_time;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Human_readable_time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s=62;
        
        String s1="";
        int a=00,b=00,c=00;
        if(s<60)
        {
            c=s;
            s1=s1+a+"0:"+b+"0:"+c;
        }
        else
        {
            if(s<3600)
            {
               b=s/60;
               c=s-(b*60);
               s1=s1+a+"0:"+b+"0:"+c;
            }
            else
            {
                a=s/3600;
                b=(s-(a*3600))/60;
                c=s-(a*3600)-(b*60);
                s1=s1+a+":"+b+":"+c;
            }
        }
        
        
        
        System.out.println(s1);
    }
    
}
