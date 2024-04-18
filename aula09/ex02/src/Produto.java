public class Produto {
    protected String nome;
    protected double price;

    protected TipoProduto t;
    // Constructors
    public Produto(){}
    public Produto(String nome, double price, TipoProduto t) {
        this.nome = nome;
        this.price = price;
        this.t = t;
    }
    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public TipoProduto getT() {
        return t;
    }

    @Override
    public String toString() {
        return "Produto: " +
                 nome + '\n'+
                "Tipo: " + t + '\n' +
                "Custa: " + price;
    }
}