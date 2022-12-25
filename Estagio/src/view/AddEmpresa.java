/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.SistemaEstagioController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Empresa;

/**
 *
 * @author ranoc
 */
public class AddEmpresa extends javax.swing.JPanel {
    private static Empresa empresa;

    /**
     * Creates new form AddEmpresa
     */
    public AddEmpresa() {
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

        panelAddEmpresa = new javax.swing.JPanel();
        inputEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        inputCNPJ = new javax.swing.JTextField();
        labelCNPJ = new javax.swing.JLabel();
        labelPorte = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        labelArea = new javax.swing.JLabel();
        inputAreaAtuacao = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        selectPorte = new javax.swing.JComboBox<>();

        panelAddEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        labelEmail.setText("E-mail");

        labelCNPJ.setText("CNPJ");

        labelPorte.setText("Porte");

        labelNome.setText("Nome");

        labelArea.setText("Área de Atuação");

        btnAdd.setText("OK");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        selectPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Micro-Empresa", "Pequeno", "Médio", "Grande", "Gigante" }));
        selectPorte.setSelectedItem(-1);
        selectPorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPorteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddEmpresaLayout = new javax.swing.GroupLayout(panelAddEmpresa);
        panelAddEmpresa.setLayout(panelAddEmpresaLayout);
        panelAddEmpresaLayout.setHorizontalGroup(
            panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputEmail)
                    .addComponent(inputNome)
                    .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                        .addGroup(panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail)
                            .addComponent(labelCNPJ)
                            .addComponent(inputCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPorte)
                            .addComponent(selectPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddEmpresaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                        .addGroup(panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelArea))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inputAreaAtuacao))
                .addContainerGap())
        );
        panelAddEmpresaLayout.setVerticalGroup(
            panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                        .addComponent(labelPorte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                        .addComponent(labelCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnAdd))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAddEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAddEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        var nome = inputNome.getText();
        var email = inputEmail.getText();
        var areaAtuacao = inputAreaAtuacao.getText();
        var CNPJ = inputCNPJ.getText();
        var porte = selectPorte.getSelectedItem().toString();

        empresa = new Empresa(nome, CNPJ, areaAtuacao, porte, email, null);
        
        
        inputNome.setText("");
        inputEmail.setText("");
        inputAreaAtuacao.setText("");
        inputCNPJ.setText("");
        selectPorte.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddActionPerformed

    private void selectPorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPorteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField inputAreaAtuacao;
    private javax.swing.JTextField inputCNPJ;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelCNPJ;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPorte;
    private javax.swing.JPanel panelAddEmpresa;
    private javax.swing.JComboBox<String> selectPorte;
    // End of variables declaration//GEN-END:variables
    public static Empresa getNew() {
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
            java.util.logging.Logger.getLogger(AddVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmpresa().setVisible(true);
            }
        });
        return empresa;
    }
}
