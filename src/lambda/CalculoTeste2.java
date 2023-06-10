package lambda;

public class CalculoTeste2 {
    public static void main(String[] args) {

        // Função sem Nome
        Calculo calc = (x, y) -> { return x + y; };
        System.out.println(calc.executar(2, 3));

        // Função sem Nome e Emitida
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 3));

        System.out.println(calc.legal());
        System.out.println(Calculo.muitoLegal());
    }
}
