public class Polimorfismo {
    public void fazerBarulho (Animal a) {
        a.emitirSom();
    }
    public void praticarCorrida(Corrida c) {
        c.correr();
    }
    public void praticarVoo(Voar v) {
        v.voar();
    }
}
