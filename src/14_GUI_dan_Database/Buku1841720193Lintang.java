package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Lintang Kusuma ADjie
 */
public class Buku1841720193Lintang {

    private int mIdbuku;
    private Kategori1841720193Lintang mKategori = new Kategori1841720193Lintang();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public Buku1841720193Lintang() {
    }

    public Buku1841720193Lintang(Kategori1841720193Lintang mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getIdbukuLintang() {
        return mIdbuku;
    }

    public void setIdbukuLintang(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Kategori1841720193Lintang getKategoriLintang() {
        return mKategori;
    }

    public void setKategoriLintang(Kategori1841720193Lintang mKategori) {
        this.mKategori = mKategori;
    }

    public String getJudulLintang() {
        return mJudul;
    }

    public void setJudulLintang(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getPenerbitLintang() {
        return mPenerbit;
    }

    public void setPenerbitLintang(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getPenulisLintang() {
        return mPenulis;
    }

    public void setPenulisLintang(String mPenulis) {
        this.mPenulis = mPenulis;
    }

    public Buku1841720193Lintang getByIdLintang(int id) {
        Buku1841720193Lintang buku = new Buku1841720193Lintang();
        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori " + " WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                buku = new Buku1841720193Lintang();
                buku.setIdbukuLintang(rs.getInt("idbuku"));
                buku.getKategoriLintang().setIdkategoriLintang(rs.getInt("idkategori"));
                buku.getKategoriLintang().setNamaLintang(rs.getString("nama"));
                buku.getKategoriLintang().setKeteranganLintang(rs.getString("keterangan"));
                buku.setJudulLintang(rs.getString("judul"));
                buku.setPenerbitLintang(rs.getString("penerbit"));
                buku.setPenulisLintang(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720193Lintang> getAllLintang() {
        ArrayList<Buku1841720193Lintang> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori ");

        try {
            while (rs.next()) {
                Buku1841720193Lintang buku = new Buku1841720193Lintang();
                buku.setIdbukuLintang(rs.getInt("idbuku"));
                buku.getKategoriLintang().setIdkategoriLintang(rs.getInt("idkategori"));
                buku.getKategoriLintang().setNamaLintang(rs.getString("nama"));
                buku.getKategoriLintang().setKeteranganLintang(rs.getString("keterangan"));
                buku.setJudulLintang(rs.getString("judul"));
                buku.setPenerbitLintang(rs.getString("penerbit"));
                buku.setPenulisLintang(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku1841720193Lintang> searchLintang(String keyword) {
        ArrayList<Buku1841720193Lintang> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori " + " WHERE b.judul LIKE '%" + keyword + "%' " + " OR b.penerbit LIKE '%" + keyword + "%' " + " OR b.penulis LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Buku1841720193Lintang buku = new Buku1841720193Lintang();
                buku.setIdbukuLintang(rs.getInt("idbuku"));
                buku.getKategoriLintang().setIdkategoriLintang(rs.getInt("idkategori"));
                buku.getKategoriLintang().setNamaLintang(rs.getString("nama"));
                buku.getKategoriLintang().setKeteranganLintang(rs.getString("keterangan"));
                buku.setJudulLintang(rs.getString("judul"));
                buku.setPenerbitLintang(rs.getString("penerbit"));
                buku.setPenulisLintang(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveLintang() {
        if (getByIdLintang(mIdbuku).getIdbukuLintang() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES(" + " '" + this.mJudul + "', " + " '" + this.getKategoriLintang().getIdkategoriLintang() + "', " + " '" + this.mPenulis + "', " + " '" + this.mPenerbit + "' " + " )";
            this.mIdbuku = DBHelper1841720193Lintang.insertQueryGetIdLintang(SQL);
        } else {
            String SQL = "UPDATE buku SET " + " judul = '" + this.mJudul + "', " + " idkategori = '" + this.getKategoriLintang().getIdkategoriLintang() + "', " + " penulis = '" + this.mPenulis + "', " + " penerbit = '" + this.mPenerbit + "' " + " WHERE idbuku = '" + this.mIdbuku + "'";
            DBHelper1841720193Lintang.executeQueryLintang(SQL);
        }
    }

    public void deleteLintang() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720193Lintang.executeQueryLintang(SQL);
    }
}
