package herança;

public class Computador {

    // Atributos da Classe mãe
    private int codigoDeBarra;
    private int memoria;
    private String processador;

    // Constructor
    public Computador(){}
    public Computador(int codigoDeBarra,int memoria, String processador){
        this.codigoDeBarra = codigoDeBarra;
        this.memoria = memoria;
        this.processador = processador;
    }

    // Getter e Setter
    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }
    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "codigoDeBarra=" + codigoDeBarra +
                ", memoria=" + memoria +
                ", processador='" + processador + '\'' +
                '}';
    }

    // Métodos
    public void ligar(){
        System.out.println("Maquina ligada");
    }

    public void desligar(){
        System.out.println("Maquina desligada");
    }
}
