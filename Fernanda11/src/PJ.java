public class PJ extends Pessoa {
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTipo: Pessoa Jurídica";
    }
    protected int CNPJ;

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getCNPJ() {
        return CNPJ;
    }
}

