/*
 * Nama File : MainPerson.java
 * Deskripsi :
 * Menunjukkan mekanisme polymorphism (dynamic dispatch) di Java.
 * – Kelas Person mendefinisikan isAsleep(hr) default dan status(hr).
 * – Kelas Student meng-override isAsleep(hr).
 * – Pada runtime, JVM akan memanggil override yang sesuai tipe objek.
 *
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 24 April 2025
 */

public class MainPerson {
  /**
   * Titik masuk program.
   * Membuat referensi bertipe Person yang merujuk ke Student,
   * kemudian memanggil status(1).
   */
  public static void main(String[] args) {
    Person p;
    p = new Student("Sally");
    p.status(1);

    /*
     * Pertanyaan:
     * Jika dieksekusi main method seperti di atas...
     * maka output yang didapat adalah?
     * Diskusikan bagaimana hasil tersebut didapatkan (hint: apakah “this” pada
     * kelas person dalam method status dieksekusi ketika compile time atau runtime)
     *
     * Jawaban:
     * 1. Output: "Now online: Sally"
     * 2. Diskusi:
     * - Variabel `p` bertipe `Person` tapi menunjuk ke objek `Student`
     * (polimorfisme).
     * - `p.status(1)` memanggil method `status` dari `Person`.
     * - Di dalam `status`, `this.isAsleep(1)` dipanggil. `this` merujuk ke objek
     * `Student` saat runtime.
     * - Karena `Student` meng-override `isAsleep`, maka `Student.isAsleep(1)` yang
     * dieksekusi (dynamic dispatch).
     * - `Student.isAsleep(1)` mengembalikan `false` (karena 1 tidak di antara 2 dan
     * 8).
     * - Akibatnya, blok `else` di `status` dijalankan, mencetak "Now online: " +
     * `this`.
     * - `this` (objek `Student`) memanggil `toString()`. Karena tidak di-override,
     * `Person.toString()` digunakan, menghasilkan "Sally".
     * - Jadi, penentuan method `isAsleep` yang dipanggil oleh `this` terjadi saat
     * *runtime*.
     */
  }
}

/**
 * Kelas dasar yang menyimpan nama dan menyediakan:
 * – konstruktor Person(String)
 * – isAsleep(int) default: tidur jika hr>22 atau hr<7
 * – toString() mengembalikan name
 * – status(int) mencetak “Now offline/online: ” + this
 */
class Person {
  private String name;

  /**
   * Konstruktor.
   * 
   * @param name Nama orang
   */
  public Person(String name) {
    this.name = name;
  }

  /**
   * Apakah sedang tidur (default)?
   * 
   * @param hr Jam (0–23)
   * @return true jika 22 < hr || 7 > hr
   */
  public boolean isAsleep(int hr) {
    return 22 < hr || 7 > hr;
  }

  /**
   * Representasi string objek = nama.
   */
  @Override
  public String toString() {
    return name;
  }

  /**
   * Cetak status online/offline.
   * 
   * @param hr Jam saat ini (0–23)
   */
  public void status(int hr) {
    if (this.isAsleep(hr)) {
      System.out.println("Now offline: " + this);
    } else {
      System.out.println("Now online: " + this);
    }
  }
}

/**
 * Subkelas Person yang meng-override isAsleep:
 * Student tidur hanya jika 2 < hr && hr < 8.
 */
class Student extends Person {
  /**
   * Turunan konstruktor Person.
   * 
   * @param name Nama student
   */
  public Student(String name) {
    super(name);
  }

  /**
   * Override: Student dianggap tidur jika
   * 2 < hr && hr < 8.
   * 
   * @param hr Jam (0–23)
   * @return true jika 2 < hr && 8 > hr
   */
  @Override
  public boolean isAsleep(int hr) {
    return 2 < hr && 8 > hr;
  }
}
