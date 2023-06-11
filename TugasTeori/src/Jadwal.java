/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Jadwal {
    protected String id;
    protected String namaProker;
    protected String Depar;
    protected String tanggal;
    protected String waktu;
    protected String tempat;

    public Jadwal(String id, String namaProker, String Depar, String tanggal, String waktu, String tempat) {
        this.id = id;
        this.namaProker = namaProker;
        this.Depar = Depar;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.tempat = tempat;
    }
    
    public Jadwal(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaProker() {
        return namaProker;
    }

    public void setNamaProker(String namaProker) {
        this.namaProker = namaProker;
    }

    public String getDepar() {
        return Depar;
    }

    public void setDepar(String Depar) {
        this.Depar = Depar;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }
    
    
    

}
