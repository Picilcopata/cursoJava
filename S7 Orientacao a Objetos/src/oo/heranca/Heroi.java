package oo.heranca;

public class Heroi extends Jogador {

    public Heroi(int x, int y){
        super(x, y);
    }
    
    public boolean atacar(Jogador inimigo){
        boolean ataque1 = super.atacar(inimigo);
        boolean ataque2 = super.atacar(inimigo);
        return ataque1 || ataque2;
    }
    
}
