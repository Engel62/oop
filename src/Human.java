public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;



    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
        if (name == null || name.isEmpty()) {
            name = "информация не указанна";
        }
        this.name = name;

        if (town == null || town.isEmpty()) {
            town = "информация не указанна";
        }
        this.town = town;

        if (jobTitle == null || jobTitle.isEmpty()) {
            jobTitle = "информация не указанна";
        }
        this.jobTitle = jobTitle;

    }

    void informationAboutPerson() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
