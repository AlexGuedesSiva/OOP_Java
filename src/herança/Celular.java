package herança;

public class Celular extends Computador {
    // Atributos exclusivos da classe Celular
    private boolean ligacao;

    // Constructor
    public Celular(int codigo, int memoria, String processador, boolean ligacao){
        super(codigo,memoria,processador);
        this.ligacao = ligacao;
    }

    //Getter/Setter
    public boolean isLigacao() {
        return this.ligacao;
    }

    public void setLigacao(boolean ligacao) {
        this.ligacao = ligacao;
    }

    @Override
    public String toString() {
        return "Código de barra: " + getCodigoDeBarra() + "\n" +
                "Memória: " + getMemoria() + "\n" +
                "Processador: " + getProcessador() + "\n" +
                "Status da ligação: " + isLigacao();
    }

    // Métodos
    public void fazerLigacao(){
        System.out.println("Ligando");
    }

}
