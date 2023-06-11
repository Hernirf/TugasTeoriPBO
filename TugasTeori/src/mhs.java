

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class mhs extends Mahasiswa implements Mhs_hima {
        protected String id;
        protected String jabatan;
        protected String departemen;
        static ArrayList<mhs> Petinggi = new ArrayList<mhs>();
        static ArrayList<mhs> Anggota = new ArrayList<mhs>();
        static ArrayList<Proker> proker = new ArrayList<Proker>();
        static ArrayList<Jadwal> jadwal = new ArrayList<Jadwal>();
        static String namaLogin, kodelogin, roleLogin;




    public mhs(String id, String jabatan, String departemen, String pass, String nomorhp, String nama, String prodi, String fakultas, String jenisKelamin, String angkatan) {
        super(pass, nomorhp, nama, prodi, fakultas, jenisKelamin, angkatan);
        this.id = id;
        this.jabatan = jabatan;
        this.departemen = departemen;
    }
    
    
    


    public mhs() {
        
    }

    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public void lihatdataPribadi() throws Exception {
        for (int i=0; i <  Anggota.size(); i++){
                if (Anggota.get(i).getId().equals(kodelogin)){
                    menu_akun.txtIDAnggota.setText(Anggota.get(i).getId());
                    menu_akun.txtNama.setText(Anggota.get(i).getNama());
                    menu_akun.txtNomorHP.setText(Anggota.get(i).getNomorhp());
                    menu_akun.txtJabatan.setText(Anggota.get(i).getJabatan());
                    menu_akun.txtDepar.setText(Anggota.get(i).getDepartemen());
                    menu_akun.txtProdi.setText(Anggota.get(i).getProdi());
                    menu_akun.txtFakultas.setText(Anggota.get(i).getFakultas());
                    menu_akun.txtAngkatan.setText(Anggota.get(i).getAngkatan());
                }   
        }
        for (int i=0; i <  Petinggi.size(); i++){
                if (Petinggi.get(i).getId().equals(kodelogin)){
                    menu_akun.txtIDAnggota.setText(Petinggi.get(i).getId());
                    menu_akun.txtNama.setText(Petinggi.get(i).getNama());
                    menu_akun.txtNomorHP.setText(Petinggi.get(i).getNomorhp());
                    menu_akun.txtJabatan.setText(Petinggi.get(i).getJabatan());
                    menu_akun.txtDepar.setText(Petinggi.get(i).getDepartemen());
                    menu_akun.txtProdi.setText(Petinggi.get(i).getProdi());
                    menu_akun.txtFakultas.setText(Petinggi.get(i).getFakultas());
                    menu_akun.txtAngkatan.setText(Petinggi.get(i).getAngkatan());
                }   
        }
    }

    @Override
    public void login() throws IOException {
        
    }

    @Override
    public void lihatanggota() throws IOException {
        DefaultTableModel dtm = (DefaultTableModel) DaftarAnggota.TabelMhs.getModel();
        dtm.setRowCount(0);
        for(mhs tinggi: Petinggi){
            dtm.addRow(new Object[]{
            tinggi.getId(),
            tinggi.getNama(),
            tinggi.getJenisKelamin(),
            tinggi.getNomorhp(),
            tinggi.getJabatan(),
            tinggi.getDepartemen(),
            tinggi.getFakultas(),
            tinggi.getProdi(),
            tinggi.getAngkatan(),
            });
        }
        
        for(mhs mahasiswa: Anggota){
            
            dtm.addRow(new Object[]{
            mahasiswa.getId(),
            mahasiswa.getNama(),
            mahasiswa.getJenisKelamin(),
            mahasiswa.getNomorhp(),
            mahasiswa.getJabatan(),
            mahasiswa.getDepartemen(),
            mahasiswa.getFakultas(),
            mahasiswa.getProdi(),
            mahasiswa.getAngkatan(),
            });
        }
    }
    
   

    @Override
    public void tambahanggota() throws IOException {
        String gender = "";
        String idAnggota = TambahAnggota.txtIDAnggota.getText();
        String nama = TambahAnggota.txtnama.getText();
        String nomorhp = TambahAnggota.txtnomorHp.getText();
        String jabatan = TambahAnggota.cmbJabatan.getSelectedItem().toString();
        String depar = TambahAnggota.cmbDepar.getSelectedItem().toString();
        String prodi = TambahAnggota.cmbProdi.getSelectedItem().toString();
        String fakultas = TambahAnggota.cmbFakultas.getSelectedItem().toString();
        String angkatan = TambahAnggota.cmbAngkatan.getSelectedItem().toString();
        String pass = TambahAnggota.txtpass.getText();
        if (TambahAnggota.rdLaki.isSelected()){
            gender = "Laki-laki";
        }
        else if (TambahAnggota.rdPerempuan.isSelected()){
            gender = "Perempuan";
        }
        mhs mahasiswa = new mhs(idAnggota, jabatan, depar, pass, nomorhp,nama, prodi, fakultas,gender,angkatan);
        if (jabatan.equals("Anggota")){
            Anggota.add(mahasiswa);
        }
        else{
            Petinggi.add(mahasiswa);
        }
        
       MyDB.insertAnggota(nama, nomorhp, gender, jabatan, depar, prodi, fakultas, angkatan, idAnggota, pass);
    }

    static int ubah;
    static String passs;
    @Override
    public void ubahanggota() throws IOException {
        if (DaftarAnggota.cmbJabatan1.getSelectedItem().toString().equals("Anggota")){
            for (int i=0; i <  Anggota.size(); i++){
                if (Anggota.get(i).getId().equals(DaftarAnggota.txtIDAnggota.getText())){
                    String gender = "";
                    String idAnggota = DaftarAnggota.txtIDAnggota.getText();
                    String nama = DaftarAnggota.txtNama.getText();
                    String nomorhp = DaftarAnggota.txtNomorHP.getText();
                    String jabatan = DaftarAnggota.cmbJabatan1.getSelectedItem().toString();
                    String depar = DaftarAnggota.cmbDepar.getSelectedItem().toString();
                    String prodi = DaftarAnggota.cmbProdi.getSelectedItem().toString();
                    String fakultas = DaftarAnggota.cmbFakultas.getSelectedItem().toString();
                    String angkatan = DaftarAnggota.cmbAngkatan.getSelectedItem().toString();
                    String pass = Anggota.get(i).getPass();
                    if (DaftarAnggota.rdLaki1.isSelected()){
                        gender = "Laki-laki";
                    }
                    else if (DaftarAnggota.rdPerempuan1.isSelected()){
                        gender = "Perempuan";
                    }
                    mhs mahasiswa = new mhs(idAnggota, jabatan, depar,pass , nomorhp,nama, prodi, fakultas,gender,angkatan);
                    Anggota.set(i,mahasiswa);
                    MyDB.UpdateAnggota(nama, nomorhp, gender, jabatan, depar, prodi, fakultas, angkatan, idAnggota);
                    ubah = 1;
                }
             

            }
            if (ubah == 0){
                String gender = "";
                    String idAnggota = DaftarAnggota.txtIDAnggota.getText();
                    String nama = DaftarAnggota.txtNama.getText();
                    String nomorhp = DaftarAnggota.txtNomorHP.getText();
                    String jabatan = DaftarAnggota.cmbJabatan1.getSelectedItem().toString();
                    String depar = DaftarAnggota.cmbDepar.getSelectedItem().toString();
                    String prodi = DaftarAnggota.cmbProdi.getSelectedItem().toString();
                    String fakultas = DaftarAnggota.cmbFakultas.getSelectedItem().toString();
                    String angkatan = DaftarAnggota.cmbAngkatan.getSelectedItem().toString();
                    String pass = "123";
                    if (DaftarAnggota.rdLaki1.isSelected()){
                        gender = "Laki-laki";
                    }
                    else if (DaftarAnggota.rdPerempuan1.isSelected()){
                        gender = "Perempuan";
                    }
                    mhs mahasiswa = new mhs(idAnggota, jabatan, depar,pass , nomorhp,nama, prodi, fakultas,gender,angkatan);
                    Anggota.add(mahasiswa);
                    for (int i=0; i <  Petinggi.size(); i++){
                        if (Petinggi.get(i).getId().equals(DaftarAnggota.txtIDAnggota.getText())){
                            Petinggi.remove(i);
                        }
                    }
                    MyDB.UpdateAnggota(nama, nomorhp, gender, jabatan, depar, prodi, fakultas, angkatan, idAnggota);
                    ubah = 1;
            }
        }
        else{
            for (int i=0; i <  Petinggi.size(); i++){
                if (Petinggi.get(i).getId().equals(DaftarAnggota.txtIDAnggota.getText())){
                    String gender = "";
                    String idAnggota = DaftarAnggota.txtIDAnggota.getText();
                    String nama = DaftarAnggota.txtNama.getText();
                    String nomorhp = DaftarAnggota.txtNomorHP.getText();
                    String jabatan = DaftarAnggota.cmbJabatan1.getSelectedItem().toString();
                    String depar = DaftarAnggota.cmbDepar.getSelectedItem().toString();
                    String prodi = DaftarAnggota.cmbProdi.getSelectedItem().toString();
                    String fakultas = DaftarAnggota.cmbFakultas.getSelectedItem().toString();
                    String angkatan = DaftarAnggota.cmbAngkatan.getSelectedItem().toString();
                    String pass = Petinggi.get(i).getPass();
                    if (DaftarAnggota.rdLaki1.isSelected()){
                        gender = "Laki-laki";
                    }
                    else if (DaftarAnggota.rdPerempuan1.isSelected()){
                        gender = "Perempuan";
                    }
                    mhs mahasiswa = new mhs(idAnggota, jabatan, depar,pass , nomorhp,nama, prodi, fakultas,gender,angkatan);
                    Petinggi.set(i,mahasiswa);
                    MyDB.UpdateAnggota(nama, nomorhp, gender, jabatan, depar, prodi, fakultas, angkatan, idAnggota);
                    ubah = 1;
                }
            }
            if (ubah==0){
                    String gender = "";
                    String idAnggota = DaftarAnggota.txtIDAnggota.getText();
                    String nama = DaftarAnggota.txtNama.getText();
                    String nomorhp = DaftarAnggota.txtNomorHP.getText();
                    String jabatan = DaftarAnggota.cmbJabatan1.getSelectedItem().toString();
                    String depar = DaftarAnggota.cmbDepar.getSelectedItem().toString();
                    String prodi = DaftarAnggota.cmbProdi.getSelectedItem().toString();
                    String fakultas = DaftarAnggota.cmbFakultas.getSelectedItem().toString();
                    String angkatan = DaftarAnggota.cmbAngkatan.getSelectedItem().toString();
                    String pass = "123";
                    if (DaftarAnggota.rdLaki1.isSelected()){
                        gender = "Laki-laki";
                    }
                    else if (DaftarAnggota.rdPerempuan1.isSelected()){
                        gender = "Perempuan";
                    }
                    mhs mahasiswa = new mhs(idAnggota, jabatan, depar,pass , nomorhp,nama, prodi, fakultas,gender,angkatan);
                    Petinggi.add(mahasiswa);
                    for (int i=0; i <  Anggota.size(); i++){
                        if (Anggota.get(i).getId().equals(DaftarAnggota.txtIDAnggota.getText())){
                            Anggota.remove(i);
                        }
                    }
                    MyDB.UpdateAnggota(nama, nomorhp, gender, jabatan, depar, prodi, fakultas, angkatan, idAnggota);

            }
        }
        ubah=0;
      
    }

    @Override
    public void hapusanggota() throws IOException {
        String idx =  DaftarAnggota.txtIDAnggota.getText();
            if (DaftarAnggota.cmbJabatan1.getSelectedItem().toString().equals("Anggota")){
                for (int i=0; i <  Anggota.size(); i++){
                    if (Anggota.get(i).getId().equals(idx)){
                        Anggota.remove(i);
                        MyDB.deleteAnggota(idx);
                    }
                }
            }
            else{
                for (int i=0; i <  Petinggi.size(); i++){
                    if (Petinggi.get(i).getId().equals(idx)){
                        Petinggi.remove(i);
                        MyDB.deleteAnggota(idx);
                    }

                }
            }
    }

    @Override
    public void lihatproker() throws IOException {
        DefaultTableModel dtm = (DefaultTableModel) DaftarProker.TabelProker.getModel();
        dtm.setRowCount(0);
        for(Proker pkr: proker){
            dtm.addRow(new Object[]{
            pkr.getId(),
            pkr.getNamaProker(),
            pkr.getDepar(),           
            pkr.getJumlah(),
            pkr.getKet(),
            
            });
        }
    }

    @Override
    public void tambahproker() throws IOException {
        String idproker = TambahProker.txtIDProker.getText();
        String namaProker = TambahProker.txtnamaProker.getText();
        String ket = TambahProker.txtket.getText();
        String depar = TambahProker.cmbDepar.getSelectedItem().toString();
        int jumlah = 0;
        Proker pkr = new Proker(idproker, namaProker, depar, jumlah, ket);
        proker.add(pkr);
       MyDB.insertProker(idproker, namaProker, depar, jumlah, ket);
    }

    @Override
    public void ubahproker() throws IOException {
       
            for (int i=0; i <  proker.size(); i++){
                if (proker.get(i).getId().equals(DaftarProker.txtIDProker.getText())){
                    String idproker = DaftarProker.txtIDProker.getText();
                    String namaProker = DaftarProker.txtnamaProker.getText();
                    String ket = DaftarProker.txtket.getText();
                    String depar = DaftarProker.cmbDepar.getSelectedItem().toString();
                    int jumlah = Integer.parseInt(DaftarProker.txtjumlah.getText());   
                    Proker pkr = new Proker(idproker, namaProker, depar, jumlah, ket);
                    proker.set(i,pkr);
                    MyDB.UpdateProker(idproker, namaProker, depar, jumlah, ket);
                }
            }
    }

    @Override
    public void hapusproker() throws IOException {
        String idx =  DaftarProker.txtIDProker.getText();
            for (int i=0; i <  proker.size(); i++){
                if (proker.get(i).getId().equals(idx)){
                    proker.remove(i);
                    MyDB.deletProker(idx);
                }
            }
    }

    @Override
    public void lihatjadwal() throws IOException {
        DefaultTableModel dtm = (DefaultTableModel) DaftarJadwal.TabelJadwal.getModel();
        dtm.setRowCount(0);
        for(Jadwal jdwl: jadwal){
            dtm.addRow(new Object[]{
            jdwl.getId(),
            jdwl.getDepar(), 
            jdwl.getNamaProker(),    
            jdwl.getTanggal(),
            jdwl.getWaktu(),
            jdwl.getTempat(),
            });
        }
    }

    @Override
    public void ubahjadwal() throws IOException {
        for (int i=0; i <  jadwal.size(); i++){
                if (jadwal.get(i).getId().equals(DaftarJadwal.txtIDJadwal.getText())){
                    String idjadwal = DaftarJadwal.txtIDJadwal.getText();
                    String namajadwal = DaftarJadwal.txtnamaProker.getSelectedItem().toString();
                    String tanggal = DaftarJadwal.txttanggal.getText();
                    String waktu = DaftarJadwal.txtwaktu.getText();
                    String tempat = DaftarJadwal.txttempat.getText();
                    String depar = DaftarJadwal.cmbDepar.getSelectedItem().toString(); 
                    Jadwal jdwl = new Jadwal(idjadwal,namajadwal,depar,tanggal,waktu,tempat);
                    jadwal.set(i,jdwl);
                    MyDB.UpdateJadwal(idjadwal,depar,namajadwal, tanggal, waktu, tempat);
                }

            }
    }

    @Override
    public void tambahjadwal() throws IOException {
        String idjadwal = TambahJadwal.txtIDJadwal.getText();
        String namajadwal = TambahJadwal.txtnamaProker.getSelectedItem().toString();
        String tanggal = TambahJadwal.txttanggal.getText();
        String waktu = TambahJadwal.txtwaktu.getText();
        String tempat = TambahJadwal.txttempat.getText();
        String depar = TambahJadwal.cmbDepar.getSelectedItem().toString();
        
        Jadwal jdwl = new Jadwal(idjadwal,namajadwal,depar,tanggal,waktu,tempat);
        jadwal.add(jdwl);
       MyDB.inserJadwal(idjadwal, depar,namajadwal, tanggal, waktu, tempat);
    }

    @Override
    public void hapusjadwal() throws IOException {
        String idx =  DaftarJadwal.txtIDJadwal.getText();
            for (int i=0; i <  jadwal.size(); i++){
                if (jadwal.get(i).getId().equals(idx)){
                    jadwal.remove(i);
                    MyDB.deleteJadwal(idx);
                }
            }
    }

    @Override
    public void cariAnggota() throws IOException {
        String sql = "SELECT * FROM mhs where nama like '%" + DaftarAnggota.txtcari.getText() + "%'";
        ArrayList<mhs> carii = new ArrayList<mhs>();

        try {
            
            MyDB.rs = MyDB.stmt.executeQuery(sql);
            while (MyDB.rs.next()) {
                int key = MyDB.rs.getInt("key");
                String nama = MyDB.rs.getString("nama");
                String nomorhp = MyDB.rs.getString("nomorHp");
                String jeniskelamin = MyDB.rs.getString("jenis_kel");
                String jabatan = MyDB.rs.getString("jabatan");
                String departemen = MyDB.rs.getString("departemen");
                String prodi = MyDB.rs.getString("prodi");
                String fakultas = MyDB.rs.getString("fakultas");
                String angkatan = MyDB.rs.getString("angkatan");
                String kode = MyDB.rs.getString("kode");
                String pass = MyDB.rs.getString("pass");
                mhs mahasiswa = new mhs(kode,jabatan,departemen,pass,nomorhp,nama,prodi,fakultas,jeniskelamin,angkatan);
                carii.add(mahasiswa);
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        DefaultTableModel dtm = (DefaultTableModel) DaftarAnggota.TabelMhs.getModel();
        dtm.setRowCount(0);
        for(mhs carix: carii){
            
                dtm.addRow(new Object[]{
                carix.getId(),
                carix.getNama(),
                carix.getJenisKelamin(),
                carix.getNomorhp(),
                carix.getJabatan(),
                carix.getDepartemen(),
                carix.getFakultas(),
                carix.getProdi(),
                carix.getAngkatan(),
                });
        }
    }

    @Override
    public void cariProker() throws IOException {
        String sql = "SELECT * FROM proker where nama like '%" + DaftarProker.txtcari.getText() + "%'";
        ArrayList<Proker> carii = new ArrayList<Proker>();

        try {
            
            MyDB.rs = MyDB.stmt.executeQuery(sql);
            while (MyDB.rs.next()) {
                    String nama = MyDB.rs.getString("nama");
                    String departemen = MyDB.rs.getString("depar");
                    String ket = MyDB.rs.getString("ket");
                    int jumlah = MyDB.rs.getInt("jumlah");
                    String kode = MyDB.rs.getString("kode");
                    Proker pkr = new Proker(kode,nama,departemen,jumlah, ket);
                    carii.add(pkr);

            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        DefaultTableModel dtm = (DefaultTableModel) DaftarProker.TabelProker.getModel();
        dtm.setRowCount(0);
        for(Proker carix: carii){
            
                dtm.addRow(new Object[]{
                carix.getId(),
                carix.getNamaProker(),
                carix.getDepar(),           
                carix.getJumlah(),
                carix.getKet(),
            });       
        }

    }

    @Override
    public void cariJadwal() throws IOException {
        String sql = "SELECT * FROM jadwal where nama_proker like '%" + DaftarJadwal.txtcari.getText() + "%'";
        ArrayList<Jadwal> carii = new ArrayList<Jadwal>();

        try {
            
            MyDB.rs = MyDB.stmt.executeQuery(sql);
            while (MyDB.rs.next()) {
                String nama = MyDB.rs.getString("nama_proker");
                    String depar = MyDB.rs.getString("depar");
                    String tanggal = MyDB.rs.getString("tanggal");
                    String waktu = MyDB.rs.getString("waktu");
                    String tempat = MyDB.rs.getString("tempat");
                    String kode = MyDB.rs.getString("kode");
                    Jadwal jdw = new Jadwal(kode,nama,depar,tanggal, waktu, tempat);
                    carii.add(jdw);
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        DefaultTableModel dtm = (DefaultTableModel) DaftarJadwal.TabelJadwal.getModel();
        dtm.setRowCount(0);
        for(Jadwal carix: carii){
            
                dtm.addRow(new Object[]{
                carix.getId(),
                carix.getDepar(), 
                carix.getNamaProker(),    
                carix.getTanggal(),
                carix.getWaktu(),
                carix.getTempat(),
            });       
        }
        
    }
    

    
    
    
}
