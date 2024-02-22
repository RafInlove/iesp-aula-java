import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Pessoa Raphael = new Pessoa();
        Scanner ler = new Scanner(System.in);


        System.out.println("Olá ! Quantos anos você tem ?");
        Raphael.idade = ler.nextInt();
        Raphael.niver();

        System.out.println("Legal, então se você fizesse aniverssário hoje, você ficaria com " + Raphael.idade + " anos");

    }
}
