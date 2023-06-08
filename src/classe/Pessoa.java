package classe;

public class Pessoa {


    /*
        Método Constructor:

        Constructor é um tipo especial de método em Java que é usado para inicializar objetos. Ele é invocado
        automaticamente sempre que um novo objeto de uma classe é criado. O objetivo principal de um constructor
        é atribuir valores iniciais aos atributos (variáveis de instância) de um objeto.

        Em Java, um constructor é definido usando o mesmo nome da classe em que ele está localizado. Ele pode ter
        parâmetros ou não. Se um constructor não for explicitamente definido em uma classe, a linguagem Java fornece
        um constructor padrão sem parâmetros, que inicializa os atributos com valores padrão.
     */

    // Método Constructor sem parâmetros
    public Pessoa(){
        nome = "Sem nome";
        idade = 0;
    }
    // Método constructor com parameter
    public Pessoa(String nome, String genero, int idade, float peso, float altura) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    /*
        Atributos:

        Em Java, atributos são variáveis declaradas dentro de uma classe que armazenam dados associados a objetos
        dessa classe. Também conhecidos como variáveis de instância ou campos, os atributos definem as características
        e estados de um objeto.

        Cada objeto de uma classe possui seus próprios conjuntos de valores para os atributos. Isso significa que os
        atributos são únicos para cada instância da classe e podem ter diferentes valores em objetos diferentes.
     */

    // ATRIBUTOS DA CLASSE
    public String nome, genero;
    public int idade;
    public float peso, altura;


        // Métodos:
     /*
        Em Java, um método é um bloco de código que executa uma determinada ação ou calcula um valor específico.
        Os métodos são usados para agrupar instruções relacionadas em uma unidade lógica e reutilizável, permitindo
        que sejam chamados e executados várias vezes ao longo de um programa.

        Cada método em Java tem um nome único que o identifica e pode ter um conjunto de parâmetros (opcional) que
        especificam os dados de entrada necessários para executar o método. Além disso, um método pode ter um tipo de
        retorno, que define o tipo de valor que o método retorna após a sua execução.
     */

        // Métodos da classe
    public void andar(){
        // Corpo do método
        // Instruções a serem executadas
        // Retorno de valor (se houver)
    }
    public void falar(){
        // Corpo do método
        // Instruções a serem executadas
        // Retorno de valor (se houver)
    }
    public void comer(){
        // Corpo do método
        // Instruções a serem executadas
        // Retorno de valor (se houver)
    }


}
