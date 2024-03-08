/*Na classe Gerente, adicione um atributo adicional chamado departamento (String).
Nesta classe, o gerente possui um método para calcularBonus de 10% do salário.*/
public class Gerente extends Funcionario {

    double salario = 1800;

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
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Departamento
    public String departamento;
    // Função de calcular bônus
    public double calcularBonus(double salario) {
        return salario * 0.1;
    }

}
