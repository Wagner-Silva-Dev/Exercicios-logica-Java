package fundamentos.classes.teste;

import fundamentos.classes.produto.Produto;

import java.util.Scanner;

public class ProdutosTest {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);

        validarNome(produto, scanner);

        validarEstoque(produto, scanner);

        validarPreco(produto, scanner);

        produto.imprimirDados();
    }

    static void validarNome(Produto produto, Scanner scanner) {
        System.out.println("Digite o nome do produto");
        String nome = scanner.nextLine();

        while (nome.isBlank() || nome.length() < 3) {
            System.out.println("Nome invalido, digite novamente");
            nome = scanner.nextLine();
        }
        produto.setNome(nome);
    }

    static void validarEstoque(Produto produto, Scanner scanner) {
        System.out.println("Digite a quantidade em estoque do produto");
        int qtdeEstoque =  scanner.nextInt();

        while (qtdeEstoque < 0) {
            System.out.println("Quantidade invalido, digite novamente");
            qtdeEstoque = scanner.nextInt();
        }
        produto.setEstoque(qtdeEstoque);
    }

    static void validarPreco(Produto produto, Scanner scanner) {
        System.out.println("Digite o valor do produto");
        double preco = scanner.nextDouble();

        while (preco < 0) {
            System.out.println("Preco invalido, digite novamente");
            preco = scanner.nextDouble();
        }
        produto.setPreco(preco);
    }
}
