package classe;

public class ClasseMain {
    public static void main(String[] args) {

        /*
            Instância

            Em Java, a instanciação de objetos é o processo de criar uma instância, ou seja, uma cópia concreta de uma
            classe. Um objeto é uma entidade real que possui características e comportamentos específicos definidos
            pela classe da qual foi instanciado.

            Para criar uma instância de um objeto em Java, é necessário usar a palavra-chave new seguida pelo nome da
            classe e parênteses vazios (se a classe possuir um construtor sem parâmetros) ou pelos parâmetros
            necessários para chamar um construtor específico.

            A instância de um objeto pode ser atribuída a uma variável de referência, que é um tipo de dado que
            especifica a classe da qual o objeto é uma instância. A variável de referência pode ser usada para acessar
            os atributos e métodos do objeto.
         */

        // Criação de uma instância de Pessoa Instancia
        Carros myCar;
        myCar = new Carros();

        myCar.placa="ABC 1234";
        myCar.anoDeFabricacao=2010;

        System.out.println("A placa do carro é: " + myCar.placa);

    }
}


