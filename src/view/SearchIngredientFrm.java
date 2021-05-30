/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templat    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
es
 * and open the template in the editor.
 */
package view;

import dao.IngredientDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import model.DetailStock_Ingredient;
import model.Ingredient;
import model.Invoice;
import model.Staff;
import model.Supplier;

/**
 *
 * @author demo
 */
public class SearchIngredientFrm extends javax.swing.JFrame {

    private static Staff s;
    private static Supplier supp;
    private List<Ingredient> listIngredient;
    private static List<DetailStock_Ingredient> detailList;
    private DefaultTableModel md;
    private DetailStock_Ingredient d, k;
    private int pos;

    /**
     * Creates new form SearchIngredientFrm
     */
    public SearchIngredientFrm(Staff s, Supplier supplier, List<DetailStock_Ingredient> dt) {
        super("Tìm kiếm Nguyên liệu  ");
        this.s = s;
        this.supp = supplier;
        listIngredient = new ArrayList<>();

        detailList = dt;
        initComponents();
        inpQ.setEditable(false);
        inpB.setEditable(false);
        inpS.setEditable(false);
        jButton4.setEnabled(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        inpName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredient = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inpQ = new javax.swing.JTextField();
        inpB = new javax.swing.JTextField();
        inpS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tìm nguyên liệu cần nhập");

        jLabel2.setText("Từ khóa:");

        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblIngredient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên ", "Loại", "Đơn giá", "Đơn vị", "Số lượng nhập", "Giá mua", "Chiết khấu"
            }
        ));
        tblIngredient.setColumnSelectionAllowed(true);
        tblIngredient.setRowHeight(30);
        tblIngredient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngredientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIngredient);
        tblIngredient.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton3.setText("Đã nhập hết");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Thêm vào hóa đơn");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Số lượng nhập");

        jLabel4.setText("Giá mua");

        jLabel5.setText("Chiết khấu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(inpName, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inpB)
                            .addComponent(inpQ)
                            .addComponent(inpS, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addComponent(jButton4)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(inpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(inpB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inpS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (inpName.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tư khóa!");
        } else {
            inpQ.setEditable(false);
            inpB.setEditable(false);
            inpS.setEditable(false);
            jButton4.setEnabled(false);
            IngredientDAO sd = new IngredientDAO();
            listIngredient = sd.searchIngredient(inpName.getText().trim());
            String[][] val = new String[listIngredient.size()][8];
            for (int i = 0; i < listIngredient.size(); ++i) {
                val[i][0] = String.valueOf(listIngredient.get(i).getId());
                val[i][1] = listIngredient.get(i).getName();
                val[i][2] = listIngredient.get(i).getType();
                val[i][3] = String.valueOf(listIngredient.get(i).getPrice());
                val[i][4] = listIngredient.get(i).getUnit();
                val[i][5] = val[i][6] = null;
                val[i][7] = "0";
                if (detailList != null && checkExistIng(listIngredient.get(i))) {
                    val[i][5] = String.valueOf(k.getQuantity());
                    val[i][6] = String.valueOf(k.getPrice());
                    val[i][7] = String.valueOf(k.getSaleoff());
                }
            }
            String[] cols = {"ID", "Tên nguyên liệu", "Loại", "Đơn giá", "Đơn vị", "Số lượng nhập", "Giá mua", "Chiết khấu"};
            md = new DefaultTableModel(val, cols) {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };
            tblIngredient.setModel(md);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        (new AddIngredientFrm(s, supp, detailList)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        float q = Float.parseFloat(inpQ.getText());
        int b = Integer.parseInt(inpB.getText());
        float s = Float.parseFloat(inpS.getText());

        try {
            if (q >= 0 && b >= 0 && s >= 0 && tblIngredient.getValueAt(pos, 5) == null) {
                d = new DetailStock_Ingredient();
                d.setIngredient(listIngredient.get(pos));
                d.setPrice(b);
                d.setQuantity(q);
                d.setSaleoff(s);
                detailList.add(d);
                tblIngredient.setValueAt(q, pos, 5);
                tblIngredient.setValueAt(b, pos, 6);
                tblIngredient.setValueAt(s, pos, 7);
                inpQ.setText("");
                inpB.setText("");
                inpS.setText("");
            } else {
                for (int i = 0; i < detailList.size(); ++i) {
                    if (listIngredient.get(pos) == detailList.get(i).getIngredient()) {
                        detailList.get(i).setQuantity(detailList.get(i).getQuantity() + q);
                        detailList.get(i).setPrice(detailList.get(i).getPrice() + b);
                        detailList.get(i).setSaleoff(s);
                        tblIngredient.setValueAt(detailList.get(i).getQuantity(), pos, 5);
                        tblIngredient.setValueAt(detailList.get(i).getPrice(), pos, 6);
                        tblIngredient.setValueAt(s, pos, 7);
                        inpQ.setText("");
                        inpB.setText("");
                        inpS.setText("");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhập sai định dạng");
            inpQ.setText("");
            inpB.setText("");
            inpS.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblIngredientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngredientMouseClicked
        // TODO add your handling code here:
        int col = tblIngredient.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tblIngredient.getRowHeight();
        pos = row;
        if (row < tblIngredient.getRowCount() && row >= 0 && col < tblIngredient.getColumnCount() && col >= 0) {
            inpQ.setEditable(true);
            inpB.setEditable(true);
            inpS.setEditable(true);
        }
        jButton4.setEnabled(true);
    }//GEN-LAST:event_tblIngredientMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        (new ConfirmFrm(s, supp, detailList)).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchIngredientFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchIngredientFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchIngredientFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchIngredientFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchIngredientFrm(s, supp, detailList).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inpB;
    private javax.swing.JTextField inpName;
    private javax.swing.JTextField inpQ;
    private javax.swing.JTextField inpS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIngredient;
    // End of variables declaration//GEN-END:variables

    private boolean checkExistIng(Ingredient i) {
        for (int j = 0; j < detailList.size(); ++j) {
            if (i.getId() == detailList.get(j).getIngredient().getId()) {
                k = detailList.get(j);
                return true;
            }
        }
        return false;
    }

}
