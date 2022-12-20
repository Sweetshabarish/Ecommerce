package Customer.IncreaceData.AddToCart;

import database.DetailsDatabase;
import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MovingProductToCart {
    Scanner scannerObject=new Scanner(System.in);
    public void movingProductToCart(String username) throws SQLException {
        System.out.println("Enter the productid");
        int productid=scannerObject.nextInt();
        System.out.println("Enter the quantnity");
        int quantinty=scannerObject.nextInt();

        DetailsDatabase.StoreDetails("insert into AddToCart(username,productid,quantinty)values('"+username+"','"+productid+"','"+quantinty+"');");
        System.out.println("Cart Added Succesfully");

        ResultSet resultSetObject = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select productquantinty from productdatatable where productid='"+productid+"';");
        while (resultSetObject.next()) {
            int getQuantinty=resultSetObject.getInt(1);
            int productQuantinty=getQuantinty-quantinty;
            DetailsDatabase.StoreDetails("update productdatatable set productquantinty="+productQuantinty+" where productid="+productid+" ;");

        }
    }
}
