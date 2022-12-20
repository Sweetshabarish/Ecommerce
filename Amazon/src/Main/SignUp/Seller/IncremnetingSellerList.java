package Main.SignUp.Seller;

import Main.Login.Seller.SellerLogin;
import Seller.SellerRegisteration.RegiaterSeller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class IncremnetingSellerList {

    static public void incrementingSellerListMethod() throws SQLException, IOException {
        Scanner scanner=new Scanner(System.in);
        RegiaterSeller regiaterSellerObject=new RegiaterSeller();
        regiaterSellerObject.registerSeller();
        t1:while(true){
            System.out.println("1.Need to login");
            System.out.println("2.Exit");
            int choise=scanner.nextInt();
            switch(choise){
                case 1:
                    SellerLogin.sellerLoginMethod();
                    break;
                case 2:
                    break t1;

            }
        }
    }
}
