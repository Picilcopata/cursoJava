package oo.composicao.composicaoDesafio;

public class Item { 
    
    String nome;
    double preco;
    int quantidade;
    Compra compra;
    

    Item(String nome, double preco, int quantidade){
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

}
