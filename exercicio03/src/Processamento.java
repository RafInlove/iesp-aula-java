import java.util.Scanner;
public class Processamento{
    Calculadora calculadora = new Calculadora();
    Scanner ler = new Scanner(System.in);


    public double adicao() {
            System.out.println("Quais números deseja somar ? (1/2) ");
            int input = ler.nextInt();
            System.out.println("Quais números deseja somar ? (2/2) ");
            int secondInput = ler.nextInt();

            return calculadora.ad(input, secondInput);
    }

    public double subtracao() {
            System.out.println("Quais números deseja subtrair ? (1/2)");
            int input = ler.nextInt();
            System.out.println("Quais números deseja subtrair ? (2/2)");
            int secondInput = ler.nextInt();

            return calculadora.sub(input, secondInput);
    }

    public double divisao() {
            System.out.println("Quais números deseja dividir ? (1/2)");
            int input = ler.nextInt();
            System.out.println("Quais números deseja dividir ? (2/2)");
            int secondInput = ler.nextInt();

            return calculadora.div(input, secondInput);
        }

    public double multiplicacao() {
            System.out.println("Quais números deseja multiplicar ? (1/2)");
            int input = ler.nextInt();
            System.out.println("Quais números deseja multiplicar ? (2/2)");
            int secondInput = ler.nextInt();

            return calculadora.mult(input, secondInput);
        }
    
}
