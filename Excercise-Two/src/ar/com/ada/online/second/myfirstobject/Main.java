package ar.com.ada.online.second.myfirstobject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	Item product = new Item();

        Scanner keyboard = new Scanner(System.in);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ingrese el nombre del producto : ");
        product.name = keyboard.next();

        System.out.println("ingrese el precio del producto: ");
        product.price = keyboard.nextDouble();


        System.out.println("Ingrese la fecha de vencimiento: ");
        String dateString = keyboard.next();
        product.expirationDate = df.parse(dateString);

        product.calculateTax();
        product.canltBeSold();
        product.getTotalToPay();
    }
}

