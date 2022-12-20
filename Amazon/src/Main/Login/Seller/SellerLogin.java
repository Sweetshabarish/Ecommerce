package Main.Login.Seller;

import Seller.SellerWorking;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SellerLogin {
    static public void sellerLoginMethod() throws SQLException, IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the username");
        String username = scanner.next();
        System.out.println("Enter the password");
        String password = scanner.next();
        ArrayList<Object> object=new ArrayList<>();
        object.add(username);
        object.add(password);

        if(CheckingSellerDetails.sellerDetails(object)==1){

            System.out.println("login susccesfiullt");
            SellerWorking sellerWorkingObject=new SellerWorking();
            sellerWorkingObject.sellerWorkingMethod(object);
            //IncrementingProducts.addProducts();
        } else {
            System.out.println("no use");
        }

    }



}
