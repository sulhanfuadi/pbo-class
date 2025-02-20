/* Nama File : Titik.java
  Deskripsi : Berisi atribut dan method dalam class Titik
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Februari 2025
*/

public class Titik {
  /************** ATRIBUT **************/
  double absis;
  double ordinat;
  static int counterTitik = 0; // atribut statik untuk menghitung jumlah objek titik yang telah dibuat
  // static merupakan atribut yang dimiliki oleh kelas, bukan oleh objek
  // sehingga nilai atribut ini akan sama untuk semua objek yang dibuat dari kelas
  // Titik

  /************** METHOD **************/
  // Konstruktor untuk membuat titik (x,y)
  // Overloading konstruktor, konstruktor ini memungkinkan pembuatan objek titik
  // dengan nilai absis dan ordinat yang sudah ditentukan
  // Di kasus ini, overloading digunakan untuk customisasi pembuatan objek titik
  Titik(double absis, double ordinat) {
    this.absis = absis;
    this.ordinat = ordinat;
    // keyword this digunakan untuk merujuk pada atribut objek yang sedang dibuat
    // sehingga absis dan ordinat pada baris 22 dan 23 merujuk pada atribut objek
    // yang sedang dibuat, bukan pada parameter konstruktor
    counterTitik++; // menambah nilai counterTitik setiap kali objek titik dibuat
  }

  // Konstruktor untuk membuat titik (0,0)
  Titik() {
    // absis = 0;
    // ordinat = 0;
    this(0, 0); // memanggil konstruktor Titik(double absis, double ordinat)
    // this digunakan untuk memanggil konstruktor lain pada kelas yang sama
    // sehingga konstruktor ini akan memanggil konstruktor Titik(double absis,double
    // ordinat)
    // dengan nilai absis dan ordinat 0
  }

  // mengembalikan nilai counterTitik
  // dibuat sebagai metode statik sehingga dapat dipanggil tanpa membuat objek
  // dari kelas Titik
  static int getCounterTitik() {
    return counterTitik;
  }

  // mengembalikan nilai absis
  double getAbsis() {
    return absis;
  }

  // mengembalikan nilai ordinat
  double getOrdinat() {
    return ordinat;
  }

  // mengeset absis titik dengan nilai baru x
  void setAbsis(double x) {
    absis = x;
  }

  // mengeset ordinat titik dengan nilai baru y
  void setOrdinat(double y) {
    ordinat = y;
  }

  // menggeser titik sejauh dx ke arah sumbu x dan dy ke arah sumbu y
  void geser(double dx, double dy) {
    absis += dx;
    ordinat += dy;
  }

  // mendapatkan kuadran titik
  int getKuadran() {
    if (absis > 0 && ordinat > 0) {
      return 1;
    } else if (absis < 0 && ordinat > 0) {
      return 2;
    } else if (absis < 0 && ordinat < 0) {
      return 3;
    } else if (absis > 0 && ordinat < 0) {
      return 4;
    } else {
      return 0; // titik berada di pusat koordinat
    }
  }

  // mendapatkan jarak titik ke pusat koordinat
  double getjarakPusat() {
    return Math.sqrt(absis * absis + ordinat * ordinat);
  }

  // mendapatkan jarak titik ke titik T
  double getJarak(Titik T) {
    return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
  }

  // refleksi terhadap sumbu x
  void refleksiX() {
    ordinat = -ordinat;
  }

  // refleksi terhadap sumbu y
  void refleksiY() {
    absis = -absis;
  }

  // mengembalikan titik hasil refleksi terhadap sumbu x
  Titik getRefleksiX() {
    return new Titik(absis, -ordinat);
  }

  // mengembalikan titik hasil refleksi terhadap sumbu y
  Titik getRefleksiY() {
    return new Titik(-absis, ordinat);
  }

  // mencetak koordinat titik
  void printTitik() {
    System.out.println("Titik (" + absis + ", " + ordinat + ")");
  }
}