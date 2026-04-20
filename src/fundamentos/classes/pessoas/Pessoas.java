package fundamentos.classes.pessoas;

public class Pessoas {
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade <= 18){
            System.out.println("Idade invalida");
            System.out.println("---------------");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
}
