package ar.com.ada.online.second.myfirstobject;

import java.util.Date;

import static java.lang.String.valueOf;

public class Item {
    String name;
    Double price;
    Double tax;
    Date expirationDate;
    Date today = new Date();
    Double result;


    Double getTotalToPay(){
        result = this.price + this.tax;
        return result;
    }

    void calculateTax(){
        tax = 0.5 * price;
    }

    Boolean canltBeSold(){
    if (expirationDate.compareTo(today)>0) {
        System.out.println("Nombre: "+ name + "Precio: " + price + "Impuesto: " + tax + "Total a pagar" + result);
        return  Boolean.TRUE;
    } else {
        System.out.println("Este Item no esta Habilitado para la venta");
            return Boolean.FALSE;
    }
    }
}
