/* Nama File : App.java
  Deskripsi : menguji fungsi dan manipulasi objek dari kelas-kelas yang telah dibuat
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 27 Februari 2025
*/

// membuat class App yang berisi method main dari program yang menguji fungsi dan manipulasi objek dari kelas-kelas yang telah dibuat
public class App {
  public static void main(String[] args) {
    // membuat objek titik T1, mengeset absis dan ordinat, menggeser titik, dan
    // menghitung jarak titik
    Titik T1 = new Titik(); // membuat titik (0,0)
    T1.setAbsis(3); // mengeset absis titik T1 dengan nilai 3
    T1.setOrdinat(4); // mengeset ordinat titik T1 dengan nilai 4
    T1.printTitik(); // mencetak koordinat titik T1
    T1.geser(2, 3); // menggeser titik T1 sejauh 2 ke arah sumbu x dan 3 ke arah sumbu y
    T1.printTitik(); // mencetak koordinat titik T1
    System.out.println("Jarak titik T1 ke titik (0,0) = " + T1.getjarakPusat()); // menghitung jarak
                                                                                 // titik T1 ke
    // titik (0,0)

    // membuat objek titik T2 yang sama dengan titik T1
    // object reference, T2 dan T1 merujuk ke objek yang sama
    // sehingga perubahan nilai atribut T1 juga mempengaruhi nilai atribut T2
    Titik T2 = T1; // membuat titik T2 yang sama dengan titik T1
    T2.printTitik(); // mencetak koordinat titik T2
    // mengeset absis dan ordinat titik T1 dengan nilai 10 dan 20
    T1.setAbsis(10);
    T1.setOrdinat(20);
    T2.printTitik(); // mencetak koordinat titik T2

    // membuat objek titik T3, mengeset absis dan ordinat, dan menghitung jarak
    Titik T3 = new Titik(5, 12); // membuat titik (5,12)
    T3.printTitik(); // mencetak koordinat titik T3

    // mengecek jumlah objek titik yang telah dibuat
    System.out.println("Jumlah objek titik yang telah dibuat = " + Titik.getCounterTitik());
  }
}
