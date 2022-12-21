package animal;

public class Dog extends Pet {

    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Насыпают собачий корм в миску");
        System.out.println("дают команду");
        System.out.println("Ем корм и пью воду");
    }
}
