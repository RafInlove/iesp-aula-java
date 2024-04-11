package aula08.ex01;

public class Passarinho extends Animal implements Animal.Voar{
    public Passarinho(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu !");
    }
    public void voar() {
        System.out.println("Levantar vôo !");
    }
}
