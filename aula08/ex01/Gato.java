package aula08.ex01;

public class Gato extends Animal implements Animal.Corrida {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Meow !");
    }
    public void correr() {
        System.out.println("Correndo !");
    }
}
