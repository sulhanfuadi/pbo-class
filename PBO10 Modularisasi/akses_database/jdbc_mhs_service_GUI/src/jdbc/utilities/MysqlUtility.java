/*
 * Nama File : MysqlUtility.java
 * Deskripsi : Kelas koneksi ke Mysql
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 28 Mei 2025
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jdbc.utilities;

import java.sql.*;

/**
 *
 * @author Han
 */
public class MysqlUtility {

  private static Connection koneksi;

  public static Connection getConnection() {
    if (koneksi == null) {
      try {
        Class.forName("com.mysql.jdbc.Driver");
        // Sesuaikan host, port, nama db
        String url = "jdbc:mysql://localhost:3306/pbo_mhs";
        // sesuaikan username dan password
        String user = "user";
        String password = "your_password";

        koneksi = DriverManager.getConnection(url, user, password);

        if (koneksi != null) {
          System.out.println("Koneksi berhasil");
        }
      } catch (ClassNotFoundException cne) {
        System.out.println("Gagal load driver : " + cne.getMessage());
      } catch (SQLException sqle) {
        System.out.println("Gagal Koneksi : " + sqle.getMessage());
      }
    }
    return koneksi;
  }

}