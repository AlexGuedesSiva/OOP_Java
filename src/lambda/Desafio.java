package lambda;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        // Função calcular precoFinal com interface Function
        Function<Produto, Double> precoComDesconto = prod -> p.preco * (1 - p.desconto);
        System.out.printf("preco final:R$ %.2f \n",precoComDesconto.apply(p));
        double precofinal = (1 - p.desconto) * p.preco;


        UnaryOperator<Double> pagaImposto = imposto -> precofinal >= 2500 ? precofinal + 8.5 : precofinal;


    }
}

/*
    1 - A partir do produto calcular o preco real (com desconto)
    2 - Imposto Municipal: >= 2500 (8,5%) / 2500 (Isento)
    3 - Frete: >= 3000 (100) / < 3000 (50)
    4 - Arrendondar: Deixar duas casas decimais
    5 - Formatar: 1234,56
 */