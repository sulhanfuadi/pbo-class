/*
 * Nama File  : Koleksi.java
 * Deskripsi   : Kelas Koleksi yang menyimpan objek-objek dari tipe generik
 *               dan menyediakan metode untuk menambah, menghapus, dan
 *               menampilkan elemen
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 14 Mei 2025
*/

import java.util.ArrayList;
import java.util.List;

public class Koleksi<T> {
  // atribut
  private int nbelm;
  private List<T> wadah;

  // konstruktor
  public Koleksi() {
    wadah = new ArrayList<>();
    nbelm = 0;
  }

  // metode selektor dan mutator
  public int getSize() {
    return nbelm;
  }

  public void setSize(int size) {
    this.nbelm = size;
  }

  public T getIsi(int idx) {
    return wadah.get(idx);
  }

  public void setIsi(int idx, T nilai) {
    wadah.set(idx, nilai);
  }

  // metode untuk menambah, menghapus, dan menampilkan elemen
  public void add(T e) {
    wadah.add(e);
    nbelm = wadah.size();
  }

  public T delete() {
    if (nbelm == 0) {
      return null;
    }
    T e = wadah.get(nbelm - 1);
    wadah.remove(nbelm - 1);
    nbelm = wadah.size();
    return e;
  }

  public void showAll() {
    for (T e : wadah) {
      System.out.println(e);
    }
  }
}