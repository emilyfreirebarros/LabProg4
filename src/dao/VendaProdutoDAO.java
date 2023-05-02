/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VendaProduto;
import bean.Venda;
import bean.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaProdutoDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        VendaProduto vendaproduto = (VendaProduto) object;
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
            String sql = "INSERT INTO venda_produto VALUES (?, ?, ?, ?,?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendaproduto.getIdvendaProduto());
            pstm.setInt(2, vendaproduto.getProduto().getIdproduto());
            pstm.setInt(3, vendaproduto.getVenda().getIdvenda());
            pstm.setString(4, vendaproduto.getQuantidade());
            pstm.setString(5, vendaproduto.getValorUnitario());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        VendaProduto vendaProduto = (VendaProduto) object;
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
            String sql = "UPDATE venda_produto SET produto = ?, venda = ?, quantidade = ?, valor_unitario = ?  WHERE idvenda_produto = ?";
            pstm = cnt.prepareStatement(sql);

            pstm.setInt(1, vendaProduto.getProduto().getIdproduto());
            pstm.setInt(2, vendaProduto.getVenda().getIdvenda());
            pstm.setString(3, vendaProduto.getQuantidade());
            pstm.setString(4, vendaProduto.getValorUnitario());
            pstm.setInt(5, vendaProduto.getIdvendaProduto());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        VendaProduto vendaProduto = (VendaProduto) object;
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
            String sql = "DELETE FROM venda_produto WHERE idvenda_produto = ?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendaProduto.getIdvendaProduto());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        VendaProduto vendaProduto = new VendaProduto();
        Produto produto=new Produto();
        Venda venda=new Venda();

        //insert 
        produto.setIdproduto(1);
        venda.setIdvenda(1);

        vendaProduto .setIdvendaProduto(1);
        vendaProduto.setProduto(produto);
        vendaProduto.setVenda(venda);
        vendaProduto.setQuantidade("50");
        vendaProduto.setValorUnitario("100.0");

        //update
        /*
        produto.setIdproduto(5);
        venda.setIdvenda(1);

        vendaProduto .setIdvendaProduto(1);
        vendaProduto.setProduto(produto);
        vendaProduto.setVenda(venda);
        vendaProduto.setQuantidade("60");
        vendaProduto.setValorUnitario("50.0");
        
         */
        //delete
        //vendaProduto.setIdvendaProduto(1);
        VendaProdutoDAO vendaProdutoDAO = new VendaProdutoDAO();
        vendaProdutoDAO.insert(vendaProduto);
        //vendaProdutoDAO.update(vendaProduto);
        //vendaProdutoDAO.delete(vendaProduto);
       
        System.out.println("Funcionou");
    }
}
