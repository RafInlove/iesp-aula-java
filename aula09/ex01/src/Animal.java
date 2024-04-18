public abstract class Animal {
    protected String nome;

    private final TipoAnimal t;

    public TipoAnimal getT() {
        return t;
    }

    // Construtor
    public Animal(String nome, TipoAnimal t){
        this.nome = nome;
        this.t = t;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Método
    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }
}