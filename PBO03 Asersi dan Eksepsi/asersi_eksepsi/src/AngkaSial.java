/*
 * Nama File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Penggunaan klausa 'throw' dan 'throws'
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 06 Maret 2025
 */

public class AngkaSial {
  public void cobaAngka(int angka) throws AngkaSialException {
    // throws digunakan untuk melempar eksepsi ke luar method, digunakan pada method
    // yang di dalamnya dimungkinan ada kesalahan (eksepsi) yang terjadi
    if (angka == 13) {
      throw new AngkaSialException();
      // throw digunakan ketika program akan melemparkan kesalahan ke kelas exception
    }
    System.out.println("Angka yang dimasukkan adalah " + angka + " dan bukan angka sial.");
  }

  public static void main(String[] args) {
    AngkaSial as = new AngkaSial(); // Membuat objek AngkaSial
    try {
      as.cobaAngka(10); // Memanggil method cobaAngka dengan parameter 10, tidak akan menimbulkan
                        // eksepsi
      as.cobaAngka(13); // Memanggil method cobaAngka dengan
      // parameter 13, akan menimbulkan eksepsi
      as.cobaAngka(12); // Karena eksepsi pada method cobaAngka dilempar, maka baris ini tidak akan
                        // dieksekusi
    } catch (AngkaSialException ase) {
      // method getMessage() sudah ada di kelas Exception
      System.out.println(ase.getMessage()); // mengembalikan: Jangan memasukkan angka 13 karena angka sial !!!
      System.out.println("Hati-hati memasukkan angka !!!");
    }
  }
}

// Setelah itu dilakukan:
// 1. compile dengan 'javac AngkaSialException.java' dan ‘javac AngkaSial.java’
// ->
// akan muncul AngkaSialException.class dan AngkaSial.class (jika belum ada)
// 2. jalankan dengan 'java AngkaSial' -> akan muncul:
// Angka yang dimasukkan adalah 10 dan bukan angka sial.
// Jangan memasukkan angka 13 karena angka sial!!!
// Hati-hati memasukkan angka!!!

/*
 * BAHASAN:
 * 
 * Ketika eksepsi terjadi, apakah baris 17 [ System.out.println("Angka yang
 * dimasukkan adalah " + angka + " dan bukan angka sial."); ] pada
 * AngkaSial.java di atas dieksekusi?
 * 
 * => Tidak, baris 17 tidak akan dieksekusi ketika eksepsi terjadi. Hal ini
 * karena
 * ketika kondisi if (angka == 13) bernilai true, statement throw new
 * AngkaSialException()
 * akan dijalankan. Ketika statement throw dieksekusi, program langsung keluar
 * dari metode
 * cobaAngka dan mencari blok catch yang sesuai tanpa mengeksekusi baris kode di
 * bawah
 * statement throw tersebut. Oleh karena itu, System.out.println pada baris 17
 * tidak
 * akan pernah dijalankan untuk kasus angka == 13.
 *
 * Apakah baris 29 [ catch (AngkaSialException ase) ] pada AngkaSial.java
 * di atas dieksekusi?
 * 
 * => Ya, baris 29 akan dieksekusi ketika eksepsi terjadi. Ketika
 * as.cobaAngka(13)
 * dipanggil, metode tersebut melempar AngkaSialException. Eksepsi ini kemudian
 * ditangkap
 * oleh blok catch pada baris 29, sehingga program mengeksekusi kode dalam blok
 * catch
 * tersebut yang mencetak pesan eksepsi dan peringatan. Ini menjelaskan mengapa
 * output
 * program menampilkan pesan "Jangan memasukkan angka 13 karena angka sial!!!"
 * dan
 * "Hati-hati memasukkan angka!!!" setelah pesan untuk angka 10.
 */
