/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelLogin;

/**
 *
 * @author edila
 */
public class ControlLogin {
    
    ConectaBanco conecta = new ConectaBanco();//instancia da classe de conexão
    
    public void salvar(ModelLogin mod){
    conecta.conexao();//chamada do metodo de conexão
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into login (nome=?, senha=?, permissão=?, login=?)");//passagem do sql para inserção
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getSenha());
            pst.setString(3,mod.getPermissão());
            pst.setString(4,mod.getLogin());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuário!\nERRO:"+ex);
        }
    conecta.desconecta();
    }
          
    
}
