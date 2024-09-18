package map.pesquisa.contagem;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        Integer valor = palavras.get(palavra);
        if(valor != null){
            palavras.put(palavra, contagem += valor);
        } else {
            palavras.put(palavra, contagem);
        }

    }


    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        } else {
            System.out.println("O Map está vazio");
        }
    }

    public Integer exibirContagemPalavra() {
        int contagemTotal = 0;
        for (int contagem : palavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }
}
