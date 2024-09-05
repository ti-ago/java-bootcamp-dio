package list.operacoesBasicas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> meuCarrinho;

    public CarrinhoDeCompras() {
        meuCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
            meuCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> paraRemover = new ArrayList<>();
        for(Item item : meuCarrinho) {
            if(nome.equalsIgnoreCase(item.getNome())) {
                paraRemover.add(item);
            }
        }
        if(paraRemover.isEmpty()){
            System.out.println("Não há itens para remoção");
        }else{
            meuCarrinho.removeAll(paraRemover);
            System.out.println("Item removido com sucesso");
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item item : meuCarrinho) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public String exibirItens() {
        return meuCarrinho.toString();
    }
}

