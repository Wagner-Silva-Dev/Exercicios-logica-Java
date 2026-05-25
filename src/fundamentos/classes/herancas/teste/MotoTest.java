package fundamentos.classes.herancas.teste;

import fundamentos.classes.herancas.veiculos.Moto;

import java.util.Scanner;

public class MotoTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Moto moto = new Moto();

            System.out.println("Cadastre sua moto");

            System.out.println("Qual a marca do veiculo?");
            moto.setMarca(scanner.nextLine());

            System.out.println("Qual o ano de fabricaçao do veiculo?");
            moto.setAno(scanner.nextInt());

            System.out.println("Qual a velocidade maxima do veiculo?");
            moto.setVelocidadeMaxima(scanner.nextInt());

            System.out.println("Quantas cilindradas tem a moto?");
            moto.setCilindradas(scanner.nextInt());

            System.out.println(moto);
        }
    }
}