/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_gui.teacher;

/**
 *
 * @author Leshan
 */
public class UpdateTeacherForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateTeacherForm
     */
    public UpdateTeacherForm() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblTitle = new javax.swing.JLabel();
        middlePane = new javax.swing.JPanel();
        lblSID = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        lblAddress1 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        lblAddress2 = new javax.swing.JLabel();
        txtAddress2 = new javax.swing.JTextField();
        lblAddress3 = new javax.swing.JLabel();
        txtAddress3 = new javax.swing.JTextField();
        lblMobileNo = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        lblTelNo = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        comboSID = new javax.swing.JComboBox();
        butSearch = new javax.swing.JButton();
        buttonPane = new javax.swing.JPanel();
        butCancel = new javax.swing.JButton();
        butUpdate = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        middlePane1 = new javax.swing.JPanel();
        lblCode = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        lblLastName1 = new javax.swing.JLabel();
        txtLastName1 = new javax.swing.JTextField();
        txtFirstName1 = new javax.swing.JTextField();
        lblDOB1 = new javax.swing.JLabel();
        txtDOB1 = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        txtAddress4 = new javax.swing.JTextField();
        lblAddress5 = new javax.swing.JLabel();
        txtAddress5 = new javax.swing.JTextField();
        lblAddress6 = new javax.swing.JLabel();
        txtAddress6 = new javax.swing.JTextField();
        lblMobileNo1 = new javax.swing.JLabel();
        txtMobileNo1 = new javax.swing.JTextField();
        lblTelNo1 = new javax.swing.JLabel();
        txtTelNo1 = new javax.swing.JTextField();
        comboCode = new javax.swing.JComboBox();
        butSearch1 = new javax.swing.JButton();
        buttonPane1 = new javax.swing.JPanel();
        butCancel1 = new javax.swing.JButton();
        butUpdate1 = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UPDATE STUDENT");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        middlePane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSID.setText("Student ID:");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblDOB.setText("Date Of Birth:");

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        lblAddress1.setText("Address1:");

        txtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress1ActionPerformed(evt);
            }
        });

        lblAddress2.setText("Address2:");

        txtAddress2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress2ActionPerformed(evt);
            }
        });

        lblAddress3.setText("Address3:");

        txtAddress3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress3ActionPerformed(evt);
            }
        });

        lblMobileNo.setText("Mobile No. :");

        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });

        lblTelNo.setText("Tel no.(Home):");

        txtTelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelNoActionPerformed(evt);
            }
        });

        comboSID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSIDActionPerformed(evt);
            }
        });

        butSearch.setText("Search");

        javax.swing.GroupLayout middlePaneLayout = new javax.swing.GroupLayout(middlePane);
        middlePane.setLayout(middlePaneLayout);
        middlePaneLayout.setHorizontalGroup(
            middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMobileNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLastName))
                    .addGroup(middlePaneLayout.createSequentialGroup()
                        .addComponent(comboSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        middlePaneLayout.setVerticalGroup(
            middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSID)
                    .addComponent(comboSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress1)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress2)
                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress3)
                    .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobileNo)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        buttonPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        butCancel.setText("Cancel");
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });

        butUpdate.setText("Update");

        javax.swing.GroupLayout buttonPaneLayout = new javax.swing.GroupLayout(buttonPane);
        buttonPane.setLayout(buttonPaneLayout);
        buttonPaneLayout.setHorizontalGroup(
            buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butCancel)
                .addContainerGap())
        );
        buttonPaneLayout.setVerticalGroup(
            buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPaneLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCancel)
                    .addComponent(butUpdate))
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(middlePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(middlePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblTitle1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("UPDATE TEACHER");
        lblTitle1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        middlePane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCode.setText("Teacher code:");

        lblFirstName1.setText("First Name:");

        lblLastName1.setText("Last Name:");

        txtLastName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastName1ActionPerformed(evt);
            }
        });

        lblDOB1.setText("Date Of Birth:");

        txtDOB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOB1ActionPerformed(evt);
            }
        });

        lblAddress4.setText("Address1:");

        txtAddress4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress4ActionPerformed(evt);
            }
        });

        lblAddress5.setText("Address2:");

        txtAddress5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress5ActionPerformed(evt);
            }
        });

        lblAddress6.setText("Address3:");

        txtAddress6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress6ActionPerformed(evt);
            }
        });

        lblMobileNo1.setText("Mobile No. :");

        txtMobileNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNo1ActionPerformed(evt);
            }
        });

        lblTelNo1.setText("Tel no.(Home):");

        txtTelNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelNo1ActionPerformed(evt);
            }
        });

        comboCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCodeActionPerformed(evt);
            }
        });

        butSearch1.setText("Search");

        javax.swing.GroupLayout middlePane1Layout = new javax.swing.GroupLayout(middlePane1);
        middlePane1.setLayout(middlePane1Layout);
        middlePane1Layout.setHorizontalGroup(
            middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMobileNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDOB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelNo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFirstName1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(txtDOB1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddress5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddress6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMobileNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLastName1))
                    .addGroup(middlePane1Layout.createSequentialGroup()
                        .addComponent(comboCode, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butSearch1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        middlePane1Layout.setVerticalGroup(
            middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCode)
                    .addComponent(comboCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName1)
                    .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName1)
                    .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB1)
                    .addComponent(txtDOB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress4)
                    .addComponent(txtAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress5)
                    .addComponent(txtAddress5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress6)
                    .addComponent(txtAddress6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo1)
                    .addComponent(txtTelNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobileNo1)
                    .addComponent(txtMobileNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        buttonPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        butCancel1.setText("Cancel");
        butCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancel1ActionPerformed(evt);
            }
        });

        butUpdate1.setText("Update");

        javax.swing.GroupLayout buttonPane1Layout = new javax.swing.GroupLayout(buttonPane1);
        buttonPane1.setLayout(buttonPane1Layout);
        buttonPane1Layout.setHorizontalGroup(
            buttonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butUpdate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butCancel1)
                .addContainerGap())
        );
        buttonPane1Layout.setVerticalGroup(
            buttonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPane1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(buttonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCancel1)
                    .addComponent(butUpdate1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(middlePane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(middlePane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress1ActionPerformed

    private void txtAddress2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress2ActionPerformed

    private void txtAddress3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress3ActionPerformed

    private void txtMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNoActionPerformed

    private void txtTelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelNoActionPerformed

    private void comboSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSIDActionPerformed

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butCancelActionPerformed

    private void txtLastName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastName1ActionPerformed

    private void txtDOB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOB1ActionPerformed

    private void txtAddress4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress4ActionPerformed

    private void txtAddress5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress5ActionPerformed

    private void txtAddress6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress6ActionPerformed

    private void txtMobileNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNo1ActionPerformed

    private void txtTelNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelNo1ActionPerformed

    private void comboCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCodeActionPerformed

    private void butCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butCancel1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butCancel1;
    private javax.swing.JButton butSearch;
    private javax.swing.JButton butSearch1;
    private javax.swing.JButton butUpdate;
    private javax.swing.JButton butUpdate1;
    private javax.swing.JPanel buttonPane;
    private javax.swing.JPanel buttonPane1;
    private javax.swing.JComboBox comboCode;
    private javax.swing.JComboBox comboSID;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblAddress3;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblAddress5;
    private javax.swing.JLabel lblAddress6;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDOB1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastName1;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblMobileNo1;
    private javax.swing.JLabel lblSID;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblTelNo1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JPanel middlePane;
    private javax.swing.JPanel middlePane1;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtAddress3;
    private javax.swing.JTextField txtAddress4;
    private javax.swing.JTextField txtAddress5;
    private javax.swing.JTextField txtAddress6;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDOB1;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstName1;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastName1;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtMobileNo1;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtTelNo1;
    // End of variables declaration//GEN-END:variables
}
