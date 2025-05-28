/*
 * Nama File : MysqlMahasiswaService.java
 * Deskripsi : Kelas untuk manipulasi table mysql melalui program java
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 28 Mei 2025
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.*;
import jdbc.service.*;
import jdbc.utilities.MysqlUtility;
import static jdbc.utilities.MysqlUtility.getConnection;

/**
 *
 * @author Han
 */
public class MysqlMahasiswaService {
  Connection koneksi = null;

  public MysqlMahasiswaService() {
    koneksi = getConnection();
  }

  public Mahasiswa makeMhsObject() {
    return new Mahasiswa();
  }

  public void add(Mahasiswa mhs) throws SQLException {
    String query = "INSERT INTO mahasiswa (id,nama) VALUES (" + mhs.getId() + ",'" + mhs.getNama() + "')";
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("berhasil insert");
    } catch (SQLException e) {
      e.printStackTrace();
      throw e; // Lemparkan kembali exception setelah dicatat
    }
  }

  public void update(Mahasiswa mhs) throws SQLException {
    String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("berhasil update");
    } catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
  }

  public void delete(int id) throws SQLException {
    String query = "DELETE FROM mahasiswa WHERE id = " + id;
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("berhasil delete");
    } catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
  }

  public Mahasiswa getById(int id) throws SQLException {
    Mahasiswa mhs = new Mahasiswa();
    String query = "SELECT * FROM mahasiswa WHERE id = " + id;
    try {
      Statement s = koneksi.createStatement();
      ResultSet rs = s.executeQuery(query);
      if (rs.next()) {
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
    return mhs;
  }

  public List<Mahasiswa> getAll() throws SQLException {
    List<Mahasiswa> mahasiswaList = new ArrayList<>();
    String query = "SELECT * FROM mahasiswa";
    try {
      Statement s = koneksi.createStatement();
      ResultSet rs = s.executeQuery(query);
      while (rs.next()) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        mahasiswaList.add(mhs);
      }
    } catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
    return mahasiswaList;
  }

  public void indexReset() throws SQLException {
    String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("berhasil reset indeks");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public boolean isEmpty() {
    String query = "SELECT COUNT(*) FROM mahasiswa";

    try {
      Statement s = koneksi.createStatement();
      ResultSet rs = s.executeQuery(query);
      if (rs.next()) {
        return rs.getInt(1) == 0;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  public void closeConnection() {
    if (koneksi != null) {
      try {
        koneksi.close();
        System.out.println("Koneksi ditutup");
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

}