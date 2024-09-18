package map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("O dicionario esta vazio");
        }
    }

    public String exibirPalavras() {
        if(!dicionario.isEmpty()) {
            return dicionario.toString();
        } else{
            return "Dicionario vazio";
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String pesquisa = dicionario.get(palavra);
        if(pesquisa != null) {
            return pesquisa;
        } else {
            return "Palavra nao encontrada";
        }
    }
}
