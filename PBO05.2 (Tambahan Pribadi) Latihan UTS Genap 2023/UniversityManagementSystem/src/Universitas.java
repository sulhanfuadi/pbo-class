import java.util.ArrayList;

public class Universitas {
  private String nama;
  private ArrayList<Fakultas> daftarFakultas;

  public Universitas(String nama) {
    this.nama = nama;
    this.daftarFakultas = new ArrayList<>(); // Inisialisasi list fakultas
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  // Method untuk menambahkan fakultas ke universitas
  public void tambahFakultas(Fakultas fakultas) {
    daftarFakultas.add(fakultas);
  }

  public ArrayList<Fakultas> getDaftarFakultas() {
    return daftarFakultas;
  }
}