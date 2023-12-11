package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        
        Calculo soma = new Somar();
        Calculo multipliocacao = new Multiplicar();
        System.out.println(soma.executar(2, 3));
        System.out.println(multipliocacao.executar(2, 3));
    }
}
