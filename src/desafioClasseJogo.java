import classes.heroGenerator;

public class desafioClasseJogo {
    public static void main(String[] args) {
        heroGenerator hero1 = new heroGenerator("Nicolas", 25, "mago");
        System.out.println(hero1.atacar());

        heroGenerator hero2 = new heroGenerator("Eduardo", 20, "ninja");
        System.out.println(hero2.atacar());
    }

}
