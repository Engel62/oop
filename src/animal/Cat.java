package animal;
import java.time.LocalDate;
import java.util.Arrays;

public class Cat {
    public static int getCount() {
        return count;
    }

    private    static  int count;
    public static class Breed {
        private String name;
        private  String country;
        private String hearType;

        public Breed(String name, String country, String hearType) {
            this.name = name;
            this.country = country;
            this.hearType = hearType;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getHearType() {
            return hearType;
        }

        public void setHearType(String hearType) {
            this.hearType = hearType;
        }
    }

    public class FavToy{

        private String name;
        private String type;

        private FavToy toy;

        public FavToy(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getCatName() {
            return Cat.this.name;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public FavToy getToy() {
            return toy;
        }

        public void setToy(FavToy toy) {
            this.toy = toy;
        }
    }
    private String name;
    private Breed breed;
    public Breed getBreed() {
        return breed;
    }
    public void setBreed(Breed breed) {
        if (breed == null) {
            this.breed = breed;
        }
    }
            private int birthYear;
            private Cat[] friends;
    public Cat(String name) {
                this(name, 0);
            }
    public Cat(String name, int age){
                this.name = name;
                if (age >= 0) {
                    this.birthYear = LocalDate.now().getYear() - age;
                } else {
                    this.birthYear = LocalDate.now().getYear() - Math.abs(age);
                }

                friends = new Cat[0];
                count ++;
            }
            public void meow () {
                System.out.println("Мяу!");
                System.out.println("Меня зовут " + name);
                System.out.println("МНе " + getAge() + " лет");
            }
            public Cat[] getFriends () {
                if (friends == null) {
                    friends = new Cat[0];
                }
                return friends;
            }
            public void addFriend (Cat friend){
                this.friends = Arrays.copyOf(getFriends(), getFriends().length + 1);
                this.friends[this.friends.length - 1] = friend;
            }
            public String getName () {
                return name;
            }
            public void setName (String name){
                if (name != null && !name.isEmpty() && !name.isBlank()) {
                    this.name = name;
                } else {
                    this.name = "Кот";
                }
            }
            public int getAge () {
                return LocalDate.now().getYear() - birthYear;
            }
        }
