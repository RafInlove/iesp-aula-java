import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Questão 1
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade;
        String resposta;

        do {
            System.out.println("Olá ! Qual é o seu nome ?");

            nome = ler.next();
            System.out.println("Legal " +nome+ ", e quantos anos você tem ? ");
            idade = ler.nextInt();
            System.out.println("Show ! Mas eu tenho alzheimer, você quer se apresentar pra mim de novo ?");
            resposta = ler.next();

            if (resposta.equalsIgnoreCase("não")) {break;}
        } while (resposta.equalsIgnoreCase("sim"));



        // Questão 2

        // Dados
        int matricula;
        String funcionarioNome;
        double salarioBruto = 0;
        // Cálculos



        // Coletar dados
        System.out.println("Olá caro colaborador(a), qual é o seu nome completo ? ");
        funcionarioNome = ler.nextLine();

        System.out.println("Agora digite sua matrícula: ");
        matricula = ler.nextInt();

        System.out.println("Perfeito. Qual é o valor do seu salário bruto ? ");
        salarioBruto = ler.nextInt();

        double descontoINSS = salarioBruto+(salarioBruto * 0.015);
        double salarioLiquido = (salarioBruto - descontoINSS);

        // Resultado
        System.out.println("Matrícula: " +matricula);
        System.out.println("Nome completo: "+funcionarioNome);
        System.out.println("Salário bruto: "+salarioBruto);
        System.out.println("Desconto do INSS: "+descontoINSS);
        System.out.println("Salário líquido: "+salarioLiquido);

        // Questão 3
        double nota1, nota2, nota3, nota4;

        System.out.println("Bem vindo(a) ao calculador de média !");
        System.out.println("Qual foi a sua nota no primeiro bimestre ? ");
        nota1 = ler.nextDouble();

        System.out.println("E qual foi a sua nota no segundo bimestre ? ");
        nota2 = ler.nextDouble();

        System.out.println("Enquanto a sua nota no terceiro bimestre ? ");
        nota3 = ler.nextDouble();

        System.out.println("Por fim, me diga sua nota no quarto e último bimestre: ");
        nota4 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/(4);

        System.out.println("A sua média foi: " +media);

    }
}
