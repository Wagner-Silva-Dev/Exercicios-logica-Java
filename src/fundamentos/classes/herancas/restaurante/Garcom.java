package fundamentos.classes.herancas.restaurante;

public class Garcom extends Pessoa {
    private int numeroMesa;
    private final double percentualGorjeta;

    public Garcom(String nome, String CPF, double percentualGorjeta) {
        super(nome, CPF);
        this.percentualGorjeta = percentualGorjeta;
    }

    public double calcularGorjeta(double valorConta) {
        return (valorConta * percentualGorjeta) / 100;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
}
