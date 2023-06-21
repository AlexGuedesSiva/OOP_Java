package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString(){
        double precoFinal = preco * (1 - desconto);
        return "Nome: " + nome + " tem preço de R$:" + precoFinal;
    }

    public static class Desafio {

        public static void main(String[] args) {

            // instancia
            Produto p = new Produto("Ipad", 3235.89, 0.13);
            // Funções
            Function<Produto, Double> precoFinal =
                    prod -> prod.preco * (1 - prod.desconto);
            UnaryOperator<Double> impostoMunicipal =
                    preco -> preco >= 2500 ? preco * 1.085 : preco;
            UnaryOperator<Double> frete =
                    preco -> preco >= 3000 ? preco + 100 : preco + 50;
            UnaryOperator<Double> arredondar =
                    preco -> Double.parseDouble(String.format("%.2f",preco).replace(",", "."));
            Function<Double, String> formatar =
                    preco -> ("R$" + preco);

            String preco = precoFinal
                    .andThen(impostoMunicipal)
                    .andThen(frete)
                    .andThen(arredondar)
                    .andThen(formatar)
                    .apply(p);
            System.out.println("O preço final é " + preco);




        }
    }
}
