/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.SistemaEstagioController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;
import model.Vaga;
import model.VagasComboBoxModel;

/**
 *
 * @author ranoc
 */
public class AlunoView extends javax.swing.JFrame {
    private Aluno currentAluno;
    private VagasComboBoxModel vagasComboModel;
    SistemaEstagioController system;
    /**
     * Creates new form AlunoView
     */
    public AlunoView() throws IOException {
        system = new SistemaEstagioController();
        vagasComboModel = new VagasComboBoxModel(system.getVagas());
        /*
        TODO: Fazer sistema de login
        */
        currentAluno = system.getAlunoByCPF("123456789");
        initComponents();   
        /*
        system.addAluno(new Aluno(
                "nome",
                "emai",
                "cidade",
                "estado",
                "pais",
                "curso",
                "universidade",
                "descricao",
                "123456789")
        );
        system.addEmpresa(new Empresa(
                "nome",
                "1234",
                "areaAtuacao",
                "porte", 
                "email",
                null)
        );
        var a = new Aluno("Rafael Correia",
                "rafael@gmail.com", 
                "Presidente Prudente", 
                "São Paulo", 
                "Brasil", 
                "Ciência da Computação", 
                "FCT UNESP", 
                "Aluno competente", 
                "11111111111");
        system.addAluno(a);
        var v = new Vaga(1,
                "Engenheiro de Software Estágiário",
                "Tecnologia da Informação",
                "São Paulo", 
                "Presidente Prudente", 
                "Estagio",
                800.0f,
                30, 
                180,
                "Contrata pessoa engenheira de software por 3 mêses carga horário 30 horas semanais",
                "Contratando",
                null);
        system.addVaga("1234", v);
        system.addVagaAluno("11111111111", 1);
        */
        //System.out.println(VagasController.vagas);
        
        populateVagas();
        comboVaga.setVisible(false);
        labelVaga.setVisible(false);
        btnCandidatarAluno.setVisible(false);
    }
    
    private void populateVagas(){
        var showVagas = "";
        for(var vaga : system.getVagas()){
            showVagas += vaga.textFieldPrep();
        }
        tareaVagas.setText(showVagas);
    }
    
    public void update(){
        populateVagas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tareaVagas = new javax.swing.JTextArea();
        comboVaga = new javax.swing.JComboBox(vagasComboModel);
        btnCandidatarAluno = new javax.swing.JButton();
        labelVaga = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addAluno = new javax.swing.JMenuItem();
        miEditarAluno = new javax.swing.JMenuItem();
        menuVagas = new javax.swing.JMenuItem();
        menuCandidatar = new javax.swing.JMenu();
        miCandVaga = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perspectiva do Aluno");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vagas"));

        tareaVagas.setEditable(false);
        tareaVagas.setColumns(20);
        tareaVagas.setRows(5);
        tareaVagas.setEnabled(false);
        jScrollPane1.setViewportView(tareaVagas);

        comboVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVagaActionPerformed(evt);
            }
        });

        btnCandidatarAluno.setText("OK");
        btnCandidatarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatarAlunoActionPerformed(evt);
            }
        });

        labelVaga.setText("Selecionar Vaga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCandidatarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelVaga)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelVaga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCandidatarAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Save");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        addAluno.setText("Adicionar Aluno");
        addAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlunoActionPerformed(evt);
            }
        });
        jMenu2.add(addAluno);

        miEditarAluno.setText("Editar Aluno");
        miEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarAlunoActionPerformed(evt);
            }
        });
        jMenu2.add(miEditarAluno);

        menuVagas.setText("Listar Vagas");
        menuVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVagasActionPerformed(evt);
            }
        });
        jMenu2.add(menuVagas);

        jMenuBar1.add(jMenu2);

        menuCandidatar.setText("Candidatar");

        miCandVaga.setText("Selecionar Vaga");
        miCandVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCandVagaActionPerformed(evt);
            }
        });
        menuCandidatar.add(miCandVaga);

        jMenuBar1.add(menuCandidatar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            system.save();
        } catch (IOException ex) {
            Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void addAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlunoActionPerformed
        var addAlunoFrame = new AddAluno(this);
        addAlunoFrame.setVisible(true);
        var aluno = addAlunoFrame.getAluno();
        system.addAluno(aluno);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_addAlunoActionPerformed

    private void miCandVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCandVagaActionPerformed
        tareaVagas.setText("");
        comboVaga.setVisible(true);
        labelVaga.setVisible(true);
        btnCandidatarAluno.setVisible(true);
        update();
    }//GEN-LAST:event_miCandVagaActionPerformed

    private void btnCandidatarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatarAlunoActionPerformed
        update();
        
        comboVaga.setVisible(false);
        labelVaga.setVisible(false);
        btnCandidatarAluno.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCandidatarAlunoActionPerformed

    private void comboVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVagaActionPerformed
        Vaga selectedVaga = (Vaga) comboVaga.getSelectedItem();
        tareaVagas.setText(selectedVaga.textFieldPrep());
        // TODO add your handling code here:
    }//GEN-LAST:event_comboVagaActionPerformed

    private void miEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarAlunoActionPerformed
        var editarAlunoFrame = new EditAluno(this, currentAluno);
        editarAlunoFrame.setVisible(true);
        var alunoEditado = editarAlunoFrame.getAlunoEditado();
        system.addAluno(alunoEditado);
        update();
        // TODO add your handling code here:
    }//GEN-LAST:event_miEditarAlunoActionPerformed

    private void menuVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuVagasActionPerformed

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
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AlunoView().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addAluno;
    private javax.swing.JButton btnCandidatarAluno;
    private javax.swing.JComboBox<String> comboVaga;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelVaga;
    private javax.swing.JMenu menuCandidatar;
    private javax.swing.JMenuItem menuVagas;
    private javax.swing.JMenuItem miCandVaga;
    private javax.swing.JMenuItem miEditarAluno;
    private javax.swing.JTextArea tareaVagas;
    // End of variables declaration//GEN-END:variables
}
