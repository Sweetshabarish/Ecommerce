package Categories.Product.Products.AddingProducts;

import Categories.Product.Products.ProductConstnts;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddProducts {
    private static final int ELECTRONICS=1;
    private static final int APPLIANCES =2;
    private static final int FASHION=3;
    private static final int GLOCERYIES=4;
    private static final int EXIT=5;
    static public void product(ArrayList<Object> object) throws SQLException, IOException {
        Scanner scannerObject = new Scanner(System.in);

        t:
        while (true) {


            ProductConstnts.displayProductTypes();
            int choice = scannerObject.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.println();
            switch (choice) {
                case ELECTRONICS:
                    IncrementingProducts.addProducts(String.valueOf(ELECTRONICS), object);

                    break;
                case APPLIANCES:
                    IncrementingProducts.addProducts(String.valueOf(APPLIANCES),object);

                    break;
                case FASHION:
                    IncrementingProducts.addProducts(String.valueOf(FASHION),object);
                    break;
                case GLOCERYIES:
                    IncrementingProducts.addProducts(String.valueOf(GLOCERYIES),object);

                case EXIT:
                    System.out.println("!!! Thank You !!!");
                    break t;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
