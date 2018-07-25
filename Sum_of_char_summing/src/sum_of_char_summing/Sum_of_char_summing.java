/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum_of_char_summing;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUBRAMANIYAN
 */
public class Sum_of_char_summing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1="AD";
        String s2="BC";
        s1=s1.toUpperCase();
        char[] k=s1.toCharArray();
        byte[] bytes = null;
        byte a1 = 0,a2=0;
        try {
            bytes = s1.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Sum_of_char_summing.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] bytes1 = null;
        try {
            bytes1 = s2.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Sum_of_char_summing.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(byte i:bytes)
        {
            a1 = (byte) (a1+i);
        }
        for(byte i:bytes1)
        {
            a2=(byte) (a2+i);
        }
        if(a1==a2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        // TODO code application logic here
    }
    
}
