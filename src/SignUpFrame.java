
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author devpark
 */
public class SignUpFrame extends javax.swing.JFrame {
    public static boolean idFlag = false;
    public static boolean pwFlag = false;
    public static boolean pwCorrectFlag = false;
    public static boolean nameFlag = false;
    public static boolean ageFlag = false;
    public static boolean addrFlag = false;
    public static boolean phoneNumberFlag = false;
    public static boolean emailFlag = false;
    
    String strSQL;
    
    DB_MAN db = new DB_MAN();
    /**
     * Creates new form SignUpFrame
     */
    public SignUpFrame() {
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

        btnSignUp = new javax.swing.JButton();
        lblSignUp = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblPw = new javax.swing.JLabel();
        lblPwCorrect = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblAddr = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddr = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cboGender = new javax.swing.JComboBox<>();
        lblIdRes = new javax.swing.JLabel();
        lblPwRes = new javax.swing.JLabel();
        lblPwCorrectRes = new javax.swing.JLabel();
        lblNameRes = new javax.swing.JLabel();
        lblAddrRes = new javax.swing.JLabel();
        lblPhoneNumberRes = new javax.swing.JLabel();
        lblEmailRes = new javax.swing.JLabel();
        lblAgeRes = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtPw = new javax.swing.JPasswordField();
        txtPwCorrect = new javax.swing.JPasswordField();
        lblIsEmpty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSignUp.setText("???  ???");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblSignUp.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        lblSignUp.setText("?????? ?????? ??????");

        lblId.setText("?????????");

        lblPw.setText("????????????");

        lblPwCorrect.setText("???????????? ??????");

        lblName.setText("??????");

        lblAge.setText("????????????");

        lblAddr.setText("??????");

        lblGender.setText("??????");

        lblPhoneNumber.setText("????????????");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtAddr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddrKeyReleased(evt);
            }
        });

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });

        lblEmail.setText("?????????");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "??????" }));
        cboGender.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGenderItemStateChanged(evt);
            }
        });

        lblIdRes.setToolTipText("");
        lblIdRes.setPreferredSize(new java.awt.Dimension(42, 17));
        lblIdRes.setSize(new java.awt.Dimension(42, 17));

        lblNameRes.setToolTipText("");

        btnBack.setText("??? ???");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPwKeyReleased(evt);
            }
        });

        txtPwCorrect.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPwCorrectKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPw)
                    .addComponent(lblPwCorrect)
                    .addComponent(lblId)
                    .addComponent(lblName)
                    .addComponent(lblAge)
                    .addComponent(lblAddr)
                    .addComponent(lblGender)
                    .addComponent(lblPhoneNumber)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSignUp)
                        .addGap(44, 44, 44)
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPwCorrect, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPw, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblIdRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgeRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAddr)
                                    .addComponent(txtAge)
                                    .addComponent(txtName)
                                    .addComponent(lblPwCorrectRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail)
                                    .addComponent(lblAddrRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmailRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPhoneNumberRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNameRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPwRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblSignUp)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIsEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblSignUp)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdRes, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPw)
                    .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPwRes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwCorrect)
                    .addComponent(txtPwCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPwCorrectRes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNameRes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgeRes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddr)
                    .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddrRes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPhoneNumber)))
                .addComponent(lblPhoneNumberRes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailRes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblIsEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignUp)
                    .addComponent(btnBack))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        // TODO add your handling code here:
        String id = txtId.getText();
        if (!id.matches("^.{10,20}$")) {
            lblIdRes.setText("10????????? 20??? ????????? ???????????? ???????????????.");
            idFlag = false;
            return;
        }
        if (!id.matches("^[0-9a-z]$")) {
            lblIdRes.setText("????????? ?????????, ????????? ???????????????.");
            idFlag = false; 
            return;
        }
        idFlag = true;
        lblIdRes.setText("");
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String nameCorrect = txtName.getText();
        if (!nameCorrect.matches("^.{2,4}$")) {
            lblNameRes.setText("????????? 2????????? 4????????? ???????????????.");
            nameFlag = false;
            return;
        }
        if (!nameCorrect.matches("^[???-???]$")) {
            lblNameRes.setText("????????? ????????? ??????????????????.");
            nameFlag = false;
            return;
        }
        nameFlag = true;
        lblNameRes.setText("");
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String age = txtAge.getText();
        if (!age.matches("^.{6}$")) {
            lblAgeRes.setText("???????????? 6????????? ??????????????????.");
            ageFlag = false;
            return;
        }
        if (!age.matches("^[0-9]$")) {
            lblAgeRes.setText("??????????????? ????????? ??????????????????.");
            ageFlag = false;
            return;
        }
        ageFlag = true;
        lblAgeRes.setText("?????????????????????.");
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtAddrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrKeyReleased
        // TODO add your handling code here:
        String addr = txtAddr.getText();
        if (!addr.matches("^.*(?=^.{0,40}$).*$")) {
            lblAddrRes.setText("????????? 40??? ????????? ????????? ?????? ????????? ?????? ???????????????.");
            addrFlag = false;
            return;
        }
        addrFlag = true;
        lblAddrRes.setText("?????????????????????.");
    }//GEN-LAST:event_txtAddrKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        // TODO add your handling code here:
        String phoneNumber = txtPhoneNumber.getText();
        if (!phoneNumber.matches("^010-\\d{4}-\\d{4}$")) {
            lblPhoneNumberRes.setText("??????????????? ????????? ??????????????????.");
            phoneNumberFlag = false;
            return;
        }
        phoneNumberFlag = true;
        lblPhoneNumberRes.setText("?????????????????????.");
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String email = txtEmail.getText();
        if (!email.matches("^\\w+@\\w+([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$")) {
            lblEmailRes.setText("???????????? ????????? ??????????????????.");
            emailFlag = false;
            return;
        }
        emailFlag = true;
        lblEmailRes.setText("");
    }//GEN-LAST:event_txtEmailKeyReleased

    private void cboGenderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGenderItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGenderItemStateChanged

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        if (!idFlag) {
            lblIsEmpty.setText("???????????? ???????????????.");
            return;
        }
        if (!pwFlag) {
            lblIsEmpty.setText("??????????????? ???????????????.");
            return;
        }
        if (!pwCorrectFlag) {
            lblIsEmpty.setText("???????????? ???????????? ???????????????.");
            return;
        }
        if (!nameFlag) {
            lblIsEmpty.setText("????????? ???????????????.");
            return;
        }
        if (!ageFlag) {
            lblIsEmpty.setText("??????????????? ???????????????.");
            return;
        }
        if (!addrFlag) {
            lblIsEmpty.setText("????????? ???????????????.");
            return;
        }
        if (!phoneNumberFlag) {
            lblIsEmpty.setText("????????????????????? ???????????????.");
            return;
        }
        if (!emailFlag) {
            lblIsEmpty.setText("???????????? ???????????????.");
            return;
        }
            strSQL = "insert into staff values (";
            strSQL += "'" + "select count(*) from staff" +"', ";
            strSQL += "'" + txtName.getText() + "', ";
            strSQL += "'" + txtId.getText() + "', ";
            strSQL += "'" + Arrays.toString(txtPw.getPassword()) + "', ";
            strSQL += "'" + txtAge.getText() + "', ";
            strSQL += "'" + txtAddr.getText() + "', ";
            strSQL += "'" + cboGender.getSelectedItem().toString() + "', ";
            strSQL += "'" + txtPhoneNumber.getText() + "', ";
            strSQL += "'" + txtEmail.getText() + "')";
        try {
            db.dbOpen();
            db.DB_stmt.executeUpdate(strSQL);
            showMessageDialog(null, "?????? ????????? ?????????????????????.");
            db.dbClose();
            Java_Project login = new Java_Project();
            login.show();
            dispose();            
        } catch(IOException ex) {
            showMessageDialog(null, "DB ????????? ????????? ????????? ??????????????????.");
            return;
        } catch (SQLException ex) {
            Logger.getLogger(SignUpFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Java_Project loginPage = new Java_Project();
        loginPage.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwKeyReleased
        // TODO add your handling code here:
        String pw = txtPw.getText();
        if (!pw.matches("^.*(?=^.{8,16}$).*$")) {
            lblPwRes.setText("8????????? 16??? ????????? ??????????????? ???????????????.");
            pwFlag = false;
            return;
        }
        if (!pw.matches("^.*(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=]).*$")) {
            lblPwRes.setText("??????, ????????????, ????????? ?????? ???????????? ???????????????.");
            pwFlag = false;
            return;
        }
        pwFlag = true;
        lblPwRes.setText("?????????????????????.");
    }//GEN-LAST:event_txtPwKeyReleased

    private void txtPwCorrectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwCorrectKeyReleased
        // TODO add your handling code here:
        String pwCorrect = txtPwCorrect.getText();
        if (!pwCorrect.equals(txtPw.getText())) {
            lblPwCorrectRes.setText("???????????? ??????????????? ???????????? ????????????.");
            pwCorrectFlag = false;
            return;
        }
        pwCorrectFlag = true;
        lblPwCorrectRes.setText("?????????????????????.");
    }//GEN-LAST:event_txtPwCorrectKeyReleased
    
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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel lblAddr;
    private javax.swing.JLabel lblAddrRes;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeRes;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailRes;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdRes;
    private javax.swing.JLabel lblIsEmpty;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameRes;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumberRes;
    private javax.swing.JLabel lblPw;
    private javax.swing.JLabel lblPwCorrect;
    private javax.swing.JLabel lblPwCorrectRes;
    private javax.swing.JLabel lblPwRes;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JTextField txtAddr;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JPasswordField txtPw;
    private javax.swing.JPasswordField txtPwCorrect;
    // End of variables declaration//GEN-END:variables
}
