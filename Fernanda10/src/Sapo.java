public final class Sapo extends Animal implements Saltar {
    public Sapo(String nome, TipoAnimal t) {
        super(nome, t);
    }

    public void emitirSom() {
        System.out.println("Rebbit !");
    }

    public void saltar() {
        System.out.println("Super salto !");
    }
}
