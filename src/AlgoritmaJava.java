public class AlgoritmaJava {

    /**
     * Finding the Maximum Element in a Finite Sequence.
     * @param nim the nim [2021230008]
     * @return
     */
    static void findMaxElement(int[] nim) {
        int nimMhs = nim.length;
        if (nimMhs > 0) {
            for (int i = 0; i < nimMhs; i++) {
                if (i < 5) {
                    System.out.println("Result :" +i);
                }
            }
        }
    }

    /**
     * The Linear Search Algorithm.
     * @param nim the nim [2021230008]
     * @return
     */
    static void lineaSeearch(int[] nim) {
        int nimMhs = nim.length;
        int b = 5;
        int q = 0;
        if (nimMhs > 0) {
            while (q <= nimMhs) {
                if (b > q) {
                    System.out.println("Result :" + q + 1);
                } else {
                    System.out.println("Result : Not Found");
                }
                q++;
                break;
            }
        }
    }

    /**
     * Binary Search Algorithm
     * @param nim the nim [2021230008]
     * @return
     */
    static void binarySearchAlgorithm(int[] nim) {
        int nimMhs = nim.length;
        int[] nilai = {90, 87,78,90,89};
        int result = 0;
        int i = 0;
        if (nimMhs > 0) {
            while (true) {
                int m =(nimMhs + nilai.length) / 2;
                int x = 10;
                if (x < nilai[4]) {
                    System.out.println("Result :" + m + 1);
                } else {
                    System.out.println("Result :" + result);
                }
                break;
            }
        }
    }

    /**
     * The Bubble Sort.
     * @param nim the nim [2021230008]
     * @return
     */
    static void bubbleSort(int[] nim) {
        int[] arr = {20,21,23,0,0,0,8};
        int n = arr.length;
        if (nim.length > 0) {
            for (int i = 0; i < n - 1; i++)
                for (int g = 0; g < n - i - 1; g++)
                    if (arr[g] > arr[g + 1]) {
                        int temp = arr[g];
                        arr[g] = arr[g + 1];
                        arr[g + 1] = temp;
                    }
            for (int i = 0; i < n; ++i) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }

        System.out.println("-----------Algoritma 5-------------");
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] nim = {20, 21, 23, 0, 0, 0, 8};
        System.out.println("----------Tanto Wibowo-------------");
        System.out.println("------------2021230008-------------");
        findMaxElement(nim);
        System.out.println("-----------Algoritma 2-------------");
        lineaSeearch(nim);
        System.out.println("-----------Algoritma 3-------------");
        binarySearchAlgorithm(nim);
        System.out.println("-----------Algoritma 4-------------");
        bubbleSort(nim);
        System.out.println();
        insertionSort(nim);
    }
}