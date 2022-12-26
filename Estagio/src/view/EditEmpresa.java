/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.JFrame;
import model.Empresa;

/**
 *
 * @author ranoc
 */
public class EditEmpresa extends javax.swing.JDialog {
    private static Empresa empresa;

    /**
     * Creates new form AddEmpresa
     */
    public EditEmpresa(JFrame parent, Empresa currentEmpresa) {
        super(parent, "Editar Empresa", true);
        initComponents();
        
        inputNome.setText(empresa.getNome());
        inputEmail.setText(empresa.getEmail());
        inputAreaAtuacao.setText(empresa.getAreaAtuacao());
        inputCNPJ.setText(empresa.getCNPJ());
        selectPorte.setSelectedItem(empresa.getPorte());
    }

    public Empresa getEmpresaEditada(){
        return empresa;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputEmail)
                    .addComponent(inputNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail)
                            .addComponent(labelCNPJ)
                            .addComponent(inputCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPorte)
                            .addComponent(selectPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelArea))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inputAreaAtuacao))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPorte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                .addComponent(btnAdd)
                .addGap(26, 26, 26))
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
    private javax.swing.JComboBox<String> selectPorte;
    // End of variables declaration//GEN-END:variables
    
}
