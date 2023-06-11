/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author LENOVO
 */
public class MyDB {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/hima";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public MyDB(){
        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);  
            stmt = conn.createStatement();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void move() {
        String sql = "SELECT * FROM mhs";

        try {
            
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                if(rs.getString("jabatan").equals("Anggota")){
                    int key = rs.getInt("key");
                    String nama = rs.getString("nama");
                    String nomorhp = rs.getString("nomorHp");
                    String jeniskelamin = rs.getString("jenis_kel");
                    String jabatan = rs.getString("jabatan");
                    String departemen = rs.getString("departemen");
                    String prodi = rs.getString("prodi");
                    String fakultas = rs.getString("fakultas");
                    String angkatan = rs.getString("angkatan");
                    String kode = rs.getString("kode");
                    String pass = rs.getString("pass");
                    mhs mahasiswa = new mhs(kode,jabatan,departemen,pass,nomorhp,nama,prodi,fakultas,jeniskelamin,angkatan);
                    mhs.Anggota.add(mahasiswa);
                    System.out.println("hmmm");
                }
                else{
                    int key = rs.getInt("key");
                    String nama = rs.getString("nama");
                    String nomorhp = rs.getString("nomorHp");
                    String jeniskelamin = rs.getString("jenis_kel");
                    String jabatan = rs.getString("jabatan");
                    String departemen = rs.getString("departemen");
                    String prodi = rs.getString("prodi");
                    String fakultas = rs.getString("fakultas");
                    String angkatan = rs.getString("angkatan");
                    String kode = rs.getString("kode");
                    String pass = rs.getString("pass");
                    mhs mahasiswa = new mhs(kode,jabatan,departemen,pass,nomorhp,nama,prodi,fakultas,jeniskelamin,angkatan);
                    mhs.Petinggi.add(mahasiswa);
                    System.out.println("hmmm");

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void insertAnggota(String nama, String nomorhp, String jeniskelamin, String jabatan, String departemen, String prodi, String fakultas, String angkatan, String kode, String pass) {
        String sql = "INSERT INTO mhs (`key`, `nama`, `nomorHp`, `jenis_kel`, `jabatan`, `departemen`, `prodi`, `fakultas`, `angkatan`, `kode`, `pass`) VALUES(NULL, '%s', '%s', '%s', '%s', '%s', '%s','%s','%s','%s','%s')";
        sql = String.format(sql, nama, nomorhp, jeniskelamin, jabatan, departemen, prodi, fakultas, angkatan, kode, pass);
        try {
            stmt.execute(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void UpdateAnggota(String nama, String nomorhp, String jeniskelamin, String jabatan, String departemen, String prodi, String fakultas, String angkatan, String kode) {
        String sql = "UPDATE mhs SET nama='%s', nomorHp = '%s',jenis_kel = '%s', jabatan = '%s', departemen = '%s', prodi = '%s', fakultas= '%s', angkatan = '%s' WHERE kode='%s'";
        sql = String.format(sql, nama, nomorhp, jeniskelamin, jabatan, departemen, prodi, fakultas, angkatan, kode);            
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteAnggota(String kode){
        String sql = String.format("DELETE FROM mhs WHERE kode='%s'", kode);
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static void moveProker() {
        String sql = "SELECT * FROM proker";

        try {
            
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                    String nama = rs.getString("nama");
                    String departemen = rs.getString("depar");
                    String ket = rs.getString("ket");
                    int jumlah = rs.getInt("jumlah");
                    String kode = rs.getString("kode");
                    Proker pkr = new Proker(kode,nama,departemen,jumlah, ket);
                    mhs.proker.add(pkr);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void insertProker(String id, String nama, String depar, int jumlah, String ket) {
        String sql = "INSERT INTO proker (`key`, `nama`, `depar`, `ket`, `jumlah`, `kode`) VALUES(NULL, '%s','%s','%s',%d,'%s')";
        sql = String.format(sql, nama, depar, ket, jumlah, id);
        try {
            stmt.execute(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void UpdateProker(String id, String nama, String depar, int jumlah, String ket) {
        String sql = "UPDATE proker SET nama='%s', depar = '%s',ket = '%s', jumlah = '%d' WHERE kode='%s'";
        sql = String.format(sql, nama, depar, ket, jumlah, id);            
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deletProker(String id){
        String sql = String.format("DELETE FROM proker WHERE kode='%s'", id);
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String randomm(){
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = upperAlphabet + numbers;

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 3;

        for(int i = 0; i < length; i++) {

          // generate random index number
          int index = random.nextInt(alphaNumeric.length());

          // get character specified by index
          // from the string
          char randomChar = alphaNumeric.charAt(index);

          // append the character to string builder
          sb.append(randomChar);
        }
        return sb.toString();
    }
    
    public static void moveJadwal() {
        String sql = "SELECT * FROM jadwal";

        try {
            
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                    String nama = rs.getString("nama_proker");
                    String depar = rs.getString("depar");
                    String tanggal = rs.getString("tanggal");
                    String waktu = rs.getString("waktu");
                    String tempat = rs.getString("tempat");
                    String kode = rs.getString("kode");
                    Jadwal jdw = new Jadwal(kode,nama,depar,tanggal, waktu, tempat);
                    mhs.jadwal.add(jdw);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void inserJadwal(String id, String depar, String nama, String tanggal, String waktu, String tempat) {
        String sql = "INSERT INTO jadwal (`key`, `depar`, `nama_proker`, `tanggal`, `waktu`, `tempat`, `kode` ) VALUES(NULL, '%s','%s','%s','%s','%s','%s')";
        sql = String.format(sql, depar, nama, tanggal, waktu, tempat, id);
        try {
            stmt.execute(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void UpdateJadwal(String id, String depar, String nama, String tanggal, String waktu, String tempat) {
        String sql = "UPDATE jadwal SET depar='%s', nama_proker = '%s',tanggal = '%s', waktu = '%s', tempat = '%s' WHERE kode='%s'";
        sql = String.format(sql, depar, nama, tanggal, waktu, tempat, id);            
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteJadwal(String id){
        String sql = String.format("DELETE FROM jadwal WHERE kode='%s'", id);
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
