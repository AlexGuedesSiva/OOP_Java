package abstracao;

// Classe abstrata que representa um produto
abstract class Produto {
    private String nome;
    private double preco;

    // Contructor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método abstrato para calcular o preço de venda
    public abstract double calcularPrecoVenda();

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

// Subclasse que representa um produto específico: Livro
class Livro extends Produto {
    private int numeroPaginas;

    public Livro(String nome, double preco, int numeroPaginas) {
        super(nome, preco);
        this.numeroPaginas = numeroPaginas;
    }

    // Implementação do método abstrato para calcular o preço de venda
    @Override
    public double calcularPrecoVenda() {
        // Exemplo de cálculo simples: preço de custo + 50%
        return getPreco() * 1.5;
    }

    // Getter e setter específico para número de páginas
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

// Classe principal para testar a abstração
class ExemploAbstracao {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", 50.0, 500);
        double precoVenda = livro.calcularPrecoVenda();

        System.out.println("Nome do livro: " + livro.getNome());
        System.out.println("Preço de venda: " + precoVenda);
        System.out.println("Número de páginas: " + livro.getNumeroPaginas());
    }
}

/*
    Nesse exemplo, temos a classe abstrata Produto, que representa um produto genérico e contém atributos como nome
    e preço.Além disso, a classe possui um método abstrato calcularPrecoVenda() que deve ser implementado
    pelas subclasses.

    A classe Livro é uma subclasse de Produto e implementa o método abstrato calcularPrecoVenda() de acordo com a
    lógica específica para calcular o preço de venda de um livro.

    Na classe principal ExemploAbstracao, criamos um objeto do tipo Livro, definimos seu nome, preço e número de
    páginas e então chamamos o método calcularPrecoVenda() para obter o preço de venda do livro. Em seguida,
    imprimimos as informações do livro na tela.

    Esse exemplo demonstra como a abstração permite criar uma estrutura genérica para representar produtos e definir
    comportamentos específicos nas subclasses.

 */


