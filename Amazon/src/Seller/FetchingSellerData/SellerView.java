package Seller.FetchingSellerData;


import java.util.ArrayList;

public class SellerView {
    public void sellerViewMethod(ArrayList< SellerModel > sellerModelObject){

            for(SellerModel sellerModelForloopObject:sellerModelObject) {

                System.out.println("NAME: " + sellerModelForloopObject.getName());
                System.out.println("USER NAME: " + sellerModelForloopObject.getUserName());
                System.out.println("PASSWORD: " + sellerModelForloopObject.getPassword());
                System.out.println("EMAIL: " +sellerModelForloopObject.getEmail() );
                System.out.println("PHONE NUMBER: " + sellerModelForloopObject.getPhoneNumber());


            }

        }
    }
