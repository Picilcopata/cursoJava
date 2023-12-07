package oo.composicao.composicaoDesafio;

public class ClienteTeste {
    public static void main(String[] args) {
        // fazer rodar
        
        Cliente cliente1 = new Cliente("Carlos");
        Compra lista1 = new Compra();
        lista1.adicionarItem(new Item("Escova", 6.28, 3));
        lista1.adicionarItem(new Item("Pasta", 7, 2));
        System.out.println(lista1.obterValorTotal());
    }
}
