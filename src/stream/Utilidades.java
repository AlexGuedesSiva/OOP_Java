package stream;

import java.util.function.UnaryOperator;

public class Utilidades {

    private Utilidades(){}
    public final static UnaryOperator<String> maiscula = String::toUpperCase;
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    public static String grito(String n) {
      return n + "!!! ";
    }




}
