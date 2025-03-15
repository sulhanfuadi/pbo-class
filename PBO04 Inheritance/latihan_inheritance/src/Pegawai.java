/* Nama File : Pegawai.java
    Deskripsi : Kelas Pegawai merupakan kelas induk yang berisi atribut dan method yang digunakan oleh kelas anak
    Pembuat   : Sulhan Fuadi (24060123130115)
    Tanggal   : 13 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // Constructor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Metode untuk memformat tanggal dalam format Indonesia
    protected String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return date.format(formatter);
    }

    // Metode untuk menghitung masa kerja
    protected Period hitungMasaKerja() {
        LocalDate today = LocalDate.now();
        return Period.between(tmt, today);
    }

    // Metode untuk memformat masa kerja
    protected String formatMasaKerja(Period period) {
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    // Metode untuk menghitung dan menampilkan informasi pegawai
    public void printInfo() {
        System.out.println("NIP        : " + nip);
        System.out.println("Nama       : " + nama);
        System.out.println("Tanggal Lahir : " + formatDate(tanggalLahir));
        System.out.println("TMT        : " + formatDate(tmt));
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
    }
}
