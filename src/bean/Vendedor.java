package bean;

public class Vendedor implements java.io.Serializable {

    private int idvendedor;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private String endereco;
    private String ativo;

    public Vendedor() {
    }

    public Vendedor(int idvendedor, String nome, String sobrenome, String cpf, String rg, String endereco,
            String ativo) {
        this.idvendedor = idvendedor;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.ativo = ativo;

    }

    /**
     * @return the idvendedor
     */
    public int getIdvendedor() {
        return idvendedor;
    }

    /**
     * @param idvendedor the idvendedor to set
     */
    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
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
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}
