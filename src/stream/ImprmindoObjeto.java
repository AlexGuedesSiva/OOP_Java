package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprmindoObjeto {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
        System.out.println("Usando Foreach...");
        for (String nome: aprovados )
        {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator1 = aprovados.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("\nUsando Streams...");
        Stream<String> stream1 = aprovados.stream();
        stream1.forEach(System.out::println); //Laço interno!!!





    }
}
