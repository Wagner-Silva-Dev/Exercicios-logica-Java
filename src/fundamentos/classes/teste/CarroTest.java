package src.fundamentos.classes.teste;

import src.fundamentos.classes.concessionaria.Carro;
import java.util.Scanner;

public class CarroTest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();

        do{
            System.out.println("Digite o nome do carro");
            carro.nome = sc.nextLine();

            System.out.println("Digite o modelo do carro");
            carro.modelo = sc.nextLine();

            System.out.println("Digite o ano do carro");
            carro.ano = sc.nextInt();

            while(carro.ano < 1884 || carro.ano > 2026){
                System.out.println("Esse ano não é valido, por favor digite novamente");
                carro.ano = sc.nextInt();
            }

            carro.imprimirEspecificacoesCarro();

            sc.nextLine();
            System.out.println("Deseja finalizar o sistema? S/N");
            String continuar = sc.nextLine();
            if (continuar.equalsIgnoreCase("S")) {
                break;
            }
        }while(true);

        System.out.println("----------------------");
        System.out.println("Digitação Encerrada");
        System.out.println("Finalizando sistema");
        System.out.println("----------------------");
    }
}
