package list.pesquisa.somaNumeros;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {
    private List<Integer> listNumeros;

    public SomaNumeros(){
        listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumeros.add(numero);
    }

    public Integer calcularSoma() {
        Integer soma = 0;
        for(Integer numero : listNumeros) {
            soma += numero;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero(){
        Integer maior = null;
        for(Integer numero : listNumeros){
            if (maior == null){
                maior = numero;
            } else if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }

    public Integer encontrarMenorNumero(){
        Integer menor = null;
        for(Integer numero : listNumeros){
            if (menor == null){
                menor = numero;
            } else if(numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public String toString(){
        String lista = "";
        for(Integer numero : listNumeros) {
            lista += " " + numero.toString();
        }
        return lista;
    }

    public String exibirNumeros(){
        return listNumeros.toString();
    }
}

