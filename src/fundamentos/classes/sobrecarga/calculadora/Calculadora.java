package fundamentos.classes.sobrecarga.calculadora;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
    public int somar(int a, int b, int c) {
        return somar(a, b) + c;
    }
    public double somar(double a, double b) {
        return a + b;
    }
}
