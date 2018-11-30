/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deby_FormKuis2;
import Deby_Kuis2.Item;
import Deby_Kuis2.PilihanBox;
import Deby_Kuis2.TableTransaksi;
import Deby_Kuis2.Transaksi;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sin
 */
public class Main extends javax.swing.JFrame {
    private int id=0;
    private String code;
    private DefaultTableModel tbModel;
    private ArrayList<Item> items = new ArrayList<>();
    private final DefaultComboBoxModel<Object> pbModel;
    public Main() {
        PilihanBox pb = new PilihanBox();
        this.pbModel = new DefaultComboBoxModel<>(pb.getSemuaNama().toArray());
        TableTransaksi tbTransaksi = new TableTransaksi();
        this.tbModel = new DefaultTableModel(tbTransaksi.getKolomNama(),0);
        initComponents();
    }
    
    
    private void incId(){
        this.id += 1;
    }
    
    private void decId(){
        this.id -= 1;
    }

    private String setCode(){
        this.incId();
        String set = new SimpleDateFormat("yyMMdd").format(new Date());
        this.code = String.format(set+"%02d",this.id);
        return code;
    }
    
    private Object[] addItem(String nama, int jumlah){
        float harga = 0;
        PilihanBox item = new PilihanBox();
        for (int i=0 ; i<item.getSemuaHarga().size(); i++){
            if (nama.equalsIgnoreCase(item.getSemuaNama().get(i))){
                harga = item.getSemuaHarga().get(i);
            } else {
            }
        }
        Object[] obj={
            nama,harga,jumlah
        };
        return obj;
        
    }
    
    private  void updateJumlah (String nama , int add) {
        ArrayList<String> item = new ArrayList<> () ;
        for (int i = 0; i < tbModel.getRowCount(); i++) {
            item.add (tbModel.getValueAt (i , 0).toString()) ;
        }
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i).equals(nama)) {
                int jumlah = new Integer (tbModel.getValueAt(i , 2).toString()) ;
                tbModel.setValueAt (jumlah + add , i , 2) ;
            }
        }
    }
    
    private boolean isDuplicate (String nama){
        boolean result = false ;
        ArrayList <String> item = new ArrayList<>() ;
        for (int i = 0; i < tbModel.getRowCount(); i++) {
            item.add (tbModel.getValueAt(i, 0).toString()) ;
        }
        for (String i : item) {
            if (i.equals(nama)) {
                result = true ;
            }
        }
        
        return result ;
    }

    
    private boolean isEmpty() {
        return this.tampil.getModel().getRowCount() <= 0 ;
    }
    
    private void belanja() {
        if (isEmpty()) {
            this.saveToggleButton.setEnabled(false) ;
            this.removeButton.setEnabled(false) ;
        } else {
            this.saveToggleButton.setEnabled(true) ;
            this.removeButton.setEnabled(true) ;
        }
    }
        
     private void transaksiBaru () {
        this.jumlahTextField.setText(" ") ;
        this.codeTextField.setText(" ") ;
        this.newButton.setEnabled(true) ;
        this.saveToggleButton.setEnabled(false) ;
        this.cancelToggleButton.setEnabled(false) ;
        this.addButton.setEnabled(false) ;
        this.removeButton.setEnabled(false) ;
        this.removeButton.setEnabled(false) ;
        this.jumlahTextField.setEnabled(false) ;
        this.pilihanComboBox.setEnabled(false) ;
        this.tbModel.setRowCount(0) ;
        this.items.clear() ;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newButton = new javax.swing.JToggleButton();
        addButton = new javax.swing.JToggleButton();
        removeButton = new javax.swing.JToggleButton();
        codeLabel = new javax.swing.JLabel();
        itemsLabel = new javax.swing.JLabel();
        pilihanComboBox = new javax.swing.JComboBox<>();
        jumlahTextField = new javax.swing.JTextField();
        codeTextField = new javax.swing.JTextField();
        tampilPane = new javax.swing.JScrollPane();
        tampil = new javax.swing.JTable();
        saveToggleButton = new javax.swing.JToggleButton();
        cancelToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        codeLabel.setText("Code");

        itemsLabel.setText("Items");

        pilihanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gula", "Susu", "Kopi", "Teh" }));
        pilihanComboBox.setSelectedIndex(-1);
        pilihanComboBox.setToolTipText("");
        pilihanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanComboBoxActionPerformed(evt);
            }
        });

        codeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextFieldActionPerformed(evt);
            }
        });

        tampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Jumlah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tampilPane.setViewportView(tampil);

        saveToggleButton.setText("Save");
        saveToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToggleButtonActionPerformed(evt);
            }
        });

        cancelToggleButton.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(codeLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(codeTextField))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(itemsLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(pilihanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jumlahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(saveToggleButton)
                            .addGap(18, 18, 18)
                            .addComponent(cancelToggleButton))
                        .addComponent(tampilPane, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(codeLabel)
                                .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemsLabel)
                        .addComponent(pilihanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jumlahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tampilPane, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveToggleButton)
                    .addComponent(cancelToggleButton))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToggleButtonActionPerformed
        try {
            // loop setiap tabel
            for (int i = 0; i < tbModel.getRowCount(); i++) {
                // menyimpan nama dan jumlah menjadi variable
                String nama = tbModel.getValueAt (i , 0).toString () ;
                float harga = new Float (tbModel.getValueAt (i , 1).toString()) ;
                int jumlah = new Integer (tbModel.getValueAt (i , 2).toString()) ;
                this.items.add (new Item(nama, jumlah , (int) harga)) ;   
            }
            // instansiasi kelas Transaksi dengan kode dan committed belanja
            Transaksi tsk = new Transaksi (this.code , this.items) ;
            // Stringbuilder untuk menangani output Transaksi
            StringBuilder sbr = new StringBuilder() ;
            // menambahkan hasil transaksi
            sbr.append(tsk.Pembayaran()) ;
            // memanggil dialog dengan StringBuilder
            JOptionPane.showMessageDialog(this , sbr , "Transaksi" , JOptionPane.INFORMATION_MESSAGE) ;
            // melakukan transaksi baru
            transaksiBaru () ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_saveToggleButtonActionPerformed

    private void pilihanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanComboBoxActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
            this.jumlahTextField.setText(" ");
            this.codeLabel.setText(" ");
            this.newButton.setEnabled(true);
            this.saveToggleButton.setEnabled(false);
            this.cancelToggleButton.setEnabled(false);
            this.addButton.setEnabled(false);
            this.removeButton.setEnabled(false);
            this.codeTextField.setEnabled(false);
            this.tbModel.setRowCount(0);
            this.items.clear();
    }//GEN-LAST:event_newButtonActionPerformed

    private void codeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextFieldActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        if (tampil.getSelectedRow() <0) {
            // jika tidak ada , maka akan muncul tulisan seperti ini
            String sbr = "Pilihlah item yang akan dihapus" ;
            JOptionPane.showMessageDialog(this , sbr , "Information" , JOptionPane.INFORMATION_MESSAGE) ;  
        } else {
            // jika ada baris yg dipilih , maka baris tersebut akan dihapus
            int count = tampil.getSelectedRows().length ;
            for (int i = 0; i < count; i++) {
                tbModel.removeRow(tampil.getSelectedRow()) ;
            }
            
        }
        this.belanja() ;
    
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String nama = this.pilihanComboBox.getSelectedItem().toString();
        int jumlah  = new Integer(this.jumlahTextField.getText());
        if(isDuplicate(nama)) {
            updateJumlah(nama , jumlah);
        } else {
            tbModel.addRow(addItem(nama , jumlah)) ;
        }
        this.belanja() ;
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addButton;
    private javax.swing.JToggleButton cancelToggleButton;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JTextField jumlahTextField;
    private javax.swing.JToggleButton newButton;
    private javax.swing.JComboBox<String> pilihanComboBox;
    private javax.swing.JToggleButton removeButton;
    private javax.swing.JToggleButton saveToggleButton;
    private javax.swing.JTable tampil;
    private javax.swing.JScrollPane tampilPane;
    // End of variables declaration//GEN-END:variables
}
