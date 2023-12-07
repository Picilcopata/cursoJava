package oo.polimorfismo;

public class Arroz extends Comida {
    public Arroz(double peso) {
        super(peso);
    }

    public Comida arroz = new Comida(getPeso());
}
