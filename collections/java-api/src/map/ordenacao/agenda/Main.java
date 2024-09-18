package map.ordenacao.agenda;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2025, Month.JULY, 25), "Aniversario", "palhaço");
        agenda.adicionarEvento(LocalDate.of(2023, Month.JUNE, 10), "Casamento", "noiva");
        agenda.adicionarEvento(LocalDate.of(2019, Month.DECEMBER, 30), "Matricula", "escola");
        agenda.adicionarEvento(LocalDate.of(1987, Month.FEBRUARY, 13), "viagem", "carro");
       // agenda.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 16), "jogo", "Levi");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }


}
