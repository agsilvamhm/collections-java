import jdk.swing.interop.SwingInterOpUtils;
import list.Carrinho.CarrinhoDeCompras;
import list.OperacoesBasicas.ListaTarefas;
import list.Pesquisa.CatalogoLivros;

public class Main {
    public static void main(String[] args){

   /*   Teste para o List Básico
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
        */

     /*
        CarrinhoDeCompras lista = new CarrinhoDeCompras();
        lista.adicionarItem("Teclado", 150.00, 2);
        lista.adicionarItem("Monitor", 650.00, 12);
        lista.adicionarItem("Mouse", 50.00, 6);
        lista.adicionarItem("Cadeira", 1000.00, 10);
        lista.adicionarItem("Televisão", 2500.00, 5);
        lista.exibirItens();
        System.out.println(lista.calcularValortotal());
        lista.removerItem("Televisão");
        lista.exibirItens();
     */

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3","Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 5","Autor 5", 1994);


        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));

        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020,2020));

        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }

}
