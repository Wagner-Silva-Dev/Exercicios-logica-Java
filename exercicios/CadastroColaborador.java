package exercicios;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class CadastroColaborador {

    static final double SalarioBase = 2000.0;

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)) {
            ArrayList<String> colaboradores = new ArrayList<>();

            boolean rodando = true;

            do {
                exibirmenu();
                int opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {
                    case 1:
                        boolean continuar;

                        do {
                            // O método faz o trabalho e nos diz se deve continuar
                            continuar = executarCadastro(entrada, colaboradores, SalarioBase);
                        } while (continuar);
                        break;

                    case 2:

                        do {
                            continuar = executarCadastroComissionado(entrada, colaboradores, SalarioBase);
                        } while (continuar);
                        break;

                    case 3:

                        do {
                            continuar = executarCadastroProducao(entrada, colaboradores, SalarioBase);
                        } while (continuar);
                        break;

                    case 4:
                        exibirFolhaPagamento (colaboradores);
                        break;

                    case 0:
                        rodando = false;
                        System.out.println("Encerrando sistema.");
                        break;

                    default:
                        System.out.println("Opção selecionada é inválida, tente novamente.");

                }
            } while (rodando);
        }
    }

    public static void exibirmenu() {
        System.out.println("Informe que tipo de cadastro você quer fazer: ");
        System.out.println("Opção 1: Cadastro de Colaborador Padrão");
        System.out.println("Opção 2: Cadastro de Colaborador Comissionado.");
        System.out.println("Opção 3: Cadastro de Colaborador de Produção.");
        System.out.println("Opção 4: Gerar Folha de Pagamento.");
        System.out.println("Opção 0: Fechar sistema.");
    }

    public static boolean executarCadastro(Scanner entrada, ArrayList<String> lista, double valorBase) {
        System.out.println("\n--- CADASTRANDO COLABORADOR COMUM ---");
        System.out.println("Insira o nome (ou 'parar'): ");
        String nome = entrada.nextLine();

        // Se digitar parar, retorna 'false' para avisar ao loop principal que deve
        // encerrar
        if (nome.equalsIgnoreCase("parar")) {
            return false;
        }

        System.out.println("Insira o número de registro:");
        int registro = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer do Enter

        // Guarda tudo formatado na lista
        String dadosParaSalvar = formatarColaborador(nome, registro, valorBase);
        lista.add(dadosParaSalvar);

        System.out.println("Colaborador cadastrado com sucesso!");
        return true; // Retorna 'true' para indicar que o cadastro aconteceu e pode continuar
    }

    public static boolean executarCadastroComissionado(Scanner entrada, ArrayList<String> lista, double valorBase) {
        System.out.println("\n --- CADASTRANDO COLABORADOR COMISSIONADO ---");
        System.out.println("Insira o nome (ou 'parar'): ");
        String nome = entrada.nextLine();

        if (nome.equalsIgnoreCase("parar")) {
            return false;
        }

        System.out.println("Insira o número de registro: ");
        int registro = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Insira o valor total das vendas realizadas: ");
        double vendas = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Informe comissão percentual: ");
        double porcentagemComissao = entrada.nextDouble();
        entrada.nextLine();

        double salarioFinal = valorBase + (vendas * porcentagemComissao / 100);

        String dadosParaSalvar = formatarColaborador(nome, registro, salarioFinal);
        lista.add(dadosParaSalvar);

        System.out.println("Colaborador cadastrado com sucesso!");
        return true;

    }

    public static boolean executarCadastroProducao(Scanner entrada, ArrayList<String> lista, double valorBase) {
        System.out.println("\n --- CADASTRANDO COLABORADOR DE PRODUÇÃO ---");
        System.out.println("Insira o nome (ou 'parar'): ");
        String nome = entrada.nextLine();

        if (nome.equalsIgnoreCase("parar")) {
            return false;
        }

        System.out.println("Insira o número de registro: ");
        int registro = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Insira o número de peças produzidas: ");
        double pecasProduzidas = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Informe o valor das peças produzidas: ");
        double valorPecas = entrada.nextDouble();
        entrada.nextLine();

        double salarioFinal = valorBase + (pecasProduzidas * valorPecas);

        String dadosParaSalvar = formatarColaborador(nome, registro, salarioFinal);
        lista.add(dadosParaSalvar);

        System.out.println("Colaborador cadastrado com sucesso!");
        return true;
    }

    public static void exibirFolhaPagamento(ArrayList<String> lista) {
        System.out.println("\n========== FOLHA DE PAGAMENTO ==========");

        // Verificamos se a lista está vazia antes de tentar imprimir
        if (lista.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado até o momento.");
        } else {
            // Usamos o "Enhanced For-Loop" (for-each) para percorrer a lista
            for (String colaborador : lista) {
                System.out.println(colaborador);
            }
        }

        System.out.println("========================================\n");
    }

    public static String formatarColaborador(String nome, int registro, double salarioFinal) {
        return String.format("Nome: %s | Reg: %d | Salário: R$ %.2f", nome, registro, salarioFinal);
    }
}