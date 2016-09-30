import java.awt.Color;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adam
 */
public class frmNewClientInfo extends javax.swing.JFrame {

    /**
     * Creates new form frmNewClientInfo
     */
    public frmNewClientInfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtPhone = new javax.swing.JTextField();
        phoneNum = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        companyNam = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBillingAddress = new javax.swing.JTextArea();
        billingAdd = new javax.swing.JLabel();
        txtCreditCard = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbCreditCardType = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enter New Client Information");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        clientAdd.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        clientAdd.setText("Enter the client's address *");
        clientAdd.setAutoscrolls(true);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtAddress.setLineWrap(true);
        txtAddress.setRows(5);
        txtAddress.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAddress);

        txtPhone.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        phoneNum.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        phoneNum.setText("Enter the client's phone number *");

        txtCompanyName.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        companyNam.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        companyNam.setText("Enter the client's name *");

        txtBillingAddress.setColumns(20);
        txtBillingAddress.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtBillingAddress.setLineWrap(true);
        txtBillingAddress.setRows(5);
        jScrollPane2.setViewportView(txtBillingAddress);

        billingAdd.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        billingAdd.setText("Enter the client's billing address *");

        txtCreditCard.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel7.setText("Enter credit card number");

        cmbCreditCardType.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cmbCreditCardType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Master Card", "Visa", "Discover Card" }));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel8.setText("Enter the type of credit card");

        btnSubmit.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jCheckBox1.setText("same as address");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(64, 64, 64)
                                .addComponent(cmbCreditCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(companyNam)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(clientAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(billingAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(phoneNum))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyNam, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientAdd))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billingAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbCreditCardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSubmit))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "ad";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            Statement st = conn.createStatement();
            String queryText = "INSERT INTO client (address, phone, companyName, billingAddress, creditCard, creditCardType) VALUES ('" + txtAddress.getText() + "', '" + txtPhone.getText() + "', '" + txtCompanyName.getText() + "', ";
            if (txtBillingAddress.getText().equals("")) {
                queryText = queryText + "null, ";
            } else {
                queryText = queryText + "'" + txtBillingAddress.getText() + "', ";
            }
            if (txtCreditCard.getText().equals("")) {
                queryText = queryText + "null, ";
            } else {
                queryText = queryText + "'" + txtCreditCard.getText() + "', ";
            }
            if (cmbCreditCardType.getSelectedIndex() == 0) {
                queryText = queryText + "null)";
            } else {
                queryText = queryText + "'" + cmbCreditCardType.getSelectedItem().toString() + "')";
            }
            
            int counter = 0;

            
            
            if (txtPhone.getText().equals("")) {
                phoneNum.setForeground(Color.RED);
            counter ++;
            }
            if (txtCompanyName.getText().equals("")) {
                companyNam.setForeground(Color.RED);
              counter ++;  
            }
            
            ResultSet ClientTable=st.executeQuery("select companyName from client");
            while(ClientTable.next()){
                if (txtCompanyName.getText().equals(ClientTable.getString("companyName"))){
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Client already exists");
                this.setVisible(false);
                        this.dispose();
            }
            }
            
            if (txtAddress.getText().equals("")) {
                clientAdd.setForeground(Color.RED);
                counter ++;
            }
            if (txtBillingAddress.getText().equals("")) {
                billingAdd.setForeground(Color.RED);
              counter++;  
            }
            
            String pattern= "[0-9]+";
                
                if (!txtPhone.getText().matches(pattern)){
                    phoneNum.setForeground(Color.RED);
                    JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Phone number must be numerical");
                
                }
            
            
             else {
                
               
                
                st.executeUpdate(queryText);

                txtAddress.setText("");
                txtBillingAddress.setText("");
                txtCompanyName.setText("");
                txtPhone.setText("");
                
                
                
                
                    
                
                
                txtCreditCard.setText("");
                cmbCreditCardType.setSelectedIndex(0);
                 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSuccessWindow().setVisible(true);
            }
        });

            }
            if(counter > 0){
                       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMissingInfo().setVisible(true);
            }
        });
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

       

    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:

        int reply = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to Cancel?", null, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.dispose();
        }


    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
        txtBillingAddress.setText(txtAddress.getText());


    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmNewClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNewClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNewClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNewClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNewClientInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billingAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel clientAdd;
    private javax.swing.JComboBox cmbCreditCardType;
    private javax.swing.JLabel companyNam;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel phoneNum;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextArea txtBillingAddress;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtCreditCard;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
