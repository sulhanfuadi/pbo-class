/*
 * Nama File  : ContohMetodeGenerik.java
 * Deskripsi   : Kelas ContohMetodeGenerik yang berisi metode generik untuk menukar
 *               isi dua objek Datum<T> dan mensimulasikan perilaku Anabul di dalam
 *               Datum<T>.
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 03 Mei 2025
*/

public class ContohMetodeGenerik {

  // a) Metode untuk menukar isi dua objek Datum<T>
  public static <T> void tukarIsi(Datum<T> d1, Datum<T> d2) {
    T temp = d1.getIsi();
    d1.setIsi(d2.getIsi());
    d2.setIsi(temp);
  }

  // b) Metode generik untuk mensimulasikan perilaku Anabul di dalam Datum<T>
  public static <T extends Anabul> void simulasikan(Datum<T> datum) {
    T a = datum.getIsi();
    System.out.println("=== Simulasi generik: " + a.getNama() + " ===");
    a.info();
    a.gerak();
    a.bersuara();
    a.makan();
    a.tidur();
    if (a instanceof Kucing)
      ((Kucing) a).scratch();
    else if (a instanceof Anjing)
      ((Anjing) a).fetch();
    else if (a instanceof Burung)
      ((Burung) a).terbangTinggi();
    System.out.println();
  }
}