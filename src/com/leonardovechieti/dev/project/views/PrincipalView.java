/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardovechieti.dev.project.views;

import com.leonardovechieti.dev.project.model.Usuario;

/**
 *
 * @author Leonardo
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public Usuario usuario;
    
    public PrincipalView() {
        initComponents();
        //Seta os dados do usuario logado

    }
    public PrincipalView(Usuario usuario) {
        initComponents();
        //Seta os dados do usuario logado
        setUsuario(usuario);
        this.setVisible(true);
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if(usuario != null){
            labelNomeUsuario.setText(usuario.getNome());
            labelIdUsuario.setText(String.valueOf(usuario.getId()));
            //Seta data atual formatada
            labelDateTime.setText(new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date(System.currentTimeMillis())));
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

        jMenu3 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jToolBar3 = new javax.swing.JToolBar();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        labelVersao = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        labelIdEmpresa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelNomeEmpresa = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        labelIdUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelNomeUsuario = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        lblData1 = new javax.swing.JLabel();
        labelDateTime = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dev - Software");

        jToolBar1.setRollover(true);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);
        jToolBar3.add(jSeparator9);

        labelVersao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelVersao.setText("Versão: 1.0");
        jToolBar3.add(labelVersao);
        jToolBar3.add(jSeparator10);

        labelIdEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelIdEmpresa.setText("ID");
        jToolBar3.add(labelIdEmpresa);

        jLabel3.setText(" - ");
        jToolBar3.add(jLabel3);

        labelNomeEmpresa.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelNomeEmpresa.setText("Nome da Empresa");
        jToolBar3.add(labelNomeEmpresa);
        jToolBar3.add(jSeparator11);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Usuário: ");
        jToolBar3.add(jLabel2);

        labelIdUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelIdUsuario.setText("ID");
        jToolBar3.add(labelIdUsuario);

        jLabel4.setText(" - ");
        jToolBar3.add(jLabel4);

        labelNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelNomeUsuario.setText("Nome do Usuário");
        jToolBar3.add(labelNomeUsuario);
        jToolBar3.add(jSeparator12);

        lblData1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblData1.setText("Data Atual:  ");
        jToolBar3.add(lblData1);

        labelDateTime.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelDateTime.setText("Data");
        jToolBar3.add(labelDateTime);
        jToolBar3.add(jSeparator13);

        jMenu1.setText("Cadastro");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimentações");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatórios");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 534, Short.MAX_VALUE)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JLabel labelDateTime;
    public static javax.swing.JLabel labelIdEmpresa;
    public static javax.swing.JLabel labelIdUsuario;
    public static javax.swing.JLabel labelNomeEmpresa;
    public static javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel labelVersao;
    private javax.swing.JLabel lblData1;
    // End of variables declaration//GEN-END:variables
}