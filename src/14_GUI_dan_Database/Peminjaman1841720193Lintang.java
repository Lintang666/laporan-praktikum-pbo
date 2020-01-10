package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Lintang Kusuma Adjie
 */
public class Peminjaman1841720193Lintang {

    private int mIdpeminjaman;
    private Anggota1841720193Lintang mAnggota = new Anggota1841720193Lintang();
    private Buku1841720193Lintang mBuku = new Buku1841720193Lintang();
    private String mTanggalpinjam;
    private String mTanggalkembali;

    public Peminjaman1841720193Lintang() {
    }

    public Peminjaman1841720193Lintang(Anggota1841720193Lintang mAnggota, Buku1841720193Lintang mBuku, String mTanggalpinjam, String mTanggalkembali) {
        this.mAnggota = mAnggota;
        this.mBuku = mBuku;
        this.mTanggalpinjam = mTanggalpinjam;
        this.mTanggalkembali = mTanggalkembali;
    }

    public int getIdpeminjamanLintang() {
        return mIdpeminjaman;
    }

    public void setIdpeminjamanLintang(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public Anggota1841720193Lintang getAnggotaLintang() {
        return mAnggota;
    }

    public void setAnggotaLintang(Anggota1841720193Lintang mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720193Lintang getBukuLintang() {
        return mBuku;
    }

    public void setBukuLintang(Buku1841720193Lintang mBuku) {
        this.mBuku = mBuku;
    }

    public String getTanggalpinjamLintang() {
        return mTanggalpinjam;
    }

    public void setTanggalpinjamLintang(String mTanggalpinjam) {
        this.mTanggalpinjam = mTanggalpinjam;
    }

    public String getTanggalkembaliLintang() {
        return mTanggalkembali;
    }

    public void setTanggalkembaliLintang(String mTanggalkembali) {
        this.mTanggalkembali = mTanggalkembali;
    }

    public Peminjaman1841720193Lintang getByIdLintang(int id) {
        Peminjaman1841720193Lintang pinjam = new Peminjaman1841720193Lintang();
        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
                + " a.idanggota AS idanggota, "
                + " b.idbuku AS idbuku "
                + " FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + " LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720193Lintang();
                pinjam.setIdpeminjamanLintang(rs.getInt("idpeminjaman"));
                pinjam.getAnggotaLintang().setIdanggotaLintang(rs.getInt("idanggota"));
                pinjam.getBukuLintang().setIdbukuLintang(rs.getInt("idbuku"));
                pinjam.setTanggalpinjamLintang(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembaliLintang(rs.getString("tanggalkembali"));
                pinjam.setAnggotaLintang(new Anggota1841720193Lintang().getByIdLintang(pinjam.getAnggotaLintang().getIdanggotaLintang()));
                pinjam.setBukuLintang(new Buku1841720193Lintang().getByIdLintang(pinjam.getBukuLintang().getIdbukuLintang()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720193Lintang> getAllLintang() {
        ArrayList<Peminjaman1841720193Lintang> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.idanggota AS idanggota, "
                + "b.idbuku AS idbuku "
                + "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720193Lintang pinjam = new Peminjaman1841720193Lintang();
                pinjam.setIdpeminjamanLintang(rs.getInt("idpeminjaman"));
                pinjam.getAnggotaLintang().setIdanggotaLintang(rs.getInt("idanggota"));
                pinjam.getBukuLintang().setIdbukuLintang(rs.getInt("idbuku"));
                pinjam.setTanggalpinjamLintang(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembaliLintang(rs.getString("tanggalkembali"));
                pinjam.setAnggotaLintang(new Anggota1841720193Lintang().getByIdLintang(pinjam.getAnggotaLintang().getIdanggotaLintang()));
                pinjam.setBukuLintang(new Buku1841720193Lintang().getByIdLintang(pinjam.getBukuLintang().getIdbukuLintang()));

                ListPinjam.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveLintang() {
        if (getByIdLintang(mIdpeminjaman).getIdpeminjamanLintang() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggotaLintang().getIdanggotaLintang() + "', "
                    + "'" + this.getBukuLintang().getIdbukuLintang() + "',"
                    + "'" + this.mTanggalpinjam + "', "
                    + "'" + this.mTanggalkembali + "' "
                    + ")";
            this.mIdpeminjaman = DBHelper1841720193Lintang.insertQueryGetIdLintang(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "idanggota = '" + this.getAnggotaLintang().getIdanggotaLintang() + "', "
                    + "idbuku = '" + this.getBukuLintang().getIdbukuLintang() + "', "
                    + "tanggalpinjam = '" + this.mTanggalpinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalkembali + "'";
            DBHelper1841720193Lintang.executeQueryLintang(sql);
        }
    }

    public void cariAnggotaLintang(int id) {
        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getAnggotaLintang().setIdanggotaLintang(rs.getInt("idanggota"));
                getAnggotaLintang().setNamaLintang(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuLintang(int id) {
        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getBukuLintang().setIdbukuLintang(rs.getInt("idbuku"));
                getBukuLintang().setJudulLintang(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteLintang() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720193Lintang.executeQueryLintang(sql);
    }
}
