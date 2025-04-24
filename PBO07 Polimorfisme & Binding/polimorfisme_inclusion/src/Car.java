/*
 * Nama File : Car.java
 * Deskripsi : Kelas Car sebagai subclass dari Vehicle
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Car extends Vehicle {
  @Override
  void calRent(int jarak, float harga) {
    float fare = jarak * harga;
    fare = fare - 100.0f; // diskon khusus mobil
    System.out.println("harga sewa mobil = " + fare);
  }
}
