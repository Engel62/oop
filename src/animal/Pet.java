package animal;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pet {
    private String name;

    private String address;
    private String phone;
    private  int birthYear;

    public Pet(String name) {
        this(name , 0);
    }

    public Pet(String name, int age) {
        setName(name);

        if (age >= 0) {
            this.birthYear = LocalDate.now()
                    .getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public void talk() {
        System.out.println("Меня зoвут " + getName());;
    }

    public  abstract void eat();



    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Annonimus";
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return birthYear == pet.birthYear && Objects.equals(name, pet.name) && Objects.equals(address, pet.address) && Objects.equals(phone, pet.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone, birthYear);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
