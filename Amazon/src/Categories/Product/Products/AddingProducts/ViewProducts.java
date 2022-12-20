package Categories.Product.Products.AddingProducts;

import Categories.Product.FetchingProductData.ProductMain;
import Categories.Product.ProductCategories.*;
import Categories.Product.Products.ProductConstnts;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewProducts {
    public void viewProductMethod(ArrayList<Object> arrayListObject) throws SQLException {
        Scanner scannerObject = new Scanner(System.in);

        t:
        while (true) {

            ProductConstnts.displayProductTypes();
            int choice = scannerObject.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.println();
            switch (choice) {
                case 1:
                    AllProducts allProductsObejct=new AllProducts();
                    allProductsObejct.allProductsMethod(arrayListObject);

                    break;

                case 2:
                    Electronics electronicsObject=new Electronics();
                    electronicsObject.electronicsMethod(arrayListObject);

                    break;
                case 3:
                    Appliances appliancesObject=new Appliances();
                    appliancesObject.appliancesMethod(arrayListObject);
                    break;
                case 4:
                    Fashion fashionObject=new Fashion();
                    fashionObject.fashionMethod(arrayListObject);

                    break;
                case 5:
                    Gloceryies gloceryiesObject=new Gloceryies();
                    gloceryiesObject.gloceryiesMethod(arrayListObject);

                    break;

                case 6:
                    System.out.println("!!! Thank You !!!");
                    break t;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }

}
