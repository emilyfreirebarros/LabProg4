package bean;

public class VendaProduto  implements java.io.Serializable {


     private int idvendaProduto;
     private Produto produto;
     private Venda venda;
     private String quantidade;
     private String valorUnitario;

    public VendaProduto() {
    }


    public VendaProduto(int idvendaProduto, Produto produto, Venda venda, String quantidade, String valorUnitario) {
       this.idvendaProduto = idvendaProduto;
       this.produto = produto;
       this.venda = venda;
       this.quantidade = quantidade;
       this.valorUnitario = valorUnitario;
    }

    /**
     * @return the idvendaProduto
     */
    public int getIdvendaProduto() {
        return idvendaProduto;
    }

    /**
     * @param idvendaProduto the idvendaProduto to set
     */
    public void setIdvendaProduto(int idvendaProduto) {
        this.idvendaProduto = idvendaProduto;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the venda
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitario
     */
    public String getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
   
}


