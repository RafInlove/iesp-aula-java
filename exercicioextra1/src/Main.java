import java.util.Scanner;

/*As maçãs custam 1,30 cada, se forem compradas menos de uma dúzia, e 1,00 se forem compradas
pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o
custo total da compra. */

public class Main {
    public static void main (String[] args) {
        // Instanciando teclado
        Scanner ler = new Scanner(System.in);
        // Instanciando Fruta
        Fruta apple = new Fruta();
        // Operadores
        double cobrar;
        double finalCost = 0;

        System.out.println("Bem vindo(a) a loja de maçãs, quantas vai querer ?");
        int qtd = ler.nextInt();

        if (qtd < 12) {
            cobrar = 1.30;

            finalCost = apple.apple(cobrar, qtd);
        }
        if (qtd >= 12) {
            cobrar = 1.00;

            finalCost = apple.apple(cobrar, qtd);
        }

        System.out.println("Ok,ficou R$" +finalCost+ " no total.");
        System.out.println("Crébito ou Dédito ?");

    }
}
