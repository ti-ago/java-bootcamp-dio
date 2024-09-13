package set.ordenacao.listaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    public Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, float media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for(Aluno aluno : alunoSet){
            if(aluno.getMatricula() == matricula){
                alunoSet.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        for(Aluno aluno : alunoSet) {
            System.out.println(aluno);
        }
    }

}
