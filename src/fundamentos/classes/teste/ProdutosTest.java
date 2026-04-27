package fundamentos.classes.teste;

import fundamentos.classes.produto.Produto;

import java.util.Scanner;

public class ProdutosTest {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        produto.setNome(scanner.nextLine());

        while (produto.getNome().isBlank() || produto.getNome().length() < 3) {
            System.out.println("Nome invalido, digite novamente");
            produto.setNome(scanner.nextLine());
        }

        System.out.println("Digite a quantidade em estoque do produto");
        produto.setEstoque(scanner.nextInt());

        while (produto.getEstoque() < 0) {
            System.out.println("Estoque invalido, digite novamente");
            produto.setEstoque(scanner.nextInt());
        }

        System.out.println("Digite o valor do produto");
        produto.setPreco(scanner.nextDouble());

        while (produto.getPreco() < 0) {
            System.out.println("Preco invalido, digite novamente");
            produto.setPreco(scanner.nextDouble());
        }

        produto.imprimirDados();
    }


}
