
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SatisPaneli extends javax.swing.JFrame {

    Db db = new Db();

    public SatisPaneli() {
        initComponents();
        dataGetir();
        dataGetirSiparis();
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtAramaAdi = new javax.swing.JTextField();
        txtAramaSoyadi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSeciliSil = new javax.swing.JButton();
        btnTumSil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusteriler = new javax.swing.JTable();
        btnEkle = new javax.swing.JButton();
        btnDuzenle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnYenile = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSiparis = new javax.swing.JTable();
        btnYeniSiparis = new javax.swing.JButton();
        btnSiparisGor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnİletildi = new javax.swing.JButton();
        btnİletilmedi = new javax.swing.JButton();
        btnYolda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Su Satış Otomasyonu");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Arama"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Müşteri Adı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Müşteri Soyadı");

        btnAra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seaaaarch.png"))); // NOI18N
        btnAra.setText("Ara");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAramaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAramaSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAramaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAramaSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnAra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablo İşlemleri"));

        btnSeciliSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deleeeeteee.png"))); // NOI18N
        btnSeciliSil.setText("Seçili Olanı Sil");
        btnSeciliSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeciliSilActionPerformed(evt);
            }
        });

        btnTumSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/alldelete.png"))); // NOI18N
        btnTumSil.setText("Tümünü Sil");
        btnTumSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTumSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSeciliSil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTumSil)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeciliSil, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(btnTumSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteriler"));

        tblMusteriler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMusteriler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusterilerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMusteriler);

        btnEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        btnDuzenle.setText("Düzenle");
        btnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzenleActionPerformed(evt);
            }
        });

        btnSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnYenile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refressssh.png"))); // NOI18N
        btnYenile.setText("Yenile");
        btnYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnYenile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnYenile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Siparişler"));

        tblSiparis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSiparis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSiparisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSiparis);

        btnYeniSiparis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/order.png"))); // NOI18N
        btnYeniSiparis.setText("Yeni Sipariş");
        btnYeniSiparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniSiparisActionPerformed(evt);
            }
        });

        btnSiparisGor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/show (2).png"))); // NOI18N
        btnSiparisGor.setText("Bugünün Siparişlerini Görüntüle");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnYeniSiparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiparisGor, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYeniSiparis, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiparisGor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Sipariş Durumu"));

        btnİletildi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iletildi.png"))); // NOI18N
        btnİletildi.setText("İletildi");
        btnİletildi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnİletildiActionPerformed(evt);
            }
        });

        btnİletilmedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iletilmedi.png"))); // NOI18N
        btnİletilmedi.setText("İletilmedi");
        btnİletilmedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnİletilmediActionPerformed(evt);
            }
        });

        btnYolda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/local.png"))); // NOI18N
        btnYolda.setText("Yolda");
        btnYolda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYoldaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnİletildi)
                .addGap(7, 7, 7)
                .addComponent(btnİletilmedi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnYolda, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnİletildi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnİletilmedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYolda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        Ekle ekle = new Ekle();
        ekle.setVisible(true);
        ekle.parenSatisPaneli = this;
        dispose();
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzenleActionPerformed
        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        }else {
        Duzenle dz = new Duzenle(mid);
        dz.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_btnDuzenleActionPerformed
    String mid = "";
    int row;
    private void tblMusterilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusterilerMouseClicked
        midd = "";
        row = tblMusteriler.getSelectedRow();
        if (row > -1) {
            mid = "" + tblMusteriler.getValueAt(row, 0);
            System.out.println("mid : " + mid);
            dataGetirSiparis();
        }
    }//GEN-LAST:event_tblMusterilerMouseClicked

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        }else {
            int cevap = JOptionPane.showConfirmDialog(rootPane, "Kayıtlar geri alınamaz, silmek istediğinize emin misiniz?", "Silme İşlemi", JOptionPane.YES_NO_OPTION);        
         if (cevap == 0){
            try {
                String silQuery = "delete from musteriler where musteriID = '" + mid + "' ";
                int silSonuc = db.baglan().executeUpdate(silQuery);
                if (silSonuc > 0) {
                    dataGetir();
                    JOptionPane.showMessageDialog(rootPane, "Silme işlemi başarılı");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Silme hatası !");
                }
            } catch (Exception e) {
                System.err.println("Silme hatası : " + e);
            
            } finally {
                db.kapat();  
        }
        } 
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnSeciliSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeciliSilActionPerformed
        if (midd.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        } else {
            int cevap = JOptionPane.showConfirmDialog(rootPane, "Kayıtlar geri alınamaz, silmek istediğinize emin misiniz?", "Silme İşlemi", JOptionPane.YES_NO_OPTION);        
         if (cevap == 0){
            try {
                String silQuery = "delete from siparisler where siparisID = '" + midd + "' ";
                int silSonuc = db.baglan().executeUpdate(silQuery);
                if (silSonuc > 0) {
                    dataGetirSiparis();
                    JOptionPane.showMessageDialog(rootPane, "Silme işlemi başarılı");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Silme hatası !");
                }
            } catch (Exception e) {
                System.err.println("Silme hatası : " + e);
            } finally {
                db.kapat();
            }
         }
        }
    }//GEN-LAST:event_btnSeciliSilActionPerformed
String midd = "";
int roww;
    private void tblSiparisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSiparisMouseClicked
        mid = "";
        roww = tblSiparis.getSelectedRow();
        if (roww > -1) {
            midd = "" + tblSiparis.getValueAt(roww, 0);
            System.out.println("mid : " + midd);
            dataGetir();
        }
    }//GEN-LAST:event_tblSiparisMouseClicked

    private void btnTumSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTumSilActionPerformed
      int cevap = JOptionPane.showConfirmDialog(rootPane, "Kayıtlar geri alınamaz, silmek istediğinize emin misiniz?", "Silme İşlemi", JOptionPane.YES_NO_OPTION);        
         if (cevap == 0){
        try {
            String silQuery = "delete from siparisler ";
            int silSonuc = db.baglan().executeUpdate(silQuery);
            if (silSonuc > 0) {
                dataGetirSiparis();
                JOptionPane.showMessageDialog(rootPane, "Silme işlemi başarılı");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Silme hatası !");
            }
        } catch (Exception e) {
            System.err.println("Silme hatası : " + e);
        } finally {
            db.kapat();
        } 
         }
    }//GEN-LAST:event_btnTumSilActionPerformed

    private void btnYeniSiparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniSiparisActionPerformed
        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        } else {
        YeniSiparis ys = new YeniSiparis(mid);
        ys.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_btnYeniSiparisActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        String adi,soyadi;
        adi = txtAramaAdi.getText();
        soyadi = txtAramaSoyadi.getText();
        try {
            DefaultTableModel dtm2 = new DefaultTableModel();
            dtm2.addColumn("ID");
            dtm2.addColumn("Adı");
            dtm2.addColumn("Soyadı");
            dtm2.addColumn("Telefon");
            dtm2.addColumn("Adres");
            ResultSet rs = db.baglan().executeQuery("select * from musteriler where musteriAdi= '" + adi + "' or musteriSoyadi= '" + soyadi + "' ");
            while(rs.next()) {
             if (adi.equals(rs.getString("musteriAdi")) || soyadi.equals(rs.getString("musteriSoyadi"))){   
                dtm2.addRow(new String [] {rs.getString("musteriID"), rs.getString("musteriAdi"), rs.getString("musteriSoyadi"), rs.getString("musteriTelefon") , rs.getString("musteriAdres") });
             }    
            }
            tblMusteriler.setModel(dtm2);
        } catch (Exception e) {
            System.err.println("hata : " + e);       
        }         
    }//GEN-LAST:event_btnAraActionPerformed

    private void btnİletildiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnİletildiActionPerformed

        if (midd.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        } else {
        String iletildi = "İletildi";        
        try {
        String qq = "update siparisler set teslimatDurumu  = '"+iletildi+"' where siparisID = '"+ midd +"'";
            System.out.println(qq);
        int ilet = db.baglan().executeUpdate(qq);
        if (ilet > 0 ) {
            dataGetirSiparis();
        }
        }  catch (Exception e) {
            System.err.println("İletilme Hatası : " + e);
        } finally {
            db.kapat();
        }
       }
        
    }//GEN-LAST:event_btnİletildiActionPerformed

    private void btnİletilmediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnİletilmediActionPerformed
            if (midd.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        } else {
        String iletilmedi = "İletilmedi";        
        try {
        String qq = "update siparisler set teslimatDurumu  = '"+iletilmedi+"' where siparisID = '"+ midd +"'";
            System.out.println(qq);
        int ilet = db.baglan().executeUpdate(qq);
        if (ilet > 0 ) {
            dataGetirSiparis();
        }
        }  catch (Exception e) {
            System.err.println("İletilmedi Hatası : " + e);
        } finally {
            db.kapat();
        }
       }
    }//GEN-LAST:event_btnİletilmediActionPerformed

    private void btnYoldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYoldaActionPerformed
        if (midd.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        } else {
        String yolda = "Yolda";        
        try {
        String qq = "update siparisler set teslimatDurumu  = '"+yolda+"' where siparisID = '"+ midd +"'";
            System.out.println(qq);
        int ilet = db.baglan().executeUpdate(qq);
        if (ilet > 0 ) {
            dataGetirSiparis();
        }
        }  catch (Exception e) {
            System.err.println("Yolda Hatası : " + e);
        } finally {
            db.kapat();
        }
       }
    }//GEN-LAST:event_btnYoldaActionPerformed

    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        dataGetir();
    }//GEN-LAST:event_btnYenileActionPerformed

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
            java.util.logging.Logger.getLogger(SatisPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SatisPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SatisPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SatisPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SatisPaneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnSeciliSil;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnSiparisGor;
    private javax.swing.JButton btnTumSil;
    private javax.swing.JButton btnYeniSiparis;
    private javax.swing.JButton btnYenile;
    private javax.swing.JButton btnYolda;
    private javax.swing.JButton btnİletildi;
    private javax.swing.JButton btnİletilmedi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMusteriler;
    private javax.swing.JTable tblSiparis;
    private javax.swing.JTextField txtAramaAdi;
    private javax.swing.JTextField txtAramaSoyadi;
    // End of variables declaration//GEN-END:variables
public void dataGetir() {
        try {
            String musteriQuery = "select *from musteriler";
            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("ID");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("Adres");

            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("musteriID"), rs.getString("musteriAdi"), rs.getString("musteriSoyadi"), rs.getString("musteriTelefon"), rs.getString("musteriAdres")});
            }
            tblMusteriler.setModel(dtm);

        } catch (SQLException e) {
            System.err.println("Data Getirme Hatası : " + e);
        } finally {
            db.kapat();
        }
    }

    public void dataGetirSiparis() {

        try {
            String siparisQuery = "select * from siparisler inner join musteriler where siparisler.musteriID = musteriler.musteriID ";
            ResultSet rs1 = db.baglan().executeQuery(siparisQuery);
            DefaultTableModel dtm1 = new DefaultTableModel();
            dtm1.addColumn("ID");
            dtm1.addColumn("Adı");
            dtm1.addColumn("Soyadı");
            dtm1.addColumn("Teslimat Durumu");
            dtm1.addColumn("Adres");
            dtm1.addColumn("Tutar");
            while (rs1.next()) {
                dtm1.addRow(new String[]{rs1.getString("siparisID"), rs1.getString("musteriAdi"), rs1.getString("musteriSoyadi"), rs1.getString("teslimatDurumu"), rs1.getString("musteriAdres"), rs1.getString("tutar")});
            }
            tblSiparis.setModel(dtm1);
        } catch (Exception ex) {
            System.err.println("Siparis Datası Hatası : " + ex);
        } finally {
            db.kapat();
        }
    }
}
