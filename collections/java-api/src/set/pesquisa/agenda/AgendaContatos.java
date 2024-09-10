package set.pesquisa.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> agenda;

    public AgendaContatos(){
        agenda = new HashSet<>();
    }

    public void adicionarContatos(String nome, Integer numero){
        Contato contatoAdicionado = new Contato(nome, numero);
        if(agenda.contains(contatoAdicionado)){
            System.out.println("Contato já existente");
        }else{
            agenda.add(contatoAdicionado);
            System.out.println("Contato adicionado com sucesso");
        }
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> resultadoPesquisa = new HashSet<>();
        for(Contato contato : agenda){
            if(contato.getNome().startsWith(nome)){
                resultadoPesquisa.add(contato);
            }
        }
        return resultadoPesquisa;
    }

    public void atualizarNumeroContato(String nome, Integer numero){
        for(Contato contato : agenda){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(numero);
            }
        }
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "agenda=" + agenda +
                '}';
    }
}
