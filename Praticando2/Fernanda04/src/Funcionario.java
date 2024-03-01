public class Funcionario {
    private String nome;
    private double hora;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public double getHora() {
        return hora;
    }

    public double calcularSalario() {
        return getHora()*15;
    }
}
