/*
 * Nama File : Vehicle.java
 * Deskripsi : Kelas Vehicle sebagai superclass dari Car dan Bus
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Vehicle {
  void calRent(int distance, float price) {
    float fare = distance * price;
    System.out.println("vehicle price = " + fare);
  }
}
