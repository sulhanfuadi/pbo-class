/* Nama File : Garis.java
  Deskripsi : Berisi atribut dan method dalam class Garis
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Februari 2025
*/

public class Garis {
  /************** ATRIBUT **************/
  Titik titikAwal;
  Titik titikAkhir;
  static int counterGaris = 0;

  /************** METHOD **************/
  // a. Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0)
  // dan
  // titik akhir
  // dengan (1,1)
  Garis() {
    titikAwal = new Titik();
    titikAkhir = new Titik(1, 1);
    counterGaris++;
  }

  // b. Konstruktor dengan parameter masukan titik awal dan titik akhir
  Garis(Titik titikAwal, Titik titikAkhir) {
    this.titikAwal = titikAwal;
    this.titikAkhir = titikAkhir;
    counterGaris++;
  }

  // c. Selektor (getter) untuk setiap atribut beserta mutatornya (setter).
  // Tambahkan
  // pula selektor
  // untuk mendapatkan
  // atribut static counterGaris
  Titik getTitikAwal() { // Selektor untuk mendapatkan titik awal
    return titikAwal;
  }

  Titik getTitikAkhir() { // Selektor untuk mendapatkan titik akhir
    return titikAkhir;
  }

  void setTitikAwal(Titik titikAwal) { // Mutator untuk mengeset titik awal
    this.titikAwal = titikAwal;
  }

  void setTitikAkhir(Titik titikAkhir) { // Mutator untuk mengeset titik akhir
    this.titikAkhir = titikAkhir;
  }

  static int getCounterGaris() { // Selektor untuk mendapatkan counterGaris
    return counterGaris;
  }

  // d. Method untuk mendapatkan panjang sebuah garis
  double getPanjang() {
    return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2)
        + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
  }

  // e. Method untuk mendapatkan gradien dari sebuah garis
  double getGradien() {
    return (titikAkhir.getOrdinat() - titikAwal.getOrdinat())
        / (titikAkhir.getAbsis() - titikAwal.getAbsis());
  }

  // f. Method untuk mendapatkan titik tengah dari sebuah garis
  Titik getTitikTengah() {
    double absisTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
    double ordinatTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
    return new Titik(absisTengah, ordinatTengah);
  }

  // g. Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis
  // lainnya,
  // mengembalikan true jika sejajar dan false jika sebaliknya.
  boolean isSejajar(Garis garis) {
    return this.getGradien() == garis.getGradien();
  }

  // h. Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah
  // garis lainnya,
  // mengembalikan true jika sejajar dan false jika sebaliknya.
  boolean isTegakLurus(Garis garis) {
    return this.getGradien() * garis.getGradien() == -1;
  }

  // i. Method untuk menampilkan ke layar titik awal dan titik akhir garis.
  void printGaris() {
    System.out.println("Titik awal: ");
    titikAwal.printTitik();
    System.out.println("Titik akhir: ");
    titikAkhir.printTitik();
  }

  // j. Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c.
  // Contoh: garis yang dibuat dari titik (-2,0) dan (0,4) mempunyai persamaan
  // garis
  // y = 2x + 4.
  void printPersamaanGaris() {
    double m = this.getGradien();
    double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
    System.out.println("y = " + m + "x + " + c);
  }
}
