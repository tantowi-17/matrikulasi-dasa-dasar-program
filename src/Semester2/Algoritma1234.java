package Semester2;

import java.util.Arrays;

public class Algoritma1234 {

    public static void main(String[] args) {
        int nilaiMax = cariNilaiMax();
        int linear = linear();
        int binary = binary();
        bubbleSort();
//        System.out.println("nilai max  : " + nilaiMax);
//        System.out.println("nilai linear  : " + linear);
//        System.out.println("nilai binary  : " + binary);

        System.out.println("");
        int[] nim = {2,0,2,1,2,3,0,0,0,8};
        System.out.println("Sebelum Insertion Sort");
        for(int i:nim) {
            System.out.print(i+" ");
        }

        System.out.println();
        insertionSort(nim);
        System.out.println("Sesudah Insertion Sort");
        for(int i:nim){
            System.out.print(i+" ");
        }
    }

    static int cariNilaiMax() {
        int[] list = {0, 4, 30, 12};
        int n = list.length;
        int max = 4;

        for (int i = 2; i < n; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }

    static int linear() {
        int[] list = {0, 4, 30, 12};
        int n = list.length;
        int x = 30;
        int i = 1;
        int location = 0;

        while (i <= n && x != list[i]) {
            if (list[i] < x) {
                location = i;
            } else {
                location = 0;
            }
            i++;
        }
        return location;
    }

    static int binary() {
        int[] list = {0, 4, 30, 12};
        int n = list.length;
        int i = 1;
        int j = n;
        int x = 30;
        int location = 0;

        while (i < j) {
            int m = (i + j)/2;
            if (x > list[m]) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        if (x == list[i]) {
            location = i;
        } else {
            location = 0;
        }
        return location;
    }

    static void bubbleSort() {
        int[] list = {0, 4, 30, 12};
        int n = list.length;
        for (int i = 0; i < n - 1; i++)
            for (int g = 0; g < n - i - 1; g++)
                if (list[g] > list[g + 1]) {
                    int temp = list[g];
                    list[g] = list[g + 1];
                    list[g + 1] = temp;
                }
        for (int i = 0; i < n; ++i) {
            System.out.print(list[i] + " ");
        }
    }

    static void insertionSort(int[] nim) {
        int n = nim.length;
        for (int j = 1; j < n; j++) {
            int key = nim[j];
            int i = j-1;
            while ( (i > -1) && ( nim [i] > key ) ) {
                nim [i+1] = nim [i];
                i--;
            }
            nim[i+1] = key;
        }
    }
}
