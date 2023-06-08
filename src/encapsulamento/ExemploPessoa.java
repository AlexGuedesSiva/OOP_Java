package encapsulamento;

public class ExemploPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}

/*
    Nesse exemplo, criamos um objeto da classe Pessoa, definimos seu nome como "João" e idade como 25 usando os
    métodos setNome() e setIdade(). Em seguida, usamos os métodos getNome() e getIdade() para obter e exibir esses
    valores.

    O encapsulamento nesse exemplo garante que as variáveis "nome" e "idade" só possam ser acessadas e modificadas
    por meio dos métodos públicos fornecidos. Isso protege os dados internos da classe e fornece uma interface
    controlada para interagir com eles.
 */