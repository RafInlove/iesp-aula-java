package aula08.ex01;

public class Cachorro extends Animal implements Animal.Corrida {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au !");
    }
    public void correr() {
        System.out.println("Correndo !");
    }
}
