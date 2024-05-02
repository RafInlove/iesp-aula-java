import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        Pessoa p = new Pessoa();
        PF pf = new PF();
        PJ pj = new PJ();
        CadastroPessoa cp = new CadastroPessoa();
        // controle de repetição
        String resposta = "n";
        do {
            System.out.println("Que pessoa deseja cadastrar?");
            System.out.println("1. CPF\n2.CNPJ");
            int escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome da pessoa a ser cadastrada: ");
                    pf.setNome(ler.next());
                    System.out.println("Informe o CPF:");
                    pf.setCPF(ler.nextInt());
                    System.out.print("Informe a idade desta pessoa: ");
                    pf.setIdade(ler.nextInt());

                    cp.cadastrarPessoaPF(pf);
                    break;

                case 2:
                    System.out.print("Digite o nome da pessoa a ser cadastrada: ");
                    pj.setNome(ler.next());
                    System.out.println("Informe o CNPJ:");
                    pj.setCNPJ(ler.nextInt());
                    System.out.print("Informe a idade desta pessoa: ");
                    pj.setIdade(ler.nextInt());

                    cp.cadastrarPessoaPJ(pj);
                    break;
            }

            System.out.println("Deseja cadastrar mais alguém? (S/N)");
            resposta = ler.next();

        } while (resposta.equalsIgnoreCase("s"));

        // System.out.println(pf.toString());
        // System.out.println(pj.toString());
        cp.listarPolimorficos();

    }
}
