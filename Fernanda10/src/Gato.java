public class Gato extends Animal implements Corrida {
    public Gato(String nome, TipoAnimal t) {
        super(nome, t);
    }

    @Override
    public void emitirSom() {
        System.out.println("Meow !");
    }
    public void correr() {
        System.out.println("Correndo !");
    }
}