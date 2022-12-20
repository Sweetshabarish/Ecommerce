package Main.Orders;

import database.DetailsDatabase;
import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class PlaceOrder {
    Scanner scannerObject=new Scanner(System.in);
    public void placeOrder(ArrayList<Object>arrayListObject,int serialNumber) throws SQLException {



        System.out.println("Enter Serial number: ");
        int serial=scannerObject.nextInt();
        ResultSet resultSetObject = ExcetuteQureyThrowDatabase.connectExecuteQuery("select productid,quantinty from addtocart where username='" + arrayListObject.get(0).toString() + "'and cartserial='"+serial+"';");
        while (resultSetObject.next()) {
            int productid = resultSetObject.getInt(1);
            int quantinty = resultSetObject.getInt(2);
            ResultSet priceTkaing=ExcetuteQureyThrowDatabase.connectExecuteQuery("select productdiscountedprice from productdatatable where productid='"+productid+"';");
            while (priceTkaing.next()){
                int price=priceTkaing.getInt(1);
                int totalAmoubt=quantinty*price;
                System.out.println("Enter the Address");
                String addres=scannerObject.next();

                Date dateObject=new Date();
                ArrayList<Object> arrayListDateObject=dateObject.Date();


                DetailsDatabase.StoreDetails("insert into ordertable(username,quantinty,productid,amount,date,address,delevirydate) values('"+arrayListObject.get(0).toString()+"','"+quantinty+"','"+productid+"','"+totalAmoubt+"','"+ arrayListDateObject.get(0).toString()+"','"+addres+"','"+arrayListDateObject.get(1).toString()+"');");
                DetailsDatabase.StoreDetails("Delete from addtocart where cartserial='"+serial+"';");
                System.out.println("!!!!Super Order Placed Sussefully!!!!***");
            }


        }
    }
}
