package app;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;

public class SPKu extends javax.swing.JFrame {

    int dtID;
    int ktgID;
    Data data;
    Kategori kategori;

    /**
     * Creates new form SPK
     */
    public SPKu() {
        initComponents();

        setLocationRelativeTo(null);
//        setExtendedState(Frame.MAXIMIZED_BOTH);
        loadKriteria();
        loadAlternatif();
        Normalisasi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnEditKri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKriteria = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnTambahAlt = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlternatif = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        hasilPembobotan1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnNormalisasi1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        hasilPembobotan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSeleksi = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("SELEKSI PENERIMAAN PESERTA DIDIK BARU");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnCari.setText("Cari");

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(873, 50));

        btnEditKri.setText("Edit");
        btnEditKri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditKriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditKri, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(779, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditKri, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        tblKriteria.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKriteria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKriteriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKriteria);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Kriteria", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel7.setPreferredSize(new java.awt.Dimension(873, 50));

        btnTambahAlt.setText("Tambah");
        btnTambahAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahAltActionPerformed(evt);
            }
        });

        btnEdit1.setText("Edit");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambahAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(550, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambahAlt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        tblAlternatif.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAlternatif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlternatifMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAlternatif);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Alternatif", jPanel4);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(873, 50));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 873, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        hasilPembobotan1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(hasilPembobotan1);

        jPanel9.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Normalisasi", jPanel9);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(873, 50));

        btnNormalisasi1.setText("Lakukan Pembobotan Produk Terbaik");
        btnNormalisasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalisasi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNormalisasi1)
                .addContainerGap(654, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNormalisasi1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        hasilPembobotan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(hasilPembobotan);

        jPanel5.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Pembobotan", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        btnSeleksi.setText("Kembali ke Halaman Seleksi");
        btnSeleksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleksiActionPerformed(evt);
            }
        });

        btnHome.setText("Kembali ke Halaman Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSeleksi, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleksi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTrans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrans2ActionPerformed
        // TODO add your handling code here:
        SPK_SAW();
    }//GEN-LAST:event_buttonTrans2ActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        String key = txtCari.getText();
        String where = " WHERE "
                + "nama_menu LIKE '%" + key + "%' OR "
                + "harga_menu LIKE '%" + key + "%' OR "
                + "stok LIKE '%" + key + "%' OR "
                + "jenis_menu_id LIKE '%" + key + "%'";
//        ViewDataMenu(where);
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnTambahAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahAltActionPerformed
        TambahData TM = new TambahData(this, true);
        TM.setVisible(true);
    }//GEN-LAST:event_btnTambahAltActionPerformed

    private void btnEditKriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditKriActionPerformed
        editKtg();
    }//GEN-LAST:event_btnEditKriActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        editAlt();
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusAlt();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnNormalisasi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalisasi1ActionPerformed
        SPK_SAW();
    }//GEN-LAST:event_btnNormalisasi1ActionPerformed

    private void btnSeleksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleksiActionPerformed
        MainClass main = new MainClass();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSeleksiActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Index home = new Index();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void tblAlternatifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlternatifMouseClicked
        int index = tblAlternatif.getSelectedRow();
        if (index != -1) {
            String id = tblAlternatif.getValueAt(index, 0).toString();
            int TheID = Integer.parseInt(id);
            dtID = TheID;

            String nama = tblAlternatif.getValueAt(index, 1).toString();
            String nisn = tblAlternatif.getValueAt(index, 2).toString();
            String indo = tblAlternatif.getValueAt(index, 3).toString();
            String mtk = tblAlternatif.getValueAt(index, 4).toString();
            String ingg = tblAlternatif.getValueAt(index, 5).toString();
            String ipa = tblAlternatif.getValueAt(index, 6).toString();
            String jarak = tblAlternatif.getValueAt(index, 7).toString();

            data = new Data();
            data.setId(id);
            data.setNama(nama);
            data.setNisn(nisn);
            data.setIndo(indo);
            data.setMtk(mtk);
            data.setIngg(ingg);
            data.setIpa(ipa);
            data.setJarak(jarak);
        }

    }//GEN-LAST:event_tblAlternatifMouseClicked

    private void tblKriteriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKriteriaMouseClicked
        int index2 = tblKriteria.getSelectedRow();
        if (index2 != -1) {
            String id = tblKriteria.getValueAt(index2, 0).toString();
            int theID = Integer.parseInt(id);
            ktgID = theID;

            String nama = tblKriteria.getValueAt(index2, 1).toString();
            String bobot = tblKriteria.getValueAt(index2, 2).toString();
            String atribut = tblKriteria.getValueAt(index2, 3).toString();

            kategori = new Kategori();
            kategori.setId(id);
            kategori.setNama(nama);
            kategori.setBobot(bobot);
            kategori.setAtribut(atribut);
        }
    }//GEN-LAST:event_tblKriteriaMouseClicked

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
            java.util.logging.Logger.getLogger(SPKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPKu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnEditKri;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNormalisasi1;
    private javax.swing.JButton btnSeleksi;
    private javax.swing.JButton btnTambahAlt;
    private javax.swing.JTable hasilPembobotan;
    private javax.swing.JTable hasilPembobotan1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAlternatif;
    private javax.swing.JTable tblKriteria;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

    private void loadKriteria() {
        try {
            Object[][] data = null;
            Object[] header = {"ID", "NAMA KRITERIA", "BOBOT", "LABEL"};
            DefaultTableModel model = new DefaultTableModel(data, header);
            tblKriteria.setModel(model);

            //load data from DB
            Connection koneksi = Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            String query = "SELECT * FROM kategori";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String bobot = rs.getString("bobot");
                String label = rs.getString("atribut");
                Object[] d = {id, nama, bobot, label};
                model.addRow(d);
            }
        } catch (Exception e) {

        }
    }

    public void loadAlternatif() {
        try {
            Object[][] data = null;
            Object[] header = {"ID", "NAMA SISWA", "NISN", "NILAI B.INDONESIA", "NILAI MTK", "NILAI B.ING", "NILAI IPA", "JARAK"};
            DefaultTableModel model = new DefaultTableModel(data, header);
            tblAlternatif.setModel(model);

            //load data from DB
            Connection koneksi = Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            String query = "SELECT * FROM calon_siswa";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String nisn = rs.getString("nisn");
                String nilai_indo = rs.getString("nilai_indo");
                String nilai_mtk = rs.getString("nilai_mtk");
                String nilai_ing = rs.getString("nilai_ing");
                String nilai_ipa = rs.getString("nilai_ipa");
                String jarak = rs.getString("jarak");

                Object[] d = {id, nama, nisn, nilai_indo, nilai_mtk, nilai_ing, nilai_ipa, jarak};
                model.addRow(d);
            }
        } catch (Exception e) {

        }
    }

    public void Normalisasi() {
        try {
            Object[][] data = null;
            Object[] header = {"ID", "NAMA SISWA", "NISN", "NILAI B.INDO", "NILAI MTK", "NILAI B.ING", "NILAI IPA", "JARAK"};
            DefaultTableModel model = new DefaultTableModel(data, header);
            hasilPembobotan1.setModel(model);

            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String query = "SELECT * FROM calon_siswa";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String nisn = rs.getString("nisn");

                double nilai_indo = rs.getDouble("nilai_indo");
                double nilai_mtk = rs.getDouble("nilai_mtk");
                double nilai_ing = rs.getDouble("nilai_ing");
                double nilai_ipa = rs.getDouble("nilai_ipa");
                double jarak = rs.getDouble("jarak");

                double pembagi_nilai_indo = label("nilai_indo").equals("cost") ? min("nilai_indo") : max("nilai_indo");
                double pembagi_nilai_mtk = label("nilai_mtk").equals("cost") ? min("nilai_mtk") : max("nilai_mtk");
                double pembagi_nilai_ing = label("nilai_ing").equals("cost") ? min("nilai_ing") : max("nilai_ing");
                double pembagi_nilai_ipa = label("nilai_ipa").equals("cost") ? min("nilai_ipa") : max("nilai_ipa");
                double pembagi_jarak = label("jarak").equals("cost") ? min("jarak") : max("jarak");

                double norm_nilai_indo = label("nilai_indo").equals("cost") ? min("nilai_indo") / nilai_indo : nilai_indo / max("nilai_indo");
                double norm_nilai_mtk = label("nilai_mtk").equals("cost") ? min("nilai_mtk") / nilai_mtk : nilai_mtk / max("nilai_mtk");
                double norm_nilai_ing = label("nilai_ing").equals("cost") ? min("nilai_ing") / nilai_ing : nilai_ing / max("nilai_ing");
                double norm_nilai_ipa = label("nilai_ipa").equals("cost") ? min("nilai_ipa") / nilai_ipa : nilai_ipa / max("nilai_ipa");
                double norm_jarak = label("jarak").equals("cost") ? min("jarak") / jarak : jarak / max("jarak");

                Object[] rowData = {id, nama, nisn, norm_nilai_indo, norm_nilai_mtk, norm_nilai_ing, norm_nilai_ipa, norm_jarak};
                model.addRow(rowData);

            }
        } catch (Exception e) {
        }
    }

    public void SPK_SAW() {
        try {
            //List<Double> hasil_saw = new ArrayList<>();
            Object[] header = {"NO", "NAMA SISWA", "SKOR"};
            Object[][] data = null;
            DefaultTableModel model = new DefaultTableModel(data, header);
            hasilPembobotan.setModel(model);
            int nomor = 0;

            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String query = "SELECT * FROM calon_siswa";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                double nilai_indo = rs.getDouble("nilai_indo");
                double nilai_mtk = rs.getDouble("nilai_mtk");
                double nilai_ing = rs.getDouble("nilai_ing");
                double nilai_ipa = rs.getDouble("nilai_ipa");
                double jarak = rs.getDouble("jarak");

                double norm_nilai_indo = label("nilai_indo").equals("cost") ? min("nilai_indo") / nilai_indo : nilai_indo / max("nilai_indo");
                double norm_nilai_mtk = label("nilai_mtk").equals("cost") ? min("nilai_mtk") / nilai_mtk : nilai_mtk / max("nilai_mtk");
                double norm_nilai_ing = label("nilai_ing").equals("cost") ? min("nilai_ing") / nilai_ing : nilai_ing / max("nilai_ing");
                double norm_nilai_ipa = label("nilai_ipa").equals("cost") ? min("nilai_ipa") / nilai_ipa : nilai_ipa / max("nilai_ipa");
                double norm_jarak = label("jarak").equals("cost") ? min("jarak") / jarak : jarak / max("jarak");

                double hasil = (bobot("nilai_indo") * norm_nilai_indo) + (bobot("nilai_mtk") * norm_nilai_mtk) + (bobot("nilai_ing") * norm_nilai_ing) + (bobot("nilai_ipa") * norm_nilai_ipa) + (bobot("jarak") * norm_jarak);
                //hasil_saw.add(hasil);   
                nomor++;

                String nama_alt = rs.getString("nama");
                Object[] rowData = {nomor, nama_alt, hasil};
                model.addRow(rowData);

            }
            //double max = Collections.max(hasil_saw);
            //System.out.println(max);
        } catch (Exception e) {
        }
    }

    private double min(String kolom) {
        double min = 0;
        try {
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String query = "SELECT MIN(" + kolom + ") AS min_kolom FROM calon_siswa";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                min = rs.getDouble("min_kolom");
            }
            return min;

        } catch (SQLException e) {
        }
        return min;
    }

    private double max(String kolom) {
        double max = 0;
        try {
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String query = "SELECT MAX(" + kolom + ") AS max_kolom FROM calon_siswa";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                max = rs.getDouble("max_kolom");
            }
            return max;

        } catch (SQLException e) {
        }
        return max;
    }

    private String label(String kolom) {
        String label = "cost";
        try {
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String query = "SELECT label FROM kategori WHERE nama='" + kolom + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                label = rs.getString("atribut");
            }
            return label;

        } catch (SQLException e) {
        }
        return label;
    }

    private double bobot(String kolom) {
        double bobot = 0;
        try {
            Connection c = Koneksi.konekKeDB();
            Statement st = c.createStatement();
            String query = "SELECT bobot FROM kategori WHERE nama='" + kolom + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                bobot = rs.getDouble("bobot");
            }
            return bobot;

        } catch (SQLException e) {
        }
        return bobot;
    }

    private void hapusAlt() {
        if (dtID > 0) {
            try {
                Object[] tombol = {"YA", "Tidak"};
                int option = JOptionPane.showOptionDialog(this,
                        "Apakah anda ingin menghapus data?",
                        "Konfirmasi",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, tombol, 0);
                if (option == 0) {
                    //YA
                    //YES
                    Connection c = Koneksi.konekKeDB();
                    Statement st = c.createStatement();
                    String sql = "DELETE FROM calon_siswa WHERE id='" + dtID + "'";
                    //eksekusi query
                    st.executeUpdate(sql);
                    //refresh view table
                    loadAlternatif();
                    JOptionPane.showMessageDialog(this, "Data telah dihapus");
                }
            } catch (HeadlessException | SQLException e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih Data");
        }
    }

    private void editAlt() {
        if (dtID > 0) {
            EditData edit = new EditData(this, true);
            edit.dt = data;
            edit.setVisible(true);
        }
    }

    private void editKtg() {
        if (ktgID > 0) {
            EditKategori edit = new EditKategori(this, true);
            edit.ktgr = kategori;
            edit.setVisible(true);
        }
    }
}
