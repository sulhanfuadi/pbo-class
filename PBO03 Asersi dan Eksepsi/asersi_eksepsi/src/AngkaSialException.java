/*
 * Nama File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 06 Maret 2025
 */

public class AngkaSialException extends Exception {
  public AngkaSialException() {
    super("Jangan memasukkan angka 13 karena angka sial !!!");
  }
}
