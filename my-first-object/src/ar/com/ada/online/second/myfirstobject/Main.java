package ar.com.ada.online.second.myfirstobject;

public class Main {

    public static void main(String[] args) {
        Person almendra = new Person();
        Person Giuliana = new Person();
        Person Pau = new Person();

        almendra.name = "Almendra";
        almendra.lastname = "Polezzeli";

        Giuliana.name = "Giuliana";
        Giuliana.lastname = "Fertonani";

        Pau.name = "Paulina";
        Pau.lastname = "Stanic";

        almendra.showAttributeValues();
        Giuliana.showAttributeValues();
        Pau.showAttributeValues();

        Calculator myCalculator = new Calculator();

        myCalculator.numberA = 10;
        myCalculator.numberB = 2;

        myCalculator.sumAttributes();
        myCalculator.multiplyAttributes();

        Integer resultsum = myCalculator.sumAttributes();
        Integer resultmultiply = myCalculator.multiplyAttributes();

        System.out.println("El resultado de la suma es: " + resultsum);
        System.out.println("El resultado de la multiplicacion es: " + resultmultiply);
    }
}
