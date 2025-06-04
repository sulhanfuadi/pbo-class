/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/*
 * Nama File : LambdaList.java
 * Deskripsi : Contoh penggunaan ekspresi lambda untuk menampilkan
 *              daftar mahasiswa menggunakan ArrayList.
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 04 Juni 2025
 */

public class LambdaList {
  public static void main(String[] args) {
    ArrayList<String> mahasiswaList = new ArrayList<>();
    mahasiswaList.add("Adi");
    mahasiswaList.add("Bambang");
    mahasiswaList.add("Cici");
    mahasiswaList.add("Didi");

    // lambda digunakan sebagai parameter
    mahasiswaList.forEach((nama) -> System.out.println(nama));
  }
}

/*
 * Compile dan jalankan kode tersebut !
 * 
 * Output:
 * Adi
 * Bambang
 * Cici
 * Didi
 */