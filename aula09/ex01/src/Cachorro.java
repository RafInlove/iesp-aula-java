public final class Cachorro extends Animal implements Corrida {
    public Cachorro(String nome, TipoAnimal t) {
        super(nome, t);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au !");
    }
    public void correr() {
        System.out.println("Correndo !");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}