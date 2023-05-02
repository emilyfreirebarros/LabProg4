/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Produto produto = (Produto) object;
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
            String sql = "INSERT INTO produto VALUES (?, ?, ?, ?, ?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, produto.getIdproduto());
            pstm.setString(2, produto.getNome());
            pstm.setString(3, produto.getValorUnitario());
            pstm.setString(4, produto.getQuantidadeEstoque());
            pstm.setString(5, produto.getCategoria());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Produto produto = (Produto) object;
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
            String sql = "UPDATE produto SET nome = ?, valorUnitario = ?, quantidadeEstoque = ?, categoria = ? WHERE idproduto = ?";
            pstm = cnt.prepareStatement(sql);
            
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getValorUnitario());
            pstm.setString(3, produto.getQuantidadeEstoque());
            pstm.setString(4, produto.getCategoria());
            pstm.setInt(5, produto.getIdproduto());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        Produto produto = (Produto) object;
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
            String sql = "DELETE FROM produto WHERE idproduto = ?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, produto.getIdproduto());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        Produto produto=new Produto();
        //insert 
       
        produto.setIdproduto(1);
        produto.setNome("Sabão");
        produto.setValorUnitario("17");
        produto.setQuantidadeEstoque("100");
        produto.setCategoria("Rosto");
        
        //update
        /*
        produto.setIdproduto(1);
        produto.setNome("Base");
        produto.setValorUnitario("25");
        produto.setQuantidadeEstoque("50");
        produto.setCategoria("Rosto");
     */
        
        //delete
        //produto.setIdProduto(1);
        ProdutoDAO produtoDAO=new ProdutoDAO();
        produtoDAO.insert(produto);
        //produtoDAO.update(produto);
        //produtoDAO.delete(produto);
          System.out.println("Funcionou");
    }
}
