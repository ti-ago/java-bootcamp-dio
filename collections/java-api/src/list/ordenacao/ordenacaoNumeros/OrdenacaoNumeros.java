package list.ordenacao.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros implements Comparator<Integer> {
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ascendente = new ArrayList<>(numeros);
        Collections.sort(ascendente, this);
        return ascendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> descendente = new ArrayList<>(numeros);
        Collections.sort(descendente, Collections.reverseOrder());
        return descendente;
    }

    @Override
    public int compare(Integer numero1, Integer numero2) {
        return Integer.compare(numero1, numero2);
    }
}
