package dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setCargaHoraria(cargaHoraria);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "\ntitulo='" + getTitulo() + '\'' +
                "\ndescricao='" + getDescricao() + '\'' +
                "\ncarga horaria=" + cargaHoraria +
                '}';
    }
}
