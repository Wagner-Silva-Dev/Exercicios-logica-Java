package fundamentos.classes.exerciciosAssociacao.produto;

public class ItemPedido {
    private final String produto;
    private final int quantidade;

    public ItemPedido(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}