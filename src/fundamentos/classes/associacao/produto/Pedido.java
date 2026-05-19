package fundamentos.classes.associacao.produto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private List<ItemPedido> itens;

    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public int getNumero() {
        return numero;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}