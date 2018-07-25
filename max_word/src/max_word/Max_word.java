/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max_word;
/**
 *
 * @author SUBRAMANIYAN
 */
public class Max_word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c=abc("jhdsg jhsd hjgd jhD JHGD JHVD ab jashdkjahkajscajkscnajs  ");
        System.out.println(c);
        // TODO code application logic here
    }
    
    public static int abc(String s) {
        String max = null;
        int min=0;
        String[] a=s.split(" ");
        max=a[0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j].length()<a[i].length() && a[j].length()<max.length())
                {
                    max=a[j];
                    min=a[j].length();
                }
            }
        }
       return min; 
    }
}

