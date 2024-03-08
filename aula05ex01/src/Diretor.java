/*Na classe Diretor, adicione um atributo adicional chamado ações (int) que representa
a quantidade de ações da empresa que o diretor possui.*/
public class Diretor extends Funcionario {

    double salario = 3000;
    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    int acoes;

}
