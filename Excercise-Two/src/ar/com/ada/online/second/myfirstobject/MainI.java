package ar.com.ada.online.second.myfirstobject;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.util.Scanner;

    public class void main(String[] args) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YY");
    Scanner keyboard = new Scanner(System.in);{
        Item item = new Item();

        System.out.println("Ingrese el nombre del item");
        item.name = keyboard.nextLine();

        System.out.println("Ingrese el precio del item");
        item.price = keyboard.nextDouble();

        System.out.println("Ingrese la fecha de vto del item (dd-mm-yy) ");
        item.expirationDate = dateFormat.parse(keyboard.nextLine());

        item.getTotalToPay();
        item.calculateTax();
        if (item.canltBeSold()){
            System.out.printf(
                    "- Nombre: %2f'\n -Precio: %2f\n -Impuesto: %2f\n Total a pagar: %2f" ,
                      item.name, item.price, item.tax, item.getTotalToPay());
        } else {
            System.out.println("El Item no esta habilitado para la vta");
        }


    }
}
