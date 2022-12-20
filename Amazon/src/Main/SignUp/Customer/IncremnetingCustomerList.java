package Main.SignUp.Customer;

import Main.Login.Customer.CustomerLogin;
import Customer.CustomerRegisteration.CustomerRegisterModle;
import Main.SignUp.DataChecker.InvalidPasswordException;

import java.sql.SQLException;
import java.util.Scanner;

public class IncremnetingCustomerList {
    static public void addingCustomerList() throws SQLException, InvalidPasswordException {
        Scanner scanner=new Scanner(System.in);
        CustomerRegisterModle customerRegisterModleObject=new CustomerRegisterModle();
        customerRegisterModleObject.registerCustomer();
        t1:while(true){
            System.out.println("1.Need to login");
            System.out.println("2.Exit");
            int choise=scanner.nextInt();
            switch(choise){
                case 1:
                    CustomerLogin customerLogin=new CustomerLogin();
                    customerLogin.customerLoginMethod();
                    break;
                case 2:
                    break t1;

            }
        }
    }
}
