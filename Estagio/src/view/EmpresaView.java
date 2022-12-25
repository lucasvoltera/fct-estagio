/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.SistemaEstagioController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Empresa;
import model.Vaga;
import model.VagasComboBoxModel;
        

/**
 *
 * @author ranoc
 */
public class EmpresaView extends javax.swing.JFrame {
    private final Empresa currentEmpresa;
    private VagasComboBoxModel vagasComboModel;
    private String nomeTituloPainelPrincipal = "Vagas Adicionadas";
    SistemaEstagioController system;
    /**
     * Creates new form EmpresaView
     * @throws java.io.IOException
     */
    public EmpresaView() throws IOException {
        this.system = new SistemaEstagioController();
        vagasComboModel = new VagasComboBoxModel(system.getVagas());
        /*
        TODO: Fazer sistema de login
        */
        currentEmpresa = system.getEmpresaByCNPJ("123456");
        initComponents();
        nomeTituloPainelPrincipal = "vaga";
        populateTextArea();
        
    }
    
    private void populateTextArea(){
        var textAreaString = "";
        switch (nomeTituloPainelPrincipal) {
            case "aluno" -> {
                for( var aluno : system.getTodosAlunosPorEmpresa(currentEmpresa.getCNPJ())) {
                    textAreaString += aluno.textFieldPrep();
                }
                taListItems.setText(textAreaString);
            }
            case "vaga" -> {
                for( var vaga : currentEmpresa.getVagas()) {
                    textAreaString += vaga.textFieldPrep();
                }
                taListItems.setText(textAreaString);
            }
            default -> {
                break;
            }
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

        jMenuItem2 = new javax.swing.JMenuItem();
        panelAddEmpresa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListItems = new javax.swing.JTextArea();
        labelVaga = new javax.swing.JLabel();
        comboVaga = new javax.swing.JComboBox(vagasComboModel);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemSaveFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAddEmpresa = new javax.swing.JMenuItem();
        menuAddVaga = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenu();
        miListarVagas = new javax.swing.JMenuItem();
        miListarAlunos = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        miEditarVaga = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perspectiva da Empresa");

        panelAddEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, nomeTituloPainelPrincipal, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        panelAddEmpresa.setToolTipText("");

        taListItems.setEditable(false);
        taListItems.setColumns(20);
        taListItems.setRows(5);
        taListItems.setEnabled(false);
        jScrollPane1.setViewportView(taListItems);

        labelVaga.setText("Filtrar por vaga");

        comboVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddEmpresaLayout = new javax.swing.GroupLayout(panelAddEmpresa);
        panelAddEmpresa.setLayout(panelAddEmpresaLayout);
        panelAddEmpresaLayout.setHorizontalGroup(
            panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                        .addGroup(panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelVaga)
                            .addComponent(comboVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAddEmpresaLayout.setVerticalGroup(
            panelAddEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(labelVaga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        menuItemSaveFile.setText("Save");
        menuItemSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveFileActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSaveFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Adicionar");

        menuAddEmpresa.setText("Empresa");
        menuAddEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddEmpresaActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddEmpresa);

        menuAddVaga.setText("Vaga");
        menuAddVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddVagaActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddVaga);

        jMenuBar1.add(jMenu2);

        menuListar.setText("Listar");

        miListarVagas.setText("Vagas");
        miListarVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarVagasActionPerformed(evt);
            }
        });
        menuListar.add(miListarVagas);

        miListarAlunos.setText("Alunos");
        miListarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarAlunosActionPerformed(evt);
            }
        });
        menuListar.add(miListarAlunos);

        jMenuBar1.add(menuListar);

        menuEditar.setText("Editar");

        miEditarVaga.setText("Vaga");
        miEditarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarVagaActionPerformed(evt);
            }
        });
        menuEditar.add(miEditarVaga);

        jMenuBar1.add(menuEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                .addComponent(panelAddEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemSaveFileActionPerformed

    private void menuAddEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddEmpresaActionPerformed
        var empresa = AddEmpresa.getNew();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAddEmpresaActionPerformed

    private void menuAddVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddVagaActionPerformed
        var vaga = AddVaga.getNew();        
// TODO add your handling code here:
    }//GEN-LAST:event_menuAddVagaActionPerformed

    private void miListarVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarVagasActionPerformed
        nomeTituloPainelPrincipal = "vaga";
        populateTextArea();
        // TODO add your handling code here:
    }//GEN-LAST:event_miListarVagasActionPerformed

    private void miListarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarAlunosActionPerformed
        nomeTituloPainelPrincipal = "aluno";
        populateTextArea();
        // TODO add your handling code here:
    }//GEN-LAST:event_miListarAlunosActionPerformed

    private void comboVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVagaActionPerformed
        Vaga selectedVaga = (Vaga) comboVaga.getSelectedItem();
        switch (nomeTituloPainelPrincipal) {
            case "aluno":
                var alunosFiltradosString = "";
                for(var aluno : selectedVaga.getAlunos()){
                    alunosFiltradosString += aluno.textFieldPrep();
                } 
                taListItems.setText(alunosFiltradosString);
                break;
            case "vaga":
                taListItems.setText(selectedVaga.textFieldPrep());
                break;
            default:
                throw new AssertionError();
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_comboVagaActionPerformed

    private void miEditarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarVagaActionPerformed
        var vagaEditada = EditVaga.edit(currentEmpresa.getVagas());
        if(vagaEditada != null)
            system.editVaga(vagaEditada);
        // TODO add your handling code here:
        System.out.println(vagaEditada.textFieldPrep());
    }//GEN-LAST:event_miEditarVagaActionPerformed

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
            java.util.logging.Logger.getLogger(EmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EmpresaView().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EmpresaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboVaga;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelVaga;
    private javax.swing.JMenuItem menuAddEmpresa;
    private javax.swing.JMenuItem menuAddVaga;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuItemSaveFile;
    private javax.swing.JMenu menuListar;
    private javax.swing.JMenuItem miEditarVaga;
    private javax.swing.JMenuItem miListarAlunos;
    private javax.swing.JMenuItem miListarVagas;
    private javax.swing.JPanel panelAddEmpresa;
    private javax.swing.JTextArea taListItems;
    // End of variables declaration//GEN-END:variables
}
