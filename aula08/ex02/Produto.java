public class Produto {
    protected String nome;
    protected double price;
    // Constructors
    public Produto(){}
    public Produto(String nome, double price) {
        this.nome = nome;
        this.price = price;
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
}
