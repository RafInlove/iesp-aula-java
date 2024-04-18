public class Eletronicos extends Produto implements Desconto{
    public Eletronicos(String nome, double price) {
        super(nome,price, TipoProduto.ELETRÔNICO);
    }
    @Override
    public double descontoAplicado() {
        return 0.05;
    }
}