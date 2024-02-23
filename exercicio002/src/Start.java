import java.util.Scanner;

public class Start {
    int option = iniciar();
   public static int iniciar() {
       Scanner ler = new Scanner(System.in);
       int option;

       System.out.println("Olá, seja bem-vindo(a) a Calculadora !");
       System.out.println("para começar, o que deseja fazer ?");
       System.out.println("1 - Somar dois números");
       System.out.println("2 - Subtrair dois números");
       System.out.println("3 - Dividir dois números");
       System.out.println("4 - Multiplicar dois números");
       System.out.println("Digite um número para escolher: ");

       option = ler.nextInt();

       return option;
   }
}