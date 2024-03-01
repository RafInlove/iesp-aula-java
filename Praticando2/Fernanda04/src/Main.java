/*
Faça um programa que calcule o salário de um funcionário com base
no valor da hora trabalhada de R$ 15.00 e na quantidade de
40 horas trabalhadas e exiba o salário.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite o nome do funcionário: ");
        f.setNome(ler.next());
        System.out.println("Digite as horas trabalhadas: ");
        f.setHora(ler.nextInt());

        System.out.println("O funcionário: "+f.getNome());
        System.out.println("Recebeu: "+f.calcularSalario());
    }

}