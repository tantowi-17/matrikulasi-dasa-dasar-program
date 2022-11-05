public class BukuPbo {

    private String judul, desc; // 2. Ini variable instance
    private String penerbit = "Universitas Handayani Makassar"; // 2. Ini variabel class
    public static int harga;


    public static void main(String[] args) {

        //Pemanggilan object ObjectClassPbo
        BukuPbo resi = new BukuPbo("Analisis Pemrograman Berorietasi Object", "Ini buku Pbo", 150000); // 1. Ini adalah object
        resi.cetakBuku();
        BukuPbo.sayaMahasiswa myAnimal = new BukuPbo.sayaMahasiswa();
        BukuPbo.sayaMahasiswa myCat = new BukuPbo.Cat();
        BukuPbo.sayaMahasiswa myDog = new BukuPbo.Dog();

        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Output -> Overloading");
        System.out.println("--------------------------------------");
        viewData(harga);

        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Output -> Inheritance dan polimorphism");
        System.out.println("--------------------------------------");
        myAnimal.namaSaya();
        myCat.namaSaya();
        myDog.namaSaya();
    }

    public void cetakBuku () {
        System.out.println("Nama : Elsa");
        System.out.println("NPM  : 2021230008");
        System.out.println("======================================");
        System.out.println("Judul buku      : " + judul);
        System.out.println("desc            : " + desc);
        System.out.println("Perbit          : " + penerbit);
        System.out.println("__________________________________");
        System.out.println("Harga           : " + harga);
    }

    public BukuPbo(String jBuku, String bDesc, int hHarga) {
        judul = jBuku;
        desc = bDesc;
        harga = hHarga;

    }

    private static void viewData(int a){
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
