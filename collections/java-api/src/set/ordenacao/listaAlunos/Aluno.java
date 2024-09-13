package set.ordenacao.listaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private float nota;

    public Aluno(String nome, long matricula, float nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareToIgnoreCase(aluno.getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Float.compare(aluno1.getNota(),aluno2.getNota());
    }
}

