public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Human(int yearOfBirth, String name, String town) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
    }

    void informationAboutPerson() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности" + jobTitle + ". Будем знакомы!");
    }
}
