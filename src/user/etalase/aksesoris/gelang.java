/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user.etalase.aksesoris;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import kaweshop.Kaweshop;

/**
 *
 * @author KWHY
 */
public class gelang extends javax.swing.JPanel {

    /**
     * Creates new form gelang
     */
    public String id1;
    public String id2;
    public String id3;
    public String nama1;
    public String nama2;
    public String nama3;
    public String harga1;
    public String harga2;
    public String harga3;
    public gelang() {
        initComponents();
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 31;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id1 = r.getString("id_barang");
                nama1 = r.getString("nama_barang");
                harga1 = r.getString("harga");
  
                namagelang1.setText(nama1.toUpperCase());
                hargagelang1.setText("Rp."+harga1);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 32;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id2 = r.getString("id_barang");
                nama2 = r.getString("nama_barang");
                harga2 = r.getString("harga");
  
                namagelang2.setText(nama2.toUpperCase());
                hargagelang2.setText("Rp."+harga2);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 33;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id3 = r.getString("id_barang");
                nama3 = r.getString("nama_barang");
                harga3 = r.getString("harga");
  
                namagelang3.setText(nama3.toUpperCase());
                hargagelang3.setText("Rp."+harga3);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel23 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        namagelang3 = new javax.swing.JLabel();
        namagelang1 = new javax.swing.JLabel();
        namagelang2 = new javax.swing.JLabel();
        hargagelang3 = new javax.swing.JTextField();
        hargagelang1 = new javax.swing.JTextField();
        hargagelang2 = new javax.swing.JTextField();
        jumlahgelang1 = new javax.swing.JTextField();
        jumlahgelang2 = new javax.swing.JTextField();
        jumlahgelang3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(16, 77, 168));

        jPanel23.setBackground(new java.awt.Color(42, 186, 237));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gelang.png"))); // NOI18N
        jPanel23.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel24.setBackground(new java.awt.Color(42, 186, 237));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kisspng-bangle-bracelet-gemstone-jewellery-cartier-gold-bracelet-5b0c5296b292f8.1117031415275342307315.png"))); // NOI18N
        jPanel24.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel25.setBackground(new java.awt.Color(42, 186, 237));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kisspng-montblanc-jewellery-bracelet-leather-bangle-bracelet-mont-blanc-homme-5b5d386d1e9b41.4374994115328359491254 (1).png"))); // NOI18N
        jPanel25.add(jLabel3, java.awt.BorderLayout.CENTER);

        jSeparator1.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator1.setForeground(new java.awt.Color(42, 186, 237));

        jSeparator2.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator2.setForeground(new java.awt.Color(42, 186, 237));

        jSeparator3.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator3.setForeground(new java.awt.Color(42, 186, 237));

        namagelang3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namagelang3.setForeground(new java.awt.Color(42, 186, 237));
        namagelang3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namagelang3.setText("BLU SATIR");

        namagelang1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namagelang1.setForeground(new java.awt.Color(42, 186, 237));
        namagelang1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namagelang1.setText("BLU SATIR");

        namagelang2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namagelang2.setForeground(new java.awt.Color(42, 186, 237));
        namagelang2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namagelang2.setText("BLU SATIR");

        hargagelang3.setEditable(false);
        hargagelang3.setBackground(new java.awt.Color(16, 77, 168));
        hargagelang3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargagelang3.setForeground(new java.awt.Color(255, 255, 255));
        hargagelang3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hargagelang1.setEditable(false);
        hargagelang1.setBackground(new java.awt.Color(16, 77, 168));
        hargagelang1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargagelang1.setForeground(new java.awt.Color(255, 255, 255));
        hargagelang1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hargagelang2.setEditable(false);
        hargagelang2.setBackground(new java.awt.Color(16, 77, 168));
        hargagelang2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargagelang2.setForeground(new java.awt.Color(255, 255, 255));
        hargagelang2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahgelang1.setBackground(new java.awt.Color(16, 77, 168));
        jumlahgelang1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahgelang1.setForeground(new java.awt.Color(255, 255, 255));
        jumlahgelang1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahgelang2.setBackground(new java.awt.Color(16, 77, 168));
        jumlahgelang2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahgelang2.setForeground(new java.awt.Color(255, 255, 255));
        jumlahgelang2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahgelang3.setBackground(new java.awt.Color(16, 77, 168));
        jumlahgelang3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahgelang3.setForeground(new java.awt.Color(255, 255, 255));
        jumlahgelang3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton4.setBackground(new java.awt.Color(16, 77, 168));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_ok_32px.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(16, 77, 168));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_ok_32px.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(16, 77, 168));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_ok_32px.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namagelang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargagelang1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahgelang1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(namagelang2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(hargagelang2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahgelang2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(namagelang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargagelang3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahgelang3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namagelang3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namagelang1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namagelang2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargagelang3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargagelang1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargagelang2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jumlahgelang2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jumlahgelang1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jumlahgelang3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String jmlhgelang1= jumlahgelang1.getText();
        int jmlh = Integer.parseInt(jmlhgelang1);
        int hrg1 = Integer.parseInt(harga1);
        int totalharga = jmlh * hrg1;
        String jmlhharga = Integer.toString(totalharga);
        try{
                java.sql.Connection c = Kaweshop.getkawe();
                String sql = "INSERT INTO keranjang VALUES ( ?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id1);
                p.setString(2, nama1);
                p.setString(3, harga1);
                p.setString(4, jmlhgelang1);
                p.setString(5, jmlhharga);
                p.executeUpdate();
                p.close();
            }catch(SQLException ex){
                System.out.println("erur");
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String jmlhgelang2= jumlahgelang2.getText();
        int jmlh = Integer.parseInt(jmlhgelang2);
        int hrg2 = Integer.parseInt(harga2);
        int totalharga = jmlh * hrg2;
        String jmlhharga = Integer.toString(totalharga);
        try{
                java.sql.Connection c = Kaweshop.getkawe();
                String sql = "INSERT INTO keranjang VALUES ( ?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id2);
                p.setString(2, nama2);
                p.setString(3, harga2);
                p.setString(4, jmlhgelang2);
                p.setString(5, jmlhharga);
                p.executeUpdate();
                p.close();
            }catch(SQLException ex){
                System.out.println("erur");
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String jmlhgelang3= jumlahgelang3.getText();
        int jmlh = Integer.parseInt(jmlhgelang3);
        int hrg3 = Integer.parseInt(harga3);
        int totalharga = jmlh * hrg3;
        String jmlhharga = Integer.toString(totalharga);
        try{
                java.sql.Connection c = Kaweshop.getkawe();
                String sql = "INSERT INTO keranjang VALUES ( ?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id3);
                p.setString(2, nama3);
                p.setString(3, harga3);
                p.setString(4, jmlhgelang3);
                p.setString(5, jmlhharga);
                p.executeUpdate();
                p.close();
            }catch(SQLException ex){
                System.out.println("erur");
            }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hargagelang1;
    private javax.swing.JTextField hargagelang2;
    private javax.swing.JTextField hargagelang3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jumlahgelang1;
    private javax.swing.JTextField jumlahgelang2;
    private javax.swing.JTextField jumlahgelang3;
    private javax.swing.JLabel namagelang1;
    private javax.swing.JLabel namagelang2;
    private javax.swing.JLabel namagelang3;
    // End of variables declaration//GEN-END:variables
}