package oo.polimorfismo;

public class Feijao extends Comida{
    public Feijao(double peso) {
        super(peso);
    }

    public Comida feijao = new Comida(getPeso());
}
