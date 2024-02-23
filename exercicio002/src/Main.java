/*
Defina um sistema que simule uma calculadora com soma, subtração, multiplicação e divisão
Caso o usuário informe 1, ele vai ver a soma de dois números digitados pelo mesmo.
Caso informe 2, verá a subtração, 3 divisão e 4 multiplição.

Faça o usuário poder ver quantas vezes ele deseja estas operações, para isso, basta
digitar o número 0.
*/

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int option;



        System.out.println("Olá, seja bem-vindo(a) a Calculadora !");
        System.out.println("para começar, o que deseja fazer ?");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Subtrair dois números");
        System.out.println("3 - Dividir dois números");
        System.out.println("4 - Multiplicar dois números");
        System.out.println("Digite um número para escolher: ");

        option = ler.nextInt();
    }
}
