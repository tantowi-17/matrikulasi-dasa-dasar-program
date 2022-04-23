/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

import java.util.Scanner;

public class Reading_Doubles_2 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write a value: ");
        
        double value = Double.valueOf(scanner.nextLine());
        
        System.out.println("You wrote" + " " + value);
    }
}
