/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ConectaBanco;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.TelaProdutoInterna;
import view.TelaUsuarioInterna;

/**
 *
 * @author Wesley
 */
public class mdMovimentarEstoque {
    ConectaBanco conecta = new ConectaBanco();
    public ResultSet res_tudo;
    
    private Integer idestoque;
    private Date data;
    private String tipo;
    private Integer idusuario;
    private Integer idproduto;
    private Float qtd;
    

    public ConectaBanco getConecta() {
        return conecta;
    }

    public void setConecta(ConectaBanco conecta) {
        this.conecta = conecta;
    }

    public Integer getIdestoque() {
        return idestoque;
    }

    public void setIdestoque(Integer idestoque) {
        this.idestoque = idestoque;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Float getQtd() {
        return qtd;
    }

    public void setQtd(Float qtd) {
        this.qtd = qtd;
    }
    
    public void Consultar() throws SQLException{
        conecta.conexao();
                try {
            idestoque = res_tudo.getInt("idproduto");
            data = res_tudo.getDate("data");
            tipo = res_tudo.getString("tipo");
            idusuario = res_tudo.getInt("idusuario");
            idproduto = res_tudo.getInt("idproduto");
            qtd = res_tudo.getFloat("qtd");
                 
        } catch (SQLException ex) {
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
}
