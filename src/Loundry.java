public class Loundry {

    private String namaLoundry;
    private String type = "Strika";
    private static int harga;


    public static void main(String[] args) {
        Loundry loundry = new Loundry("Astri", 25000);
        loundry.printLoundry();

        pesanan myAnimal = new pesanan();
        pesanan myCat = new Inheritance();
        pesanan myDog = new Data();

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
        myAnimal.order();
        myCat.order();
        myDog.order();

    }

    private static void viewData(int a){
        System.out.println("Nilai Angka : " + a);
    }

    /**
     * Inheritance dan polimorphism
     */
    static class Inheritance extends pesanan {
        public void order() {
            System.out.println("Nama depan: Astriana");
        }
    }

    static class Data extends pesanan {
        public void order() {
            System.out.println("Nama belakang: Sari");
        }
    }

    static class pesanan {
        public void order() {
            System.out.println("Saya order");
        }
    }

    public void printLoundry () {
        System.out.println("Nama      : " + namaLoundry);
        System.out.println("NPM       : 2021230005");
        System.out.println("Type      : " + type);
        System.out.println("__________________________________");
        System.out.println("Harga     : " + harga);
    }

    public Loundry(String nLoundry, int hHarga) {
        namaLoundry = nLoundry;
        harga = hHarga;
    }
}
