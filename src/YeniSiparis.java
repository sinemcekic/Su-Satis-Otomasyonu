
import com.sun.corba.se.impl.orbutil.fsm.StateEngineImpl;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class YeniSiparis extends javax.swing.JFrame {

    Db db = new Db();
    SatisPaneli panel = null;
    String id = "";

    public YeniSiparis(String id) {
        this.id = id;
        initComponents();
        try {
            String q = "select * from musteriler where musteriID = '" + id + "'";
            ResultSet rs = db.baglan().executeQuery(q);
            if (rs.next()) {
                txtSipAdi.setText(rs.getString("musteriAdi"));
                txtSipSoyadi.setText(rs.getString("musteriSoyadi"));
                txtSipAdres.setText(rs.getString("musteriAdres"));
            }
        } catch (Exception e) {
            System.err.println("Yeni Sipariş Hatası :  " + e);
        } finally {
            db.kapat();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSipAdi = new javax.swing.JTextField();
        txtSipSoyadi = new javax.swing.JTextField();
        txtSipAdres = new javax.swing.JTextField();
        txtSipTutar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSipKaydet = new javax.swing.JButton();
        resimGoster = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sipariş Kayıt");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSipAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSipAdiActionPerformed(evt);
            }
        });
        jPanel1.add(txtSipAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, -1));
        jPanel1.add(txtSipSoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, -1));
        jPanel1.add(txtSipAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));
        jPanel1.add(txtSipTutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Adı");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Soyadı");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Adres");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tutar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 20));

        btnSipKaydet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSipKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btnSipKaydet.setText("Kaydet");
        btnSipKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSipKaydetActionPerformed(evt);
            }
        });
        jPanel1.add(btnSipKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 180, -1, -1));

        resimGoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/su.jpg"))); // NOI18N
        resimGoster.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(resimGoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 300, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSipAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSipAdiActionPerformed

    }//GEN-LAST:event_txtSipAdiActionPerformed

    private void btnSipKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSipKaydetActionPerformed
        String ad = txtSipAdi.getText().trim();
        String soyadi = txtSipSoyadi.getText().trim();
        String adres = txtSipAdres.getText().trim();
        String tutar = txtSipTutar.getText().trim();
        String teslimatDurumu = "Hazırlanıyor";
        Ekle ekle = new Ekle();
        if ((ekle.adSoyadValidator(ad) && ekle.adSoyadValidator(soyadi)) && tutarValidator(tutar)) {
            if (ad.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Müşterinin Adını Giriniz.");
                txtSipAdi.requestFocus();
            } else if (soyadi.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Müşterinin Soyadını Giriniz.");
                txtSipSoyadi.requestFocus();
            } else if (adres.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Müşterinin Telefonunu Giriniz");
                txtSipAdres.requestFocus();
            } else {
                try {
                    String q = "insert into siparisler values(null,  '" + teslimatDurumu + "',  '" + tutar + "',  '" + id + "')";
                    int yeniSiparis = db.baglan().executeUpdate(q);
                    if (yeniSiparis > 0) {
                        dispose();
                        panel = new SatisPaneli();
                        panel.setVisible(true);
                    }
                } catch (Exception e) {
                    System.err.println("Sipariş Kayıt Hatası : " + e);
                } finally {
                    db.kapat();
                }
            }
        }
    }//GEN-LAST:event_btnSipKaydetActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

      panel.setVisible(true);
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
            java.util.logging.Logger.getLogger(YeniSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YeniSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YeniSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YeniSiparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YeniSiparis("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSipKaydet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resimGoster;
    private javax.swing.JTextField txtSipAdi;
    private javax.swing.JTextField txtSipAdres;
    private javax.swing.JTextField txtSipSoyadi;
    private javax.swing.JTextField txtSipTutar;
    // End of variables declaration//GEN-END:variables
    public boolean tutarValidator(String tutar) {
        for (char sayi : tutar.toCharArray()) {
            if (Character.isLetter(sayi) || Character.isWhitespace(sayi)) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen rakam giriniz.");
                return false;
            }
        }
        return true;
    }
}
