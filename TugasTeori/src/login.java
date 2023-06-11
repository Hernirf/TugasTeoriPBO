 
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    public login() {
       new MyDB();
       initComponents();
        
    }
    
    public void navigatelogin(){
        new menu_utama().setVisible(true);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        llogin2 = new java.awt.Button();
        lusername = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        txtRegistrasi = new javax.swing.JLabel();
        lpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(166, 215, 232));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        llogin2.setBackground(new java.awt.Color(87, 108, 189));
        llogin2.setForeground(new java.awt.Color(255, 255, 255));
        llogin2.setLabel("Login");
        llogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llogin2ActionPerformed(evt);
            }
        });

        lusername.setText("USERNAME");
        lusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lusernameMouseClicked(evt);
            }
        });
        lusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lusernameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        txtRegistrasi.setBackground(new java.awt.Color(87, 108, 189));
        txtRegistrasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRegistrasi.setForeground(new java.awt.Color(87, 108, 189));
        txtRegistrasi.setText("KEMBALI");
        txtRegistrasi.setToolTipText("");
        txtRegistrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegistrasiMouseClicked(evt);
            }
        });

        lpass.setText("jPasswordField1");
        lpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lpass, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lusername, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(txtRegistrasi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addComponent(lusername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lpass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(llogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(txtRegistrasi)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lusernameActionPerformed

    }//GEN-LAST:event_lusernameActionPerformed

    private void txtRegistrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrasiMouseClicked
        navigatelogin();
    }//GEN-LAST:event_txtRegistrasiMouseClicked

    private void llogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llogin2ActionPerformed
        int kondisi=0;
         String username = lusername.getText().toLowerCase();
         String pass = lpass.getText().toLowerCase();
         
       for(int i=0; i <  mhs.Anggota.size(); i++){
            if (username.equals(mhs.Anggota.get(i).getNama().toLowerCase()) && pass.equals(mhs.Anggota.get(i).getPass().toLowerCase())){
                kondisi =1;
                mhs.namaLogin = mhs.Anggota.get(i).getNama();                
                mhs.kodelogin = mhs.Anggota.get(i).getId();
                mhs.roleLogin = mhs.Anggota.get(i).getJabatan();

                new menu_admin().setVisible(true);
                lusername.setText(""); 
                lpass.setText("");           
                this.dispose();
                return;
            }
        } 
        for(int i=0; i <  mhs.Petinggi.size(); i++){
            if (username.equals(mhs.Petinggi.get(i).getNama().toLowerCase()) && pass.equals(mhs.Petinggi.get(i).getPass().toLowerCase())){
                kondisi =1;
                mhs.namaLogin = mhs.Petinggi.get(i).getNama();
                mhs.kodelogin = mhs.Petinggi.get(i).getId();
                mhs.roleLogin = mhs.Petinggi.get(i).getJabatan();
                new menu_admin().setVisible(true);
                lusername.setText(""); 
                lpass.setText("");     
                this.dispose();

                return;
            }
        } 
        if (kondisi==0){
            JOptionPane.showMessageDialog(this,"Password dan Username anda salah");
            lusername.setText(""); 
            lpass.setText("");  
        }    
    }//GEN-LAST:event_llogin2ActionPerformed

    private void lusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lusernameMouseClicked
        lusername.setText("");
    }//GEN-LAST:event_lusernameMouseClicked

    private void lpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpassMouseClicked
        lpass.setText("");
    }//GEN-LAST:event_lpassMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Button llogin2;
    public javax.swing.JPasswordField lpass;
    public java.awt.TextField lusername;
    private javax.swing.JLabel txtRegistrasi;
    // End of variables declaration//GEN-END:variables
}
