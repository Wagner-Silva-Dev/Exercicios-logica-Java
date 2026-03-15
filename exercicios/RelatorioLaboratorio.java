// Você foi chamado(a) para ajudar um pequeno laboratório a gerar um relatório simples e confiável todos os dias. 
// O laboratório registra três valores:

// Quantidade de amostras processadas no dia.
// Tempo total gasto no processamento (em minutos).
// Número de resultados válidos.
// O relatório precisa calcular e mostrar:

// Tempo médio por amostra (tempo total ÷ amostras).
// Percentual de resultados válidos (válidos ÷ total).
// Um resumo final bem formatado no console.
package exercicios;
import java.util.Scanner;
import utilitarios.*;

public class RelatorioLaboratorio 
{
    public static void main(String []args)
    {
        Scanner leia = new Scanner(System.in);

        String continuar = "S";
        
        while (continuar.equalsIgnoreCase("S"))
        {
        int amostrasDia, tempo, amostrasValidas, amostrasInvalidas;
        double tempoMedio, percentualResultadosValidos;

        System.out.println("Quantas amostras foram processadas no dia?");
        amostrasDia = leia.nextInt();

        System.out.println("Foi gasto quanto tempo(em minutos) para processar as amostras?");
        tempo = leia.nextInt();

        System.out.println("E quantas amostras estão válidas?");
        amostrasValidas = leia.nextInt();
        

        tempoMedio = (double)tempo / amostrasDia;

        amostrasInvalidas = amostrasDia - amostrasValidas;

        percentualResultadosValidos = ((double)amostrasValidas / amostrasDia) * 100;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Amostras processadas: " + amostrasDia);
        System.out.printf("Tempo médio gasto no processamento de amostras: %.2f minutos por amostra %n", tempoMedio);
        System.out.println("Amostras válidas: " + amostrasValidas);
        System.out.println("Amostras inválidas: " + amostrasInvalidas);
        System.out.printf("Porcentagem de amostras válidas: %.2f%% %n", percentualResultadosValidos);
        System.out.println("------------------------------------------------------------------------");

        continuar = Entrada.lerSN(leia);
        }
        leia.close();
    }
}