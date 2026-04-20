/*Camada 1: 
solução técnica em Java (o que precisa existir no código) Você vai implementar uma lógica que percorra um conjunto de famílias e calcule a prioridade usando critérios objetivos. 
Você vai usar estruturas repetitivas para processar várias famílias e estruturas condicionais para aplicar regras como bônus e penalidades. 
Você vai organizar o código de forma legível, preferencialmente com subrotinas para separar responsabilidades 
(por exemplo: calcular pontuação, validar dados, imprimir explicação). Você vai gerar uma saída final com a pontuação e a ordem de prioridade, 
e vai incluir pelo menos dois testes simples no console para provar que o cálculo está coerente.*/
package exercicios;

import java.util.Scanner;

public class PriorizaAtendimento {
    
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da familia que vai ser cadastrada");
        String idFamilia = scanner.nextLine();

        System.out.println("Digite a quantidade de membros da familia");
        int membrosFamilia = scanner.nextInt();
        scanner.nextLine();

        double rendaTotalFamilia = 0;
        int membrosQueInformaram = 0;
        for (int i = 1; i <= membrosFamilia ; i++){
            System.out.println("Digite a renda do " + i +  "º membro(ou -1 para encerrar)");
            double rendaMembro = validarNegativos(scanner);

            if (rendaMembro == -1){
                break;
            }

            rendaTotalFamilia += rendaMembro;

            membrosQueInformaram = i;
        }

        int dependentesFamilia = membrosFamilia - membrosQueInformaram;

        scanner.nextLine();
        System.out.println("Alguém da familia possui algum tipo de deficiência?");
        String possuiDeficiencia = scanner.nextLine();

        System.out.println("Quanto tempo que a familia não tem alguém empregado na casa?(em meses)");
        int tempoDesemprego = (int)validarNegativos(scanner);

        System.out.println("Qual o risco do bairro que a familia mora?");
        System.out.println("1 - baixo risco");
        System.out.println("2 - médio risco");
        System.out.println("3 - alto risco");
        int bairroRisco = scanner.nextInt();

        double pontuacaoFinal = calcularPontuacao(rendaTotalFamilia, membrosFamilia , dependentesFamilia, possuiDeficiencia, tempoDesemprego, bairroRisco);

        imprimirResultado(idFamilia, pontuacaoFinal, rendaTotalFamilia, membrosFamilia, dependentesFamilia, possuiDeficiencia, tempoDesemprego, bairroRisco);

        scanner.close();
    }

        // ===================== CÁLCULO DE PONTUAÇÃO =====================

    public static double calcularPontuacao(double rendaTotal, int totalMembros, int dependentes, String deficiencia, int tempoDesemprego, int bairroRisco) {
        double pontuacao = 0;

        pontuacao += calcularPontosPorRenda(rendaTotal, totalMembros);
        pontuacao += calcularPontosPorDependentes(dependentes);
        pontuacao += calcularBonusDeficiencia(deficiencia);
        pontuacao += calcularBonusBairro(bairroRisco);
        pontuacao += calcularBonusDesemprego(tempoDesemprego);

        return pontuacao;
    }

    // Renda per capita → até 40 pontos (quanto menor, mais pontos)
    public static double calcularPontosPorRenda(double rendaTotal, int totalMembros) {

        double rendaPerCapita = totalMembros > 0 ? rendaTotal / totalMembros : 0; // ? é um if/else de uma linha só sendo condição ? valor_verdadeiro : valor_falso
        double rendaMaxima = 5000.0;

        if (rendaPerCapita <= 0)           return 40;
        if (rendaPerCapita >= rendaMaxima) return 0;

        return ((rendaMaxima - rendaPerCapita) / rendaMaxima) * 40;
    }

    // Dependentes → até 20 pontos (5 por dependente, máximo 4)
    public static double calcularPontosPorDependentes(int dependentes) {
        return Math.min(dependentes * 5, 20); // math.min limita os pontos do dependente até 20
    }

    // Deficiência → bônus fixo de 15 pontos
    public static double calcularBonusDeficiencia(String deficiencia) {
        return deficiencia.equals("sim") ? 15 : 0;
    }

    // Bairro → bônus de 15 pontos se alto risco
    public static double calcularBonusBairro(int bairroRisco) {
        return bairroRisco == 3 ? 15 : 0;
    }

    // Desemprego → bônus de 10 pontos se > 12 meses
    public static double calcularBonusDesemprego(int tempoDesemprego) {
        return tempoDesemprego > 12 ? 10 : 0;
    }

    // ===================== SAÍDA =====================

    public static void imprimirResultado(String id, double pontuacao, double rendaTotal, int membros, int dependentes, String deficiencia, int tempoDesemprego, int bairroRisco) {

        System.out.println("\n========== RESULTADO ==========");
        System.out.println("Família: " + id);
        System.out.printf("Renda per capita: R$ %.2f  %.1f pts%n",  rendaTotal / membros, calcularPontosPorRenda(rendaTotal, membros));
        System.out.printf("Dependentes (%d):    %.0f pts%n",  dependentes, calcularPontosPorDependentes(dependentes));
        System.out.printf("Deficiência (%s):    %.0f pts%n",  deficiencia, calcularBonusDeficiencia(deficiencia));
        System.out.printf("Bairro risco %d:     %.0f pts%n",  bairroRisco, calcularBonusBairro(bairroRisco));
        System.out.printf("Desemprego %d meses: %.0f pts%n", tempoDesemprego, calcularBonusDesemprego(tempoDesemprego));
        System.out.println("--------------------------------");
        System.out.printf("PONTUAÇÃO FINAL: %.1f / 100%n", pontuacao);
        System.out.println("================================");
    }

    public static double validarNegativos(Scanner scanner){

        double resultado = scanner.nextDouble();

        while (resultado < 0 && resultado != -1){
            System.out.println("Valor inválido, por favor digite novamente");
            resultado = scanner.nextDouble();
        }

        return resultado;
    }
}