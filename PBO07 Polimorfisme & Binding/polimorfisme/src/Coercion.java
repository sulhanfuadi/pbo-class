/*
 * Nama File : Coercion.java
 * Deskripsi : Contoh Polimorfisme Ad Hoc melalui Coercion (widening) dan narrowing
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class Coercion {
  public static void main(String[] args) {
    // 1. char -> int (widening coercion)
    int output1 = 'a';
    System.out.println("1. output1 = 'a'  -> " + output1);

    // 2. double -> int (narrowing without cast) ⇒ compile error
    // double x = 15.5;
    // int output2 = x; // tidak bisaaa, dia: incompatible types: possible lossy
    // conversion from double
    // to int
    // System.out.println("2. output2 = x -> " + output2);

    // 3. int -> double (widening coercion)
    int y = 25;
    double output3 = y;
    System.out.println("3. output3 = y    -> " + output3);

    // 4. int -> char (narrowing with explicit cast)
    int z = 78;
    char output4 = (char) z;
    System.out.println("4. output4 = (char)z -> " + output4);

    // 5. char -> double (widening coercion)
    char a = 'a';
    double output5 = a;
    System.out.println("5. output5 = a    -> " + output5);
  }
}
