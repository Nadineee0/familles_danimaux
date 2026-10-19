public class Main {
    public static void main(String[] args) {

        // Instruction 21: Default constructors
        Aquatic a1 = new Aquatic();
        Terrestrial t1 = new Terrestrial();
        Dolphin d1 = new Dolphin();
        Penguin p1 = new Penguin();

        // Instruction 22: Parameterized constructors
        Aquatic a2 = new Aquatic("Fish", 2, "Sea");
        Terrestrial t2 = new Terrestrial("Lion", 5, 4);
        Dolphin d2 = new Dolphin("Dolly", 8, "Ocean", 25.5f);
        Penguin p2 = new Penguin("Pingu", 3, "Sea", 50.0f);
        // Observation : Les constructeurs paramétrés permettent
        // d'initialiser les attributs lors de la création des objets.
        // L'appel à super(...) permet d'initialiser les attributs hérités.
        // Après la création d'un constructeur paramétré, le constructeur
        // sans paramètres doit être déclaré explicitement si nécessaire.

        // Instruction 23: Display objects
        System.out.println(a2);
        System.out.println(t2);
        System.out.println(d2);
        System.out.println(p2);

        // Instruction 24: Swimming behavior
        a2.swim();
        d2.swim();
        p2.swim();
    }
}