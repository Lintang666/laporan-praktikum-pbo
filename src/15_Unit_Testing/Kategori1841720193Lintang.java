package unittest.database;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Lintang Kusuma Adjie
 */
public class Kategori1841720193Lintang {

    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720193Lintang() {
    }

    public Kategori1841720193Lintang(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getIdkategoriLintang() {
        return mIdkategori;
    }

    public void setIdkategoriLintang(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getNamaLintang() {
        return mNama;
    }

    public void setNamaLintang(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganLintang() {
        return mKeterangan;
    }

    public void setKeteranganLintang(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720193Lintang getByIdLintang(int id) {
        Kategori1841720193Lintang kat = new Kategori1841720193Lintang();
        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720193Lintang();
                kat.setIdkategoriLintang(rs.getInt("idkategori"));
                kat.setNamaLintang(rs.getString("nama"));
                kat.setKeteranganLintang(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720193Lintang> getAllLintang() {
        ArrayList<Kategori1841720193Lintang> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720193Lintang kat = new Kategori1841720193Lintang();
                kat.setIdkategoriLintang(rs.getInt("idkategori"));
                kat.setNamaLintang(rs.getString("nama"));
                kat.setKeteranganLintang(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720193Lintang> searchLintang(String keyword) {
        ArrayList<Kategori1841720193Lintang> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang(sql);

        try {
            while (rs.next()) {
                Kategori1841720193Lintang kat = new Kategori1841720193Lintang();
                kat.setIdkategoriLintang(rs.getInt("idkategori"));
                kat.setNamaLintang(rs.getString("nama"));
                kat.setKeteranganLintang(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720193Lintang> getByNamaAndKeteranganLintang(String nama, String keterangan) {
        ArrayList<Kategori1841720193Lintang> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720193Lintang.selectQueryLintang(
                    "SELECT * FROM kategori "
                    + "WHERE nama = '" + nama + "'  AND keterangan = '" + keterangan + "'  ");

        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT * FROM kategori WHERE nama = '" + nama + "'");
        } else {
            rs = DBHelper1841720193Lintang.selectQueryLintang(
                    "SELECT * FROM kategori "
                    + "WHERE keterangan = '" + keterangan + "'  ");

        }
        try {
            while (rs.next()) {
                Kategori1841720193Lintang kat = new Kategori1841720193Lintang();
                kat.setIdkategoriLintang(rs.getInt("idkategori"));
                kat.setNamaLintang(rs.getString("nama"));
                kat.setKeteranganLintang(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveLintang() {
        if (getByIdLintang(mIdkategori).getIdkategoriLintang() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES(" + " '" + this.mNama + "', " + " '" + this.mKeterangan + "' " + " )";
            this.mIdkategori = DBHelper1841720193Lintang.insertQueryGetIdLintang(SQL);
        } else {
            String SQL = "UPDATE kategori SET " + " nama = '" + this.mNama + "', " + " keterangan = '" + this.mKeterangan + "' " + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720193Lintang.executeQueryLintang(SQL);
        }
    }

    public void deleteLintang() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720193Lintang.executeQueryLintang(SQL);
    }

    public String toString() {
        return mNama;
    }
}
