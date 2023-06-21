package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Employe e1 = new Employe("Luiz", 2000.00, true);
        Employe e2 = new Employe("Alex", 2688.00, true);
        Employe e3 = new Employe("Léo", 2800.00, false);
        Employe e4 = new Employe("Rinaldo", 3200.00, false);
        Employe e5 = new Employe("Zé", 3500.00, true);
        Employe e6 = new Employe("Luca", 1990.00, true);

        List<Employe> empregados = Arrays.asList(e1,e2,e3,e4,e5,e6);

        Predicate<Employe> temFalta = e -> e.absenteismoNull;
        Predicate<Employe> recebeMenoDeDoisMil = e -> e.salario <= 3000.00;
        Function<Employe, String> aprovado = a -> "Parabens " + a.nome + " você recebeu um aumento!!!";

        empregados.stream()
                .filter(recebeMenoDeDoisMil)
                .filter(temFalta)
                .map(aprovado)
                .forEach(System.out::println);








    }
}
