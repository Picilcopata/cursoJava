package lambdas;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;

public class Desafio {
    public static void main(String[] args) {
        
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Double precoReal =  p.preco - (p.preco * p.desconto);
        Double imposto = precoReal >= 2500 ? precoReal * 0.85 : precoReal;
        Double frete = imposto >= 3000 ? imposto + 100 : imposto + 50;
        Double valorFinal = frete;

        System.out.println("R$ " + new DecimalFormat("#,##0.00").format(valorFinal));

    }
}

// Era pra fazer com os operadores unários e binários. Mas resolveu xD