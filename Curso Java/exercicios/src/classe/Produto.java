package classe;

public class Produto {
    
    String nome;
    double preco;
    static double desconto = 0.25; // Escreva em decimal xD

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double precoComDesconto(){
        return preco * (1 - desconto);
    } 
    
    public void statusProduto(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço com desconto: " + this.precoComDesconto());
    }
    

}
