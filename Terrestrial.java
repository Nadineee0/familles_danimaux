public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String name, int age, int nbrLegs) {
        super(name, age);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age
                + "}, Terrestrial{nbrLegs=" + nbrLegs + "}";
    }
}