import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Bem-vindo(a) ao calculador de IMC, qual é o seu nome ?");
        p.setNome(ler.next());
        System.out.println("Ótimo " + p.getNome() + ", agora me diga a sua altura em centímetros: ");
        p.setAltura(ler.nextInt());
        System.out.println("Ok, agora para finalizar me diga seu peso em kilogramas: ");
        p.setPeso(ler.nextInt());

        System.out.println(p.getAltura());
        System.out.println(p.getPeso());

        p.calcularImc();

        System.out.printf("O seu IMC é: %.2f", p.calcularImc());
    }
}