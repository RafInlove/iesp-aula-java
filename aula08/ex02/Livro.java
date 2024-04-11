public class Livro extends Produto implements Desconto{
    public Livro(String nome, double price) {
        super(nome,price);
    }
    @Override
    public double descontoAplicado() {
        return 0.1;
    }
}
