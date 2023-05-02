/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Usuario Usuario = (Usuario) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost:3306/db_emily";
            user = "root";
            password = "";
            //conectar bd if
            /*
            url="jdbc:mysql://10.7.0.51:33062/db_emily";
            user = "emely";
            password = "emily";
             */
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "INSERT INTO usuario VALUES (?, ?, ?, ?, ?, ?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, Usuario.getIdusuario());
            pstm.setString(2, Usuario.getNome());
            pstm.setString(3, Usuario.getSenha());
            pstm.setString(4, Usuario.getNivel());
            pstm.setString(5, Usuario.getAtivo());
            pstm.setString(6, Usuario.getApelido());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Usuario Usuario = (Usuario) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost:3306/db_emily";
            user = "root";
            password = "";
            //conectar bd if
            /*
            url="jdbc:mysql://10.7.0.51:33062/db_emily";
            user = "emely";
            password = "emily";
             */
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "UPDATE usuario SET nome = ?, senha = ?, nivel = ?, ativo = ?, apelido = ?  WHERE idusuario = ?";
            pstm = cnt.prepareStatement(sql);

            pstm.setString(1, Usuario.getNome());
            pstm.setString(2, Usuario.getSenha());
            pstm.setString(3, Usuario.getNivel());
            pstm.setString(4, Usuario.getAtivo());
            pstm.setString(5, Usuario.getApelido());
            pstm.setInt(6, Usuario.getIdusuario());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        Usuario Usuario = (Usuario) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost:3306/db_emily";
            user = "root";
            password = "";
            //conectar bd if
            /*
            url="jdbc:mysql://10.7.0.51:33062/db_emily";
            user = "emely";
            password = "emily";
             */
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "DELETE FROM usuario WHERE idusuario = ?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, Usuario.getIdusuario());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public List lisAll() {
        return null;
    }

    public static void main(String[] args) {
        Usuario Usuario = new Usuario();
        //insert 

        Usuario.setIdusuario(1);
        Usuario.setNome("flores");
        Usuario.setApelido("jo");
        Usuario.setAtivo("s");
        Usuario.setNivel("adm");
        Usuario.setSenha("12345");

        //update
        /*
    
        Usuario.setIdusuario(1);
        Usuario.setNome("emily");
        Usuario.setApelido("kkk");
        Usuario.setAtivo("n");
        Usuario.setNivel("ano");
        Usuario.setSenha("54321");
        
         */
        //delete
        //Usuario.setIdusuario(1);
        UsuarioDAO UsuarioDAO = new UsuarioDAO();
        UsuarioDAO.insert(Usuario);
        //UsuarioDAO.update(Usuario);
        //UsuarioDAO.delete(Usuario);
        System.out.println("Funcionou");
    }
}
