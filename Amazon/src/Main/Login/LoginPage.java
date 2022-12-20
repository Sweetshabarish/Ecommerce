package Main.Login;

import Main.Login.Customer.CustomerLogin;
import Main.Login.Seller.SellerLogin;
import database.ExcetuteQureyThrowDatabase;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginPage {

    public void loginMethod() throws SQLException, IOException {

        Scanner scanner = new Scanner(System.in);

        t:
        while (true) {

            System.out.println("1.Customer");
            System.out.println("2.Seller");
            System.out.println("3.Exit");
            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.println();
            switch (choice) {
                case 1:
                    CustomerLogin customerLogin=new CustomerLogin();
                    customerLogin.customerLoginMethod();

                    break;
                case 2:
                    SellerLogin.sellerLoginMethod();



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
