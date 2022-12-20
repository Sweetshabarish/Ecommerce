package Seller;

import Categories.Product.Products.AddingProducts.AddProducts;
import Categories.Product.Products.DeleteProducts.DcrementingProducts;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SellerWorking {
    public void sellerWorkingMethod(ArrayList<Object> object) throws SQLException, IOException {
        Scanner scannerObject = new Scanner(System.in);

        t:
        while (true) {
            System.out.println(" ");
            System.out.println("1.Add Products");
            System.out.println("3.Delete Products");
            System.out.println("2.View Products");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");
            int choice = scannerObject.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.println();
            switch (choice) {
                case 1:
                    AddProducts.product(object);

                    break;
                case 2:
                    SellerViewingProducts sellerViewingProducts=new SellerViewingProducts();
                    sellerViewingProducts.sellerViewProductsMethod(object);



                    break;
                case 3:
                    DcrementingProducts dcrementingProducts=new DcrementingProducts();
                    dcrementingProducts.decrementingTheProducts(object);



                    break;
                case 4:
                    System.out.println("!!! Thank You !!!");
                    break t;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
