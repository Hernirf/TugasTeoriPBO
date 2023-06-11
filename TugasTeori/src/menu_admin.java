


import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Image;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


/**
 *
 * @author USER
 */
public class menu_admin extends javax.swing.JFrame {
    
    
    public menu_admin() {
      
        initComponents();
         LabelNama.setText(mhs.namaLogin.toUpperCase());

       
//        if()
//        scaleimage();
    }
    
//    fungsi mengecilkan size gambar icon
//    public void scaleimage(){
////        String lokasi[]={"C:\\Users\\USER\\Documents\\netbeans projek\\catatan pengeluaran\\catatan_pengeluaran\\src\\catatan_pengeluaran\\gambar\\images.png"};
////        for(int i =0; i<2;i++){
//        ImageIcon icon = new ImageIcon("C:\\Users\\USER\\Documents\\netbeans projek\\catatan pengeluaran\\catatan_pengeluaran\\src\\catatan_pengeluaran\\gambar\\images.png");
//        Image img = icon.getImage();
//        Image imgscale = img.getScaledInstance(100, 100, 100);
//        ImageIcon scaleicon = new ImageIcon(imgscale);
//        jLabel1.setIcon(scaleicon);
//        
//        icon = new ImageIcon("C:\\Users\\USER\\Documents\\netbeans projek\\catatan pengeluaran\\catatan_pengeluaran\\src\\catatan_pengeluaran\\gambar\\dragon-quest-viii-journey-of-the-cursed-king-ps2-cover.jpg");
//        img = icon.getImage();
//        imgscale = img.getScaledInstance(100, 100, 100);
//        scaleicon = new ImageIcon(imgscale);
//        jLabel2.setIcon(scaleicon);
////        }  
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        btnLogout = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mlihat = new java.awt.Button();
        mgoals = new java.awt.Button();
        mubah = new java.awt.Button();
        mkurs = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jabout = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(166, 215, 232));

        jPanel2.setBackground(new java.awt.Color(25, 55, 109));

        label1.setBackground(new java.awt.Color(255, 255, 255));

        btnLogout.setBackground(new java.awt.Color(153, 153, 255));
        btnLogout.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setLabel("LOGOUT");
        btnLogout.setName("mlogout"); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selamat Datang");

        LabelNama.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        LabelNama.setForeground(new java.awt.Color(255, 255, 255));
        LabelNama.setText("NAMA USER");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MENU UTAMA");

        mlihat.setBackground(new java.awt.Color(25, 55, 109));
        mlihat.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mlihat.setForeground(new java.awt.Color(255, 255, 255));
        mlihat.setLabel("DAFTAR ANGGOTA");
        mlihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mlihatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlihatMouseExited(evt);
            }
        });
        mlihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlihatActionPerformed(evt);
            }
        });

        mgoals.setBackground(new java.awt.Color(25, 55, 109));
        mgoals.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mgoals.setForeground(new java.awt.Color(255, 255, 255));
        mgoals.setLabel("LIHAT DATA DIRI");
        mgoals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mgoalsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mgoalsMouseExited(evt);
            }
        });
        mgoals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgoalsActionPerformed(evt);
            }
        });

        mubah.setBackground(new java.awt.Color(25, 55, 109));
        mubah.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        mubah.setForeground(new java.awt.Color(255, 255, 255));
        mubah.setLabel("DAFTAR PROKER");
        mubah.setName("mubah"); // NOI18N
        mubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mubahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mubahMouseExited(evt);
            }
        });
        mubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mubahActionPerformed(evt);
            }
        });

        mkurs.setBackground(new java.awt.Color(25, 55, 109));
        mkurs.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mkurs.setForeground(new java.awt.Color(255, 255, 255));
        mkurs.setLabel("DAFTAR JADWAL");
        mkurs.setName("mkurs"); // NOI18N
        mkurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mkursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mkursMouseExited(evt);
            }
        });
        mkurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mlihat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mkurs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mgoals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mubah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(LabelNama))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelNama)
                        .addGap(33, 33, 33))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(mlihat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(mgoals, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mubah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mkurs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(265, 365));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ABOUT");

        jabout.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jabout);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mkursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkursActionPerformed
        new DaftarJadwal().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_mkursActionPerformed

    private void mkursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkursMouseExited
        // TODO add your handling code here:
        mkurs.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mkursMouseExited

    private void mkursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkursMouseEntered
       jabout.setText("Merupakan menu yang akan menampilkan informasi mengenai daftar jadwal");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); mkurs.setBackground(Color.WHITE);
    }//GEN-LAST:event_mkursMouseEntered

    private void mubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mubahActionPerformed
        new DaftarProker().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mubahActionPerformed

    private void mubahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mubahMouseExited
        // TODO add your handling code here:
        mubah.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mubahMouseExited

    private void mubahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mubahMouseEntered
       jabout.setText("Merupakan menu yang akan menampilkan informasi mengenai daftar proker");

        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); mubah.setBackground(Color.WHITE);
    }//GEN-LAST:event_mubahMouseEntered

    private void mgoalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgoalsActionPerformed

        new menu_akun().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_mgoalsActionPerformed

    private void mgoalsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgoalsMouseExited
        // TODO add your handling code here:
        mgoals.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mgoalsMouseExited

    private void mgoalsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgoalsMouseEntered
        jabout.setText("Merupakan menu yang akan menampilkan informasi mengenai data akun");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);mgoals.setBackground(Color.WHITE);
    }//GEN-LAST:event_mgoalsMouseEntered

    private void mlihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlihatActionPerformed
        new DaftarAnggota().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_mlihatActionPerformed

    private void mlihatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlihatMouseExited
        mlihat.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mlihatMouseExited

    private void mlihatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlihatMouseEntered
        jabout.setText("Merupakan menu yang akan menampilkan informasi mengenai daftar pengurus");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);mlihat.setBackground(Color.WHITE);
    }//GEN-LAST:event_mlihatMouseEntered

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new menu_utama().setVisible(true);
        mhs.Anggota.clear();
        mhs.Petinggi.clear();
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNama;
    private java.awt.Button btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jabout;
    private java.awt.Label label1;
    private java.awt.Button mgoals;
    private java.awt.Button mkurs;
    private java.awt.Button mlihat;
    private java.awt.Button mubah;
    // End of variables declaration//GEN-END:variables
}
