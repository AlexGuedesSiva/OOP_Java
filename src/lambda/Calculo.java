package lambda;

@FunctionalInterface
public interface Calculo {
    // Método lambda
    double executar(double a, double b);

    // Consigo acessar o método executavel
    default String legal(){ return "legal"; }

    // Nao consigo acessar a instancia
    static String muitoLegal(){ return "Muito Legal"; }

}
