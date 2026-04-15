package src.fundamentos.classes.concessionaria;

public class Carro {
    public String nome;

    public String modelo;

    public int ano;
    
    public void imprimirEspecificacoesCarro(){
        System.out.println("Especificações do carro");
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
