/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

/**
 *
 * @author Tantowi
 */
public class Statement_Switch_3 {
    
   public static void main(String[] args) {
    int day = 4;
    switch (day) {
      case 6 -> System.out.println("Today is Saturday");
      case 7 -> System.out.println("Today is Sunday");
      default -> System.out.println("Looking forward to the Weekend");
    }    
  }
   
}
