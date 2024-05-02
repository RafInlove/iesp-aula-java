public final class ContaPoupanca extends ContaBancaria {
    double rendimento = 0.05;

    // Getters and Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Funções
    public double depositar(double x) {
        return x;
    }

    public double sacar(double x) {
        return x;
    }

    public double calcularRendimento() {
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        }
        else {
            rendimento = 0.007 * selic * saldo;
        }

        return rendimento;
    }

    public String exibirDados() {
        return "Titular: " + getTitular() + "\nSaldo: " + getSaldo();
    }

    @Override
    public String toString() {
        return "Titular: " + titular + '\n' +
                "Saldo em conta: " + saldo + '\n' +
                "Rendimento: " + calcularRendimento();
    }

}