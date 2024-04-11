/*Elabore um código que tenha uma empresa que vende produtos. Podendo ser
livro , eletrônico ou roupa. Todos eles possuem nome e preço, mas quando existe
promoção, livros possuem desconto de 10% e eletrônicos, apenas 5% e roupas
sempre estão com preço fixo. Neste sentido, o preço final de todos os produtos
dependem do desconto aplicado quando há promoção.*/
public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Harry Potter", 50);
        Eletronicos e = new Eletronicos("TV LED SUPER PLUS ULTRA 4K ZICA DEMAIS", 5000);
        Roupa r = new Roupa("Camisa branca", 25.50);

        System.out.println("Este é o livro: " + l.getNome() + "\nCusta: " + l.getPrice());
        l.setPrice(l.getPrice() - (l.getPrice() * l.descontoAplicado()));
        System.out.println("Porém, com desconto, o preço fica: " + l.getPrice());

        System.out.println("Este é o eletrônico: " + e.getNome() + "\nCusta: " + e.getPrice());
        e.setPrice(e.getPrice() - (e.getPrice() * e.descontoAplicado()));
        System.out.println("Porém, com desconto, o preço fica: " + e.getPrice());

        System.out.println("Esta é uma: " + r.getNome() + "\nCusta: " + r.getPrice());
    }
}
