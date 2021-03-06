
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Justin
 */
public class frmModifyAd extends javax.swing.JFrame {

    private int adID;

    public void setAdID(int SelectedID) {
        this.adID = SelectedID;
    }

    /**
     * Creates new form frmModifyAd
     */
    public frmModifyAd() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdInfo = new javax.swing.JTextArea();
        lblCat = new javax.swing.JLabel();
        cmbCat = new javax.swing.JComboBox();
        lblAdTitle = new javax.swing.JLabel();
        txtAdTitle = new javax.swing.JTextField();
        lblAdInfo = new javax.swing.JLabel();
        lblPublishDate = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox();
        cmbMonth = new javax.swing.JComboBox();
        cmbDay = new javax.swing.JComboBox();
        lblColumns = new javax.swing.JLabel();
        cmbColumns = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAdInformation = new javax.swing.JTextArea();
        btnMakePayment = new javax.swing.JButton();
        btnDeleteAd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();

        txtAdInfo.setColumns(20);
        txtAdInfo.setLineWrap(true);
        txtAdInfo.setRows(5);
        jScrollPane1.setViewportView(txtAdInfo);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modify Select Ad");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCat.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblCat.setText("Category *");

        cmbCat.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cmbCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAdTitle.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblAdTitle.setText("Ad Title *");

        txtAdTitle.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtAdTitle.setText("jTextField1");

        lblAdInfo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblAdInfo.setText("Ad Information *");

        lblPublishDate.setText("Publish Date *");

        cmbYear.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbMonth.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbDay.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cmbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblColumns.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblColumns.setText("Columns");

        cmbColumns.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cmbColumns.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        txtAdInformation.setColumns(20);
        txtAdInformation.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtAdInformation.setLineWrap(true);
        txtAdInformation.setRows(5);
        jScrollPane2.setViewportView(txtAdInformation);

        btnMakePayment.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnMakePayment.setText("Make/Refund Payment");
        btnMakePayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMakePaymentMouseClicked(evt);
            }
        });

        btnDeleteAd.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnDeleteAd.setText("Delete Ad");
        btnDeleteAd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteAdMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel1.setText("Outstanding  Balance:");

        lblBalance.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblBalance.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPublishDate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAdInfo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAdTitle)
                                .addGap(27, 27, 27)
                                .addComponent(txtAdTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(lblColumns)
                                .addGap(18, 18, 18)
                                .addComponent(cmbColumns, 0, 105, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblCat)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeleteAd, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMakePayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBalance))))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCat)
                    .addComponent(cmbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdTitle)
                    .addComponent(txtAdTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAdInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPublishDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColumns)
                    .addComponent(cmbColumns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblBalance))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteAd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "ad";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            Statement st = conn.createStatement();
            String queryText = "SELECT * FROM ad WHERE adID=" + this.adID;
            ResultSet adTable = st.executeQuery(queryText);
            if (adTable.next()) {
                txtAdTitle.setText(adTable.getString("title"));
                txtAdInformation.setText(adTable.getString("contents"));
            }

            String date = adTable.getString("publishDate");
            String pubYear = date.substring(0, 4);
            String pubMonth = date.substring(5, 7);
            String pubDay = date.substring(8, 10);

            cmbColumns.removeAllItems();
            int columns = adTable.getInt("columns");
            for (int i = 1; i < 5; i++) {
                cmbColumns.addItem(i);
            }
            cmbColumns.setSelectedIndex(columns - 1);

            String catID = adTable.getString("catID");
            queryText = "SELECT catName FROM category WHERE catID=" + catID;
            adTable = st.executeQuery(queryText);
            cmbCat.removeAllItems();
            if (adTable.next()) {
                cmbCat.addItem(adTable.getString("catName"));
            }
            queryText = "SELECT catName FROM category";
            adTable = st.executeQuery(queryText);
            while (adTable.next()) {
                String cat = adTable.getString("catName");
                if (!cat.equals(cmbCat.getItemAt(0))) {
                    cmbCat.addItem(cat);
                }
            }

            cmbYear.removeAllItems();
            cmbYear.addItem("Year");
            int year = 2014;
            while (year <= 2044) {
                String strYear = Integer.toString(year);
                cmbYear.addItem(strYear);
                year++;
            }
            for (int i = 0; i <= cmbYear.getItemCount(); i++) {
                if (cmbYear.getItemAt(i).equals(pubYear)) {
                    cmbYear.setSelectedIndex(i);
                    break;
                }
            }

            //Fill Combo Box with months
            cmbMonth.removeAllItems();
            cmbMonth.addItem("Month");
            cmbMonth.addItem("01");
            cmbMonth.addItem("02");
            cmbMonth.addItem("03");
            cmbMonth.addItem("04");
            cmbMonth.addItem("05");
            cmbMonth.addItem("06");
            cmbMonth.addItem("07");
            cmbMonth.addItem("08");
            cmbMonth.addItem("09");
            cmbMonth.addItem("10");
            cmbMonth.addItem("11");
            cmbMonth.addItem("12");
            for (int i = 0; i <= cmbMonth.getItemCount(); i++) {
                if (cmbMonth.getItemAt(i).equals(pubMonth)) {
                    cmbMonth.setSelectedIndex(i);
                    break;
                }
            }

            //Fill Combo Box with days
            cmbDay.removeAllItems();
            cmbDay.addItem("Day");

            int i = 1;
            while (i <= 31) {
                //Convert int value to string
                String str = Integer.toString(i);
                if (i < 10) {
                    cmbDay.addItem("0" + str);
                    i++;
                } else {
                    cmbDay.addItem(str);
                    i++;
                }
            }
            for (int j = 0; j <= 31; j++) {
                if (cmbDay.getItemAt(j).equals(pubDay)) {
                    cmbDay.setSelectedIndex(j);
                    break;
                }
            }
            cmbYear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!(cmbMonth.getSelectedIndex() == 0)) {
                        if (!(cmbYear.getSelectedIndex() == 0)) {
                            int i = 1;
                            while (i <= 28) {
                                //Convert int value to string
                                String str = Integer.toString(i);
                                if (i < 10) {
                                    cmbDay.addItem("0" + str);
                                    i++;
                                } else {
                                    cmbDay.addItem(str);
                                    i++;
                                }
                            }
                            if (cmbMonth.getSelectedItem().toString().equals("02")) {
                                if (Integer.parseInt(cmbYear.getSelectedItem().toString()) % 4 == 0) {
                                    cmbDay.addItem("29");
                                }
                            } else {
                                cmbDay.addItem("30");
                                if (cmbMonth.getSelectedItem().toString().equals("01") || cmbMonth.getSelectedItem().toString().equals("03") || cmbMonth.getSelectedItem().toString().equals("05") || cmbMonth.getSelectedItem().toString().equals("07") || cmbMonth.getSelectedItem().toString().equals("08") || cmbMonth.getSelectedItem().toString().equals("10") || cmbMonth.getSelectedItem().toString().equals("12")) {
                                    cmbDay.addItem("31");
                                }
                            }
                        }
                    }
                }
            });
            cmbMonth.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!(cmbYear.getSelectedIndex() == 0)) {
                        int i = 1;
                        while (i <= 28) {
                            //Convert int value to string
                            String str = Integer.toString(i);
                            if (i < 10) {
                                cmbDay.addItem("0" + str);
                                i++;
                            } else {
                                cmbDay.addItem(str);
                                i++;
                            }
                        }
                        if (cmbMonth.getSelectedItem().toString().equals("02")) {
                            if (Integer.parseInt(cmbYear.getSelectedItem().toString()) % 4 == 0) {
                                cmbDay.addItem("29");
                            }
                        } else {
                            cmbDay.addItem("30");
                            if (cmbMonth.getSelectedItem().toString().equals("01") || cmbMonth.getSelectedItem().toString().equals("03") || cmbMonth.getSelectedItem().toString().equals("05") || cmbMonth.getSelectedItem().toString().equals("07") || cmbMonth.getSelectedItem().toString().equals("08") || cmbMonth.getSelectedItem().toString().equals("10") || cmbMonth.getSelectedItem().toString().equals("12")) {
                                cmbDay.addItem("31");
                            }
                        }
                    }
                }
            });
           adTable= st.executeQuery("select paymentPlan.balance,paymentPlan.totalAmountPayed from paymentPlan,ad where ad.planID=paymentPlan.planID and ad.adID="+this.adID);
           if (adTable.next())
           {
               double balance=adTable.getDouble("balance")-adTable.getDouble("totalAmountPayed");
               this.lblBalance.setText("$"+balance+"0");
           }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "ad";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            Statement st = conn.createStatement();
            String queryText = "SELECT catID FROM category WHERE catName='" + cmbCat.getSelectedItem().toString() + "'";
            ResultSet adTable = st.executeQuery(queryText);
            int catID = 0;
            while (adTable.next()) {
                catID = adTable.getInt("catID");
            }
            int columns = Integer.parseInt(cmbColumns.getSelectedItem().toString());
            queryText = "UPDATE ad SET ";
            if (txtAdTitle.getText() != "" && txtAdInformation.getText() != "") {
                queryText += "title='" + txtAdTitle.getText() + "', contents='" + txtAdInformation.getText() + "'";
                queryText += ", catID=" + catID;
                queryText += ", columns=" + columns;
                if (cmbYear.getSelectedIndex() != 0 && cmbMonth.getSelectedIndex() != 0 && cmbDay.getSelectedIndex() != 0) {
                    String date = "";
                    date += cmbYear.getSelectedItem().toString() + "-";
                    date += cmbMonth.getSelectedItem().toString() + "-";
                    date += cmbDay.getSelectedItem().toString() + " 00:00:00";
                    queryText += ", publishDate='" + date + "'";
                }
            }
            queryText += " WHERE adID=" + this.adID;
            
            
            int counter = 0;

            
            
            if(txtAdTitle.getText().equals("")){
               lblAdTitle.setForeground(Color.RED);
               counter ++;
           }
            if(txtAdInformation.getText().equals("")){
               lblAdInfo.setForeground(Color.RED);
               counter ++;
           }
            if(cmbYear.getSelectedItem().equals("Year")){
                lblPublishDate.setForeground(Color.RED);
                counter ++;
            }
           if(cmbMonth.getSelectedItem().equals("Month")){
                lblPublishDate.setForeground(Color.RED);
                counter ++;
            }
            if(cmbDay.getSelectedItem().equals("Day")){
                lblPublishDate.setForeground(Color.RED);
                counter ++;
            }
            if(counter == 0){
            st.executeUpdate(queryText);
            
              java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSuccessWindow().setVisible(true);
            }
        });
              
        this.setVisible(false);
        this.dispose();
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
                "Are you sure you want to cancel?", null, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnMakePaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMakePaymentMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmMakePayment toOpen=new frmMakePayment();
                toOpen.setAdID(adID);
                toOpen.setVisible(true);
            }
        });
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnMakePaymentMouseClicked

    private void btnDeleteAdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAdMouseClicked
        int reply = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete this ad? There is no undoing this!", null, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "ad";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try {
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url + dbName, userName, password);
                Statement st = conn.createStatement();
                String queryText="select * from ad, paymentPlan where ad.planID=paymentPlan.planID and ad.adID="+this.adID;
                ResultSet adTable=st.executeQuery(queryText);
              double balance=0;
            if(adTable.next())
            {
                int lines;
                String contents=adTable.getString("contents");
                lines=(contents.length()/20);
                int numColumns=adTable.getInt("columns");
                if(lines>2)
                {
                    lines-=2;
                }else{
                    lines=0;
                }
                if (numColumns==1)
                {
                    balance+=4;
                    double amtToAdd=0;
                    amtToAdd+=(lines*0.5);
                    balance+=amtToAdd;
                }else if(numColumns==2){
                    balance+=5.50;
                    double amtToAdd=0;
                    amtToAdd+=(lines * .75);
                    balance+=amtToAdd;
                }else if(numColumns==3){
                    balance+=6.50;
                    double amtToAdd=0;
                    amtToAdd+=(lines*1.50);
                    balance+=amtToAdd;
                }else if(numColumns==4){
                    balance+=8;
                    double amtToAdd=0;
                    amtToAdd+=(lines*3.00);
                    balance+=amtToAdd;
                }
                
            }
            System.out.println(balance);
            double preExistingBalance=adTable.getDouble("balance");
            if(balance>preExistingBalance)
            {
                preExistingBalance=0;
            }else{
                preExistingBalance-=balance;
            }
            double totalAmtPayed=adTable.getDouble("totalAmountPayed");
            int planID=adTable.getInt("planID");
            if(preExistingBalance<totalAmtPayed)
            {
                double amtToRefund=totalAmtPayed-preExistingBalance;
                
                st.executeUpdate("insert into payment (paymentAmount,planID) values ("+ -amtToRefund+", "+planID+")");
                JOptionPane.showMessageDialog(null, "User has already made payments in excess of new plan balance. User refunded $"+ amtToRefund+". Information sent to billing.");
            }
            st.executeUpdate("update paymentPlan set balance="+preExistingBalance+" where planID="+planID);
                queryText=("delete from ad where adID="+this.adID);
               st.execute(queryText);
                JOptionPane.showMessageDialog(null, "Ad Deleted.");
                this.setVisible(false);
                this.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteAdMouseClicked

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
            java.util.logging.Logger.getLogger(frmModifyAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModifyAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModifyAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModifyAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModifyAd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteAd;
    private javax.swing.JButton btnMakePayment;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbCat;
    private javax.swing.JComboBox cmbColumns;
    private javax.swing.JComboBox cmbDay;
    private javax.swing.JComboBox cmbMonth;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdInfo;
    private javax.swing.JLabel lblAdTitle;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblColumns;
    private javax.swing.JLabel lblPublishDate;
    private javax.swing.JTextArea txtAdInfo;
    private javax.swing.JTextArea txtAdInformation;
    private javax.swing.JTextField txtAdTitle;
    // End of variables declaration//GEN-END:variables
}
