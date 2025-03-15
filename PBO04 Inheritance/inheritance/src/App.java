/* Nama File : App.java
    Deskripsi : Program utama demonstrasi konsep inheritance
    Pembuat   : Sulhan Fuadi (24060123130115)
    Tanggal   : 13 Maret 2025
*/

public class App {
    public static void main(String[] args) {
        // Konstanta untuk formatting output
        final String SEPARATOR = "=================================================";

        // Header Program
        System.out.println(SEPARATOR);
        System.out.println("            PROGRAM DEMONSTRASI INHERITANCE            ");
        System.out.println(SEPARATOR);

        // ==========================================
        // BAGIAN 1: Demonstrasi Konstruktor & Method
        // ==========================================
        System.out.println("\n>> BAGIAN 1: PEMBUATAN OBJEK");
        System.out.println(SEPARATOR);

        // 1.1 Objek Persegi dengan konstruktor tanpa parameter
        System.out.println("\n1. Membuat Persegi tanpa parameter:");
        Persegi persegi1 = new Persegi();
        persegi1.setWarna("Merah");
        persegi1.setBorder("Solid");
        persegi1.setSisi(5.0);
        persegi1.printInfo();

        // 1.2 Objek Persegi dengan konstruktor berparameter
        System.out.println("\n2. Membuat Persegi dengan parameter:");
        Persegi persegi2 = new Persegi(7.5, "Biru", "Dashed");
        persegi2.printInfo();

        // 1.3 Objek Lingkaran dengan konstruktor tanpa parameter
        System.out.println("\n3. Membuat Lingkaran tanpa parameter:");
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setWarna("Kuning");
        lingkaran1.setBorder("Dotted");
        lingkaran1.setJariJari(10.0);
        lingkaran1.printInfo();

        // 1.4 Objek Lingkaran dengan konstruktor berparameter
        System.out.println("\n4. Membuat Lingkaran dengan parameter:");
        Lingkaran lingkaran2 = new Lingkaran(3.5, "Hijau", "Double");
        lingkaran2.printInfo();

        // ==========================================
        // BAGIAN 2: Demonstrasi Polymorphism
        // ==========================================
        System.out.println("\n>> BAGIAN 2: POLYMORPHISM");
        System.out.println(SEPARATOR);

        BangunDatar[] arrBangun = new BangunDatar[4];
        arrBangun[0] = persegi1; // Upcast dari Persegi ke BangunDatar
        arrBangun[1] = persegi2; // Upcast dari Persegi ke BangunDatar
        arrBangun[2] = lingkaran1; // Upcast dari Lingkaran ke BangunDatar
        arrBangun[3] = lingkaran2; // Upcast dari Lingkaran ke BangunDatar

        for (int i = 0; i < arrBangun.length; i++) {
            System.out.println("\nInfo Bangun Datar ke-" + (i + 1) + ":");
            arrBangun[i].printInfo(); // Method dipanggil sesuai dengan tipe objek sebenarnya
            System.out.println(""); // Tambah baris kosong untuk pemisah
        }

        // ==========================================
        // BAGIAN 3: Demonstrasi Method Static & Method Hiding
        // ==========================================
        System.out.println("\n>> BAGIAN 3: STATIC METHOD DAN METHOD HIDING");
        System.out.println(SEPARATOR);

        System.out.println("\nPanggil dari class BangunDatar:");
        BangunDatar.printCounterBangunDatar();

        System.out.println("\nPanggil dari class Persegi:");
        Persegi.printCounterBangunDatar();

        // ==========================================
        // BAGIAN 4: Perhitungan Luas dan Keliling
        // ==========================================
        System.out.println("\n>> BAGIAN 4: PERHITUNGAN LUAS DAN KELILING");
        System.out.println(SEPARATOR);

        System.out.println("\nPersegi (sisi = " + persegi1.getSisi() + "):");
        System.out.println("- Luas     : " + persegi1.getLuas());
        System.out.println("- Keliling : " + persegi1.getKeliling());
        System.out.println("- Diagonal : " + persegi1.getDiagonal());

        System.out.println("\nLingkaran (jari-jari = " + lingkaran1.getJariJari() + "):");
        System.out.println("- Luas     : " + lingkaran1.getLuas());
        System.out.println("- Keliling : " + lingkaran1.getKeliling());

        // Footer
        System.out.println("\n" + SEPARATOR);
        System.out.println("                 PROGRAM SELESAI                     ");
        System.out.println(SEPARATOR);
    }
}
