/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author edila
 */
public class ModelLogin {
    private int Id_login;
    private String Nome;
    private String Senha;
    private String Permissão;
    private String Login;
    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    /**
     * @return the Id_login
     */
    public int getId_login() {
        return Id_login;
    }

    /**
     * @param Id_login the Id_login to set
     */
    public void setId_login(int Id_login) {
        this.Id_login = Id_login;
    }

    /**
     * @return the Permissão
     */
    public String getPermissão() {
        return Permissão;
    }

    /**
     * @param Permissão the Permissão to set
     */
    public void setPermissão(String Permissão) {
        this.Permissão = Permissão;
    }

    /**
     * @return the Login
     */
    public String getLogin() {
        return Login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.Login = Login;
    }
    
    
}
