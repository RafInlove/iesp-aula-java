public class PF extends Pessoa {
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTipo: Pessoa Física";
    }
    protected int CPF;

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getCPF() {
        return CPF;
    }
}
