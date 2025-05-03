# Sistem Manajemen Ruang FSM

## Identitas

- **Nama**: Sulhan Fuadi
- **NIM**: 24060123130115
- **Kelas**: Lab PBO E1

## Deskripsi Proyek

Proyek ini merupakan implementasi sistem manajemen ruang untuk Fakultas Sains dan Matematika (FSM) menggunakan paradigma pemrograman berorientasi objek (OOP) dalam bahasa Java. Sistem ini dirancang untuk mengelola berbagai jenis ruangan di lingkungan fakultas, termasuk ruang kelas, laboratorium, dan ruang departemen. Implementasi ini juga menghitung biaya kebersihan untuk masing-masing jenis ruangan berdasarkan luas dan tarif yang ditentukan.

## Struktur Program

### Hierarki Kelas

```
Ruang (abstract)
├── RuangFakultas (abstract)
│   ├── RuangKelas
│   └── RuangLaboratorium (abstract)
│       ├── LabKomputer
│       └── LabNonKomputer
└── RuangDepartemen (abstract)
    ├── RuangKantorDepartemen
    └── RuangDosen

Departemen
RuangCounter
Main
```

### Penjelasan Kelas

1. **Ruang.java**

   - Kelas abstrak dasar yang menyimpan atribut dasar ruangan (kode, panjang, lebar, tinggi, kapasitas)
   - Berisi method `hitungLuas()` dan method abstrak `hitungBiayaKebersihan()`

2. **Departemen.java**

   - Merepresentasikan departemen dengan nama, ketua departemen, dan tarif biaya kebersihan khusus

3. **RuangFakultas.java**

   - Kelas abstrak yang mewarisi Ruang
   - Memiliki tarif biaya kebersihan yang seragam untuk semua ruang fakultas (variabel statis)

4. **RuangDepartemen.java**

   - Kelas abstrak yang mewarisi Ruang
   - Memiliki asosiasi dengan kelas Departemen
   - Biaya kebersihan dihitung berdasarkan tarif departemen

5. **RuangKelas.java**

   - Kelas konkrit yang mewarisi RuangFakultas
   - Memiliki atribut tambahan: jumlah kursi tersedia dan jumlah kursi rusak

6. **RuangLaboratorium.java**

   - Kelas abstrak yang mewarisi RuangFakultas
   - Memiliki atribut tambahan: nama lab dan harga sewa
   - Berisi method abstrak `getJenisLab()`

7. **LabKomputer.java**

   - Kelas konkrit yang mewarisi RuangLaboratorium
   - Memiliki atribut tambahan: jumlah komputer

8. **LabNonKomputer.java**

   - Kelas konkrit yang mewarisi RuangLaboratorium
   - Memiliki atribut tambahan: daftar mata kuliah dan kategori lab

9. **RuangKantorDepartemen.java**

   - Kelas konkrit yang mewarisi RuangDepartemen
   - Memiliki atribut tambahan: jumlah meja, jumlah kursi, dan jumlah lemari

10. **RuangDosen.java**

    - Kelas konkrit yang mewarisi RuangDepartemen
    - Memiliki atribut tambahan: nama dosen, jumlah meja, dan jumlah kursi

11. **RuangCounter.java**

    - Kelas utilitas untuk menghitung statistik ruangan
    - Mengimplementasikan konsep agregasi dengan kelas Ruang

12. **Main.java**
    - Kelas utama untuk demonstrasi program
    - Berisi contoh penggunaan kelas-kelas dalam sistem

## Implementasi Konsep OOP

### 1. Enkapsulasi

Enkapsulasi diterapkan dengan membuat atribut bersifat private dan menyediakan method getter dan setter untuk mengakses dan memodifikasi nilai atribut.

```java
public class Ruang {
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;

    // Getter
    public String getKode() {
        return kode;
    }

    // ...getter lainnya
}
```

Keuntungan:

- Melindungi data dari akses langsung
- Memungkinkan validasi pada setter method
- Memudahkan perubahan implementasi internal tanpa mempengaruhi kode klien

### 2. Inheritance (Pewarisan)

Inheritance diterapkan dengan memanfaatkan hubungan "is-a" antar kelas. Misalnya, RuangKelas "is-a" RuangFakultas, dan RuangFakultas "is-a" Ruang.

```java
public abstract class RuangFakultas extends Ruang {
    // ...
}

public class RuangKelas extends RuangFakultas {
    // ...
}
```

Keuntungan:

- Penggunaan kembali kode (code reuse)
- Memperjelas hierarki konseptual
- Memudahkan perluasan fungsionalitas

### 3. Polymorphism (Polimorfisme)

Polimorfisme diterapkan melalui method overriding dan penggunaan referensi tipe parent untuk objek tipe child.

**a. Method Overriding**

```java
// Di kelas Ruang
public abstract double hitungBiayaKebersihan();

// Di kelas RuangFakultas
@Override
public double hitungBiayaKebersihan() {
    return hitungLuas() * tarifBiayaKebersihan;
}

// Di kelas RuangDepartemen
@Override
public double hitungBiayaKebersihan() {
    return hitungLuas() * departemen.getTarifBiayaKebersihan();
}
```

**b. Penggunaan referensi tipe parent**

```java
Ruang ruang = new RuangKelas(...); // Referensi Ruang menunjuk ke objek RuangKelas
ruang.hitungBiayaKebersihan(); // Memanggil implementasi di kelas RuangKelas
```

Keuntungan:

- Fleksibilitas dalam menangani objek yang berbeda
- Memungkinkan penggunaan kode yang lebih generik
- Memfasilitasi ekstensi dengan penambahan kelas baru

### 4. Abstraction (Abstraksi)

Abstraksi diterapkan melalui kelas abstrak dan method abstrak.

```java
public abstract class Ruang {
    // ...
    public abstract double hitungBiayaKebersihan();
}

public abstract class RuangLaboratorium extends RuangFakultas {
    // ...
    public abstract String getJenisLab();
}
```

Keuntungan:

- Menyembunyikan kompleksitas implementasi
- Memfokuskan pada fungsionalitas penting
- Memastikan kelas turunan mengimplementasikan perilaku tertentu

### 5. Method Overloading

Overloading diterapkan pada method `hitungTotalBiayaKebersihan()` dalam kelas Main.

```java
// Overloading 1: Untuk ruang fakultas
public static double hitungTotalBiayaKebersihan(RuangFakultas... ruangs) {
    // implementasi
}

// Overloading 2: Untuk ruang departemen
public static double hitungTotalBiayaKebersihan(RuangDepartemen... ruangs) {
    // implementasi
}
```

Keuntungan:

- Intuitivitas dalam penggunaan method dengan nama yang sama untuk fungsi serupa
- Fleksibilitas dalam menangani parameter yang berbeda
- Menyederhanakan API dengan mengurangi jumlah nama method yang perlu diingat

### 6. Asosiasi, Agregasi, dan Komposisi

**a. Asosiasi**

- RuangDepartemen berasosiasi dengan Departemen

**b. Agregasi**

- RuangCounter mengagregasi objek-objek Ruang

Implementasi:

```java
public class RuangCounter {
    private List<Ruang> daftarRuang; // agregasi

    public void tambahRuang(Ruang ruang) {
        daftarRuang.add(ruang);
    }
}
```

## Cara Menjalankan Program

1. Pastikan JDK (Java Development Kit) telah terinstal di komputer Anda.
2. Atur project Java Anda dengan benar.
3. Salin semua file kelas Java ke project tersebut.
4. Jalankan program dengan menjalankan kelas Main.java.

```bash
javac *.java
java Main
```

## Contoh Output Program

```
---------- CONTOH INFORMASI RUANGAN ----------
=== RUANG KELAS ===
Kode: K-101
Ukuran: 10.0 x 8.0 x 3.5 meter
Kapasitas: 40 orang
Luas: 80.0 meter persegi
Jumlah Kursi Tersedia: 38
Jumlah Kursi Rusak: 2
Total Kursi: 40
Biaya Kebersihan: Rp. 400000.0

=== LABORATORIUM ===
Kode: LK-201
Ukuran: 15.0 x 10.0 x 3.0 meter
Kapasitas: 30 orang
Luas: 150.0 meter persegi
Nama Lab: Laboratorium Pemrograman
Jenis Lab: Laboratorium Komputer
Harga Sewa: Rp. 500000.0
Biaya Kebersihan: Rp. 750000.0
Jumlah Komputer: 30

...

---------- STATISTIK RUANGAN ----------
=== STATISTIK RUANGAN ===
Total Ruang: 10
Jumlah Ruang Kelas: 2
Jumlah Laboratorium: 4
  - Lab Komputer: 2
  - Lab Non-Komputer: 2
Jumlah Ruang Kantor Departemen: 2
Jumlah Ruang Dosen: 2

---------- BIAYA KEBERSIHAN BULANAN ----------
Total Biaya Kebersihan Ruang Fakultas: Rp. 3090000.0
Total Biaya Kebersihan Ruang Departemen: Rp. 210000.0
Total Biaya Kebersihan Keseluruhan: Rp. 3300000.0
```

## Kesimpulan

Implementasi Sistem Manajemen Ruang FSM ini telah berhasil menerapkan berbagai konsep pemrograman berorientasi objek. Melalui penggunaan hierarki kelas, enkapsulasi data, pewarisan, polimorfisme, dan abstraksi, sistem ini menyediakan cara yang terstruktur untuk mengelola berbagai jenis ruangan di fakultas.

Sistem ini mudah diperluas dengan menambahkan jenis ruangan baru atau fungsionalitas tambahan seperti penjadwalan ruangan atau pemantauan penggunaan ruangan. Penerapan prinsip OOP memastikan bahwa perubahan dan penambahan di masa depan dapat dilakukan dengan minimal dampak pada kode yang sudah ada.

---

© 2025 Sulhan Fuadi - Praktikum Pemrograman Berorientasi Objek
