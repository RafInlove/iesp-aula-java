public class Principal {
    public static void main (String[] args) {
        Professor Pedro = new Professor("Pedro", 47, 2200);
        Aluno Ana = new Aluno("Ana Carolina", 19, 202321151);
        Aluno Paulo = new Aluno("Paulo João", 18, 202321152);
        Aluno Jose = new Aluno("José Barros", 21, 202015148);

        System.out.println("Esta é a aula de " +Pedro.getNome()+", e estes três alunos estão no mesmo grupo: " +
                "\n"+Ana.getNome()+" "+Ana.getIdade()+" "+Ana.getMatricula()+"\n"+Paulo.getNome()+" "+
                Paulo.getIdade()+" "+Paulo.getMatricula()+"\n"+Jose.getNome()+" "+Paulo.getIdade()+" "+Paulo.getMatricula());
    }
}
