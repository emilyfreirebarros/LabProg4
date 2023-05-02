/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Venda;
import bean.Cliente;
import bean.Vendedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Venda venda = (Venda) object;
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
            String sql = "INSERT INTO venda VALUES (?, ?, ?, ?,?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda.getIdvenda());
            pstm.setInt(2, venda.getCliente().getIdcliente());
            pstm.setInt(3, venda.getVendedor().getIdvendedor());
            pstm.setDouble(4, venda.getTotal());
            pstm.setDate(5, (java.sql.Date) venda.getDataVenda());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Venda venda = (Venda) object;
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
            String sql = "UPDATE venda SET cliente = ?, vendedor = ?, total = ?, data_venda = ?  WHERE idvenda = ?";
            pstm = cnt.prepareStatement(sql);

            
            pstm.setInt(1, venda.getCliente().getIdcliente());
            pstm.setInt(2, venda.getVendedor().getIdvendedor());
            pstm.setDouble(3, venda.getTotal());
            pstm.setDate(4, (java.sql.Date) venda.getDataVenda());
            pstm.setInt(1, venda.getIdvenda());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        Venda venda = (Venda) object;
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
            String sql = "DELETE FROM venda WHERE idvenda = ?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda.getIdvenda());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        Venda venda = new Venda();
        Cliente cliente=new Cliente();
        Vendedor vendedor=new Vendedor();
        
        
        //insert 
        cliente.setIdcliente(1);
        vendedor.setIdvendedor(1);
        
        venda.setIdvenda(1);
        venda.setCliente(cliente);
        venda.setVendedor(vendedor);
        venda.setDataVenda(Date.valueOf("2023-02-05"));
        venda.setTotal(100.0);

        //update
        /*
    
          cliente.setIdcliente(1);
        vendedor.setIdvendedor(2);
        
        venda.setIdvenda(1);
        venda.setCliente(cliente);
        venda.setVendedor(vendedor);
        venda.setDataVenda(Date.valueOf("2023-03-04"));
        venda.setTotal(90.0);
        
         */
        //delete
         venda.setIdvenda(1);
        VendaDAO VendaDAO = new VendaDAO();
        VendaDAO.insert(venda);
        //VendaDAO.update(venda);
        //VendaDAO.delete(venda);
        System.out.println("Funcionou");
    }
}
