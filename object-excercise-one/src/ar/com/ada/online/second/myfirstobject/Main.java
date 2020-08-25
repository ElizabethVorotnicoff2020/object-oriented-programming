package ar.com.ada.online.second.myfirstobject;

public class Main {
    public static void main(String[] args) {
    Animal dog = new Animal();
    Vehicle fiat = new Vehicle();
    Person eli = new Person();

    dog.breed = "Pitbull";
    dog.color = "Black";
    dog.name = "Jeny";

    fiat.color = "brown";
    fiat.brand = "Cronos";
    fiat.maxSpeed = 150;

    eli.name = "Elizabeth";
    eli.lastname = "Vorotnicoff";
    eli.age = 20;

    System.out.println(dog.breed + " " + dog.color + ", " + dog.name + ",");
    dog.move();

    System.out.println(fiat.color + " " + fiat.brand + " " + fiat.maxSpeed + " ");
    fiat.moveOn();

    System.out.println(eli.name + " " + eli.lastname + " " + eli.age + " ");
    eli.sing();
    }
}
