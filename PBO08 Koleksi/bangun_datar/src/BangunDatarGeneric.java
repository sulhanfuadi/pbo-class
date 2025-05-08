/*
 * Nama File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 08 Mei 2025
*/

public class BangunDatarGeneric<T1 extends BangunDatar> {
  private T1 bangunDatar;

  public void set(T1 tipeBangunDatar) {
    bangunDatar = tipeBangunDatar;
  }

  public T1 get() {
    return bangunDatar;
  }

  public double hitungKeliling() {
    return bangunDatar.hitungKeliling();
  }
}

/*
 * Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada
 * BangunDatarGeneric.java diganti dengan karakter yang lain seperti,
 * T1,T2,T1234. Simpulkan apa yang anda lakukan !
 * 
 * Mengganti nama parameter tipe generik (misalnya dari `T` menjadi `T1`, `T2`,
 * atau `T1234`) dalam kelas BangunDatarGeneric tidak akan mengubah
 * fungsionalitas atau perilaku kelas tersebut.
 * 
 * Nama parameter tipe hanyalah seperti sebuah pengenal placeholder. Selama
 * pengenal tersebut valid dalam Java dan digunakan secara konsisten di seluruh
 * definisi kelas generik, kompiler akan tetap memahaminya sebagai parameter
 * tipe.
 */
