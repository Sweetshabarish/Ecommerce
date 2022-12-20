package Customer.IncreaceData.AddToCart;

import Categories.Product.Products.ProductConstnts;

import java.sql.SQLException;
import java.util.Scanner;

public class AddToCart {
    public void addToCartMethod(String username) throws SQLException {
    Scanner scannerObject = new Scanner(System.in);

    t:while (true) {
        System.out.println(ProductConstnts.DesignDisplau);
        System.out.println("1.Add to cart");
        System.out.println("2.Move to Main Menu");
        System.out.println("Enter Choice: ");
        System.out.println(ProductConstnts.DesignDisplau);
        int choice = scannerObject.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.println();
        switch (choice) {
            case 1:
               MovingProductToCart movingProductToCart=new MovingProductToCart();
               movingProductToCart.movingProductToCart(username);
                break;

            case 2:
                System.out.println("!!! Moving to Main Menu !!!");
                break t;

            default:
                System.out.println("Invalid Input");
        }
    }
}
}
