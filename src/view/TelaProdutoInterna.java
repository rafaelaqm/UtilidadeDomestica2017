/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ConectaBanco;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Wesley
 */
public class TelaProdutoInterna extends javax.swing.JInternalFrame {
    ConectaBanco conecta = new ConectaBanco();
    public ResultSet res_tudo;
    
    public void AtualizarRecordSet(){
        try {
            String sql = "SELECT * FROM produto ORDER BY idproduto";
            PreparedStatement stm;
            stm = conecta.conn.prepareStatement(sql);
            res_tudo = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }
    
    public TelaProdutoInterna() {
        initComponents();
        conecta.conexao();
        HabilitarBotoesPadrao();
        AtualizarRecordSet();
    }

    public void LimparCampos(){
        txtCodigo.setText("");
        txtAtivo.setSelectedItem("");
        txtUnidade.setSelectedItem("");
        txtDescritivo.setText("");
        txtVr_Aquisicao.setText("");
        txtVr_Venda.setText("");
        txtQtd_Minima.setText("");
        txtSaldo.setText("");
    }
    
    public void HabilitarCampos(){
        txtAtivo.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtDescritivo.setEnabled(true);
        txtQtd_Minima.setEnabled(true);
        txtVr_Aquisicao.setEnabled(true);
        txtVr_Venda.setEnabled(true);
        txtVr_Venda.setEnabled(true);
        txtVr_Aquisicao.setEnabled(true);
    }
    
    public void DesabilitarCampos(){
        txtAtivo.setEnabled(false);
        txtUnidade.setEnabled(false);
        txtDescritivo.setEnabled(false);
        txtVr_Aquisicao.setEnabled(false);
        txtVr_Venda.setEnabled(false);
        txtQtd_Minima.setEnabled(false);
    }
    
    public void HabilitaBotoesConsulta(){
        btnIncluir.setVisible(false);
        btnConsultar.setVisible(false);
        btnSalvar.setVisible(false);
        btnAlterar.setVisible(true);
        btnCancelar.setVisible(true);
        btnPrimeiro.setVisible(true);
        btnAnterior.setVisible(true);
        btnProximo.setVisible(true);
        btnUltimo.setVisible(true);
    }
    
    public void HabilitarBotoesInserir(){
        btnIncluir.setVisible(false);
        btnConsultar.setVisible(false);
        btnSalvar.setVisible(true);
        btnAlterar.setVisible(false);
        btnCancelar.setVisible(true);
        btnPrimeiro.setVisible(false);
        btnAnterior.setVisible(false);
        btnProximo.setVisible(false);
        btnUltimo.setVisible(false);
    }
    
    public void HabilitarBotoesPadrao(){
        btnIncluir.setVisible(true);
        btnConsultar.setVisible(true);
        btnSalvar.setVisible(false);
        btnAlterar.setVisible(false);
        btnCancelar.setVisible(false);
        btnPrimeiro.setVisible(false);
        btnAnterior.setVisible(false);
        btnProximo.setVisible(false);
        btnUltimo.setVisible(false);
    }
    
    public void PreencherCampos() throws SQLException{
        conecta.conexao();
        try {
            txtCodigo.setText(res_tudo.getString("idproduto"));
            txtAtivo.setSelectedItem(res_tudo.getString("ativo"));
            txtUnidade.setSelectedItem(res_tudo.getString("unid_medida"));
            txtDescritivo.setText(res_tudo.getString("descritivo"));
            txtVr_Aquisicao.setText(res_tudo.getString("vr_aquisicao"));
            txtVr_Venda.setText(res_tudo.getString("vr_venda"));
            txtQtd_Minima.setText(res_tudo.getString("qtd_minima"));
            txtSaldo.setText(res_tudo.getString("saldo"));
                 
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoInterna.class.getName()).log(Level.SEVERE, null, ex);
            if (res_tudo.isBeforeFirst()==true){
                JOptionPane.showMessageDialog(null, "Você já está no primeiro registro. Impossível voltar mais.");
                res_tudo.first();
            }else if (res_tudo.isAfterLast()==true){
                JOptionPane.showMessageDialog(null, "Você já está no último registro. Impossível avançar mais.");
                res_tudo.last();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
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

        pnlProduto = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblDescritivo = new javax.swing.JLabel();
        txtDescritivo = new javax.swing.JTextField();
        txtAtivo = new javax.swing.JComboBox<>();
        lblAtivo = new javax.swing.JLabel();
        lblUnidade = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JComboBox<>();
        pnlVenda = new javax.swing.JPanel();
        lblPreco = new javax.swing.JLabel();
        txtVr_Venda = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtVr_Aquisicao = new javax.swing.JTextField();
        txtQtd_Minima = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();

        setTitle("Cadastro de Produtos");
        setPreferredSize(new java.awt.Dimension(874, 530));

        pnlProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodigo.setText("Código");

        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);

        lblDescritivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDescritivo.setText("Descritivo (*)");

        txtDescritivo.setEnabled(false);

        txtAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        txtAtivo.setEnabled(false);

        lblAtivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAtivo.setText("Ativo (*)");

        lblUnidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUnidade.setText("Unidade de Medida (*)");

        txtUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UND", "CX", "DZ", "KG", "PC", "L", "G", "" }));
        txtUnidade.setEnabled(false);

        javax.swing.GroupLayout pnlProdutoLayout = new javax.swing.GroupLayout(pnlProduto);
        pnlProduto.setLayout(pnlProdutoLayout);
        pnlProdutoLayout.setHorizontalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescritivo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUnidade)
                        .addGap(10, 10, 10)
                        .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAtivo)
                        .addGap(18, 18, 18)
                        .addComponent(txtAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addComponent(lblDescritivo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlProdutoLayout.setVerticalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtivo)
                            .addComponent(txtAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(lblDescritivo))
                    .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUnidade)))
                .addGap(11, 11, 11)
                .addComponent(txtDescritivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblPreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPreco.setText("Valor de Venda");

        txtVr_Venda.setEnabled(false);

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuantidade.setText("Quantidade Minima (*)");

        lblSaldo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSaldo.setText("Saldo Atual");

        txtSaldo.setEnabled(false);

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValor.setText("Valor de Aquisição");

        txtVr_Aquisicao.setEnabled(false);

        txtQtd_Minima.setEnabled(false);

        javax.swing.GroupLayout pnlVendaLayout = new javax.swing.GroupLayout(pnlVenda);
        pnlVenda.setLayout(pnlVendaLayout);
        pnlVendaLayout.setHorizontalGroup(
            pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor)
                    .addComponent(txtVr_Aquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreco)
                    .addComponent(txtVr_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQtd_Minima)
                    .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldo)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlVendaLayout.setVerticalGroup(
            pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade)
                            .addComponent(lblSaldo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd_Minima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVr_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVr_Aquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/application_home.png"))); // NOI18N
        btnFechar.setText("FECHAR");
        btnFechar.setToolTipText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnIncluir.setText("INCLUIR");
        btnIncluir.setToolTipText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnPrimeiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_first.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_previous.png"))); // NOI18N
        btnAnterior.setToolTipText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnProximo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_next.png"))); // NOI18N
        btnProximo.setToolTipText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/application_form_magnify.png"))); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setToolTipText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnUltimo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_last.png"))); // NOI18N
        btnUltimo.setToolTipText("Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnIncluir)
                        .addComponent(btnConsultar)
                        .addComponent(btnCancelar)
                        .addComponent(btnPrimeiro)
                        .addComponent(btnAnterior)
                        .addComponent(btnProximo)
                        .addComponent(btnUltimo)
                        .addComponent(btnAlterar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if((txtAtivo.getSelectedItem()==null) || (txtUnidade.getSelectedItem()==null) || (txtDescritivo.getText()==null || txtDescritivo.getText().trim().equals("")) || (txtQtd_Minima.getText()==null || txtQtd_Minima.getText().trim().equals(""))){
            JOptionPane.showMessageDialog(null, "Existe campo obrigatório ainda não preenchido. Verifique e tente novamente.");
        }else{
            try {
                conecta.conexao();
                PreparedStatement pst = conecta.conn.prepareStatement("UPDATE produto SET unid_medida=?,ativo=?,descritivo=?,vr_aquisicao=?,vr_venda=?,qtd_minima=? WHERE idproduto=?");
                pst.setString(1,(String) txtUnidade.getSelectedItem());
                pst.setString(2,(String) txtAtivo.getSelectedItem());
                pst.setString(3,txtDescritivo.getText());
                pst.setString(4,txtVr_Aquisicao.getText());
                pst.setString(5,txtVr_Venda.getText());
                pst.setString(6,txtQtd_Minima.getText());
                pst.setDouble(7,Integer.valueOf(txtCodigo.getText()));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Salvo com Sucesso!");
                AtualizarRecordSet();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro no salvamento\n ERRO!: "+ex);
            }
            LimparCampos();
            DesabilitarCampos();
            HabilitarBotoesPadrao();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimparCampos();
        DesabilitarCampos();
        HabilitarBotoesPadrao();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        HabilitarBotoesInserir();
        HabilitarCampos();
        
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        try {
            HabilitarCampos();
            HabilitaBotoesConsulta();
            res_tudo.first();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        try {
            HabilitarCampos();
            HabilitaBotoesConsulta();
            res_tudo.previous();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if((txtAtivo.getSelectedItem()==null) || (txtUnidade.getSelectedItem()==null) || (txtDescritivo.getText()==null || txtDescritivo.getText().trim().equals("")) || (txtQtd_Minima.getText()==null || txtQtd_Minima.getText().trim().equals(""))){
            JOptionPane.showMessageDialog(null, "Existe campo obrigatório ainda não preenchido. Verifique e tente novamente.");
        }else{
            try {
                conecta.conexao();
                PreparedStatement pst = conecta.conn.prepareStatement("insert into produto (unid_medida,ativo,descritivo,vr_aquisicao,vr_venda,qtd_minima) values (?,?,?,?,?,?)");
                pst.setString(1,(String) txtUnidade.getSelectedItem());
                pst.setString(2,(String) txtAtivo.getSelectedItem());
                pst.setString(3,txtDescritivo.getText());
                pst.setString(4,txtVr_Aquisicao.getText());
                pst.setString(5,txtVr_Venda.getText());
                pst.setString(6,txtQtd_Minima.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Salvo com Sucesso!");
                AtualizarRecordSet();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro no salvamento\n ERRO!: "+ex);
            }
            LimparCampos();
            DesabilitarCampos();
            HabilitarBotoesPadrao();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        try {
            HabilitarCampos();
            HabilitaBotoesConsulta();
            res_tudo.next();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            HabilitaBotoesConsulta();
            HabilitarCampos();
            res_tudo.first();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        try {
            HabilitarCampos();
            HabilitaBotoesConsulta();
            res_tudo.last();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel lblAtivo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescritivo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlProduto;
    private javax.swing.JPanel pnlVenda;
    private javax.swing.JComboBox<String> txtAtivo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescritivo;
    private javax.swing.JTextField txtQtd_Minima;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JComboBox<String> txtUnidade;
    private javax.swing.JTextField txtVr_Aquisicao;
    private javax.swing.JTextField txtVr_Venda;
    // End of variables declaration//GEN-END:variables
}
