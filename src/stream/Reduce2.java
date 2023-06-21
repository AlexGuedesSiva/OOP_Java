package stream;

import lambda.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {


        lambda.Aluno a1 = new lambda.Aluno("Ana", 7.1);
        lambda.Aluno a2 = new lambda.Aluno("Luna", 6.1);
        lambda.Aluno a3 = new lambda.Aluno("Gui", 8.1);
        lambda.Aluno a4 = new lambda.Aluno("Gabi", 10);

        List<lambda.Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<lambda.Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = Double::sum;

        alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);











    }
}
