// Aprendendo o básico de métodos
package fundamentos.modulos;

public class SistemaHospitalar {
     public static void main(String[] args) {

        // O main apenas "chama" o método pelo nome

        exibirAlerta(); 

        System.out.println("Monitorando sinais...");

        exibirAlerta();

    }

    // Declaração do método fora do main

    public static void exibirAlerta() {

        System.out.println("--- ALERTA DE SEGURANÇA ---");

        System.out.println("Verificar integridade do sensor!");

    }
}