import java.time.LocalDate;


public class Cliente {
    private Long cpf;
    private String nome;
    private LocalDate nascimento;
    private Integer idade;

    public Cliente(Long cpf, String nome, LocalDate nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.idade = LocalDate.now().getYear() - nascimento.getYear();
    }

    public Long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "=== Cliente ===" +
                "\nCPF : " + cpf +
                "\nnome : " + nome +
                "\nidade : " + idade;
    }
}
