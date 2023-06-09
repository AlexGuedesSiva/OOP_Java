package herança;

public class Executavel {
    public static void main(String[] args) {

        // Instanciando objetos de classe filha
        Desktop desk = new Desktop(1001, 4, "intel", "amd");
        Tablet tab = new Tablet(1100, 2, "dual", "3G");
        Celular cel = new Celular(1011, 16, "asus", true);
        Computador desk2 = new Desktop(1002, 8, "amd", "nvidia");

        // Imprimindo informações do objeto desk
        System.out.println("\nInformações do Desktop");
        System.out.printf(
                "Código de barra: %d \nMemória: %d \nProcessador: %s \nPlaca de video: %s \n\n",
                desk.getCodigoDeBarra(), desk.getMemoria(), desk.getProcessador(), desk.getPlacaDeVideo());

        // Imprimindo informações do objeto tab
        System.out.println("Informações do Tablet");
        System.out.println(tab.toString());

        // Imprimindo informações do objeto cel
        System.out.println("\nInformações do Celular");
        System.out.println(cel.toString());

    }
}
