/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Wesley
 */
public class TelaUsuarioInterna extends javax.swing.JInternalFrame {
    ConectaBanco conecta = new ConectaBanco();
    public ResultSet res_tudo;
    
    public void AtualizarRecordSet(){
        try {
            String sql = "SELECT * FROM usuario ORDER BY idusuario";
            PreparedStatement stm;
            stm = conecta.conn.prepareStatement(sql);
            res_tudo = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuarioInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }
    
    public TelaUsuarioInterna() {
        initComponents();
        conecta.conexao();
        HabilitarBotoesPadrao();
        AtualizarRecordSet();


    }
    
    public void LimparCampos(){
        txtIdUsuario.setText("");
        txtAtivo.setSelectedItem("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtCargo.setSelectedItem("");
        txtSalario.setText("");
        txtLogin.setText("");
        ptxtSenha.setText("");
        txtObs.setText("");
    }
    
    public void HabilitarCampos(){
        txtAtivo.setEnabled(true);
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCelular.setEnabled(true);
        txtEmail.setEnabled(true);
        txtCargo.setEnabled(true);
        txtSalario.setEnabled(true);
        txtLogin.setEnabled(true);
        ptxtSenha.setEnabled(true);
        txtObs.setEnabled(true);
    }
    
    public void DesabilitarCampos(){
        txtAtivo.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
        txtCargo.setEnabled(false);
        txtSalario.setEnabled(false);
        txtLogin.setEnabled(false);
        ptxtSenha.setEnabled(false);
        txtObs.setEnabled(false);
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
            txtIdUsuario.setText(res_tudo.getString("idusuario"));
            txtAtivo.setSelectedItem(res_tudo.getString("ativo"));
            txtNome.setText(res_tudo.getString("nome"));
            txtEndereco.setText(res_tudo.getString("endereco_completo"));
            txtTelefone.setText(res_tudo.getString("telefone"));
            txtCelular.setText(res_tudo.getString("celular"));
            txtEmail.setText(res_tudo.getString("email"));
            txtCargo.setSelectedItem(res_tudo.getString("cargo"));
            txtSalario.setText(res_tudo.getString("salario"));
            txtLogin.setText(res_tudo.getString("login"));
            txtObs.setText(res_tudo.getString("obs"));
                 
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuarioInterna.class.getName()).log(Level.SEVERE, null, ex);
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
            //JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
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

        btnIncluir = new javax.swing.JButton();
        pnlProfissionais = new javax.swing.JPanel();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JComboBox<>();
        lblSalario = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        pnObs = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JEditorPane();
        ptxtSenha = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        pnlPessoais = new javax.swing.JPanel();
        lblAtivo = new javax.swing.JLabel();
        txtAtivo = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        lblLogin1 = new javax.swing.JLabel();
        pnlContatos = new javax.swing.JPanel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setTitle("Cadastro de Usuários");

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnIncluir.setText("INCLUIR");
        btnIncluir.setToolTipText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        pnlProfissionais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Profissionais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        lblCargo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCargo.setText("Cargo (*)");

        txtCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Gerente" }));
        txtCargo.setEnabled(false);

        lblSalario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSalario.setText("Salário (*)");

        txtLogin.setEnabled(false);

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSenha.setText("Senha (*)");

        lblObs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblObs.setText("Observações");

        txtObs.setEnabled(false);
        pnObs.setViewportView(txtObs);

        ptxtSenha.setEnabled(false);

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogin.setText("Login  (*)");

        txtSalario.setEnabled(false);

        javax.swing.GroupLayout pnlProfissionaisLayout = new javax.swing.GroupLayout(pnlProfissionais);
        pnlProfissionais.setLayout(pnlProfissionaisLayout);
        pnlProfissionaisLayout.setHorizontalGroup(
            pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfissionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProfissionaisLayout.createSequentialGroup()
                        .addGroup(pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblObs)
                            .addGroup(pnlProfissionaisLayout.createSequentialGroup()
                                .addGroup(pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCargo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSalario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLogin)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ptxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenha))))
                        .addGap(200, 200, 200))
                    .addGroup(pnlProfissionaisLayout.createSequentialGroup()
                        .addComponent(pnObs, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlProfissionaisLayout.setVerticalGroup(
            pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfissionaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(lblSalario)
                    .addComponent(lblLogin)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnObs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/application_home.png"))); // NOI18N
        btnFechar.setText("FECHAR");
        btnFechar.setToolTipText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        pnlPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblAtivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAtivo.setText("Ativo (*)");

        txtAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        txtAtivo.setEnabled(false);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Nome (*)");

        txtNome.setEnabled(false);

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEndereco.setText("Endereço Completo");

        txtEndereco.setEnabled(false);

        txtIdUsuario.setEnabled(false);

        lblLogin1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogin1.setText("Id");

        javax.swing.GroupLayout pnlPessoaisLayout = new javax.swing.GroupLayout(pnlPessoais);
        pnlPessoais.setLayout(pnlPessoaisLayout);
        pnlPessoaisLayout.setHorizontalGroup(
            pnlPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPessoaisLayout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPessoaisLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPessoaisLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblLogin1)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblAtivo)
                        .addGap(18, 18, 18)
                        .addComponent(txtAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlPessoaisLayout.setVerticalGroup(
            pnlPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPessoaisLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLogin1))
                    .addGroup(pnlPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAtivo)
                        .addComponent(txtAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(lblNome)
                .addGap(12, 12, 12)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Contatos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefone.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setEnabled(false);

        lblCelular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCelular.setText("Celular");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setEnabled(false);

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setEnabled(false);

        javax.swing.GroupLayout pnlContatosLayout = new javax.swing.GroupLayout(pnlContatos);
        pnlContatos.setLayout(pnlContatosLayout);
        pnlContatosLayout.setHorizontalGroup(
            pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContatosLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtEmail))
                .addContainerGap())
        );
        pnlContatosLayout.setVerticalGroup(
            pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(lblCelular)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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

        btnProximo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_next.png"))); // NOI18N
        btnProximo.setToolTipText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
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

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlProfissionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(btnFechar))
                    .addComponent(pnlContatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar)
                    .addComponent(btnIncluir)
                    .addComponent(btnConsultar)
                    .addComponent(btnCancelar)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo)
                    .addComponent(btnAlterar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        HabilitarBotoesInserir();
        HabilitarCampos();
        
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if((txtAtivo.getSelectedItem()==null) || (txtLogin.getText()==null || txtLogin.getText().trim().equals("")) || (ptxtSenha.getText()==null || ptxtSenha.getText().trim().equals("")) || (txtLogin.getText()==null || txtLogin.getText().trim().equals("")) || (txtCargo.getSelectedItem()==null) || (txtNome.getText()==null || txtNome.getText().trim().equals("")) || (txtSalario.getText()==null || txtSalario.getText().trim().equals(""))){
            JOptionPane.showMessageDialog(null, "Existe campo obrigatório ainda não preenchido. Verifique e tente novamente.");
        }else{
            try {
                conecta.conexao();
                PreparedStatement pst = conecta.conn.prepareStatement("insert into usuario (ativo, nome, endereco_completo, telefone, celular, email, cargo, salario, login, senha, obs)values(?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, (String) txtAtivo.getSelectedItem());
                pst.setString(2,txtNome.getText());
                pst.setString(3,txtEndereco.getText());
                pst.setString(4,txtTelefone.getText());
                pst.setString(5,txtCelular.getText());
                pst.setString(6,txtEmail.getText());
                pst.setString(7, (String) txtCargo.getSelectedItem());
                pst.setDouble(8,Double.valueOf(txtSalario.getText()));
                pst.setString(9,txtLogin.getText());
                pst.setString(10,ptxtSenha.getText());
                pst.setString(11,txtObs.getText());
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

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            HabilitaBotoesConsulta();
            HabilitarCampos();
            res_tudo.first();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuarioInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimparCampos();
        DesabilitarCampos();
        HabilitarBotoesPadrao();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        try {
            HabilitarCampos();
            HabilitaBotoesConsulta();
            res_tudo.first();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuarioInterna.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(TelaUsuarioInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        try {
            HabilitarCampos();
            HabilitaBotoesConsulta();
            res_tudo.next();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuarioInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        try {
            HabilitarCampos();
            HabilitaBotoesConsulta();
            res_tudo.last();
            PreencherCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuarioInterna.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o acesso ao banco de dados.\nErro: " + ex);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Problema de sistema: "+ex);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if((txtAtivo.getSelectedItem()==null) || (txtLogin.getText()==null || txtLogin.getText().trim().equals("")) || (ptxtSenha.getText()==null || ptxtSenha.getText().trim().equals("")) || (txtLogin.getText()==null || txtLogin.getText().trim().equals("")) || (txtCargo.getSelectedItem()==null) || (txtNome.getText()==null || txtNome.getText().trim().equals("")) || (txtSalario.getText()==null || txtSalario.getText().trim().equals(""))){
            JOptionPane.showMessageDialog(null, "Existe campo obrigatório ainda não preenchido. Verifique e tente novamente.");
        }else{
            try {
                conecta.conexao();
                PreparedStatement pst = conecta.conn.prepareStatement("UPDATE usuario SET ativo=?, nome=?, endereco_completo=?, telefone=?, celular=?, email=?, cargo=?, salario=?, login=?, senha=?, obs=? WHERE idusuario=?");
                pst.setString(1, (String) txtAtivo.getSelectedItem());
                pst.setString(2,txtNome.getText());
                pst.setString(3,txtEndereco.getText());
                pst.setString(4,txtTelefone.getText());
                pst.setString(5,txtCelular.getText());
                pst.setString(6,txtEmail.getText());
                pst.setString(7, (String) txtCargo.getSelectedItem());
                pst.setDouble(8,Double.valueOf(txtSalario.getText()));
                pst.setString(9,txtLogin.getText());
                pst.setString(10,ptxtSenha.getText());
                pst.setString(11,txtObs.getText());
                pst.setInt(12, Integer.valueOf(txtIdUsuario.getText()));
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
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JScrollPane pnObs;
    private javax.swing.JPanel pnlContatos;
    private javax.swing.JPanel pnlPessoais;
    private javax.swing.JPanel pnlProfissionais;
    private javax.swing.JPasswordField ptxtSenha;
    private javax.swing.JComboBox<String> txtAtivo;
    private javax.swing.JComboBox<String> txtCargo;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JEditorPane txtObs;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
