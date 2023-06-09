package herança;

public class Tablet extends Computador{
    // Atributos exclusivo da classe Tablet
    private String cobertura;

    // Constructor
    public Tablet(int codigoDeBarra, int memoria, String processador, String cobertura) {
        super(codigoDeBarra, memoria, processador);
        this.cobertura = cobertura;
    }

    // Getter e Setter
    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    //Métodos
    public void iniciarConexao(){
        System.out.println("Conexão ativada");
    }

}
