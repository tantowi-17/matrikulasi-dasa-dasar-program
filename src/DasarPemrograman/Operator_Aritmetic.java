/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

public class Operator_Aritmetic {
    
    public static void main(String[] args){
       
        System.out.println("---Operasi aritmetika pada tipe integer---");
        
        //Deklarasi dan Proses
        int a = 2 + 1;
        int b = a - 1;
        int c = a * b;
        int d = c / 3;
        int e = -a;
        
        //Output
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);
        System.out.println("Nilai d: " + d);
        System.out.println("Nilai e: " + e);
        
        System.out.println("---Operasi aritmetika pada tipe floating-point---");
        
        //Deklarasi dan Proses
        double f = 2 + 1;
        double g = f - 1;
        double h = f * g;
        double i = h / 3;
        double j = -f;
        
        //Output
        System.out.println("Nilai f: " + f);
        System.out.println("Nilai g: " + g);
        System.out.println("Nilai h: " + h);
        System.out.println("Nilai i: " + i);
        System.out.println("Nilai j: " + j);
     
        System.out.println("---Operasi modulus (Sisa Bagi)---");
        
        //Deklarasi 
        int k = 11, l = 4, m;
        
        //Proses
        m = k % l;
        
        //Output
        System.out.println("Sisa Bagi " + k + "/" + l + " adalah " + m);
        
        System.out.println("---Operasi Increment dan Decrement---");
        
        int n = 5;
        int o = 5;
        
        System.out.println("Pre-increment");
        System.out.println("n = " + n);
        System.out.println("o = " + o);
       
        n++; //sama saja n = n + 1
        o--; //sama saja o = o - 1
        
        System.out.println("Post-increment");
        System.out.println("n = " + n);
        System.out.println("o = " + o);
                
    }
}
