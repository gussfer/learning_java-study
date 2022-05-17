public class Produto {
    // atributos do objeto
    private String nome; // encapsulamento: tornar atributos private (segurança dos atributos )
    private double preco;
    private int qtde;
    // sobrecarga é disponibilizar mais de uma versão de um mesmo construtor

    // construtor padrão
    public Produto() {
    }

    // construtor
    public Produto(String nome, double preco, int qtde) {
        // corpo do construtor
        this.nome = nome; // this.nomr = atributo do obj e nome => parametro do metodo
        this.preco = preco; // this é necessário quando nome da variavel se repete no tributo: diferenciar
                            // variável do parametro
        this.qtde = qtde; // this.variavel = atriuto
    }

    // criar construtor com 2 parametros sem qtdes
    public Produto(String nome, double preco) {
        this.nome = nome; // this.nome = atributo do obj e nome => parametro do metodo
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    } // encapsulamento: tornar atributos private (segurança dos atributos )

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    } // encapsulamento: tornar atributos private (segurança dos atributos )

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double totalEstoque() {
        return preco * qtde;
    }

    public void addProduto(int qtde) {
        this.qtde += qtde;
    }

    public void removeProduto(int qtde) {
        this.qtde -= qtde;
    }

    public String toString() {
        return "Produto: " + nome
                + ", R$. "
                + String.format("%.2f", preco)
                + ", "
                + qtde
                + " unidades, Total em estoque: R$. "
                + String.format("%.2f", totalEstoque());
    }

}
