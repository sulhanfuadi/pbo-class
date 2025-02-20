/* Nama File : MTitik.java
  Deskripsi : Menguji fungsi dan manipulasi objek dari kelas Titik
  Pembuat   : Sulhan Fuadi (24060123130115)
  Tanggal   : 20 Februari 2025
*/

// membuat class MTitik yang berisi method main dari program yang menguji fungsi dan manipulasi objek dari kelas Titik
public class MTitik {
  public static void main(String[] args) {
    // membuat objek titik T1, mengeset absis dan ordinat, menggeser titik, dan
    // menghitung jarak titik
    Titik T1 = new Titik(); // membuat titik (0,0)
    T1.setAbsis(3); // mengeset absis titik T1 dengan nilai 3
    T1.setOrdinat(4); // mengeset ordinat titik T1 dengan nilai 4
    T1.printTitik(); // mencetak koordinat titik T1
    T1.geser(2, 3); // menggeser titik T1 sejauh 2 ke arah sumbu x dan 3 ke arah sumbu y
    T1.printTitik(); // mencetak koordinat titik T1
    System.out.println("Jarak titik T1 ke titik (0,0) = " + T1.getjarakPusat()); // menghitung jarak titik T1 ke
                                                                                 // titik (0,0)

    // membuat objek titik T2 yang sama dengan titik T1
    // object reference, T2 dan T1 merujuk ke objek yang sama
    // sehingga perubahan nilai atribut T1 juga mempengaruhi nilai atribut T2
    Titik T2 = T1; // membuat titik T2 yang sama dengan titik T1
    // counterTitik tidak bertambah karena tidak ada objek baru yang dibuat
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

    // uji method getKuadran untuk berbagai kasus
    Titik t1 = new Titik(10, 20); // Kuadran I
    System.out.println("Kuadran t1: " + t1.getKuadran()); // Expected output: 1

    Titik t2 = new Titik(-10, 20); // Kuadran II
    System.out.println("Kuadran t2: " + t2.getKuadran()); // Expected output: 2

    Titik t3 = new Titik(-10, -20); // Kuadran III
    System.out.println("Kuadran t3: " + t3.getKuadran()); // Expected output: 3

    Titik t4 = new Titik(10, -20); // Kuadran IV
    System.out.println("Kuadran t4: " + t4.getKuadran()); // Expected output: 4

    // uji method getjarakPusat
    System.out.println("Jarak t1 ke pusat: " + t1.getjarakPusat());

    // uji method getJarak antara t1 dan t2
    System.out.println("Jarak antara t1 dan t2: " + t1.getJarak(t2));

    // uji method refleksiX
    t1.refleksiX();
    System.out.print("t1 setelah refleksiX: ");
    t1.printTitik();

    // uji method refleksiY
    t1.refleksiY();
    System.out.print("t1 setelah refleksiY: ");
    t1.printTitik();

    // uji method getRefleksiX
    Titik t1RefleksiX = t1.getRefleksiX();
    System.out.print("getRefleksiX dari t1: ");
    t1RefleksiX.printTitik();

    // uji method getRefleksiY
    Titik t1RefleksiY = t1.getRefleksiY();
    System.out.print("getRefleksiY dari t1: ");
    t1RefleksiY.printTitik();
  }
}
