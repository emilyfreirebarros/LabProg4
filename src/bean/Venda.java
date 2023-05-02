package bean;

import java.util.Date;

public class Venda implements java.io.Serializable {

    private int idvenda;
    private Cliente cliente;
    private Vendedor vendedor;
    private double total;
    private Date dataVenda;

    public Venda() {
    }

    public Venda(int idvenda) {
        this.idvenda = idvenda;
    }

    public Venda(int idvenda, Cliente cliente, Vendedor vendedor, double total, Date dataVenda) {
        this.idvenda = idvenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.total = total;
        this.dataVenda = dataVenda;
    }

    /**
     * @return the idvenda
     */
    public int getIdvenda() {
        return idvenda;
    }

    /**
     * @param idvenda the idvenda to set
     */
    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

}
