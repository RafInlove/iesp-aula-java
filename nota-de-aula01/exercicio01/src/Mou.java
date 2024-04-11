import java.util.Scanner;
public class Mou {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        INSS i = new INSS();
        Funcionario a = new Funcionario();

        System.out.println("Qual é o seu nome ? ");
        a.nome = ler.next();
        System.out.println("Me diga sua matrícula ");
        a.matricula = ler.nextInt();
        System.out.println("Qual é o seu salário bruto ? ");
        i.salarioBruto = ler.nextDouble();

        System.out.println("funcionário: " +a.nome);
        System.out.println("matrícula: " +a.matricula);
        System.out.println("Salário Bruto: " +i.salarioBruto);

        i.aplicarDesconto(i.salarioBruto, i.desconto);

        System.out.println("Salário Líquido: " +i.salarioLiquido);
    }
}
