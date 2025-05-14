/*
 * Nama File : Koleksi.java
 * Deskripsi : Implementasi kelas Koleksi generik
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 14 Mei 2025
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

  // getters and setters
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

  // method add, delete, showAll
  public void add(T e) {
    wadah.add(e);
    nbelm = wadah.size(); // update size
  }

  public T delete() {
    if (nbelm == 0) { // jika wadah kosong
      return null;
    }
    T e = wadah.get(nbelm - 1); // ambil elemen terakhir
    wadah.remove(nbelm - 1);
    nbelm = wadah.size();
    return e;
  }

  public void showAll() {
    for (T e : wadah) { // untuk setiap elemen dalam wadah
      System.out.println(e);
    }
  }
}
