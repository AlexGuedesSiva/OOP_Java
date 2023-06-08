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
    // Métodos
    public void ligar(){
        System.out.println("Maquina ligada");
    }

    public void desligar(){
        System.out.println("Maquina desligada");
    }
}
