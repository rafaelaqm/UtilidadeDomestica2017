
package view;

import control.ConectaBanco;


public class TelaPrincipal extends javax.swing.JFrame {
    
    ConectaBanco conecta = new ConectaBanco();//variavel global 
    
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        txtPrincipal = new javax.swing.JMenuBar();
        txtArquivo = new javax.swing.JMenu();
        txtVenda = new javax.swing.JMenuItem();
        txtCadastro = new javax.swing.JMenu();
        txtFuncionario = new javax.swing.JMenuItem();
        txtProduto = new javax.swing.JMenuItem();
        txtSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        txtPrincipal.setToolTipText("");

        txtArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.png"))); // NOI18N
        txtArquivo.setText("Arquivo");

        txtVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sales.png"))); // NOI18N
        txtVenda.setText("Venda");
        txtVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendaActionPerformed(evt);
            }
        });
        txtArquivo.add(txtVenda);

        txtPrincipal.add(txtArquivo);

        txtCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group_add.png"))); // NOI18N
        txtCadastro.setText("Cadastro");
        txtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastroActionPerformed(evt);
            }
        });

        txtFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group.png"))); // NOI18N
        txtFuncionario.setText("Funcionario");
        txtFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionarioActionPerformed(evt);
            }
        });
        txtCadastro.add(txtFuncionario);

        txtProduto.setText("Produto");
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });
        txtCadastro.add(txtProduto);

        txtPrincipal.add(txtCadastro);

        txtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/house_go.png"))); // NOI18N
        txtSair.setText("Sair");
        txtSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSairMouseClicked(evt);
            }
        });
        txtPrincipal.add(txtSair);

        setJMenuBar(txtPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionarioActionPerformed
            TelaFuncionario frm = new TelaFuncionario();
            frm.setVisible(true);  
       
    }//GEN-LAST:event_txtFuncionarioActionPerformed

    private void txtVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaActionPerformed
            TelaVenda frm = new TelaVenda();
            frm.setVisible(true);
    }//GEN-LAST:event_txtVendaActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
            TelaProduto frm = new TelaProduto();
            frm.setVisible(true);  
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSairMouseClicked
            conecta.desconecta();
            System.exit(0);
    }//GEN-LAST:event_txtSairMouseClicked

    private void txtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastroActionPerformed
            
    }//GEN-LAST:event_txtCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu txtArquivo;
    private javax.swing.JMenu txtCadastro;
    private javax.swing.JMenuItem txtFuncionario;
    private javax.swing.JMenuBar txtPrincipal;
    private javax.swing.JMenuItem txtProduto;
    private javax.swing.JMenu txtSair;
    private javax.swing.JMenuItem txtVenda;
    // End of variables declaration//GEN-END:variables

   
    

   

    

}
