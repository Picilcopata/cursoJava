package classe;

public class Jantar {
    public static void main(String[] args) {
         
        Pessoa p1 =  new Pessoa("Mateus", 70.0);
        Comida c1 = new Comida("arroz", .180);

        p1.comer(c1);
    }
}
