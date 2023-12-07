package oo.composicao.composicaoDesafio;

import java.util.ArrayList;

public class Compra {
    
    Cliente cliente;

    ArrayList<Item> listaItens = new ArrayList<>();

    void adicionarItem(Item item){
        this.listaItens.add(item);
        item.compra = this;
    }

    double obterValorTotal(){
        double total = 0;
        for(Item item: listaItens){
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
