/*
 * Nama File : ReadSerializedPerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 15 Mei 2025
*/

import java.io.*;

public class ReadSerializedPerson {
  public static void main(String[] args) {
    Person person = null;
    try {
      FileInputStream f = new FileInputStream("person.ser");
      ObjectInputStream s = new ObjectInputStream(f);
      person = (Person) s.readObject();
      s.close();
      System.out.println("serialized person name =" + person.getName());
    } catch (Exception ioe) {
      ioe.printStackTrace();
    }
  }
}
