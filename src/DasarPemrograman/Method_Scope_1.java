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
public class Method_Scope_1 {
     public static void main(String[] args) {
 
        // Code here cannot use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
  }
}
