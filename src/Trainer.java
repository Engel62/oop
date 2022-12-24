import animal.Pet;
import animal.Trained;

public class Trainer<A extends  Trained> {
    private  String name;
    private String grade;


    public Trainer(String name) {
        this.name = name;
    }

    public void train(A pet) {
 //       System.out.println("Начинаю тренировку[" + pet.getName() + "]");

        for (String command:pet.getAllCommand()) {
            pet.train(command);
   //         System.out.println("Обучаем команде" + command);
        }

        

  //     System.out.println("Заканчиваю  тренировку[" + pet.getName() + "]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
