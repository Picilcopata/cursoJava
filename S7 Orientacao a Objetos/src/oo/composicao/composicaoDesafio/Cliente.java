package oo.composicao.composicaoDesafio;

import java.util.ArrayList;

public class Cliente {

    String nome;
    Compra compra;

    Cliente(String nome){
        this.nome = nome;
    }

    ArrayList<Compra> listaCompras = new ArrayList<>();


}
