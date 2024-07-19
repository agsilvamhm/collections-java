package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> listaConvidados;

    public ConjuntoConvidados(){
        this.listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite){
        listaConvidados.add(new Convidado(nome,convite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c: listaConvidados){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        listaConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return listaConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(listaConvidados);
    }

    public static void main(String[] args){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1238);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 1239);
        conjuntoConvidados.adicionarConvidado("Convidado 7", 1240);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1240);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");
    }
}
