package Categories.Product.Products.DeleteProducts;

import database.DetailsDatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AlterQuantinty {
    static public void alterQuantinty(ArrayList<Object> arrayListObject) throws SQLException {

            Scanner scannerObject=new Scanner(System.in);

            System.out.println("Enter the productID");
            int productid=scannerObject.nextInt();
            System.out.println("Enter the Quantinty");
            int quantinty=scannerObject.nextInt();
            String storeFeturesDetails = "update productdatatable set productquantinty='"+quantinty+"'where username='"+arrayListObject.get(0).toString()+"'and productid='"+productid+"';";
            DetailsDatabase.StoreDetails(storeFeturesDetails);


    }
}
