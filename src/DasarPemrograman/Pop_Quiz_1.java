/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

import java.util.Scanner;

public class Pop_Quiz_1 {
    
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        
        System.out.println("Masukkan nilai a: ");
        a = Double.valueOf(scanner.nextLine());
        
        System.out.println("Masukkan nilai b: ");
        b = Double.valueOf(scanner.nextLine());
        
        c = a * b;
                    
        System.out.println("Nilai Akhir\t" + " " + c); 
    }
}
