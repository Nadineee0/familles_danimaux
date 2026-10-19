public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {
    }

    public Dolphin(String name, int age, String habitat,
                   float swimmingSpeed) {
        super(name, age, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age
                + "}, Aquatic{habitat='" + habitat
                + "'}, Dolphin{swimmingSpeed=" + swimmingSpeed + "}";
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}