/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.*;

/**
 *
 * @author ahmad
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Terkoneksi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Terkoneksi : " + ex);
        }
        String url = "jdbc:mysql://localhost/perpus";
        try {
            koneksi = DriverManager.getConnection(url, "root", "root");
            System.out.println("Database Berhasil Terkoneksi");
        } catch (SQLException ex) {
            System.out.println("Database Gagal Terkoneksi : " + ex);
        }
        return koneksi;
    }
}
