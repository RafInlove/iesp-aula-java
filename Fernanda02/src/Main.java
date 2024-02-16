import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /* char x = 'a';
        switch (x) {
            case 'z':
                System.out.println("Opção z escolhida");
                break;
            case 'a':
                System.out.println("Opção a escolhida");
                break;
            case 'b':
                System.out.println("Opção b escolhida");
                break;
            default:
                System.out.println("Opção inválida");
        }
        System.out.println("Fim do programa");
    } */

        int x = 1;
        int repetir;
        do {
            System.out.println("Caso escolha...");
            switch (x) {
                case 1:
                    System.out.println("Ótima escolha");
                    break;
                case 2:
                    System.out.println("O valor da blusa é R$ 2,00");
                    break;
                case 3:
                    System.out.println("Falar com atendente");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
            System.out.println("Para repetir, digite 0 ");
            repetir = ler.nextInt();
        }
        while (repetir == 0);
    }
}
