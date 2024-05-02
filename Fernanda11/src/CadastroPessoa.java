import java.util.ArrayList;

public class CadastroPessoa {
    private ArrayList <PF> pessoaspf = new ArrayList<>();
    private ArrayList <PJ> pessoaspj = new ArrayList<>();

    public void cadastrarPessoaPF(PF p) {
        pessoaspf.add(p);
        System.out.println("Pessoa cadastrada com sucesso!");
    }
    public void cadastrarPessoaPJ(PJ p) {
        pessoaspj.add(p);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

   public void listarpf() {
       for (PF p : pessoaspf) {
           System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nTipo: Pessoa Física");
       }
   }
       public void listarpj () {
           for (PJ p : pessoaspj) {
               System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nTipo: Pessoa Jurídica");
           }
    }

    public void listarPolimorficos() {
        ArrayList<Pessoa> pessoasPolimorficas = new ArrayList<>();
        pessoasPolimorficas.addAll(pessoaspf);
        pessoasPolimorficas.addAll(pessoaspj);

        for (Pessoa p:pessoasPolimorficas) {
            if (p instanceof PF) {
                System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nCPF: " + ((PF) p).getCPF());
            } else if (p instanceof PJ) {
                System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nCPF: " + ((PJ) p).getCNPJ());
            } else {
                System.out.println("Pessoa não encontrada :(");
            }
        }
    }
}