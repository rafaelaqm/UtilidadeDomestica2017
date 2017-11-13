
package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author edila
 */
public class ConectaBanco {
    public Statement stm;//preparar e realizar pesquisa no banco de dados
    public ResultSet res;//responsavel por armazenar o resultado de uma pesquisa passada pelo statement
    private String driver = "com.mysql.jdbc.Driver";//responsável por identificar o serviço de banco de dados
    private String caminho = "jdbc:mysql://localhost:3306/sistemadevenda";//responsavel por setar o local do banco de dados
    private String usuario = "root";
    private String senha = "1234";
    public Connection conn;//resposanvel por realizar a conexao com o banco de dados
    
    public void conexao(){//metodo responsavel por realizar a conexao com o banco
        try {//tentativa inicial
            System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexão com o banco de dados
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");//imprimi uma caixa de mensagem
        } catch (SQLException ex) {//excessão
            JOptionPane.showMessageDialog(null, "Erro de Conexão!\n Erro"+ex.getMessage());
        }
        
    }
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(res.TYPE_SCROLL_INSENSITIVE, res.CONCUR_READ_ONLY);
            res = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n Erro"+ex.getMessage());
        }
    }
        
    public void desconecta(){//metodo para fechar a conexao com o banco de dados
        try {
            conn.close();//fecha a conexão
            JOptionPane.showMessageDialog(null, "Desconectado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a Conexão!\n Erro"+ex.getMessage());
        }
    }
}
