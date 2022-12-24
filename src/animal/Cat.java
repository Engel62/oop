package animal;
import java.time.LocalDate;
import java.util.Arrays;

public final class Cat extends Pet implements Trained {
    private static int count;

    public static int getCount() {
        return count;
    }



    public static class Breed {
        private String name;
        private String country;
        private String hairType;

        public Breed(
                String name,
                String country,
                String heirType
        ) {
            this.name = name;
            this.country = country;
            this.hairType = heirType;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public String getHairType() {
            return hairType;
        }
    }

    public class FavToy {
        private String name;
        private String type;

        public FavToy(
                String name,
                String type
        ) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String getCatName() {
            return Cat.this.getName();
        }
    }

    private FavToy toy;

    private Pet[] friends;
    private Breed breed;

    public Cat(String name) {
        this(
                name,
                LocalDate.now()
                        .getYear()
        );
    }

    public Cat(int birthYear) {
        this(
                "Кот",
                birthYear
        );
    }

    public Cat(String name, int age) {
        super(name, age);
        friends = new Pet[0];
        count++;
    }

    @Override
    public void eat() {
        System.out.println("Насыпают кошачий корм в миску");
        System.out.println("Ем корм");
        System.out.println("Пью воду");
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (this.breed == null) {
            this.breed = breed;
        }
    }

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня звут " + getName());
        System.out.println("Мне " + getAge() + " лет");
    }
    @Override
    public String[] getTrainedCommands() {
        return new String[0];
    }

    @Override
    public String[] getAllCommand() {
        return new String[0];
    }

    @Override
    public void doCommand(String command) {

    }

    @Override
    public void train(String command) {

    }

    public Pet[] getFriends() {
        if (friends == null) {
            friends = new Pet[0];
        }

        return friends;
    }

    public void addFriends(Pet friend) {
        this.friends = Arrays.copyOf(getFriends(), getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;

        System.out.println(getName() + " подружился с  " + friend.getName());
    }


    public FavToy getToy() {
        return toy;
    }

    public void setToy(FavToy toy) {
        this.toy = toy;
    }
}