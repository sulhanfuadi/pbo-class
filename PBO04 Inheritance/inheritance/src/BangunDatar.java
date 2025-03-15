/* Nama File : BangunDatar.java
  Deskripsi : Berisi atribut dan method dalam class BangunDatar
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 13 Maret 2025
*/

// public final class BangunDatar {
public class BangunDatar {
  // private int jmlSisi;
  // private String warna;
  // private String border;
  // private static int counterBangunDatar = 0;

  protected int jmlSisi; // Diubah dari private menjadi protected
  protected String warna; // Diubah dari private menjadi protected
  protected String border; // Diubah dari private menjadi protected
  private static int counterBangunDatar = 0; // Atribut statik untuk menghitung jumlah objek BangunDatar

  // Konstruktor tanpa parameter
  public BangunDatar() {
    counterBangunDatar++; // Menambahkan nilai counter setiap kali objek dibuat
  }

  // Konstruktor dengan parameter
  public BangunDatar(int jmlSisi, String warna, String border) {
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
    counterBangunDatar++; // Menambahkan nilai counter setiap kali objek dibuat
  }

  // Metode statik untuk menampilkan jumlah objek BangunDatar yang telah dibuat
  public static void printCounterBangunDatar() {
    System.out.println("Jumlah objek BangunDatar yang telah dibuat: " + counterBangunDatar);
  }
  /*
   * . Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana
   * hasilnya?. Coba lakukan overriding pada method printCounterBangunDatar().
   * Bagaimana hasilnya?
   * 
   * Jawab: Kita tidak bisa melakukan overriding pada method statik.
   * Method statik adalah method yang terkait dengan kelas itu sendiri
   * bukan dengan objek. Method statik tidak bisa diwariskan ke subclass, sehingga
   * tidak bisa di-override. Jika kita mencoba melakukan overriding pada method
   * statik, maka akan terjadi error pada saat kompilasi.
   */

  // Getter dan Setter untuk jmlSisi
  public int getJmlSisi() {
    return jmlSisi;
  }

  public void setJmlSisi(int jmlSisi) {
    this.jmlSisi = jmlSisi;
  }

  // Getter dan Setter untuk warna
  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  // Getter dan Setter untuk border
  public String getBorder() {
    return border;
  }

  public void setBorder(String border) {
    this.border = border;
  }

  // Metode untuk menampilkan informasi
  // public final void printInfo() {
  public void printInfo() {
    System.out.println("Jumlah sisi: " + jmlSisi);
    System.out.println("Warna: " + warna);
    System.out.println("Border: " + border);
  }
  /*
   * 
   * Pengaruh penambahan keyword final pada method printInfo():
   * 1. Kompilasi akan gagal untuk class Persegi dan Lingkaran dengan error:
   * "Cannot override the final method from BangunDatar"
   * 2. Method yang ditandai final tidak dapat di-override oleh class turunannya.
   * 3. Dalam kasus ini, kedua class turunan (Persegi dan Lingkaran) memiliki
   * implementasi @Override untuk method printInfo(), sehingga terjadi error.
   * 4. Final method biasanya digunakan ketika perilaku method tersebut harus
   * konsisten di semua subclass dan tidak boleh dimodifikasi, misalnya untuk
   * alasan keamanan atau untuk menjaga integritas perilaku tertentu dalam sistem.
   * 5. Jika method printInfo() di BangunDatar final, maka class turunan hanya
   * bisa menggunakan implementasi yang ada di parent class, tidak bisa
   * menyesuaikan output sesuai kebutuhan class turunannya.
   */
}

/*
 * 
 * Pengaruh penambahan keyword final pada class BangunDatar:
 * 1. Kompilasi akan gagal untuk class Persegi dan Lingkaran dengan error:
 * "The type Persegi cannot subclass the final class BangunDatar" atau
 * "The type Lingkaran cannot subclass the final class BangunDatar"
 * 2. Keyword final pada class menandakan bahwa class tersebut tidak dapat
 * diwariskan
 * (menjadi parent class) ke class lain.
 * 3. Hal ini menyebabkan konsep inheritance yang diterapkan pada project ini
 * tidak
 * dapat berfungsi, karena Persegi dan Lingkaran tidak lagi bisa menjadi turunan
 * dari BangunDatar.
 * 4. Final class biasanya digunakan untuk class yang ingin dijaga agar
 * perilakunya
 * tetap konsisten dan tidak bisa diubah melalui inheritance, seperti class
 * String
 * dan Math pada Java standard library.
 */
