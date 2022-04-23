/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

import java.util.Scanner;

public class Reading_Integer_2 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write a value: ");
        
        int value = Integer.valueOf(scanner.nextLine());
        
        System.out.println("You wrote" + " " + value);
    }
}
