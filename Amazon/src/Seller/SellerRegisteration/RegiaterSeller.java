package Seller.SellerRegisteration;

import Main.SignUp.DataChecker.DataChekker;
import database.DetailsDatabase;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RegiaterSeller {
    Scanner scanner=new Scanner(System.in);
    public void registerSeller() throws InputMismatchException, SQLException {
        System.out.println("Welcome! Enter the following details ");
        SellerRegister sellerRegisterObject = new SellerRegister();

        t:while(true) {
            t1:while(true) {
                System.out.print("Enter your name: ");
                String name = scanner.next();
                if (DataChekker.UserNameChekker(name) == true) {
                    sellerRegisterObject.setName(name);
                    break t1;

                }else{
                    System.out.println("Pls re enter the name as per rules");
                    continue t1;
                }
            }
            System.out.print("Enter your user name: ");
            String username = scanner.next();
            sellerRegisterObject.setUserName(username);


            t2:while(true) {
                System.out.print("Enter your Password ");
                String pass = scanner.next();

                if (DataChekker.passwordMethod(pass) == true) {
                    sellerRegisterObject.setPassword(pass);
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
                    sellerRegisterObject.setEmail(email);
                    break t3;
                }else{
                    continue t3;
                }

            }

            t4:while(true) {

                System.out.println("Enter the PhoneNumber: ");
                String phoneNumber=scanner.next();
                if(DataChekker.validateMobileNumber(phoneNumber)==true) {
                    sellerRegisterObject.setPhonenumber(phoneNumber);
                    break t4;

                }else{
                    continue t4;
                }

            }
            break t;
        }




        String storeDetails = "insert into sellerdataTable(Name,username,password,email,Phoneumber)values('" + sellerRegisterObject.getName() + "','" + sellerRegisterObject.getSellerName() + "','" + sellerRegisterObject.getPassword() + "','" + sellerRegisterObject.getEmail() + "','" + sellerRegisterObject.getPhonenumber() + "')";
        DetailsDatabase.StoreDetails(storeDetails);

    }

//    public static void main(String[] args) throws SQLException {
//        RegiaterSeller s=new RegiaterSeller();
//        s.registerCustomer();
//    }

}
