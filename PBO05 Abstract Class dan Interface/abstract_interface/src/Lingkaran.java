/* Nama File : Lingkaran.java
  Deskripsi : Berisi atribut dan method dalam class Lingkaran yang merupakan turunan dari BangunDatar
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Maret 2025
*/

public class Lingkaran extends BangunDatar implements IResize {
  private double jariJari;

  // Konstruktor tanpa parameter
  public Lingkaran() {
    // Lingkaran memiliki jumlah sisi tak hingga (atau bisa didefinisikan sebagai 1)
    setJmlSisi(0); // atau bisa menggunakan nilai khusus seperti 0 untuk menandakan bentuk
                   // lingkaran
  }

  // Konstruktor dengan parameter jariJari
  public Lingkaran(double jariJari) {
    setJmlSisi(0);
    this.jariJari = jariJari;
  }

  // Konstruktor dengan parameter
  public Lingkaran(double diameter, String warna, String border) {
    super(0, warna, border); // Memanggil konstruktor BangunDatar
    this.jariJari = diameter / 2;
  }

  // Getter dan Setter jariJari
  public double getJariJari() {
    return jariJari;
  }

  public void setJariJari(double jariJari) {
    this.jariJari = jariJari;
  }

  // Method untuk menghitung luas lingkaran
  public double getLuas() {
    return Math.PI * jariJari * jariJari;
  }

  // Method untuk menghitung keliling lingkaran
  public double getKeliling() {
    return 2 * Math.PI * jariJari;
  }

  // Override method printInfo() dari BangunDatar
  @Override
  public void printInfo() {
    // Memanggil printInfo() dari BangunDatar
    super.printInfo();

    // Tambahkan informasi jari-jari, luas, dan keliling
    System.out.println("Jari-jari   : " + jariJari);
    System.out.println("Luas        : " + getLuas());
    System.out.println("Keliling    : " + getKeliling());
  }

  // Implementasi method dari interface IResize
  @Override
  public void zoomIn() {
    // Memperbesar ukuran lingkaran sebesar 10%
    this.jariJari = this.jariJari * 1.1;
  }

  @Override
  public void zoomOut() {
    // Memperkecil ukuran lingkaran sebesar 10%
    this.jariJari = this.jariJari * 0.9;
  }

  @Override
  public void zoom(double percent) {
    // Mengubah ukuran lingkaran sesuai persentase yang diberikan
    // percent = 100 berarti tidak berubah, 200 berarti 2x lipat, 50 berarti 1/2
    // kali
    this.jariJari = this.jariJari * (percent / 100);
  }
}
