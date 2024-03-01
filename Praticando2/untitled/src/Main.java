import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Coordenador c = new Coordenador();
        Professor p = new Professor();

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        a.setNome(ler.next());
        System.out.println("Informe o nome do professor: ");
        p.setNome(ler.next());
        System.out.println("Informe o nome do coordenador: ");
        c.setNome(ler.next());

        System.out.println(a.getNome());
        System.out.println(p.getNome());
        System.out.println(c.getNome());

    }

}
