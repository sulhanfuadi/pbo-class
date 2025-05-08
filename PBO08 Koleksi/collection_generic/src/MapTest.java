/*
 * Nama File  : MapTest.java
 * Deskripsi   : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * Pembuat     : Sulhan Fuadi (24060123130115)
 * Tanggal     : 08 Mei 2025
*/

import java.util.*;

public class MapTest {
  public static void main(String[] args) {
    // kunci-> integer, nilai-> string
    Map<Integer, String> map = new HashMap<Integer, String>();
    // menempatkan elemen kunci dan nilai
    map.put(1, "satu");
    map.put(2, "dua");
    // mengambil elemen pertama
    System.out.println(map.get(1));
    // mengambil keseluruhan kunci sebagai objek collection Set
    Set<Integer> key = map.keySet();
    // iterasi untuk mengambil keseluruhan nilai dari kunci
    for (Integer k : key) {
      System.out.print(map.get(k) + " ");
    }
  }
}
