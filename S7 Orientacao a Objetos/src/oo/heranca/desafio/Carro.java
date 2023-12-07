package oo.heranca.desafio;

public class Carro {
     
    int velocidadeMaxima;
    public int velocidade = 30;
    private int delta = 5;

    Carro(int velocidade_Maxima){
        velocidadeMaxima = velocidade_Maxima;
    }

    public boolean acelerar(){
        if(velocidade + getDelta() > velocidadeMaxima){
            velocidade = velocidadeMaxima;
        }else {
            velocidade += getDelta();
        }
        return false;
    }

    public boolean frear(){
        if(velocidade > 0){
            velocidade -= delta;
            return true;
        }
        return false;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    

}
