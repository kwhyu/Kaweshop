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
public class jeans extends javax.swing.JPanel {

    /**
     * Creates new form jeans
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
    public jeans() {
        initComponents();
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 16;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id1 = r.getString("id_barang");
                nama1 = r.getString("nama_barang");
                harga1 = r.getString("harga");
  
                namajeans1.setText(nama1.toUpperCase());
                hargajeans1.setText("Rp."+harga1);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 17;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id2 = r.getString("id_barang");
                nama2 = r.getString("nama_barang");
                harga2 = r.getString("harga");
  
                namajeans2.setText(nama2.toUpperCase());
                hargajeans2.setText("Rp."+harga2);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 18;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id3 = r.getString("id_barang");
                nama3 = r.getString("nama_barang");
                harga3 = r.getString("harga");
  
                namajeans3.setText(nama3.toUpperCase());
                hargajeans3.setText("Rp."+harga3);
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

        jPanel17 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        namajeans1 = new javax.swing.JLabel();
        namajeans3 = new javax.swing.JLabel();
        namajeans2 = new javax.swing.JLabel();
        hargajeans3 = new javax.swing.JTextField();
        hargajeans1 = new javax.swing.JTextField();
        hargajeans2 = new javax.swing.JTextField();
        jumlahjeans1 = new javax.swing.JTextField();
        jumlahjeans2 = new javax.swing.JTextField();
        jumlahjeans3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(16, 77, 168));

        jPanel17.setBackground(new java.awt.Color(42, 186, 237));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kisspng-gas-jeans-denim-clothing-slim-fit-pants-denim-cap-5b2a2e46e32094.6725643515294910149303.png"))); // NOI18N
        jPanel17.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel18.setBackground(new java.awt.Color(42, 186, 237));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kisspng-jeans-denim-lee-diesel-pants-men-jeans-5b49318b1b9084.8468490915315234671129.png"))); // NOI18N
        jPanel18.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel19.setBackground(new java.awt.Color(42, 186, 237));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kisspng-pepe-jeans-denim-shoe-blue-men-s-jeans-5b0d21cfe84fd9.1589100115275872799516.png"))); // NOI18N
        jPanel19.add(jLabel6, java.awt.BorderLayout.CENTER);

        jSeparator1.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator1.setForeground(new java.awt.Color(42, 186, 237));

        jSeparator2.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator2.setForeground(new java.awt.Color(42, 186, 237));

        jSeparator3.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator3.setForeground(new java.awt.Color(42, 186, 237));

        namajeans1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namajeans1.setForeground(new java.awt.Color(42, 186, 237));
        namajeans1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namajeans1.setText("Jeans 1");

        namajeans3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namajeans3.setForeground(new java.awt.Color(42, 186, 237));
        namajeans3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namajeans3.setText("Jeans 3");

        namajeans2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namajeans2.setForeground(new java.awt.Color(42, 186, 237));
        namajeans2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namajeans2.setText("Jeans 2");

        hargajeans3.setBackground(new java.awt.Color(16, 77, 168));
        hargajeans3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargajeans3.setForeground(new java.awt.Color(255, 255, 255));
        hargajeans3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hargajeans1.setBackground(new java.awt.Color(16, 77, 168));
        hargajeans1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargajeans1.setForeground(new java.awt.Color(255, 255, 255));
        hargajeans1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hargajeans2.setBackground(new java.awt.Color(16, 77, 168));
        hargajeans2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargajeans2.setForeground(new java.awt.Color(255, 255, 255));
        hargajeans2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahjeans1.setBackground(new java.awt.Color(16, 77, 168));
        jumlahjeans1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahjeans1.setForeground(new java.awt.Color(255, 255, 255));
        jumlahjeans1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahjeans2.setBackground(new java.awt.Color(16, 77, 168));
        jumlahjeans2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahjeans2.setForeground(new java.awt.Color(255, 255, 255));
        jumlahjeans2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahjeans3.setBackground(new java.awt.Color(16, 77, 168));
        jumlahjeans3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jumlahjeans3.setForeground(new java.awt.Color(255, 255, 255));
        jumlahjeans3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargajeans1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namajeans1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahjeans1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(namajeans2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(hargajeans2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahjeans2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(namajeans3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(hargajeans3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahjeans3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namajeans2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(namajeans1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(namajeans3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(hargajeans1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargajeans3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargajeans2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlahjeans1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahjeans2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahjeans3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String jmlhjeans2= jumlahjeans2.getText();
        int jmlh = Integer.parseInt(jmlhjeans2);
        int hrg2 = Integer.parseInt(harga3);
        int totalharga = jmlh * hrg2;
        String jmlhharga = Integer.toString(totalharga);
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            String sql = "INSERT INTO keranjang VALUES ( ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, id2);
            p.setString(2, nama2);
            p.setString(3, harga2);
            p.setString(4, jmlhjeans2);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String jmlhjeans1= jumlahjeans1.getText();
        int jmlh = Integer.parseInt(jmlhjeans1);
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
            p.setString(4, jmlhjeans1);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String jmlhjeans3= jumlahjeans3.getText();
        int jmlh = Integer.parseInt(jmlhjeans3);
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
            p.setString(4, jmlhjeans3);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hargajeans1;
    private javax.swing.JTextField hargajeans2;
    private javax.swing.JTextField hargajeans3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jumlahjeans1;
    private javax.swing.JTextField jumlahjeans2;
    private javax.swing.JTextField jumlahjeans3;
    private javax.swing.JLabel namajeans1;
    private javax.swing.JLabel namajeans2;
    private javax.swing.JLabel namajeans3;
    // End of variables declaration//GEN-END:variables
}
