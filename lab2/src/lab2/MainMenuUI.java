package lab2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class MainMenuUI extends javax.swing.JPanel {

    //Attributes
    private MainMenuCntl theMainMenuCntl;
    private User currentUser;
    ArrayList vals = new ArrayList();
    
    //Constructor
    public MainMenuUI(MainMenuCntl sentMainMenuCntl, User sentUser)
    {
        theMainMenuCntl = sentMainMenuCntl;
        currentUser = sentUser;
        initComponents();

        int listSize = currentUser.getReminderList().size()-1;
        
         for(int i=1; i <= listSize; i++){
            String description = currentUser.getReminderList().get(i).getReminder() + " Due On " + currentUser.getReminderList().get(i).getDue(); 
            vals.add(description);
            
        }
        remindersList.setListData(vals.toArray());
    }
    public void populateList(User sentUser){
        currentUser = sentUser; 
        vals = new ArrayList();
        remindersList.setListData(vals.toArray());
        
        int listSize = currentUser.getReminderList().size()-1;
        
         for(int i=1; i <= listSize; i++){
            String description = currentUser.getReminderList().get(i).getReminder() + " Due On " + currentUser.getReminderList().get(i).getDue(); 
            vals.add(description);
        }
        remindersList.setListData(vals.toArray());        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        remindersList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(275, 415));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reminders");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        remindersList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(remindersList);

        jButton1.setText("Add Reminders");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Reminder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        theMainMenuCntl.addReminderClicked();
    }//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int i = remindersList.getSelectedIndex();
    currentUser.removeReminder(i);
    theMainMenuCntl.deleteReminderClicked();
}//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList remindersList;
    // End of variables declaration//GEN-END:variables


}
