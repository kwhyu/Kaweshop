/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user.etalase.topi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import kaweshop.Kaweshop;

/**
 *
 * @author KWHY
 */
public class topibulat extends javax.swing.JPanel {

    /**
     * Creates new form paneltopi
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
    public topibulat() {
        initComponents();
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 22;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id1 = r.getString("id_barang");
                nama1 = r.getString("nama_barang");
                harga1 = r.getString("harga");
  
                namatopibulat1.setText(nama1.toUpperCase());
                hargatopi1.setText("Rp."+harga1);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 23;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id2 = r.getString("id_barang");
                nama2 = r.getString("nama_barang");
                harga2 = r.getString("harga");
  
                namatopibulat2.setText(nama2.toUpperCase());
                hargatopi2.setText("Rp."+harga2);
            }
            
        }catch(SQLException ex){
            System.out.println("Error");
        }
        try{
            java.sql.Connection c = Kaweshop.getkawe();
            Statement s = c.createStatement();


            String sql = "SELECT * FROM barang where id_barang = 24;";
            ResultSet r = s.executeQuery(sql);
            

           
            while (r.next()){
                id3 = r.getString("id_barang");
                nama3 = r.getString("nama_barang");
                harga3 = r.getString("harga");
  
                namatopibulat3.setText(nama3.toUpperCase());
                hargatopi3.setText("Rp."+harga3);
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

        jPanel19 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        namatopibulat3 = new javax.swing.JLabel();
        namatopibulat2 = new javax.swing.JLabel();
        namatopibulat1 = new javax.swing.JLabel();
        hargatopi1 = new javax.swing.JTextField();
        jumlahtopi1 = new javax.swing.JTextField();
        hargatopi2 = new javax.swing.JTextField();
        hargatopi3 = new javax.swing.JTextField();
        jumlahtopi2 = new javax.swing.JTextField();
        jumlahtopi3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setBackground(new java.awt.Color(16, 77, 168));

        jPanel19.setBackground(new java.awt.Color(42, 186, 237));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (4).png"))); // NOI18N
        jPanel19.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel20.setBackground(new java.awt.Color(42, 186, 237));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bulat hitamtopi.png"))); // NOI18N
        jPanel20.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel21.setBackground(new java.awt.Color(42, 186, 237));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngwing.com (3).png"))); // NOI18N
        jPanel21.add(jLabel1, java.awt.BorderLayout.CENTER);

        jSeparator1.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator1.setForeground(new java.awt.Color(42, 186, 237));

        jSeparator2.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator2.setForeground(new java.awt.Color(42, 186, 237));

        jSeparator3.setBackground(new java.awt.Color(42, 186, 237));
        jSeparator3.setForeground(new java.awt.Color(42, 186, 237));

        namatopibulat3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namatopibulat3.setForeground(new java.awt.Color(42, 186, 237));
        namatopibulat3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namatopibulat3.setText("Black CowBoy");

        namatopibulat2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namatopibulat2.setForeground(new java.awt.Color(42, 186, 237));
        namatopibulat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namatopibulat2.setText("NOT WHITE HAT");

        namatopibulat1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        namatopibulat1.setForeground(new java.awt.Color(42, 186, 237));
        namatopibulat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namatopibulat1.setText("WMN HAT");

        hargatopi1.setBackground(new java.awt.Color(16, 77, 168));
        hargatopi1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargatopi1.setForeground(new java.awt.Color(255, 255, 255));
        hargatopi1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahtopi1.setBackground(new java.awt.Color(16, 77, 168));
        jumlahtopi1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        hargatopi2.setBackground(new java.awt.Color(16, 77, 168));
        hargatopi2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargatopi2.setForeground(new java.awt.Color(255, 255, 255));
        hargatopi2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hargatopi3.setBackground(new java.awt.Color(16, 77, 168));
        hargatopi3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        hargatopi3.setForeground(new java.awt.Color(255, 255, 255));
        hargatopi3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahtopi2.setBackground(new java.awt.Color(16, 77, 168));
        jumlahtopi2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        jumlahtopi3.setBackground(new java.awt.Color(16, 77, 168));
        jumlahtopi3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        jButton6.setBackground(new java.awt.Color(16, 77, 168));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_ok_32px.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(16, 77, 168));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_ok_32px.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(16, 77, 168));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_ok_32px.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hargatopi1)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namatopibulat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahtopi1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(namatopibulat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargatopi2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahtopi2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namatopibulat3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(hargatopi3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahtopi3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namatopibulat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namatopibulat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namatopibulat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargatopi1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargatopi2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargatopi3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jumlahtopi2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jumlahtopi1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jumlahtopi3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String jmlhtopi1= jumlahtopi1.getText();
        int jmlh = Integer.parseInt(jmlhtopi1);
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
            p.setString(4, jmlhtopi1);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String jmlhtopi2= jumlahtopi1.getText();
        int jmlh = Integer.parseInt(jmlhtopi2);
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
            p.setString(4, jmlhtopi2);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String jmlhtopi3= jumlahtopi3.getText();
        int jmlh = Integer.parseInt(jmlhtopi3);
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
            p.setString(4, jmlhtopi3);
            p.setString(5, jmlhharga);
            p.executeUpdate();
            p.close();
        }catch(SQLException ex){
            System.out.println("erur");
        }
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hargatopi1;
    private javax.swing.JTextField hargatopi2;
    private javax.swing.JTextField hargatopi3;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jumlahtopi1;
    private javax.swing.JTextField jumlahtopi2;
    private javax.swing.JTextField jumlahtopi3;
    private javax.swing.JLabel namatopibulat1;
    private javax.swing.JLabel namatopibulat2;
    private javax.swing.JLabel namatopibulat3;
    // End of variables declaration//GEN-END:variables
}
