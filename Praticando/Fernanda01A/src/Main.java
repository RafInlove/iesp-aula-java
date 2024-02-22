import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Problema 1
        int salariohora = 15;
        int horas = 40;

        double salariomes = salariohora * 40;

        System.out.println("o salário do colaborador é " +"R$"+salariomes);

        // Problema 2
        int var1 = 5;
        int var2 = 9;

        if (var1 > var2) {
            System.out.println("a primeira variável é maior do que a segunda");
        } else if (var1 < var2) {
            System.out.println("a segunda variável é maior do que a primeira");
        } else {
            System.out.println("as duas variáveis são iguais");
        }

        // Problema 3
        Scanner ler = new Scanner(System.in);
        System.out.println("Me dê três notas (1/3)");
        int nota1 = ler.nextInt();

        System.out.println("Me dê três notas (2/3)");
        int nota2 = ler.nextInt();

        System.out.println("Me dê três notas (3/3)");
        int nota3 = ler.nextInt();

        double media = (nota1 + nota2 +  nota3) / 3;
        System.out.println("A média das notas é " +media);

        if (media >= 70) {
            System.out.println("Portanto, você foi aprovado !");
        } else if (media < 40) {
            System.out.println("Sinto muito, você foi reprovado.");
        }

        // Problema 4
        System.out.println("Quanto você ganha ?");
        double salarioresposta = ler.nextInt();

        double desconto5 = salarioresposta - (salarioresposta * 0.005);
        double desconto10 = salarioresposta - (salarioresposta * 0.010);
        double desconto20 = salarioresposta - (salarioresposta * 0.020);


        if (salarioresposta <= 900) {
            System.out.println("Você está isento de descontos");
        } else if (salarioresposta >= 901 && salarioresposta <=1501) {
            System.out.println("Terá um desconto de 5%, seu salário vai ficar:" +desconto5);
        } else if (salarioresposta >=1501 && salarioresposta <= 2500) {
            System.out.println("Terá um desconto de 10%, seu salário vai ficar: "+desconto10);
        } else if (salarioresposta >= 2501) {
            System.out.println("Terá um desconto de 20%, seu salário vai ficar: "+desconto20);
        }
    }
}