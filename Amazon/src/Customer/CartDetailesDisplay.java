package Customer;


import Categories.Product.Products.ProductConstnts;
import Main.Orders.Order;

import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CartDetailesDisplay {
    public void cartDetailsDisplayMethod(ArrayList<Object> arrayListObject) throws SQLException {
        ResultSet resultSetObject= ExcetuteQureyThrowDatabase.connectExecuteQuery("select cartserial,productid,quantinty from addtocart where username='"+arrayListObject.get(0).toString()+"';");
        while(resultSetObject.next()){
            int cartserial=resultSetObject.getInt(1);
            int productid=resultSetObject.getInt(2);
            int quantinty=resultSetObject.getInt(3);
            ResultSet resultSetObject1= ExcetuteQureyThrowDatabase.connectExecuteQuery("select brand,productname,productprice,productdiscountedprice from productdatatable where productid='"+productid+"';");
            while(resultSetObject1.next()){
                System.out.println(ProductConstnts.DesignDisplau);
                System.out.println("Serial No: "+cartserial);
                System.out.println("Quantinty: "+quantinty);
                int productPrice=resultSetObject1.getInt(3);
                int dicounterdPrice=resultSetObject1.getInt(4);
                System.out.println("Brand: "+resultSetObject1.getString(1));
                System.out.println("ProductName: "+resultSetObject1.getString(2));
                System.out.println("ProductPrice: "+productPrice);
                System.out.println("Discounted Price: "+dicounterdPrice);
                System.out.println("Total Price: "+dicounterdPrice*quantinty);
                System.out.println(ProductConstnts.DesignDisplau);
               
            }
             Order orderObject=new Order();
                orderObject.orderMethod(arrayListObject,cartserial);
        }
    }
}
