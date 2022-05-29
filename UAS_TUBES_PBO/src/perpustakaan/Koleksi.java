
package perpustakaan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Koleksi extends javax.swing.JFrame {
private static Connection koneksi; //Koneksi
    /**
     * Creates new form Koleksi
     */
public void tampilkandata() {
    
        DefaultTableModel tabelkoleksi = new DefaultTableModel();
        tabelkoleksi.addColumn("Kode Buku");
        tabelkoleksi.addColumn("Judul Buku");
        tabelkoleksi.addColumn("Pengarang");
        tabelkoleksi.addColumn("Penerbit");
        tabelkoleksi.addColumn("Stok");
        
        try {
            buka_koneksi();
            String sql = "select * from koleksi";
            Statement stat = koneksi.createStatement();
            ResultSet res=stat.executeQuery(sql);
            while (res.next()) {
                tabelkoleksi.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
           table2.setModel(tabelkoleksi);
        } catch (Exception e) {
        }

    }
    public Koleksi() {
        initComponents();
         this.setLocationRelativeTo(this);
    }
        private static Connection buka_koneksi() {
        if (koneksi==null) {
            try {
                String driver = "com.mysql.jdbc.Driver";
                String url="jdbc:mysql://localhost:3306/uas_kel4_perpustakaan"; //nama database belajar
                String user="root"; //user mysql
                String password=""; //password mysql
               
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,user,password);
                
            }catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
     return koneksi;
     
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_kode = new javax.swing.JTextField();
        txt_judul = new javax.swing.JTextField();
        txt_peng = new javax.swing.JTextField();
        txt_penerbit = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        btn_sim = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_cari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        btn_lihat = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Utama = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATA PERPUSTAKAAN");
        setResizable(false);

        jLabel1.setText("Kode Buku");

        jLabel2.setText("Judul Buku");

        jLabel3.setText("Nama Pengarang");

        jLabel4.setText("Nama Penerbit");

        jLabel5.setText("Jumlah Stok");

        btn_sim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/sv.png"))); // NOI18N
        btn_sim.setText("Simpan");
        btn_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simActionPerformed(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/ed.png"))); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.setEnabled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/dt.png"))); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.setEnabled(false);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/cr.png"))); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Pengarang", "Penerbit", "Stok"
            }
        ));
        jScrollPane2.setViewportView(table2);

        btn_lihat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/tm.png"))); // NOI18N
        btn_lihat.setText("Tampil");
        btn_lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lihatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("FORM KOLEKSI BUKU");

        jMenu1.setText("FORM");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Anggota");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Koleksi");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Peminjaman");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        Utama.setText("Utama");
        Utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UtamaActionPerformed(evt);
            }
        });
        jMenu1.add(Utama);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("HELP");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_peng, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(310, 310, 310))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_stok)
                                        .addGap(310, 310, 310)))))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_sim, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_lihat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_peng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sim, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_lihat, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simActionPerformed
        // TODO add your handling code here:
         if((txt_kode.getText().equals(""))||(txt_judul.getText().equals(""))||
                 (txt_peng.getText().equals(""))||(txt_penerbit.getText().equals(""))
                 ||(txt_stok.getText().equals("")))
            {
                JOptionPane.showMessageDialog(btn_sim, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
         else{
        
        Connection c=buka_koneksi(); //panggil function koneksi
         String sqlkode="Insert into koleksi(Kode,Judul,Pengarang,Penerbit,Stock) values ('"+this.txt_kode.getText()+"',"
                     + "'"+this.txt_judul.getText()+"',"+ "'"+this.txt_peng.getText()+"',"
                 +"'"+this.txt_penerbit.getText()+"',"+"'"+this.txt_stok.getText()+"')";
         
         String sql="Insert into stok(Kode,Jumlah) values ('"+this.txt_kode.getText()+"',"+"'"+this.txt_stok.getText()+"')";
                 
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               PreparedStatement p3=(PreparedStatement) c.prepareStatement(sql);
               p3.executeUpdate();
               p3.close();
               txt_kode.setText("");
               txt_judul.setText("");
               txt_peng.setText("");
               txt_penerbit.setText("");
               txt_stok.setText("");
               btn_edit.setEnabled(true);
               btn_hapus.setEnabled(true);
               txt_kode.requestFocus();
               tampilkandata();
               
               JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+ex.getMessage());
           
               btn_edit.setEnabled(true);
               btn_hapus.setEnabled(true);
               txt_kode.requestFocus();
               tampilkandata();
               
            }
         }
               
    }//GEN-LAST:event_btn_simActionPerformed

    private void btn_lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lihatActionPerformed
        // TODO add your handling code here:
        tampilkandata();
               btn_edit.setEnabled(true);
               btn_hapus.setEnabled(true);
               txt_kode.requestFocus();
    }//GEN-LAST:event_btn_lihatActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        if(txt_kode.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Text Kode Kosong","Informasi",1);
              txt_kode.requestFocus();
          }
          else{
          
        Connection c=buka_koneksi();
         String sqlkode="Delete from koleksi "+ "Where Kode='"+this.txt_kode.getText()+"'";
         String sql="Delete from stok "+ "Where Kode='"+this.txt_kode.getText()+"'";
            try {
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
               p.executeUpdate();
               p.close();

               
               txt_kode.setText("");
               txt_judul.setText("");
               txt_peng.setText("");
               txt_penerbit.setText("");
               txt_stok.setText("");
               txt_kode.requestFocus();
               
               tampilkandata();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        if((txt_kode.getText().equals(""))||(txt_judul.getText().equals(""))||
                 (txt_peng.getText().equals(""))||(txt_penerbit.getText().equals(""))
                 ||(txt_stok.getText().equals("")))
            {
                JOptionPane.showMessageDialog(btn_sim, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
        else{
        Connection c=buka_koneksi(); 
        String sqlkode="Update koleksi SET Judul='"+this.txt_judul.getText()+"'," + "Pengarang='"+this.txt_peng.getText()+"',"
                +"Penerbit='"+this.txt_penerbit.getText()+"',"+"Stock='"+this.txt_stok.getText()+"'"+"Where Kode='"+this.txt_kode.getText()+"'";
        String sql="Update stok SET Jumlah='"+this.txt_stok.getText()+"'"+"Where Kode='"+this.txt_kode.getText()+"'";   
        try {
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
               p.executeUpdate();
               p.close();
               JOptionPane.showMessageDialog(this, "Edit Berhasil","Informasi",1);
               txt_kode.setText("");
               txt_judul.setText("");
               txt_peng.setText("");
               txt_penerbit.setText("");
               txt_stok.setText("");
               txt_kode.requestFocus();
               
               tampilkandata();
            }
             catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        if(txt_kode.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Text ID Kosong","Informasi",1);
              txt_kode.requestFocus();
          }
        else{
        DefaultTableModel tabelkol = new DefaultTableModel();
        tabelkol.addColumn("Kode Buku");
        tabelkol.addColumn("Judul Buku");
        tabelkol.addColumn("Pengarang");
        tabelkol.addColumn("Penerbit");
        tabelkol.addColumn("Stok");
        
        try {
            buka_koneksi();
            String sql = "Select * from koleksi where Kode like '%" +txt_kode.getText()+
                    "%'" +"or Judul like '%" + txt_kode.getText() + "%'"; 
            Statement stat = koneksi.createStatement();
            ResultSet res=stat.executeQuery(sql);
            
               txt_kode.setText("");
               txt_judul.setText("");
               txt_peng.setText("");
               txt_penerbit.setText("");
               txt_stok.setText("");
               txt_kode.requestFocus();
            
            btn_hapus.setEnabled(true);
            btn_edit.setEnabled(true);
           
            while (res.next()) {
                tabelkol.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),
                    res.getString(4),res.getString(5)});
            }
           table2.setModel(tabelkol);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan "+e);
        }
        }
        
    }//GEN-LAST:event_btn_cariActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
          new Anggota().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         new Koleksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
          new Pinjam().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Lihatlah Data Base Bila Terjadi Kesalahan"+"\n");
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void UtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UtamaActionPerformed
        // TODO add your handling code here:
          new Utama().setVisible(true);
        dispose();
    }//GEN-LAST:event_UtamaActionPerformed

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
            java.util.logging.Logger.getLogger(Koleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Koleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Koleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Koleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Koleksi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Utama;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_lihat;
    private javax.swing.JButton btn_sim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table2;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_penerbit;
    private javax.swing.JTextField txt_peng;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
