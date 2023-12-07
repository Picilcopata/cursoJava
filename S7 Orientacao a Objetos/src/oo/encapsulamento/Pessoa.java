package oo.encapsulamento;

public class Pessoa {
    
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade){
        //alterarIdade(idade);
        this.nome =  nome;
        this.idade = idade;
    }

    public int lerIdade(){
        return idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
    }
}

