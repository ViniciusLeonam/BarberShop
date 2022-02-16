/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;

/**
 *
 * @author Vinicius Leonam
 */
public class LoginController {

    private final Login View;
    private LoginHelper helper;
    
    public LoginController(Login View) {
        this.View = View;
        this.helper = new LoginHelper(View);
    }
    
  public void entrarNoSistema(){
      //PEGAR UM USUARIO DA VIEW
      Usuario usuario = helper.obterModelo();
      
      //PESQUISAR USUARIO
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      usuarioDAO.selectPorNomeESenha(usuario)
}
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.View.exibeMensagem("Executei o fiz tarefa");
    }
    
}
