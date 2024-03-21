public class Leao extends Animal {
    private String pele;

// Construtor da classe Mamifero
    public Leao (String subclasse, String locomocao, String pele) {
        super(subclasse, locomocao);
        this.pele = pele;
    }

    public String getPele() {
        return pele;
    }

    public void exibirInformacoes() {
        System.out.println("O animal é da sub-classe: " + getSubClasse() + "\n" + "Usa como método de locomoção: " + getLocomocao() +
                "\n" + "E tem na pele: " +getPele());
    }
}