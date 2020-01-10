package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Lintang Kusuma Adjie
 */
public class Anggota1841720193Lintang {
    
    private int mIdanggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720193Lintang() {
    }

    public Anggota1841720193Lintang(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getIdanggotaLintang() {
        return mIdanggota;
    }

    public void setIdanggotaLintang(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public String getNamaLintang() {
        return mNama;
    }

    public void setNamaLintang(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatLintang() {
        return mAlamat;
    }

    public void setAlamatLintang(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponLintang() {
        return mTelepon;
    }

    public void setTeleponLintang(String mTelepon) {
        this.mTelepon = mTelepon;
    }
    
    public Anggota1841720193Lintang getByIdLintang(int id)
    {
        Anggota1841720193Lintang agt = new Anggota1841720193Lintang();
        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");
        
        try {
            while (rs.next()) {
                agt = new Anggota1841720193Lintang();
                agt.setIdanggotaLintang(rs.getInt("idanggota"));
                agt.setNamaLintang(rs.getString("nama"));
                agt.setAlamatLintang(rs.getString("alamat"));
                agt.setTeleponLintang(rs.getString("telepon"));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }
    
    public ArrayList<Anggota1841720193Lintang> getAllLintang() {
        ArrayList<Anggota1841720193Lintang> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720193Lintang agt = new Anggota1841720193Lintang();
                agt.setIdanggotaLintang(rs.getInt("idanggota"));
                agt.setNamaLintang(rs.getString("nama"));
                agt.setAlamatLintang(rs.getString("alamat"));
                agt.setTeleponLintang(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Anggota1841720193Lintang> searchLintang(String keyword) {
        ArrayList<Anggota1841720193Lintang> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720193Lintang.selectQueryLintang(sql);

        try {
            while (rs.next()) {
                Anggota1841720193Lintang agt = new Anggota1841720193Lintang();
                agt.setIdanggotaLintang(rs.getInt("idanggota"));
                agt.setNamaLintang(rs.getString("nama"));
                agt.setAlamatLintang(rs.getString("alamat"));
                agt.setTeleponLintang(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public void saveLintang() {
        if (getByIdLintang(mIdanggota).getIdanggotaLintang()== 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + " '" + this.mNama + "', " + " '" + this.mAlamat + "', " + " '" + this.mTelepon + "' " + " )";
            this.mIdanggota = DBHelper1841720193Lintang.insertQueryGetIdLintang(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + " nama = '" + this.mNama + "', " + " alamat = '" + this.mAlamat + "', " + " telepon = '" + this.mTelepon + "' " + " WHERE idanggota = '" + this.mIdanggota + "'";
            DBHelper1841720193Lintang.executeQueryLintang(SQL);
        }
    }
    
    public void deleteLintang()
    {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720193Lintang.executeQueryLintang(SQL);
    }
}
