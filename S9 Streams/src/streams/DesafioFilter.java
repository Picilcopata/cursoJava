package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {
        
        Produtos p1 = new Produtos("Arroz", "Alimentos", 7.98);
        Produtos p2 = new Produtos("Papel higiênico", "Higiene", 5.26);
        Produtos p3 = new Produtos("Frango", "Alimentos", 14.95);
        Produtos p4 = new Produtos("Garfo descartável", "Talheres", 1.37);
        Produtos p5 = new Produtos("Cotonete", "Higiene", 1.99);
        Produtos p6 = new Produtos("Pasta de dente", "Higiene", 3.25);

        List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Predicate<Produtos> alimentos = p -> p.categoria == "Alimentos";
        Function<Produtos, String> prodComestivel =
                a -> "O produto: " + a.nome + " é comestível!";

        produtos.stream()
            .filter(alimentos)
            .map(prodComestivel)
            .forEach(System.out::println);

    }
}
