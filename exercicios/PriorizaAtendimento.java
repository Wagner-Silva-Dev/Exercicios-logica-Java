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

        System.out.println("Alguém da familia possui algum tipo de deficiência?");
        String possuiDeficiencia = scanner.nextLine();

        System.out.println("Quanto tempo que a familia não tem alguém empregado na casa?(em meses)");
        int tempoDesemprego = (int)validarNegativos(scanner);

        System.out.println("Qual o risco do bairro que a familia mora?");
        System.out.println("1 - baixo risco");
        System.out.println("2 - médio risco");
        System.out.println("3 - alto risco");
        int bairroRisco = scanner.nextInt();

        scanner.close();
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