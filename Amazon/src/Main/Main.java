package Main;

import Main.Login.LoginPage;
import Main.SignUp.DataChecker.InvalidPasswordException;
import Main.SignUp.SignUp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, IOException, InvalidPasswordException {
        Scanner scannerObject = new Scanner(System.in);

        t:
        while (true) {

            System.out.println("1.Login");
            System.out.println("2.Sign UP");
            System.out.println("3.Exit");
            System.out.print("Enter Choice: ");
            int choice = scannerObject.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.println();
            switch (choice) {
                case 1:
                    LoginPage loginPage=new LoginPage();
                    loginPage.loginMethod();

             break;
                case 2:
                    SignUp signUp=new SignUp();
                    signUp.signUpMethod();

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