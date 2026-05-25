package fundamentos.classes.herancas.veiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    @Override
    public String toString() {
        return super.toString() +
                "\ncilindradas: " + cilindradas;

    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
