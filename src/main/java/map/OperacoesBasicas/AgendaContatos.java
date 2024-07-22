package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> listaContatos;

    public AgendaContatos() {
        this.listaContatos = new HashMap();
    }

    public void adicionarContato(String nome, Integer telefone){
        listaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!listaContatos.isEmpty()){
            listaContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(listaContatos);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!listaContatos.isEmpty()){
            numeroPorNome = listaContatos.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Adalberto", 999752200);
        agendaContatos.adicionarContato("Ana", 988887767);
        agendaContatos.adicionarContato("Mayra", 999370666);
        agendaContatos.adicionarContato("Heloyse", 981068018);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Mayra");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisaPorNome("Heloyse"));
    }
}
