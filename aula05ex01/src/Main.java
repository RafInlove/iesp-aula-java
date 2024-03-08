/*Elabore um programa que tenha uma classe chamada Funcionario com os seguintes
atributos: nome e salario e crie duas subclasses: Gerente e Diretor, que herdam da
classe Funcionário.

Na classe Main, interaja para o cadastro e exibição dos dados.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Teclado
        Scanner ler = new Scanner(System.in);
        // Gerente
        Gerente g = new Gerente();
        double salarioGerente = g.calcularBonus(g.getSalario()) + g.getSalario();
        // Diretor
        Diretor d = new Diretor();
        // Set diretor
        System.out.println("Insira o nome do diretor: ");
        d.setNome(ler.next());
        System.out.println("Diga quantas ações ele tem na empresa: ");
        d.setAcoes(ler.nextInt());
        // Set gerente
        System.out.println("Insira o nome do gerente: ");
        g.setNome(ler.next());
        System.out.println("Informe o respectivo departamento: ");
        g.setDepartamento(ler.next());
        // Get diretor
        System.out.println("O(a) diretor é: " + d.getNome());
        System.out.print("recebe " + d.getSalario());
        System.out.println(" e tem " + d.getAcoes() + " ações na empresa");
        // Get gerente
        System.out.println("O(a) gerente é " + g.getNome());
        System.out.print("recebe " + salarioGerente);
        System.out.print(" e é do departamento: " + g.getDepartamento());
    }
}