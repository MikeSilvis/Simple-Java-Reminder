package lab2;


public class LoginUI extends javax.swing.JPanel {

    //Controller attribute
    private LoginCntl theLoginCntl;

    //Constructor
    public LoginUI(LoginCntl sentLoginCntl) {

        theLoginCntl = sentLoginCntl;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(275, 415));

        usernameField.setText("MikeSilvis");
        usernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameField.setFocusCycleRoot(true);

        submitButton.setText("Submit");
        submitButton.setRequestFocusEnabled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reminders");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Username:");
        jLabel2.setPreferredSize(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Password:");
        jLabel3.setPreferredSize(null);

        passwordField.setText("Michael1%");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Don't have an account?");

        jButton1.setText("Register Now");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleName("errorMessage");
    }// </editor-fold>//GEN-END:initComponents

    //Sends message back to the controller, informing it that the "Manage Users" button was clicked
    //Sends message back to the controller, informing it that the "Submit" button was clicked along with the necessary parameters
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if((passwordField.getText().equals("")) || (usernameField.getText().equals("")))
        {
            System.out.println("Missing field data!");
            setTextofJlabel5("Missing field data!");
        }
        else
        {
            theLoginCntl.submitButtonClicked(usernameField.getText(), passwordField.getText());
        }  
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        theLoginCntl.registerClicked();
    }//GEN-LAST:event_jButton1MouseClicked

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
    public void setTextofJlabel5(String text){
        jLabel5.setText(text);
    }
}
