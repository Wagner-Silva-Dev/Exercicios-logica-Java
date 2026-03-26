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
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a frequência cardíaca do paciente?");
        int frequencia = leia.nextInt();

        verificaFrequenciaCardiaca(frequencia);
        System.out.println("Frequência de " + frequencia);
        leia.close();
    }   

    public static boolean verificaFrequenciaCardiaca(int frequencia){

        if (frequencia < 40 || frequencia > 120){
            System.out.println("EMERGÊNCIA ATIVADA");
            return true;
        } else {
            System.out.println("Paciente estável");
            return false;
        }

    }

}