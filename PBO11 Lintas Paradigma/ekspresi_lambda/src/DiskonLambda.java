/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Nama File : DiskonLambda.java
 * Deskripsi : Contoh penggunaan ekspresi lambda untuk menghitung diskon
 *              pada harga barang.
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 04 Juni 2025
 */

interface IDiskon {
  public double hitungDiskon(int harga);
}

public class DiskonLambda {
  public static void main(String[] args) {
    // tanpa lambda
    IDiskon diskonMerdeka = new IDiskon() {
      public double hitungDiskon(int harga) {
        return harga - (harga * 0.3);
      }
    };

    // dengan lambda
    IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

    // dengan lambda dengan blok statement
    IDiskon diskonBiasa = (harga) -> {
      return harga - (harga * 0.1);
    };

    System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
    System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
    System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
  }
}

/*
 * Compile dan jalankan kode tersebut !
 * Dapatkah Anda membedakan antara bagamana diskonLebaran dan diskonBiasa
 * diimplementasikan ?
 * 
 * Output:
 * Diskon Merdeka: 31500.0
 * Diskon Lebaran: 27000.0
 * Diskon Biasa: 40500.0
 * 
 * Perbedaan implementasi diskonLebaran dan diskonBiasa:
 * 1. diskonLebaran tanpa blok statement, menggunakan expression lambda saja:
 * (harga) -> harga - (harga * 0.4)
 * 
 * 2. diskonBiasa menggunakan blok statement:
 * (harga) -> { return harga - (harga * 0.1); }
 *
 * Namun, walaupun berbeda... keduanya merupakan anonymous function yang
 * mengimplementasikan functional interface IDiskon, sebagai alternatif yang
 * lebih ringkas dibandingkan anonymous class (seperti pada implementasi
 * diskonMerdeka).
 */