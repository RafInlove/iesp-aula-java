import java.util.Scanner;

public class CalculadoraMain {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        Calculadora c = new Calculadora();

        System.out.println("número 1");
        c.n1 = ler.nextInt();
        System.out.println("número 2");
        c.n2 = ler.nextInt();

        System.out.println(c.somar());
    }
}
