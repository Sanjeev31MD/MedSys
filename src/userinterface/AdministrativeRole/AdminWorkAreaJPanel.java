package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;

import static Logger.Logger.logger;

import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    private UserAccount userAccount;
    

    /**
     * Creates new form AdminWorkAreaJPanel
     */

    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount) {

    
        logger.log(Level.INFO, "AdminWorkAreaJPanel");


        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        valueLabel.setText(enterprise.getName());

        if (enterprise.getEnterpriseType() != Enterprise.EnterpriseType.Hospital) {
            btnCreatePatient.setVisible(false);
            btnManageLocations.setVisible(false);
            createAppointment.setVisible(false);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        createAppointment = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        btnManageLocations = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel1.setText("ADMINISTRATIVE WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        userJButton.setText("Manage User");
        userJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 180, -1));

        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 180, -1));

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 180, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 130, 30));

        createAppointment.setText("Create Appointment");
        createAppointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppointmentActionPerformed(evt);
            }
        });
        add(createAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 180, -1));

        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });
        add(btnCreatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 180, -1));

        btnManageLocations.setText("Manage Locations");
        btnManageLocations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLocationsActionPerformed(evt);
            }
        });
        add(btnManageLocations, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 180, -1));

        jButton1.setText("Emergency Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 180, -1));

        jButton2.setText("Transfer Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:

        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise, userAccount);

        logger.log(Level.INFO, "userJButtonActionPerformed --AdminWorkAreaJPanel");


        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        logger.log(Level.INFO, "manageEmployeeJButtonActionPerformed --AdminWorkAreaJPanel");

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        logger.log(Level.INFO, "manageOrganizationJButtonActionPerformed --AdminWorkAreaJPanel");

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);

        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void createAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppointmentActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "createAppointmentActionPerformed --AdminWorkAreaJPanel");

        CreateAppointmentJPanel createAppointmentJPanel = new CreateAppointmentJPanel(userProcessContainer,
                enterprise);
        userProcessContainer.add("createAppointmentJPanel", createAppointmentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createAppointmentActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnCreatePatientActionPerformed --AdminWorkAreaJPanel");

        CreatePatientJPanel createPatientJPanel = new CreatePatientJPanel(userProcessContainer,
                enterprise);
        userProcessContainer.add("createPatientJPanel", createPatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnManageLocationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLocationsActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnManageLocationsActionPerformed --AdminWorkAreaJPanel");

        ManageLocations manageLocations = new ManageLocations(userProcessContainer,
                enterprise);
        userProcessContainer.add("manageLocations", manageLocations);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageLocationsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "jButton1ActionPerformed --AdminWorkAreaJPanel");

        IncomingRequest incomingReq = new IncomingRequest(userProcessContainer, enterprise);
        userProcessContainer.add("incomingReq", incomingReq);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "jButton1ActionPerformed --AdminWorkAreaJPanel");

        TransferRequest transferRequest = new TransferRequest(userProcessContainer, enterprise);
        userProcessContainer.add("incomingReq", transferRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnManageLocations;
    private javax.swing.JButton createAppointment;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}