import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Telclado
        Scanner ler = new Scanner(System.in);
        // Contas
        ContaCorrente c = new ContaCorrente();
        ContaPoupanca p = new ContaPoupanca();
        // Artifícios do switchCase
        int escolha;
        int escolhaFiltrada;

        int deposito;

        System.out.println("Selecione o tipo de conta:\n1. Corrente\n2.Poupança");
        escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("O que deseja fazer ?\n1. Depositar\n2.Sacar\n3. Usar cheque especial\n3. Exibir dados da conta");
                escolhaFiltrada = ler.nextInt();

                switch (escolhaFiltrada) {
                    case 1:
                        System.out.println("Insira a quantia que deseja depositar:");
                        c.setSaldo(ler.nextDouble());
                        System.out.println("Depósito realizado com sucesso !");
                        break;

                    case 2:
                        System.out.println("Insira a quantia que deseja sacar:");
                        double quantia = c.sacar(ler.nextInt());
                        if (c.getSaldo() >= quantia) {
                            System.out.println("Saque realizado com sucesso !");
                            break;
                        } else {
                            System.out.println("Não foi possível realizar o saque, você não tem saldo suficiente");
                            break;
                        }

                    case 3:
                        System.out.println("Quanto de cheque especial você deseja ter acesso ?");
                        c.chequeEspecial = ler.nextDouble();

                        if (c.chequeEspecial <= 1000) {
                            System.out.println("Valor concedido");
                            break;
                        } else {
                            System.out.println("Valor negado, seu acesso ao cheque especial atualmente é de R$" + c.chequeEspecial);
                            break;
                        }

                }
        }
    }
}

// Depositar, sacar, usar cheque especial, exibir dados da conta