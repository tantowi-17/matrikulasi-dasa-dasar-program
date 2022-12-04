package Semester2;

public class Algoritma67 {
    public static void main(String[] args) {
        algoritma6(200);
    }

    public static void algoritma6(int n) {
        int c[] = {20, 10, 5, 1};

        for(int i = 1; i < c.length; i++) {
            int d = 0;

            while(n > 0) {
                d = d + 1;
                n = n - c[i];
                System.out.print(n+"\t");
            }
        }
    }

    static void algoritma7() {

    }
}
