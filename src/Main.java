public class Main {
    public static void main(String[] args) {

       Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
       Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
       Human katy = new Human(1992, "Катя", "Калиниград",null);
       Human artem = new Human(1995, "Артем", "Москвва", "директор по развитию бизнеса");


       maxim.informationAboutPerson();
       anya.informationAboutPerson();
       katy.informationAboutPerson();
       artem.informationAboutPerson();


    }
}