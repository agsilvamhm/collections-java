package list.Carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        int index = 0;
        for (Item i : listaItens){
            index ++;
            if(i.getNome().equals(nome)){
                break;
            }
         }
        if (index > 1) {
          //  System.out.println(index);
               listaItens.remove(index - 1);
        }
    }

    public Double calcularValortotal(){
        Double valor = 0.0;
        for (Item i : listaItens){
            valor += i.getPreco().doubleValue() * i.getQuantidade();
        }
        return valor;
    }

    public void exibirItens(){
        for (Item i : listaItens){
            System.out.println(i);
        }
    }
}