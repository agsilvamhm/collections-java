package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefas.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public List<String> obterDescricaoTarefas(){
        List<String> lista = new ArrayList<>();
        for (Tarefa t: tarefas){
            lista.add(t.getDescricao());
        }
        return lista;
    }
}
