package list.operacoesBasicas.carrinhoCompras;

public class Item {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Item(String nome, Double preco, Integer quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    @Override
    public String toString() {
        return (String) getNome() + " " + getPreco() + " "+ getQuantidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
