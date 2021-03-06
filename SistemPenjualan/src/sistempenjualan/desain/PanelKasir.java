/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenjualan.desain;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author USER
 */
public class PanelKasir extends javax.swing.JFrame {

    public PanelKasir() {
        initComponents();
        setWaktu();
    }

    public void setWaktu() {
        Date ys = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        tanggalField.setText(s.format(ys));
    }
    
        public JTable getTabelKasir() {
        return tabelKasir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKasir = new javax.swing.JTable();
        kodeBarangLabel = new javax.swing.JLabel();
        namaBarangLabel = new javax.swing.JLabel();
        jumlahLabel = new javax.swing.JLabel();
        totalHargaLabel = new javax.swing.JLabel();
        kasirLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        tambahButton = new javax.swing.JButton();
        bayarButton = new javax.swing.JButton();
        kodeField = new javax.swing.JTextField();
        barangField = new javax.swing.JTextField();
        jumlahField = new javax.swing.JTextField();
        tanggalField = new javax.swing.JTextField();
        totalHargaField = new javax.swing.JTextField();
        kasirField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Penjualan MultiRasa");

        tabelKasir.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelKasir);

        kodeBarangLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kodeBarangLabel.setText("Kode Barang");

        namaBarangLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namaBarangLabel.setText("Nama Barang");

        jumlahLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jumlahLabel.setText("Jumlah");

        totalHargaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalHargaLabel.setText("Total Harga");

        kasirLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kasirLabel.setText("Nama Kasir");

        tanggalLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tanggalLabel.setText("Tanggal");

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        bayarButton.setText("Bayar");
        bayarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(kasirLabel)
                .addGap(18, 18, 18)
                .addComponent(kasirField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namaBarangLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(barangField)
                                    .addComponent(kodeField)
                                    .addComponent(jumlahField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(kodeBarangLabel)
                            .addComponent(jumlahLabel))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(tambahButton)
                                .addGap(18, 18, 18)
                                .addComponent(bayarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tanggalLabel)
                                    .addComponent(totalHargaLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalHargaField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tanggalField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kasirLabel)
                    .addComponent(kasirField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeBarangLabel)
                    .addComponent(kodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggalLabel)
                    .addComponent(tanggalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaBarangLabel)
                    .addComponent(barangField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalHargaLabel)
                    .addComponent(totalHargaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahLabel)
                    .addComponent(jumlahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahButton)
                    .addComponent(bayarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Data berhasil masuk", "MultiRasa", 1);
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void bayarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Popup Pembayaran", "MultiRasa", 1);
    }//GEN-LAST:event_bayarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PanelKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barangField;
    private javax.swing.JButton bayarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahField;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JTextField kasirField;
    private javax.swing.JLabel kasirLabel;
    private javax.swing.JLabel kodeBarangLabel;
    private javax.swing.JTextField kodeField;
    private javax.swing.JLabel namaBarangLabel;
    private javax.swing.JTable tabelKasir;
    private javax.swing.JButton tambahButton;
    private javax.swing.JTextField tanggalField;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JTextField totalHargaField;
    private javax.swing.JLabel totalHargaLabel;
    // End of variables declaration//GEN-END:variables

    void setSelected(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
