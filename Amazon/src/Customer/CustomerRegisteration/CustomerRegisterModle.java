package Customer.CustomerRegisteration;

import Main.SignUp.DataChecker.InvalidPasswordException;
import Main.SignUp.DataChecker.DataChekker;
import database.DetailsDatabase;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerRegisterModle {
    Scanner scanner=new Scanner(System.in);

    public void registerCustomer() throws InputMismatchException, SQLException, InvalidPasswordException {
        System.out.println("Welcome! Enter the following details ");
        RegisterCustomer registerCustomerObject = new RegisterCustomer();


        t:while(true) {
            t1:while(true) {
                System.out.print("Enter your name: ");
                String name = scanner.next();
                if (DataChekker.UserNameChekker(name) == true) {
                    registerCustomerObject.setName(name);
                    break t1;

                }else{
                    System.out.println("Pls re enter the name as per rules");
                    continue t1;
                }
            }
                        System.out.print("Enter your user name: ");
                        String username = scanner.next();
                        registerCustomerObject.setUserName(username);


        t2:while(true) {
            System.out.print("Enter your Password ");
            String pass = scanner.next();

            if (DataChekker.passwordMethod(pass) == true) {
                registerCustomerObject.setPassword(pass);
                break t2;

            } else {
                System.out.println(" !!!! pls re enter the password as per mentioned role!!!");
                continue t2;
            }
        }


        t3:while(true){
            System.out.print("Enter your email: ");
            String email =scanner.next();
            if(DataChekker.validateEmailAddress(email)==true) {
                registerCustomerObject.setEmail(email);
                break t3;
            }else{
                continue t3;
            }

        }

        t4:while(true) {

            System.out.println("Enter the PhoneNumber: ");
            String phoneNumber=scanner.next();
            if(DataChekker.validateMobileNumber(phoneNumber)==true) {
                registerCustomerObject.setPhonenumber(phoneNumber);
                break t4;

            }else{
                continue t4;
            }

        }
            break t;
}

        String storeDetails = "insert into customerTable(Name,username,password,email,PhoneNumber)values('" + registerCustomerObject.getName() + "','" + registerCustomerObject.getUserName() + "','" + registerCustomerObject.getPassword() + "','" + registerCustomerObject.getEmail() + "','" + registerCustomerObject.getPhonenumber() + "')";
        DetailsDatabase.StoreDetails(storeDetails);


    }


    }






