import animal.*;
import animal.Cat.Breed;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Breed brShHair = new Breed("British Shorthair", "GB", "short");

        Cat murzik = new Cat("Мурзик", 1);
//        murzik.setBreed(brShHair);
//
//        Cat.FavToy murzikToy = murzik.new FavToy("Рыбка", "заводная");
//        murzik.setToy(murzikToy);
//
//        System.out.println("Игрушка " + murzikToy.getName() + ", нравится коту " + murzikToy.getCatName());
//
//        murzik.meow();

        //      murzik.talk();
        //      murzik.eat();
        Dog sharik = new Dog("Шарик", 2005);
        sharik.setAddress("random address");
        Dog sharik2 = new Dog("Шарик", 2005);
        sharik2.setAddress("random address");

        if (sharik.equals(sharik2)) {
            sharik2 = sharik;
        }
        //      sharik.talk();
        //     sharik.eat();


        Parrot kesha = new Parrot("Кеша");
        kesha.talk();

        Cat begemot = new Cat("Бегемот", -5);
//        begemot.setName(null);
//        begemot.meow();
//
//        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.addFriends(begemot);
          murzik.addFriends(sharik);
          murzik.addFriends(kesha);

   for (Pet friend : murzik.getFriends()) {
       if (friend instanceof Cat) {
           Cat cat = (Cat) friend;
           cat.meow();
       } else if (friend.getClass() == Parrot.class) {
           ((Parrot) friend).talk();
       } else {
           System.out.println(friend);
       }
   }
//        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
//        murzik.getFriends()[0].meow();
//
//        System.out.println("Создано котов " + Cat.getCount());

    }
}