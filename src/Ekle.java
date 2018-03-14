
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ekle extends javax.swing.JFrame {
   Db db = new Db();
   SatisPaneli panel = new SatisPaneli();

    public Ekle() {
        initComponents();
    }
    public SatisPaneli parenSatisPaneli;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtAdres = new javax.swing.JTextField();
        btnKaydet = new javax.swing.JButton();
        resimGoster = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Müşteri Kayıt");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Adı");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 40, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Soyadı");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 68, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Telefon");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 106, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Adres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 141, 36, 20));
        jPanel1.add(txtAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 27, 170, -1));
        jPanel1.add(txtSoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 65, 170, -1));
        jPanel1.add(txtTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 103, 170, -1));
        jPanel1.add(txtAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 141, 170, -1));

        btnKaydet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        jPanel1.add(btnKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 180, 110, 38));

        resimGoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/su.jpg"))); // NOI18N
        jPanel1.add(resimGoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed

        String musteriAdi = txtAdi.getText().trim();
        String musteriSoyadi = txtSoyadi.getText().trim();
        String musteriTelefon = txtTelefon.getText().trim();
        String musteriAdres = txtAdres.getText().trim();
        if ((adSoyadValidator(musteriAdi) && adSoyadValidator(musteriSoyadi)) && telefonValidator(musteriTelefon)) {  
            if (musteriAdi.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Müşterinin Adını Giriniz.");
                txtAdi.requestFocus();
            } else if (musteriSoyadi.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Müşterinin Soyadını Giriniz.");
                txtSoyadi.requestFocus();
            } else if (musteriTelefon.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Müşterinin Telefonunu Giriniz");
                txtTelefon.requestFocus();
            } else if (musteriAdres.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Müşterinin Adresini Giriniz");
                txtAdres.requestFocus();
            } else {
                try {
                    String yazQuery = "insert into musteriler values(null, '" + musteriAdi + "' , '" + musteriSoyadi + "' ,'" + musteriTelefon + "' , '" + musteriAdres + "')";
                    int yazSonuc = db.baglan().executeUpdate(yazQuery);

                    if (yazSonuc > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Kayıt İşlemi Başarılı");
                        txtAdi.setText("");
                        txtSoyadi.setText("");
                        txtTelefon.setText("");
                        txtAdres.setText("");
                        txtAdi.requestFocus();

                        int cevap = JOptionPane.showConfirmDialog(rootPane, "Yeni Kayıt Girmek İster misiniz?", "Yeni Kayıt İşlemi", JOptionPane.YES_NO_OPTION);
                        if (cevap == 0) {
                            txtAdi.setText("");
                            txtSoyadi.setText("");
                            txtTelefon.setText("");
                            txtAdres.setText("");
                            txtAdi.requestFocus();
                        } else {
                            dispose();
                            panel.setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Kayıt İşlemi Başarısız Oldu. Lütfen Tekrar Deneyiniz.");
                    }
                } catch (SQLException ex) {
                    System.err.println("Kayıt Hatası : " + ex);
                } finally {
                    db.kapat();
                    panel.dataGetir();
                }
            }
        }
    }//GEN-LAST:event_btnKaydetActionPerformed
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        panel.dataGetir();
        panel.setVisible(true);
    }//GEN-LAST:event_formWindowClosed
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
            java.util.logging.Logger.getLogger(Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resimGoster;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables

    public boolean adSoyadValidator(String ad) {
        for (char harf : ad.toCharArray()) {
            if (Character.isDigit(harf) || Character.isWhitespace(harf)) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen harf giriniz.");
                return false;
            } 
        } return true;
    }
    
    public boolean telefonValidator(String telefon) {
      if(telefon.length() == 10) {
        for (char sayi : telefon.toCharArray()) {
            if (Character.isLetter(sayi) || Character.isWhitespace(sayi)) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen rakam giriniz.");
                return false;
            } 
        } return true;
    } else if (telefon.length() != 10) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen 10 haneli telefon numarası giriniz");
            } return false;
    } 
}
