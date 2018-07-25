/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_human_format;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Time_human_format {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s=6280;
        String s1="";
        int a=00,b=00,c=00;
        if(s<60)
        {
            c=s;
            s1=s1+c+" second";
        }
        else
        {
            if(s<3600)
            {
               b=s/60;
               c=s-(b*60);
               if(c==0)
               {
                   if(b<2)
                        s1=s1+b+" minute";
                   else if(b>1)
                       s1=s1+b+" minutes";
               }
               else if((b>1)&&(c>1))
               {
                   s1=s1+b+" minutes and "+c+" seconds";
               }
               else if((b>1)&&(c<2))
               {
                   s1=s1+b+" minutes and "+c+" second";
               }
               else if((b<2)&&(c>1))
               {
                   s1=s1+b+" minute and "+c+" seconds";
               }
               else if((b<2)&&(c<2))
               {
                   s1=s1+b+" minute and "+c+"  second";
               }
            }
            else
            {
                a=s/3600;
                b=(s-(a*3600))/60;
                c=s-(a*3600)-(b*60);
                if((b==0)&&(c==0))
                {
                    if(a<2)
                        s1=s1+a+" hour";
                    else
                        s1=s1+a+" hours";
                }
                else if((b==0)&&(c!=0))
                {
                    s1=s1+a+" hours"+c+" seconds";
                }
                else if((b!=0)&&(c==0))
                {
                    s1=s1+a+" hours "+b+" minutes";
                }
                else if((a>1)&&(b>1)&&(c>1))
                {
                    s1=s1+a+" hours "+b+" minutes "+c+" seconds";
                }
                else if((a<2)&&(b<2)&&(c<2))
                {
                    s1=s1+a+" hour "+b+" minute "+c+" second";
                }
                else if((a>1)&&(b<2)&&(c<2))
                {
                    s1=s1+a+" hours "+b+" minute "+c+" second";
                }
                else if((a<2)&&(b>1)&&(c<2))
                {
                    s1=s1+a+" hour "+b+" minutes "+c+" second";
                }
                else if((a<2)&&(b<2)&&(c>1))
                {
                    s1=s1+a+" hour "+b+" minute "+c+" second";
                }
                else if((a>1)&&(b>1)&&(c<2))
                {
                    s1=s1+a+" hours "+b+" minutes "+c+" second";
                }
                else if((a>1)&&(b<2)&&(c>1))
                {
                    s1=s1+a+" hours "+b+" minute"+c+" seconds";
                }
                else if((a<2)&&(b>1)&&(c>1))
                {
                    s1=s1+a+" hour, "+b+" minutes and "+c+" seconds";
                }
            }
        }
        
        
        
        System.out.println(s1);
    }
    
}
