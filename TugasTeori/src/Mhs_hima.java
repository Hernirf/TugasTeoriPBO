
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */







public interface Mhs_hima {
     public void login() throws IOException;
     public void lihatanggota() throws IOException;
     public void tambahanggota() throws IOException;
     public void ubahanggota() throws IOException;
     public void hapusanggota() throws IOException;
     public void lihatproker() throws IOException;
     public void tambahproker() throws IOException;
     public void ubahproker() throws IOException;
     public void hapusproker() throws IOException;
     public void lihatjadwal() throws IOException;
     public void ubahjadwal() throws IOException;
     public void tambahjadwal() throws IOException;
     public void hapusjadwal() throws IOException;
     public void cariAnggota() throws IOException;
     public void cariProker() throws IOException;
     public void cariJadwal() throws IOException;


    
}
