/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Proker {
    protected String id;
    protected String namaProker;
    protected String Depar;
    protected int Jumlah;
    protected String ket;

    public Proker(String id, String namaProker, String Depar, int Jumlah, String ket) {
        this.id = id;
        this.namaProker = namaProker;
        this.Depar = Depar;
        this.Jumlah = Jumlah;
        this.ket = ket;
    }
    
    public Proker(){
        
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

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
    
    
   
    
}
