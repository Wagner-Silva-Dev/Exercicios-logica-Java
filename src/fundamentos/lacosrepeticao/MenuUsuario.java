package fundamentos.lacosrepeticao;

import java.util.Scanner;

public class MenuUsuario {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        int opcao; // declara a variável que vai guardar a escolha do usuário
            
        do { // inicia o loop, executa pelo menos uma vez
            
            System.out.println("\n1 - Registrar Tempo");  // \n pula uma linha antes do menu
            System.out.println("2 - Mostrar Relatorio");  // opções do menu
            System.out.println("0 - Sair");               // 0 é o valor sentinela para encerrar
            System.out.print("Escolha: ");                // print sem ln para o cursor ficar na mesma linha
            opcao = entrada.nextInt();                    // lê o número digitado pelo usuário

            if (opcao == 1) {                            // se digitou 1
                System.out.println("Registrando Tempo...");
            } else if (opcao == 2) {                     // se digitou 2
                System.out.println("Mostrando Relatorio...");
            } else if (opcao != 0) {                     // se digitou qualquer coisa que não seja 0, 1 ou 2
                System.out.println("Opcao Invalida.");
            }
            // se digitou 0 não faz nada, apenas deixa o while verificar a condição

        } while (opcao != 0); // repete enquanto o usuário não digitar 0

        System.out.println("Encerrado."); // só chega aqui quando opcao for 0
        entrada.close();
    }

}