package Seller.SellerRegisteration;

import java.sql.SQLException;
import java.util.Scanner;

/*
 * this class os created for storing the customer deails in module manner
 */
public class SellerRegister {





        Scanner scannerObject = new Scanner(System.in);
        static String Name;
        static  String Email;
        static String Password;
        static String SellerName;
        static String PhoneNumber;



        //the method to set the details
        SellerRegister( ) throws SQLException {





        }

        //setter methods starts here
        public void setName(String name) throws SQLException {

            Name = name;


        }

        public void setUserName(String sellerName) {

            SellerName = sellerName;
        }

        public void setEmail(String email) {

            Email = email;
        }

        public void setPassword(String password) {

            Password = password;
        }

        public void setPhonenumber(String phoneNumber) {

            PhoneNumber = phoneNumber;

        }


        //geter methods starts here



        public String getName() {
            return Name;
        }


        public String getSellerName() {
            return SellerName;
        }


        public String getEmail() {
            return Email;
        }




        public String getPhonenumber() {
            return PhoneNumber;
        }
        public String getPassword(){
            return Password;
        }








}
