package aula08.ex01;

public abstract class Animal {
    protected String nome;

    // Construtor
    public Animal(String nome){
        this.nome = nome;
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
    // Interface
    public interface Corrida {
        public void correr();
    }
    public interface Voar {
        public void voar();
    }

}
