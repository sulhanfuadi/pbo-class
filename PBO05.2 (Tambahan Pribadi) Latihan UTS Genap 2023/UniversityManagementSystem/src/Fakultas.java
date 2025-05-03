public class Fakultas {
  private String nama;
  private double tarifUKT;
  private double gajiPokok;

  public Fakultas(String nama, double tarifUKT, double gajiPokok) {
    this.nama = nama;
    this.tarifUKT = tarifUKT;
    this.gajiPokok = gajiPokok;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public double getTarifUKT() {
    return tarifUKT;
  }

  public void setTarifUKT(double tarifUKT) {
    this.tarifUKT = tarifUKT;
  }

  public double getGajiPokok() {
    return gajiPokok;
  }

  public void setGajiPokok(double gajiPokok) {
    this.gajiPokok = gajiPokok;
  }
}