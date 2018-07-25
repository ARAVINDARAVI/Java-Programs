/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unbalanced_parenthesis;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author SUBRAMANIYAN
 */
class A
{
    Stack s=new Stack();
    Stack s2=new Stack();
    void check(String a)
    {
        char[] c=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            if(c[i]=='(')
            {
                s.push(i);
            }
            else if(c[i]==')')
            {
                if(!s.empty())
                {
                    s.pop();
                }
                else
                {
                    s2.push(i);
                }
            }
        }
        //for(int i=0;i<a.length();i++)
        //{
            if(!s.empty())
            {
                for(int j=0;j<a.length();j++)
                {
                   if(!s.contains(j))
                   {
                       System.out.print(c[j]);
                   }
                }
            }
            if(!s2.empty())
            {
                for(int j=0;j<a.length();j++)
                {
                   if(!s2.contains(j))
                   {
                       System.out.print(c[j]);
                   }
                }
            }
        //}
    }
}
public class Unbalanced_parenthesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        A b=new A();
        String a=s1.nextLine();
        b.check(a);
        // TODO code application logic here
    }
    
}
