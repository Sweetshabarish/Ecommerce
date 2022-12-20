package Main.Orders;


import database.DetailsDatabase;
import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    Scanner scannerObject = new Scanner(System.in);

    public void orderMethod(ArrayList<Object> arrayListObject,int serialNumber) throws SQLException {
        t:
        while (true) {
            System.out.println("1.Place Order");
            System.out.println("2.Delete Item In Cart");
            System.out.println("3.Return to Cart");
            int choise = scannerObject.nextInt();
            switch (choise) {
                case 1:
                    PlaceOrder placeOrderObject=new PlaceOrder();
                    placeOrderObject.placeOrder(arrayListObject,serialNumber);

                    break;
                case 2:
                    System.out.println("Enter the Serial No");
                    int cartNumber=scannerObject.nextInt();
                    DetailsDatabase.StoreDetails("Delete from addtocart where cartserial='"+cartNumber+"';");


                    break;
                case 3:
                    System.out.println("!!! Thank You !!!");
                    break t;




                default:
                    System.out.println("Invalid Input");
            }


        }
    }
}
