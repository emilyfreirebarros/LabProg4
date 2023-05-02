/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Vendedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendedorDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Vendedor Vendedor = (Vendedor) object;
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
            String sql = "INSERT INTO vendedor VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, Vendedor.getIdvendedor());
            pstm.setString(2, Vendedor.getNome());
            pstm.setString(3, Vendedor.getSobrenome());
            pstm.setString(4, Vendedor.getCpf());
            pstm.setString(5, Vendedor.getRg());
            pstm.setString(6, Vendedor.getEndereco());
            pstm.setString(7, Vendedor.getAtivo());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Vendedor Vendedor = (Vendedor) object;
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
            String sql = "UPDATE vendedor SET nome = ?, sobrenome = ?, cpf = ?, rg = ?, endereco = ?,ativo = ?   WHERE idvendedor = ?";
            pstm = cnt.prepareStatement(sql);

          pstm.setInt(1, Vendedor.getIdvendedor());
            pstm.setString(2, Vendedor.getNome());
            pstm.setString(3, Vendedor.getSobrenome());
            pstm.setString(4, Vendedor.getCpf());
            pstm.setString(5, Vendedor.getRg());
            pstm.setString(6, Vendedor.getEndereco());
            pstm.setString(7, Vendedor.getAtivo());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        Vendedor Vendedor = (Vendedor) object;
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
            String sql = "DELETE FROM vendedor WHERE idvendedor = ?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, Vendedor.getIdvendedor());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        Vendedor Vendedor = new Vendedor();
        //insert 

        Vendedor.setIdvendedor(1);
        Vendedor.setNome("flores");
        Vendedor.setSobrenome("perez");
        Vendedor.setAtivo("s");
        Vendedor.setCpf("000.000.00-11");
        Vendedor.setRg("1.222.222");
        Vendedor.setEndereco("R.Centro");

        //update
        /*
    
         Vendedor.setIdvendedor(1);
        Vendedor.setNome("maria");
        Vendedor.setSobrenome("soares");
        Vendedor.setAtivo("n");
        Vendedor.setCpf("000.121.00-11");
        Vendedor.setRg("1.222.455");
        Vendedor.setEndereco("R.vargas");
        
         */
        //delete
        //Vendedor.setIdVendedor(1);
        VendedorDAO VendedorDAO = new VendedorDAO();
        VendedorDAO.insert(Vendedor);
        //VendedorDAO.update(Vendedor);
        //VendedorDAO.delete(Vendedor);
        System.out.println("Funcionou");
    }
}
