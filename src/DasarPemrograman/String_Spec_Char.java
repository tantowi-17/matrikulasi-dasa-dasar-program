/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

public class String_Spec_Char {
 
    public static void main(String[] args) 
    {
     
    //The sequence \"  inserts a double quote in a string:
    String txt = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txt);
    
    //The sequence \'  inserts a single quote in a string:
    String txt1 = "It\'s alright.";
    System.out.println(txt1);
    
    //The sequence \\  inserts a single backslash in a string:
    String txt2 = "Hel\\lo World!";
    System.out.println(txt2);
    
    //New Line
    String txt3 = "Hello\nWorld!";
    System.out.println(txt3);
    
    //Carriage Return
    String txt4 = "Hello\rWorld!";
    System.out.println(txt4);
    
    //Tab
    String txt5 = "Hello\tWorld!";
    System.out.println(txt5);
    
    //Backspace
    String txt6 = "Hel\blo World!";
    System.out.println(txt6);
    
    }
}
