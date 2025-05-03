/*
 * Nama File  : Datum.java
 * Deskripsi   : Kelas generik Datum<T> untuk menyimpan objek dari kelas lain
 *               dengan tipe data generik T. Kelas ini memiliki atribut isi,
 *               konstruktor, selektor, dan mutator.
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 03 Mei 2025
*/

public class Datum<T> {
  // Atribut
  private T isi;

  // Konstruktor
  public Datum(T isi) {
    this.isi = isi;
  }

  // Selektor (getter)
  public T getIsi() {
    return isi;
  }

  // Mutator (setter)
  public void setIsi(T isi) {
    this.isi = isi;
  }
}