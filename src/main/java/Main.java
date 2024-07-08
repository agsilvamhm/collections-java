import list.OperacoesBasicas.ListaTarefas;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Fazer a lição do Duolingo");
        lista.adicionarTarefa("Verificar e-mail da pos-graduação");
        lista.adicionarTarefa("Me inscrever em sites de emprego");

        System.out.println(lista.obterNumeroTotalTarefas());

        lista.removerTarefa("Fazer a lição do Duolingo");

        System.out.println(lista.obterNumeroTotalTarefas());

        for( String s: lista.obterDescricaoTarefas()){
            System.out.println(s);
        }
    }

}
