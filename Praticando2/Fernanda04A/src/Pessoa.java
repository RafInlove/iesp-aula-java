public class Pessoa {
    private String nome;
    private double altura;
    private double peso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }



    public double calcularImc(){
        return peso / (altura * altura);
    }


}
