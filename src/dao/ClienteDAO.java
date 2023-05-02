
package dao;

import bean.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Cliente cliente = (Cliente) object;
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
            String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getIdcliente());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getRg());
            pstm.setString(4, cliente.getCpf());
            pstm.setString(5, cliente.getSexo());
            pstm.setDate(6, (java.sql.Date) cliente.getDataNascimento());
            pstm.setString(7, cliente.getEmail());
            pstm.setString(8, cliente.getTelefone());
            pstm.setString(9, cliente.getEndereco());
            pstm.setString(10, cliente.getBairro());
            pstm.setString(11, cliente.getNumero());
            pstm.setString(12, cliente.getCep());
            pstm.setString(13, cliente.getCidade());
            pstm.setString(14, cliente.getEstado());
            pstm.setString(15, cliente.getComplemento());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Cliente cliente = (Cliente) object;
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
            String sql = "UPDATE cliente SET nome = ?, rg = ?, cpf = ?, sexo = ?, data_nascimento = ?, email = ?, telefone = ?, endereco = ?, bairro = ?, numero = ?, cep = ?, cidade = ?, estado = ?, complemento = ? WHERE idcliente = ?";
            pstm = cnt.prepareStatement(sql);

            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getRg());
            pstm.setString(3, cliente.getCpf());
            pstm.setString(4, cliente.getSexo());
            pstm.setDate(5, (java.sql.Date) cliente.getDataNascimento());
            pstm.setString(6, cliente.getEmail());
            pstm.setString(7, cliente.getTelefone());
            pstm.setString(8, cliente.getEndereco());
            pstm.setString(9, cliente.getBairro());
            pstm.setString(10, cliente.getNumero());
            pstm.setString(11, cliente.getCep());
            pstm.setString(12, cliente.getCidade());
            pstm.setString(13, cliente.getEstado());
            pstm.setString(14, cliente.getComplemento());
            pstm.setInt(15, cliente.getIdcliente());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        Cliente cliente = (Cliente) object;
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
            String sql = "DELETE FROM cliente WHERE idcliente = ?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getIdcliente());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        Cliente cliente=new Cliente();
        //insert 
       /*
        cliente.setIdcliente(1);
        cliente.setNome("Emily");
        cliente.setBairro("Centro");
        cliente.setCep("799.045-00");
        cliente.setCidade("Ponta Porã");
        cliente.setComplemento("Teste de cliente");
        cliente.setCpf("044.123.250.88");
        cliente.setDataNascimento(Date.valueOf("2023-02-02"));
        cliente.setEmail("emily@gmail.com");
        cliente.setEndereco("Rua 7 de setembro");
        cliente.setEstado("MS");
        cliente.setNumero("8");
        cliente.setRg("1.555.155");
        cliente.setSexo("Masculino");
        cliente.setTelefone("(67)99100222000");
        */
        //update
        
        cliente.setIdcliente(1);
        cliente.setNome("Nicolas");
        cliente.setBairro("ipê");
        cliente.setCep("799.00-00");
        cliente.setCidade("Ponta Porã");
        cliente.setComplemento("Teste de cliente2");
        cliente.setCpf("044.443.550.99");
        cliente.setDataNascimento(Date.valueOf("2023-05-02"));
        cliente.setEmail("emilysdas@gmail.com");
        cliente.setEndereco("Rua Presidente Vargas");
        cliente.setEstado("MS");
        cliente.setNumero("10");
        cliente.setRg("1.667.155");
        cliente.setSexo("Masculino");
        cliente.setTelefone("(67)99100222123");
        
        //delete
        //cliente.setIdcliente(1);
        ClienteDAO clienteDAO=new ClienteDAO();
        //clienteDAO.insert(cliente);
        clienteDAO.update(cliente);
        //clienteDAO.delete(cliente);
          System.out.println("Funcionou");
    }
}
