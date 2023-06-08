package encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}


/*
    Nesse exemplo, as variáveis de instância "nome" e "idade" são definidas como privadas, o que significa que elas
    não podem ser acessadas diretamente de fora da classe. Em vez disso, métodos públicos são fornecidos para ler e
    modificar essas variáveis.

    Os métodos getNome() e getIdade() são chamados de métodos de acesso (getters) e são usados para obter os valores
    das variáveis encapsuladas. Eles retornam os valores correspondentes das variáveis.

    Os métodos setNome() e setIdade() são chamados de métodos de modificação (setters) e são usados para definir os
    valores das variáveis encapsuladas. Eles recebem os novos valores como parâmetros e atribuem esses valores às
    variáveis correspondentes.
 */