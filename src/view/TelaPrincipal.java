
package view;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JDesktopPane();
        txtPrincipal = new javax.swing.JMenuBar();
        txtArquivo = new javax.swing.JMenu();
        mnuVenda = new javax.swing.JMenuItem();
        mnuEntrarEstoque = new javax.swing.JMenuItem();
        txtCadastro = new javax.swing.JMenu();
        mnuUsuario = new javax.swing.JMenuItem();
        mnuProduto = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        txtPrincipal.setToolTipText("");

        txtArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.png"))); // NOI18N
        txtArquivo.setText("Arquivo");

        mnuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sales.png"))); // NOI18N
        mnuVenda.setText("Venda");
        mnuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVendaActionPerformed(evt);
            }
        });
        txtArquivo.add(mnuVenda);

        mnuEntrarEstoque.setText("Entrar Estoque");
        mnuEntrarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEntrarEstoqueActionPerformed(evt);
            }
        });
        txtArquivo.add(mnuEntrarEstoque);

        txtPrincipal.add(txtArquivo);

        txtCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group_add.png"))); // NOI18N
        txtCadastro.setText("Cadastro");

        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group.png"))); // NOI18N
        mnuUsuario.setText("Usuário");
        mnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioActionPerformed(evt);
            }
        });
        txtCadastro.add(mnuUsuario);

        mnuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrench_orange.png"))); // NOI18N
        mnuProduto.setText("Produto");
        mnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProdutoActionPerformed(evt);
            }
        });
        txtCadastro.add(mnuProduto);

        txtPrincipal.add(txtCadastro);

        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/house_go.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSairMouseClicked(evt);
            }
        });
        txtPrincipal.add(mnuSair);

        setJMenuBar(txtPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal)
        );

        PainelPrincipal.getAccessibleContext().setAccessibleName("AreaTrabalho");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioActionPerformed
        try {
            TelaUsuarioInterna frm = new TelaUsuarioInterna();
            PainelPrincipal.add(frm);
            frm.setVisible(true);
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_mnuUsuarioActionPerformed

    private void mnuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendaActionPerformed
            JOptionPane.showMessageDialog(null, "Janela ainda não implementada");
    }//GEN-LAST:event_mnuVendaActionPerformed

    private void mnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProdutoActionPerformed
        try {
            TelaProdutoInterna frm = new TelaProdutoInterna();
            PainelPrincipal.add(frm);
            frm.setVisible(true);
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuProdutoActionPerformed

    private void mnuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSairMouseClicked
            System.exit(0);
    }//GEN-LAST:event_mnuSairMouseClicked

    private void mnuEntrarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEntrarEstoqueActionPerformed
        try {
            TelaEntrarEstoque frm = new TelaEntrarEstoque();
            PainelPrincipal.add(frm);
            frm.setVisible(true);
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuEntrarEstoqueActionPerformed

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
    private javax.swing.JDesktopPane PainelPrincipal;
    private javax.swing.JMenuItem mnuEntrarEstoque;
    private javax.swing.JMenuItem mnuProduto;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JMenuItem mnuUsuario;
    private javax.swing.JMenuItem mnuVenda;
    private javax.swing.JMenu txtArquivo;
    private javax.swing.JMenu txtCadastro;
    private javax.swing.JMenuBar txtPrincipal;
    // End of variables declaration//GEN-END:variables

   
    

   

    

}
