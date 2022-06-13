/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user.etalase.celana;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import kaweshop.Kaweshop;

/**
 *
 * @author KWHY
 */
public class celanapendek extends javax.swing.JPanel {

    /**
     * Creates new form panelcelana
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
    public celanapendek() {
        initComponents();
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 13;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id1 = r.getString("id_barang");
                nama1 = r.getString("nama_barang");
                harga1 = r.getString("harga");
  
                namacelana1.setText(nama1.toUpperCase());
                hargacelanapendek1.setText("Rp."+harga1);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 14;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id2 = r.getString("id_barang");
                nama2 = r.getString("nama_barang");
                harga2 = r.getString("harga");
  
                namacelana2.setText(nama2.toUpperCase());
                hargacelanapendek2.setText("Rp."+harga2);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 15;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id3 = r.getString("id_barang");
                nama3 = r.getString("nama_barang");
                harga3 = r.getString("harga");
  
                namacelana3.setText(nama3.toUpperCase());
                hargacelanapendek3.setText("Rp."+harga3);
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

        jPanel21 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        namacelana1 = new javax.swing.JLabel();
        namacelana2 = new javax.swing.JLabel();
        namacelana3 = new javax.swing.JLabel();
        hargacelanapendek3 = new javax.swing.JTextField();
        hargacelanapendek1 = new javax.swing.JTextField();
        hargacelanapendek2 = new javax.swing.JTextField();
        jumlahcelanapendek1 = new javax.swing.JTextField();
        jumlahcelanapendek2 = new javax.swing.JTextField();
        jumlahcelanapendek3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(16, 77, 168));

        jPanel21.setBackground(new java.awt.Color(42, 186, 237));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngegg (2).png"))); // NOI18N
        jPanel21.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel22.setBackground(new java.awt.Color(42, 186, 237));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (6) (1).png"))); // NOI18N
        jPanel22.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel23.setBackground(new java.awt.Color(42, 186, 237));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngegg (1).png"))); // NOI18N
        jPanel23.add(jLabel1, java.awt.BorderLayout.CENTER);

        jSeparator1.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator1.setForeground(new java.awt.Color(42, 186, 237));

        jSeparator2.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator2.setForeground(new java.awt.Color(42, 186, 237));

        jSeparator3.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator3.setForeground(new java.awt.Color(42, 186, 237));

        namacelana1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namacelana1.setForeground(new java.awt.Color(42, 186, 237));
        namacelana1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namacelana1.setText("WHITE SHORT");

        namacelana2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namacelana2.setForeground(new java.awt.Color(42, 186, 237));
        namacelana2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namacelana2.setText("BLUE SHORT");

        namacelana3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namacelana3.setForeground(new java.awt.Color(42, 186, 237));
        namacelana3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namacelana3.setText("TROPIS SHORT");

        hargacelanapendek3.setBackground(new java.awt.Color(16, 77, 168));
        hargacelanapendek3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargacelanapendek3.setForeground(new java.awt.Color(255, 255, 255));
        hargacelanapendek3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hargacelanapendek1.setBackground(new java.awt.Color(16, 77, 168));
        hargacelanapendek1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargacelanapendek1.setForeground(new java.awt.Color(255, 255, 255));
        hargacelanapendek1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hargacelanapendek2.setBackground(new java.awt.Color(16, 77, 168));
        hargacelanapendek2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargacelanapendek2.setForeground(new java.awt.Color(255, 255, 255));
        hargacelanapendek2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahcelanapendek1.setBackground(new java.awt.Color(16, 77, 168));
        jumlahcelanapendek1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahcelanapendek1.setForeground(new java.awt.Color(255, 255, 255));
        jumlahcelanapendek1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahcelanapendek2.setBackground(new java.awt.Color(16, 77, 168));
        jumlahcelanapendek2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahcelanapendek2.setForeground(new java.awt.Color(255, 255, 255));
        jumlahcelanapendek2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahcelanapendek3.setBackground(new java.awt.Color(16, 77, 168));
        jumlahcelanapendek3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahcelanapendek3.setForeground(new java.awt.Color(255, 255, 255));
        jumlahcelanapendek3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton3.setBackground(new java.awt.Color(16, 77, 168));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_ok_32px.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(namacelana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargacelanapendek1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahcelanapendek1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(namacelana2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargacelanapendek2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahcelanapendek2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3)
                    .addComponent(namacelana3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargacelanapendek3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahcelanapendek3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namacelana2)
                            .addComponent(namacelana3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namacelana1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hargacelanapendek3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargacelanapendek1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargacelanapendek2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jumlahcelanapendek1)
                    .addComponent(jumlahcelanapendek2)
                    .addComponent(jumlahcelanapendek3)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String jmlhcelanapendek3= jumlahcelanapendek3.getText();
        int jmlh = Integer.parseInt(jmlhcelanapendek3);
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
            p.setString(4, jmlhcelanapendek3);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String jmlhcelanapendek1= jumlahcelanapendek1.getText();
        int jmlh = Integer.parseInt(jmlhcelanapendek1);
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
            p.setString(4, jmlhcelanapendek1);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String jmlhcelanapendek2= jumlahcelanapendek2.getText();
        int jmlh = Integer.parseInt(jmlhcelanapendek2);
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
            p.setString(4, jmlhcelanapendek2);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hargacelanapendek1;
    private javax.swing.JTextField hargacelanapendek2;
    private javax.swing.JTextField hargacelanapendek3;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jumlahcelanapendek1;
    private javax.swing.JTextField jumlahcelanapendek2;
    private javax.swing.JTextField jumlahcelanapendek3;
    private javax.swing.JLabel namacelana1;
    private javax.swing.JLabel namacelana2;
    private javax.swing.JLabel namacelana3;
    // End of variables declaration//GEN-END:variables
}