public class INSS {
    Funcionario a = new Funcionario();
    double desconto = 0.15;
    double totalDesconto;

    public double aplicarDesconto(double x, double y) {
        return totalDesconto = x - (x*desconto);
    }
}
