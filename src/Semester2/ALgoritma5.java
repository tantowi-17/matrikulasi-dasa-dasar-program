package Semester2;

public class ALgoritma5 {

    public static void main(String[] args) {
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
