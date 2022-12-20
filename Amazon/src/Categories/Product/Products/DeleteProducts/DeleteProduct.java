package Categories.Product.Products.DeleteProducts;

import database.DetailsDatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteProduct {


    static public void deleteProduct(ArrayList<Object>arrayListObject) throws SQLException {
        Scanner scannerObject=new Scanner(System.in);


            System.out.println("Enter the Product ID");
            int productid = scannerObject.nextInt();
            String storeFeturesDetails = "DELETE FROM productdatatable WHERE username='" + arrayListObject.get(0).toString() + "',productid='" + productid + "';";
            DetailsDatabase.StoreDetails(storeFeturesDetails);


    }
}
