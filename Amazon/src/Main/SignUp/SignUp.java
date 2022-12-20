package Main.SignUp;

import Main.SignUp.Customer.IncremnetingCustomerList;
import Main.SignUp.DataChecker.InvalidPasswordException;
import Main.SignUp.Seller.IncremnetingSellerList;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class SignUp {
    public void signUpMethod() throws SQLException, IOException, InvalidPasswordException {

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
                    IncremnetingCustomerList.addingCustomerList();



                    break;
                case 2:
                    IncremnetingSellerList.incrementingSellerListMethod();



                case 3:
                    System.out.println("!!! Thank You !!!");
                    break t;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }

}
