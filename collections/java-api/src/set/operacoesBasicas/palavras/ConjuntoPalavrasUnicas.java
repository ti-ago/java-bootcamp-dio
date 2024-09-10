package set.operacoesBasicas.palavras;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        palavras  = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        for( String termo : palavras){
            if(termo.equals(palavra)){
                palavras.remove(palavra);
                break;
            }
        }

    }

    public boolean verificarPalavra(String palavra){
        if(palavras.contains(palavra)){
            return true;
        } else{
            return false;
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavras=" + palavras +
                '}';
    }
}
