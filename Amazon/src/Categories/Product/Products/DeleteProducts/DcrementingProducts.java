package Categories.Product.Products.DeleteProducts;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DcrementingProducts {
    Scanner scannerObject=new Scanner(System.in);
    public void decrementingTheProducts(ArrayList<Object>arrayListObject) throws IOException, SQLException {
        t:
        while (true) {
            System.out.println("1.Delete Product");
            System.out.println("2.Alter Quantinty");

            System.out.print("Enter Choice: ");
            int choice = scannerObject.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.println();
            switch (choice) {
                case 1:
                    DeleteProduct.deleteProduct(arrayListObject);
                    break;
                case 2:
                    AlterQuantinty.alterQuantinty(arrayListObject);


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
