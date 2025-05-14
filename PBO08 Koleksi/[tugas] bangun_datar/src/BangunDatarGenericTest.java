/*
 * Nama File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 08 Mei 2025
*/
public class BangunDatarGenericTest {
  public static void main(String[] args) {
    Lingkaran l = new Lingkaran(2);
    BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
    bdg.set(l);
    System.out.println("keliling lingkaran : "
        + bdg.hitungKeliling());
    System.out.println("tipe generic : "
        + bdg.get().getClass().getName());
  }
}
