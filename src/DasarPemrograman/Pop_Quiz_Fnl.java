/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrograman;
/**
 * @author Tantowi
 */
import java.util.Scanner;

public class Pop_Quiz_Fnl {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char nilaiIndeks;
        double nilaiUTS, nilaiUAS, nilaiAkhir;
        
        System.out.println("Masukkan nilai UTS: ");
        nilaiUTS = Double.valueOf(scanner.nextLine());
        
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = Double.valueOf(scanner.nextLine());
        
        nilaiAkhir = (0.4 * nilaiUTS) + (0.6 * nilaiUAS);
        
        if (nilaiAkhir >= 80){
            nilaiIndeks = 'A';
        }
        else if (nilaiAkhir >= 70){
            nilaiIndeks = 'B';
        }
        else if (nilaiAkhir >= 50){
            nilaiIndeks = 'C';
        }
        else if (nilaiAkhir >= 30){
            nilaiIndeks = 'D';
        }
        else { //(nilaiAkhir<30)
            nilaiIndeks = 'E';
        }
    
        System.out.println("Nilai Akhir\t" + " " + nilaiAkhir);     
        System.out.println("Nilai Indeks\t" + " " + nilaiIndeks);
    }
}
