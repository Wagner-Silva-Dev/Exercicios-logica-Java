package fundamentos.classes.teste;

import java.util.Scanner;

public class Carro {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        fundamentos.classes.concessionaria.Carro carro = new fundamentos.classes.concessionaria.Carro();

        System.out.println("Digite quantos deseja digitar");
        int contador = sc.nextInt();

        for (int i = 0; i < contador; i++) {

            sc.nextLine();
            System.out.println("Digite o nome do carro");
            carro.nome = sc.nextLine();

            System.out.println("Digite o modelo do carro");
            carro.modelo = sc.nextLine();

            System.out.println("Digite o ano do carro");
            carro.ano = sc.nextInt();

            while(carro.ano < 1884){
                System.out.println("Esse ano não é valido, por favor digite novamente");
                carro.ano = sc.nextInt();
            }

            System.out.println("Especificações do carro");
            System.out.println("Nome: " + carro.nome);
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Ano: " + carro.ano);
        }
        System.out.println("----------------------");
        System.out.println("Digitação Encerrada");
        System.out.println("Finalizando programa");
        System.out.println("----------------------");
    }
}
