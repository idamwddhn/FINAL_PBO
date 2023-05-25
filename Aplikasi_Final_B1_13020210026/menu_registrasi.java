package aplikasi_restoran_sederhana;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO-PC
 */
public class menu_registrasi extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    /**
     * Creates new form menu_masakan
     */
    public menu_registrasi() {
        initComponents();
        k.connect();
        refreshTable();
        
    }
    
    class user extends menu_registrasi{
        int id_user;
        String username, password, nama_user;
        int id_level;
        
        public user(){
            username = text_username.getText();
            password = text_password.getText();
            nama_user = text_nama_user.getText();
            id_level = Integer.parseInt(combo_id_level.getSelectedItem().toString());
        }
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("ID User");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Nama User");
        model.addColumn("ID Level");
        table_registrasi.setModel(model);
        try {
            this.stat = k.getCon().prepareStatement("select * from user");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data = {
                    rs.getString("id_user"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nama_user"),
                    rs.getString("id_level"),
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        text_id_user.setText("");
        text_username.setText("");
        text_password.setText("");
        text_nama_user.setText("");
        
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_id_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo_id_level = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_registrasi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        btn_input = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_menu_masakan = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        text_nama_user = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU REGISTRASI");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setText("ID User");

        text_id_user.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        text_id_user.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setText("Username");

        text_username.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setText("Password");

        text_password.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setText("ID Level");

        combo_id_level.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        combo_id_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        table_registrasi.setModel(new javax.swing.table.DefaultTableModel(
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
        table_registrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_registrasiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_registrasi);

        btn_delete.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_input.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_input.setText("Input");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_menu_masakan.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_menu_masakan.setText("Menu Masakan");
        btn_menu_masakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_masakanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btn_menu_masakan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_input)
                    .addComponent(btn_update)
                    .addComponent(btn_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btn_menu_masakan))
        );

        btn_logout.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btn_logout.setText("LOGOUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setText("Nama User");

        text_nama_user.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_nama_user, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_id_level, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(text_id_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_logout)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text_id_user)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_nama_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_id_level)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
             try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("insert into user values(?,?,?,?,?)");
            stat.setInt(1,0);
            stat.setString(2,u.username);
            stat.setString(3,u.password);
            stat.setString(4,u.nama_user);
            stat.setInt(5, u.id_level);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
         try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("Update user set username=?,"
            + "password=?,nama_user=?,id_level=? where id_user=?");
            stat.setString(1,u.username);
            stat.setString(2,u.password);
            stat.setString(3,u.nama_user);
            stat.setInt(4, u.id_level);
            stat.setString(5, text_id_user.getText());
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("delete from user where id_user=?");
            stat.setString(1, text_id_user.getText());
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void table_registrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_registrasiMouseClicked
        // TODO add your handling code here:
        text_id_user.setText(model.getValueAt(table_registrasi.getSelectedRow(), 0) . toString());
        text_username.setText(model.getValueAt(table_registrasi.getSelectedRow(), 1) . toString());
        text_password.setText(model.getValueAt(table_registrasi.getSelectedRow(), 2) . toString());
        text_nama_user.setText(model.getValueAt(table_registrasi.getSelectedRow(), 3) . toString());
    }//GEN-LAST:event_table_registrasiMouseClicked

    private void btn_menu_masakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_masakanActionPerformed
        // TODO add your handling code here:
        menu_masakan masak = new menu_masakan();
        masak.setVisible(true);
        
        this.setVisible(false);
        masak.btn_input.setEnabled(true);
        masak.btn_delete.setEnabled(true);
        masak.btn_update.setEnabled(true);
        masak.btn_registrasi.setEnabled(true);
    }//GEN-LAST:event_btn_menu_masakanActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_delete;
    public javax.swing.JButton btn_input;
    public javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_menu_masakan;
    public javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_id_level;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_registrasi;
    private javax.swing.JTextField text_id_user;
    private javax.swing.JTextField text_nama_user;
    private javax.swing.JTextField text_password;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}
