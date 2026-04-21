package fundamentos.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaTarefas = new ArrayList<>();

        do {
            System.out.println("Liste suas tarefas ou -1 para parar");
            String tarefas = scanner.nextLine();
            if (tarefas.equals("-1")) {
                break;
            }
            listaTarefas.add(tarefas);

        } while (true);
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhum tarefa encontrada");
        } else {
            for (String tarefas : listaTarefas) {
                System.out.println(tarefas);
            }
        }
    }
}