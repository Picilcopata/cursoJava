package oo.abstrato;

public class Cachorro extends Mamifero {

    @Override
    public String respirar() {
        return "Co2";
    }
    @Override
    public String mover() {
        return "Usando as patas";
    }
    @Override
    public String mamar() {
        return "Usando o leite";
    }
}
