package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> listaProduto;

    public CadastroProduto(){
        this.listaProduto = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        listaProduto.add(new Produto(cod,nome,preco, quantidade));
    }

    public Set<Produto> exibirProdutoNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(listaProduto);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(listaProduto);
        return produtosPorPreco;
    }

    public static void main(String[] args){
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1, "Produto 5", 15d, 5);
        cadastroProduto.adicionarProduto(2, "Produto 0", 20d, 10);
        cadastroProduto.adicionarProduto(1, "Produto 3", 10d, 2);
        cadastroProduto.adicionarProduto(9, "Produto 9", 2d, 2);

        System.out.println(cadastroProduto.listaProduto);

        System.out.println(cadastroProduto.exibirProdutoNome());

        System.out.println(cadastroProduto.exibirProdutosPorPreco());

    }
}
