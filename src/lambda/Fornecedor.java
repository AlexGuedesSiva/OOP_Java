package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        // Obrigatorio () ->  Quando voce nao tem parametros de entrada.
        Supplier<List<String>> umLista =
                () -> Arrays.asList("Ana", "Bia", "Lea", "Lex");

        System.out.println(umLista.get());






    }
}
