/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cyril
 */
public class TiltSelection extends javax.swing.JPanel {

    /**
     * Creates new form TiltSelection
     */
    public TiltSelection() {
        initComponents();
        switchStateTilt(StateTilt.OFFAUTO);
    }
    private enum StateTilt{
        OFFAUTO, ONAUTO, OFFMANUAL, ONMANUAL;
    }
    private StateTilt currentStateTilt;
    private void switchStateTilt(StateTilt state){
        currentStateTilt = state;
        switch(state){
            case OFFAUTO:
                TiltManualButton.setSelected(false);
                TiltAutoButton.setSelected(true);
                SelectionLabel.setText("AUTO");
                StabOnButton.setSelected(false);
                StabOffButton.setSelected(true);
                AngleLabel.setVisible(false);
                StabLabel.setText("OFF");
                jLabel6.setVisible(false);

                break;
            case OFFMANUAL:
                TiltManualButton.setSelected(true);
                TiltAutoButton.setSelected(false);
                SelectionLabel.setText("MANUAL");
                StabOnButton.setSelected(false);
                StabOffButton.setSelected(true);
                AngleLabel.setVisible(false);
                StabLabel.setText("OFF");
                jLabel6.setVisible(false);
                break;
            case ONAUTO:
                TiltManualButton.setSelected(false);
                TiltAutoButton.setSelected(true);
                SelectionLabel.setText("AUTO");
                StabOnButton.setSelected(true);
                StabOffButton.setSelected(false);
                AngleLabel.setVisible(true);
                StabLabel.setText("ON");
                jLabel6.setVisible(true);
                break;
            case ONMANUAL:
                TiltManualButton.setSelected(true);
                TiltAutoButton.setSelected(false);
                SelectionLabel.setText("MANUAL");
                StabOnButton.setSelected(true);
                StabOffButton.setSelected(false);
                AngleLabel.setVisible(true);
                StabLabel.setText("ON");
                jLabel6.setVisible(true);
                break;
        }
    }
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        SelectionLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        StabLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AngleLabel = new javax.swing.JTextField();
        TiltManualButton = new javax.swing.JToggleButton();
        TiltAutoButton = new javax.swing.JToggleButton();
        StabOnButton = new javax.swing.JToggleButton();
        StabOffButton = new javax.swing.JToggleButton();

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("TILT SELECTION >");

        SelectionLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SelectionLabel.setText("MANUAL");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("STABILIZATION >");

        StabLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StabLabel.setText("OFF");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("TILT ANGLE");

        AngleLabel.setText("Angle : 0.0°");
        AngleLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AngleLabelActionPerformed(evt);
            }
        });

        TiltManualButton.setText("Manual");
        TiltManualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiltManualButtonActionPerformed(evt);
            }
        });

        TiltAutoButton.setText("Auto");
        TiltAutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiltAutoButtonActionPerformed(evt);
            }
        });

        StabOnButton.setText("On");
        StabOnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StabOnButtonActionPerformed(evt);
            }
        });

        StabOffButton.setText("Off");
        StabOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StabOffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(AngleLabel)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StabOnButton)
                                .addGap(18, 18, 18)
                                .addComponent(StabOffButton)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StabLabel)))
                        .addGap(109, 109, 109))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TiltManualButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TiltAutoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectionLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TiltManualButton)
                    .addComponent(TiltAutoButton))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StabLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StabOnButton)
                    .addComponent(StabOffButton))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AngleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AngleLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AngleLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AngleLabelActionPerformed

    private void TiltManualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiltManualButtonActionPerformed
        switch(currentStateTilt){
            case OFFAUTO:
                switchStateTilt(StateTilt.OFFMANUAL);
                break;
            case ONAUTO:
                switchStateTilt(StateTilt.ONMANUAL);
                break;
            case OFFMANUAL:
                switchStateTilt(StateTilt.OFFMANUAL);
                break;
            case ONMANUAL:
                switchStateTilt(StateTilt.ONMANUAL);
                break;
        }
    }//GEN-LAST:event_TiltManualButtonActionPerformed

    private void TiltAutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiltAutoButtonActionPerformed
        switch(currentStateTilt){
            case OFFAUTO:
                switchStateTilt(StateTilt.OFFAUTO);
                break;
            case ONAUTO:
                switchStateTilt(StateTilt.ONAUTO);
                break;
            case OFFMANUAL:
                switchStateTilt(StateTilt.OFFAUTO);
                break;
            case ONMANUAL:
                switchStateTilt(StateTilt.ONAUTO);
                break;
        }
    }//GEN-LAST:event_TiltAutoButtonActionPerformed

    private void StabOnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StabOnButtonActionPerformed
        switch(currentStateTilt){
            case OFFAUTO:
                switchStateTilt(StateTilt.ONAUTO);
                break;
            case ONAUTO:
                switchStateTilt(StateTilt.ONAUTO);
                break;
            case OFFMANUAL:
                switchStateTilt(StateTilt.ONMANUAL);
                break;
            case ONMANUAL:
                switchStateTilt(StateTilt.ONMANUAL);
                break;
        }
    }//GEN-LAST:event_StabOnButtonActionPerformed

    private void StabOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StabOffButtonActionPerformed
        switch(currentStateTilt){
            case OFFAUTO:
                switchStateTilt(StateTilt.OFFAUTO);
                break;
            case ONAUTO:
                switchStateTilt(StateTilt.OFFAUTO);
                break;
            case OFFMANUAL:
                switchStateTilt(StateTilt.OFFMANUAL);
                break;
            case ONMANUAL:
                switchStateTilt(StateTilt.OFFMANUAL);
                break;
        }
    }//GEN-LAST:event_StabOffButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AngleLabel;
    private javax.swing.JLabel SelectionLabel;
    private javax.swing.JLabel StabLabel;
    private javax.swing.JToggleButton StabOffButton;
    private javax.swing.JToggleButton StabOnButton;
    private javax.swing.JToggleButton TiltAutoButton;
    private javax.swing.JToggleButton TiltManualButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
