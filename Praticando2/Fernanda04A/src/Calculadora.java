public class Calculadora {
    Pessoa p = new Pessoa();

    public double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }
}
