package bean;

public class Produto  implements java.io.Serializable {


     private int idproduto;
     private String nome;
     private String valorUnitario;
     private String quantidadeEstoque;
     private String categoria;

    public Produto() {
    }

	
    public Produto(int idproduto) {
        this.idproduto = idproduto;
    }
    public Produto(int idproduto, String nome, String valorUnitario,
            String quantidadeEstoque, String categoria) {
       this.idproduto = idproduto;
       this.nome = nome;
       this.valorUnitario = valorUnitario;
       this.quantidadeEstoque = quantidadeEstoque;
       this.categoria = categoria;
    }

    /**
     * @return the idproduto
     */
    public int getIdproduto() {
        return idproduto;
    }

    /**
     * @param idproduto the idproduto to set
     */
    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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

    /**
     * @return the quantidadeEstoque
     */
    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * @param quantidadeEstoque the quantidadeEstoque to set
     */
    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   

}


