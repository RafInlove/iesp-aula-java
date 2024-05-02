public class Passarinho extends Animal implements Voar{
    public Passarinho(String nome, TipoAnimal t) {
        super(nome,t);
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu !");
    }
    public void voar() {
        System.out.println("Levantar vôo !");
    }
}