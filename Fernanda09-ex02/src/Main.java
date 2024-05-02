/*Ajuste o exemplo 2 estudado na aula passada que utiliza Produtos com uso de
classes abstratas e interface para adicionar os conceitos de ToString, Enum e Final.*/
public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Harry Potter", 50);
        Eletronicos e = new Eletronicos("TV LED SUPER PLUS ULTRA 4K ZICA DEMAIS", 5000);
        Roupa r = new Roupa("Camisa branca", 25.50);

        System.out.println(l.toString());
        l.setPrice(l.getPrice() - (l.getPrice() * l.descontoAplicado()));
        System.out.println("Porém, com desconto, o preço fica: " + l.getPrice());

        System.out.println(e.toString());
        e.setPrice(e.getPrice() - (e.getPrice() * e.descontoAplicado()));
        System.out.println("Porém, com desconto, o preço fica: " + e.getPrice());

        System.out.println(r.toString());
    }
}