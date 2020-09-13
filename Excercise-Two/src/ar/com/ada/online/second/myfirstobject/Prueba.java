package ar.com.ada.online.second.myfirstobject;

import sun.font.TrueTypeFont;

import java.util.Date;

public class Prueba {

    String name;
    Double price;
    Double tax;
    Date expirationDate;

    Double getTotalToPay(){
        Double result  = tax + price;
        return result;

    }
    void calculateTax(){
        tax = 0.21 * price;
    }
    Boolean canltBeSold(){
        Date today = new Date();
        Boolean result = expirationDate.after(today);
        return result;

    }

}
