package fundamentos.classes.teste;

import fundamentos.classes.exerciciosAssociacao.produto.ItemPedido;
import fundamentos.classes.exerciciosAssociacao.produto.Pedido;

import java.util.Scanner;

public class PedidosTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite o número do pedido: ");
            int numeroPedido = scanner.nextInt();
            Pedido pedido = new Pedido(numeroPedido);

            String nomeItem;
            do {
                System.out.println("Digite o item do pedido (ou 'finalizar'): ");
                nomeItem = scanner.next();

                if (!nomeItem.equalsIgnoreCase("finalizar")) {
                    System.out.println("Digite a quantidade do pedido: ");
                    int quantidadeItem = scanner.nextInt();
                    pedido.adicionarItem(new ItemPedido(nomeItem, quantidadeItem));
                    System.out.println("Pedido adicionado com sucesso!\n");
                }
            } while (!nomeItem.equalsIgnoreCase("finalizar"));

            System.out.println("\nInformações do pedido Nº " + pedido.getNumero());
            for (ItemPedido itens : pedido.getItens()) {
                System.out.println("Produto: " + itens.getProduto());
                System.out.println("Quantidade pedida: " + itens.getQuantidade());
                System.out.println("================================");
            }
            System.out.println("Finalizando sistema");
        }
    }
}