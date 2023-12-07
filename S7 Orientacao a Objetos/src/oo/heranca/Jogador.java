package oo.heranca;

public class Jogador {
    
    public int vida =  100;
    public int x;
    public int y;

    Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador inimigo){
        
        int deltaX = Math.abs(x - inimigo.x);
        int deltaY = Math.abs(y - inimigo.y);

        if(deltaX == 0 && deltaY == 1){
            inimigo.vida -= 10;
            return true;
        } else if(deltaX == 1 && deltaY == 0){
            inimigo.vida -= 10;
            return true;
        } else{
            return false;
        }

    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }

/*     if(direcao == Direcao.NORTE){
            y++;
        }*/
        
 
        return true;
    }
}
