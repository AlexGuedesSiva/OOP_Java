package herança;

public class Desktop extends Computador {
    // Atributos excluiso da classe Desktop
    private String placaDeVideo;

    //Constructor
    public Desktop(int codigo, int memoria, String processador, String placaDeVideo){
        super(codigo,memoria,processador);
        this.placaDeVideo = placaDeVideo;
    }

    // Getter/Setter

    public String getPlacaDeVideo(){
        return this.placaDeVideo;
    }

    public void setPlacaDeVideo(){
        this.placaDeVideo = placaDeVideo;
    }
}
