package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> listaContatos ;

    public AgendaContatos(){
        this.listaContatos = new HashSet<>();
    }

    public void adicionaContato(String nome, int numero){
        listaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(listaContatos);
    }

    public Set<Contato> getListaContatos(String nome){
        Set<Contato>  listaResultado = new HashSet<>();
        for (Contato c: listaContatos){
            if (c.getNome().startsWith(nome)){
                listaResultado.add(c);
            }
        }
        return listaResultado;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: listaContatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionaContato("Contato - 1", 26);
        agendaContatos.adicionaContato("Contato - 2", 27);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.getListaContatos("Contato"));
        agendaContatos.atualizarNumeroContato("Contato - 1", 8686);
        agendaContatos.exibirContatos();
    }
}