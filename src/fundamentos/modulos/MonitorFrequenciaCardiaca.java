/*Adicione um método que recebe a frequência cardíaca do paciente e retorna se é emergência ou não:
Requisitos:

Método com retorno boolean
Recebe um int como parâmetro
Se frequência maior que 120 ou menor que 40 retorna true (emergência)
No main leia a frequência do usuário, chame o método e exiba uma mensagem diferente dependendo do retorno*/
package fundamentos.modulos;

import java.util.Scanner;

public class MonitorFrequenciaCardiaca {

    public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a frequência cardíaca do paciente?");
        int frequencia = scanner.nextInt();

        boolean emergencia = verificaFrequenciaCardiaca(frequencia);
        
        if (emergencia){
            System.out.println("EMERGÊNCIA ATIVADA");
        } else {
            System.out.println("Frequência de " + frequencia+ " bpm paciente estável");
        }

        scanner.close();
    }   

    public static boolean verificaFrequenciaCardiaca(int frequencia){

        return (frequencia < 40 || frequencia > 120);
    }

}