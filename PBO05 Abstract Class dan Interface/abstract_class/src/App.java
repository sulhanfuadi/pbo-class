/* Nama File : App.java
    Deskripsi : Kelas utama untuk menjalankan program
    Pembuat   : Sulhan Fuadi (24060123130115)
    Tanggal   : 20 Maret 2025
*/

public class App {
    public static void main(String[] args) {
        // Konstanta untuk formatting output
        final String SEPARATOR = "=================================================";

        // Header Program
        System.out.println(SEPARATOR);
        System.out.println("            PROGRAM DEMONSTRASI ABSTRACT CLASS           ");
        System.out.println(SEPARATOR);

        // ==========================================
        // BAGIAN 1: Pembuatan Objek & Demonstrasi Abstract Class
        // ==========================================
        System.out.println("\n>> BAGIAN 1: PEMBUATAN OBJEK");
        System.out.println(SEPARATOR);

        // Kode berikut akan error saat dijalankan karena BangunDatar sekarang abstract
        // BangunDatar B1 = new BangunDatar(); // Error: Cannot instantiate the type
        // BangunDatar

        // Pembuatan objek dengan reference tipe BangunDatar
        BangunDatar P1 = new Persegi(10, "Biru", "Solid");
        BangunDatar L1 = new Lingkaran(7, "Hijau", "Dotted");

        // Pembuatan objek dengan reference tipe spesifik
        Persegi P2 = new Persegi(5, "Merah", "Dashed");
        Lingkaran L2 = new Lingkaran(14, "Kuning", "Double");

        // Informasi objek-objek
        System.out.println("\n1. Persegi dengan reference BangunDatar (P1):");
        P1.printInfo();
        System.out.println("Luas     : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());

        System.out.println("\n2. Persegi dengan reference Persegi (P2):");
        P2.printInfo();
        System.out.println("Luas     : " + P2.getLuas());
        System.out.println("Keliling : " + P2.getKeliling());
        System.out.println("Diagonal : " + P2.getDiagonal()); // Bisa akses method khusus Persegi

        System.out.println("\n3. Lingkaran dengan reference BangunDatar (L1):");
        L1.printInfo();
        System.out.println("Luas     : " + L1.getLuas());
        System.out.println("Keliling : " + L1.getKeliling());

        System.out.println("\n4. Lingkaran dengan reference Lingkaran (L2):");
        L2.printInfo();
        System.out.println("Luas     : " + L2.getLuas());
        System.out.println("Keliling : " + L2.getKeliling());

        // ==========================================
        // BAGIAN 2: Demonstrasi Method isEqualLuas dan isEqualKeliling
        // ==========================================
        System.out.println("\n>> BAGIAN 2: PERBANDINGAN LUAS DAN KELILING");
        System.out.println(SEPARATOR);

        // OBJEK UNTUK KASUS PERBANDINGAN YANG SAMA (TRUE)

        // 1. Membuat persegi dengan luas sama dengan L1
        double sisiP3 = Math.sqrt(Math.PI * 3.5 * 3.5); // L1 jari-jari = 3.5
        Persegi P3 = new Persegi(sisiP3, "Putih", "Solid");

        // 2. Membuat lingkaran dengan luas sama dengan P1 (luas = 100)
        double diameterL3 = 2 * Math.sqrt(100 / Math.PI); // P1 luas = 100
        Lingkaran L3 = new Lingkaran(diameterL3, "Abu-abu", "Dotted");

        // 3. Membuat persegi dengan keliling sama dengan L2 (keliling = 2πr = π×14)
        double sisiP4 = (Math.PI * 14) / 4; // Persegi keliling = 4×sisi
        Persegi P4 = new Persegi(sisiP4, "Coklat", "Dashed");

        // 4. Membuat lingkaran dengan keliling sama dengan P2 (keliling = 20)
        double diameterL4 = 20 / Math.PI; // Lingkaran keliling = π×diameter
        Lingkaran L4 = new Lingkaran(diameterL4, "Pink", "Double");

        // Menampilkan perbandingan luas
        System.out.println("\nPerbandingan Luas:");
        System.out.println("P1 = P2  : " + P1.isEqualLuas(P2)); // Seharusnya false
        System.out.println("P1 = L1  : " + P1.isEqualLuas(L1)); // Seharusnya false
        System.out.println("P3 ≈ L1  : " + P3.isEqualLuas(L1)); // Seharusnya mendekati true
        System.out.println("P1 ≈ L3  : " + P1.isEqualLuas(L3)); // Seharusnya mendekati true

        // Menampilkan perbandingan keliling
        System.out.println("\nPerbandingan Keliling:");
        System.out.println("P1 = P2  : " + P1.isEqualKeliling(P2)); // Seharusnya false
        System.out.println("P1 = L1  : " + P1.isEqualKeliling(L1)); // Seharusnya false
        System.out.println("P4 ≈ L2  : " + P4.isEqualKeliling(L2)); // Seharusnya mendekati true
        System.out.println("P2 ≈ L4  : " + P2.isEqualKeliling(L4)); // Seharusnya mendekati true

        // Menampilkan nilai luas dan keliling untuk verifikasi
        System.out.println("\n--- Verifikasi Nilai Luas dan Keliling ---");
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Luas L3: " + L3.getLuas());
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Luas P3: " + P3.getLuas());

        System.out.println("\nKeliling P2: " + P2.getKeliling());
        System.out.println("Keliling L4: " + L4.getKeliling());
        System.out.println("Keliling L2: " + L2.getKeliling());
        System.out.println("Keliling P4: " + P4.getKeliling());

        // ==========================================
        // BAGIAN 3: Demonstrasi Interface IResize
        // ==========================================
        System.out.println("\n>> BAGIAN 3: DEMONSTRASI INTERFACE IRESIZE");
        System.out.println(SEPARATOR);

        // Demonstrasi dengan objek Persegi
        System.out.println("\nDemonstrasi IResize dengan Persegi P2:");
        System.out.println("Sisi awal: " + P2.getSisi());
        System.out.println("Luas awal: " + P2.getLuas());

        P2.zoomIn(); // Membesar 10%
        System.out.println("\nSetelah zoomIn():");
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());

        P2.zoomOut(); // Mengecil 10%
        System.out.println("\nSetelah zoomOut():");
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());

        P2.zoom(200); // Membesar 2x lipat
        System.out.println("\nSetelah zoom(200):");
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());

        // Demonstrasi dengan objek Lingkaran
        System.out.println("\nDemonstrasi IResize dengan Lingkaran L2:");
        System.out.println("Jari-jari awal: " + L2.getJariJari());
        System.out.println("Luas awal: " + L2.getLuas());

        L2.zoomIn(); // Membesar 10%
        System.out.println("\nSetelah zoomIn():");
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());

        L2.zoomOut(); // Mengecil 10%
        System.out.println("\nSetelah zoomOut():");
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());

        L2.zoom(150); // Membesar 1.5x lipat
        System.out.println("\nSetelah zoom(150):");
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());

        // Demonstrasi menggunakan referensi tipe IResize
        System.out.println("\nDemonstrasi dengan Referensi IResize:");

        IResize resizableP = P2;
        IResize resizableL = L2;

        resizableP.zoom(50); // Mengecil menjadi 50%
        System.out.println("Setelah resizableP.zoom(50):");
        System.out.println("Sisi P2: " + P2.getSisi());

        resizableL.zoom(50); // Mengecil menjadi 50%
        System.out.println("Setelah resizableL.zoom(50):");
        System.out.println("Jari-jari L2: " + L2.getJariJari());

        // Footer
        System.out.println("\n" + SEPARATOR);
        System.out.println("                 PROGRAM SELESAI                     ");
        System.out.println(SEPARATOR);
    }
}
