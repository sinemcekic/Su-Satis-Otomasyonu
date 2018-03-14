
import java.sql.ResultSet;

public class Duzenle extends javax.swing.JFrame {
    String id = "";
    Db db = new Db();
    
    public Duzenle(String id) {
        this.id = id;
        initComponents();
        try {
            String q = "select *from musteriler where musteriID = '"+id+"'";
            ResultSet rs = db.baglan().executeQuery(q);
            if(rs.next()) { // yukarıdaki sorgudan eb az bir adet var mı ?
                txtDuzenleAdi.setText(rs.getString("musteriAdi"));
                txtDuzenleSoyadi.setText(rs.getString("musteriSoyadi"));
                txtDuzenleTelefon.setText(rs.getString("musteriTelefon"));
                txtDuzenleAdres.setText(rs.getString("musteriAdres")); 
            }
        } catch (Exception e) {
        }finally {
            db.kapat();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDuzenleAdi = new javax.swing.JTextField();
        txtDuzenleSoyadi = new javax.swing.JTextField();
        txtDuzenleAdres = new javax.swing.JTextField();
        txtDuzenleTelefon = new javax.swing.JTextField();
        btnDuzenle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Müşteri Bilgilerini Düzenleme");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Adı");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Soyadı");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Adres");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Telefon");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel2.add(txtDuzenleAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 180, -1));
        jPanel2.add(txtDuzenleSoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, -1));
        jPanel2.add(txtDuzenleAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, -1));
        jPanel2.add(txtDuzenleTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, -1));

        btnDuzenle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_1.png"))); // NOI18N
        btnDuzenle.setText("Duzenle");
        btnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzenleActionPerformed(evt);
            }
        });
        jPanel2.add(btnDuzenle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/su.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzenleActionPerformed
        String adi = txtDuzenleAdi.getText().trim();
        String soyadi = txtDuzenleSoyadi.getText().trim();
        String telefon = txtDuzenleTelefon.getText().trim();
        String adres = txtDuzenleAdres.getText().trim();
        try {
            String q = "update musteriler set musteriAdi = '"+adi+"', "
                    + "musteriSoyadi = '"+soyadi+"', musteriTelefon = '"+telefon+"', "
                    + "musteriAdres = '"+adres+"' where musteriID = '"+id+"'";
            int duzenle = db.baglan().executeUpdate(q);
            if (duzenle > 0) {
                dispose();
                SatisPaneli sp = new SatisPaneli();
                sp.setVisible(true);
            }
        } catch (Exception e) {
            System.err.println("Düzenleme Hatası : " + e);
        }finally {
            db.kapat();
        }
    }//GEN-LAST:event_btnDuzenleActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      SatisPaneli sp = new SatisPaneli();
        sp.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Duzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Duzenle("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDuzenleAdi;
    private javax.swing.JTextField txtDuzenleAdres;
    private javax.swing.JTextField txtDuzenleSoyadi;
    private javax.swing.JTextField txtDuzenleTelefon;
    // End of variables declaration//GEN-END:variables
}
