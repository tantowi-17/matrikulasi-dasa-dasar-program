/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

import java.util.Scanner;

public class Reading_Input_1 {
    
    public static void main(String[] args){
        //Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);
        
        //Print "Write a message: "
        System.out.println("Write a message: ");
        
        //Read the string written by the user, and assign it
        //To program memory "String message = (string that was given as input)"
        String message = scanner.nextLine();
        
        //Print the message written by the user
        System.out.println(message);
    }
}
