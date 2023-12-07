package oo.polimorfismo;

public class Sorvete extends Comida {
    public Sorvete(double peso) {
        super(peso);
    }

    public Comida sorvete = new Comida(getPeso());
}
