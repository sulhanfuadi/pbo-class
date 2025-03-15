/* Nama File : Persegi.java
  Deskripsi : Berisi atribut dan method dalam class Persegi yang merupakan turunan dari BangunDatar
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 13 Maret 2025
*/

public class Persegi extends BangunDatar {
  private double sisi;

  // Konstruktor tanpa parameter
  public Persegi() {
    // Karena persegi memiliki 4 sisi, kita set nilai jmlSisi di sini
    setJmlSisi(4);
  }

  // Konstruktor dengan parameter penerapan super()
  // public Persegi(double sisi, String warna, String border) {
  // super(4, warna, border); // Memanggil konstruktor BangunDatar, jmlSisi = 4
  // // mengguanakn super() untuk memanggil konstruktor superclass

  // // Set nilai sisi khusus untuk Persegi
  // this.sisi = sisi;
  // }

  public Persegi(double sisi, String warna, String border) {
    this.jmlSisi = 4;
    this.warna = warna;
    this.border = border;
    this.sisi = sisi;

    /*
     * Karena atribut jmlSisi, warna, dan border adalah protected di kelas
     * BangunDatar,
     * kita bisa mengaksesnya langsung dari kelas turunan Persegi.
     * 
     * Hal ini dikarenakan atribut protected dapat diakses oleh kelas turunan
     * dan kelas dalam package yang sama.
     * 
     * Jika atribut tersebut adalah private, kita harus menggunakan setter/getter
     * yang disediakan oleh kelas induk untuk mengaksesnya.
     */
  }

  // Getter dan Setter sisi
  public double getSisi() {
    return sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }

  // Method untuk menghitung luas
  public double getLuas() {
    return sisi * sisi;
  }

  // Method untuk menghitung keliling
  public double getKeliling() {
    return 4 * sisi;
  }

  // Method untuk menghitung diagonal
  public double getDiagonal() {
    return Math.sqrt(2) * sisi;
  }

  // Override method printInfo() dari BangunDatar
  // Override digunakan untuk mengganti implementasi method dari superclass
  @Override
  public void printInfo() {
    // Memanggil printInfo() dari BangunDatar untuk menampilkan
    // jmlSisi, warna, dan border
    super.printInfo();

    // Tambahkan informasi sisi, luas, dan keliling
    System.out.println("Sisi        : " + sisi);
    System.out.println("Luas        : " + getLuas());
    System.out.println("Keliling    : " + getKeliling());
  }

  public static void printCounterBangunDatar() {
    System.out.println("Ini dari kelas Persegi");
    // Tidak bisa mengakses counterBangunDatar secara langsung karena bersifat
    // private di BangunDatar

    /*
     * 
     * Konsep ini menunjukkan bahwa static method terikat pada kelas, bukan pada
     * objek.
     * Ketika kita mendefinisikan static method dengan nama yang sama di kelas anak,
     * Java tidak menganggapnya sebagai overriding melainkan sebagai method hiding.
     * Saat menggunakan referensi tipe BangunDatar, meskipun objeknya adalah
     * Persegi,
     * method static yang dipanggil tetap method milik BangunDatar.
     * Ini berbeda dengan instance method dimana tipe objek sebenarnya yang
     * menentukan
     * method mana yang akan dieksekusi (polymorphism).
     */
  }

}

/*
 * Pertanyaan:
 * Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan
 * seperti berikut?
 * public Persegi(double sisi, String warna, String border){
 * this.jmlSisi = 4;
 * this.warna = warna;
 * this.border = border;
 * this.sisi = sisi;
 * }
 * Mengapa?
 * 
 * Jawaban:
 * Tidak, konstruktor berparameter tersebut tidak dapat direalisasikan karena:
 * 
 * 1. Atribut jmlSisi, warna, dan border merupakan atribut private di kelas
 * induk (BangunDatar), sehingga tidak dapat diakses langsung dengan
 * this.atribut dari kelas turunan. Atribut private hanya bisa diakses melalui
 * setter/getter yang disediakan oleh kelas induk.
 * 
 * 2. Setiap konstruktor kelas turunan harus memanggil konstruktor kelas induk,
 * baik secara implisit atau eksplisit dengan super(). Konstruktor yang
 * diusulkan tidak memiliki pemanggilan super() secara eksplisit.
 * 
 * 3. Meskipun Java akan secara otomatis menambahkan super() di awal konstruktor
 * jika tidak ditulis secara eksplisit, ini tidak menyelesaikan masalah
 * akses langsung ke atribut private milik kelas induk.
 * 
 * Implementasi yang benar seperti yang sudah ada di kode, yaitu:
 * - Memanggil super() untuk inisialisasi kelas induk
 * - Menggunakan setter methods (setJmlSisi, setWarna, setBorder) untuk
 * mengakses atribut private BangunDatar
 * - Menggunakan this.sisi untuk atribut lokal karena sisi memang milik kelas
 * Persegi
 */
