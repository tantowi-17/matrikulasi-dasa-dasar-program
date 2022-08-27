/**
 * ObjectClassPbo Class
 */
public class ObjectClassPbo { // 1. Ini adalah class
    /**
     * Deklarasi variable
     */
    private String mataKuliah, tugas; // 2. Ini variable instance
    private String kelas = "A"; // 2. Ini variabel class
    private String kampus = "Universitas Handayani Makassar"; // 2. Ini variabel class
    public static double n_akhir;

    public static void main(String[] args) {

        //Pemanggilan object ObjectClassPbo
        ObjectClassPbo resi = new ObjectClassPbo("Analisis Pemrograman Berorietasi Object", "PBO", 90, 78); // 1. Ini adalah object
        resi.tampil();
        sayaMahasiswa myAnimal = new sayaMahasiswa();
        sayaMahasiswa myCat = new Cat();
        sayaMahasiswa myDog = new Dog();

        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Output -> Overloading");
        System.out.println("--------------------------------------");
        display((int) n_akhir);

        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Output -> Inheritance dan polimorphism");
        System.out.println("--------------------------------------");
        myAnimal.namaSaya();
        myCat.namaSaya();
        myDog.namaSaya();
    }

    /**
     * Print out
     */
    public void tampil () {
        System.out.println("--------------------------------------");
        System.out.println("============Tugas Final PBO===========");
        System.out.println("--------------------------------------");

        System.out.println("Nama : Tanto Wibowo");
        System.out.println("NPM  : 2021230008");
        System.out.println("======================================");
        System.out.println("Mata kuliah      : " + mataKuliah);
        System.out.println("Tugas            : " + tugas);
        System.out.println("Kelas            : " + kelas);
        System.out.println("Kampus           : " + kampus);
        System.out.println("Nilai Akhir      : " + n_akhir);
        System.out.println("__________________________________");
        System.out.println("Total Nilai : " + n_akhir + " Nilai Huruf : " + total());
    }


    /**
     * Konstruktor Dengan Parameter
     * @param mKuliah
     * @param tKuliah
     * @param nFinal
     * @param nTugas
     */
    public ObjectClassPbo(String mKuliah, String tKuliah, int nFinal, int nTugas) {
        mataKuliah = mKuliah;
        tugas = tKuliah;
        n_akhir = (0.50 * nFinal + 0.50 * nTugas);

    }

    /**
     * Create method
     * @return
     */
    public char total () {
        char grade;
        if (n_akhir >= 85 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 75 && n_akhir < 85){
            grade = 'B';
        }
        else if (n_akhir > 65 && n_akhir < 75){
            grade = 'C';
        }
        else if (n_akhir > 50 && n_akhir < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        return grade;
    }

    /**
     * Overloading
     * @param a
     */
    private static void display(int a){
        System.out.println("Nilai Angka : " + a);
    }


    /**
     * Inheritance dan polimorphism
     */
    static class Cat extends sayaMahasiswa {
        public void namaSaya() {
            System.out.println("Nama depan: Tanto");
        }
    }

    static class Dog extends sayaMahasiswa {
        public void namaSaya() {
            System.out.println("Nama belakang: wibowo");
        }
    }

    static class sayaMahasiswa {
        public void namaSaya() {
            System.out.println("Saya mahasiswa");
        }
    }
}
