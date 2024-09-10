package list.ordenacao.ordenacaoPessoas;

import java.util.Comparator;

public class Pessoa  implements Comparable<Pessoa>{
    private String nome;
    private Integer idade;
    private Float altura;

    public Pessoa(String nome, Integer idade, Float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }
}
