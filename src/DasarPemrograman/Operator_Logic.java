/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

public class Operator_Logic {
    
    public static void main(String[] args){
       
        System.out.println("---Operasi AND---");
        System.out.println("True && True = " + (true && true));
        System.out.println("True && False = " + (true && false));
        System.out.println("False && True = " + (false && true));
        System.out.println("False && False = " + (false && false));        
        
        System.out.println("\n---Operasi OR---");
        System.out.println("True || True = " + (true || true));
        System.out.println("True || False = " + (true || false));
        System.out.println("False || True = " + (false || true));
        System.out.println("False || False = " + (false || false));   
        
        System.out.println("\n---Operasi XOR---");
        System.out.println("True ^ True = " + (true ^ true));
        System.out.println("True ^ False = " + (true ^ false));
        System.out.println("False ^ True = " + (false ^ true));
        System.out.println("False ^ False = " + (false ^ false));
        
        System.out.println("\n---Operasi NOT---");
        System.out.println("!True  = " + (!true));
        System.out.println("!False = " + (!false));
        
    }
}
