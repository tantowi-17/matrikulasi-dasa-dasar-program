/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;

public class Array_Multidimensional_2 {
    
    public static void main(String[] args) {
        int[][] duaD = {{10,20,30},{40,50,60}};
               
        for(int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(duaD[i][j]);
                if (j < 2) System.out.print(" ");                
            }
            System.out.println();    
        }
    }
}
