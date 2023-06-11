/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public abstract class Mahasiswa {
    private String pass;
    protected String nomorhp;
    protected String nama;
    protected String prodi;
    protected String fakultas;
    protected String jenisKelamin;
    protected String angkatan;

    public Mahasiswa(String pass, String nomorhp, String nama, String prodi, String fakultas, String jenisKelamin, String angkatan) {
        this.pass = pass;
        this.nomorhp = nomorhp;
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.jenisKelamin = jenisKelamin;
        this.angkatan = angkatan;
    }
    
    public Mahasiswa(){
        
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
    
    public abstract void lihatdataPribadi() throws Exception;
}
