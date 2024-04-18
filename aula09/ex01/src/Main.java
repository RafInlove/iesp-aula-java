/*Ajuste o exemplo 1 estudado na aula passada que utiliza Animal com uso de
classes abstratas e interface para adicionar os conceitos de ToString, Enum
e Final. */

public class Main {
    public static void main(String[] args) {
        Cachorro Roger = new Cachorro("Roger", TipoAnimal.MAMIFERO);
        Gato Snowbell = new Gato("Snowbell", TipoAnimal.MAMIFERO);
        Passarinho Loro = new Passarinho("Loro", TipoAnimal.AVE);
        Sapo MC = new Sapo("MC", TipoAnimal.ANFIBIO);

        System.out.println(Roger.toString());
        System.out.println(Roger.getT());

        System.out.println(Snowbell.toString());
        System.out.println(Snowbell.getT());

        System.out.println(Loro.toString());
        System.out.println(Loro.getT());

        System.out.println(MC.toString());
        System.out.println(MC.getT());
    }
}