package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoa = new ArrayList<>();

    public OrdenacaoPessoa() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenadaPessoa = new ArrayList<>(listaPessoa);
        Collections.sort(listaOrdenadaPessoa);
        return listaOrdenadaPessoa;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> listaOrdenadaAltura = new ArrayList<>(listaPessoa);
        Collections.sort(listaOrdenadaAltura, new ComparatorPorAltura());
        return listaOrdenadaAltura;
    }
}
