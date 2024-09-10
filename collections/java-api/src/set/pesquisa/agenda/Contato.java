package set.pesquisa.agenda;

import java.util.Objects;

public class Contato {
    String nome;
    Integer numero;

    public Contato(String nome, Integer numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getNumero(){
        return this.numero;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setNumero(Integer novoNumero){
        this.numero = novoNumero;
    }

    @Override
    public String toString() {
        return  '[' + nome + '|' + numero +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }
}
