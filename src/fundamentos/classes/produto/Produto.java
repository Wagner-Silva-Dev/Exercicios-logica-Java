package fundamentos.classes.produto;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public void imprimirDados() {
        System.out.println("-------------------------");
        System.out.println("Relatório do produto");
        System.out.println("Nome: " + this.nome);
        System.out.println("Estoque: " + this.estoque);
        System.out.printf("Preço: %.2f\n", this.preco);
        System.out.println("-----------------------------");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }
}
