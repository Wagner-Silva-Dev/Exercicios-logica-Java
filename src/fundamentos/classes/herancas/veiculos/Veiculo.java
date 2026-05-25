package fundamentos.classes.herancas.veiculos;

public class Veiculo {
    private String marca;
    private int ano;
    private int velocidadeMaxima;

    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nAno: " + ano +
                "\nVelocidade Maxima: " + velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
