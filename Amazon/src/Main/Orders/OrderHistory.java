package Main.Orders;

import Categories.Product.Products.ProductConstnts;

import Main.Orders.OrderMethods.Orders;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderHistory {
    public void orderHistory(ArrayList<Object> arrayListObject) throws SQLException {


            System.out.println(ProductConstnts.DesignDisplau);
            Orders.displayOrderQuery("Select productid,quantinty,amount,date,Address,DeleviryDate from ordertable where username='"+arrayListObject.get(0).toString()+"';");
            System.out.println(ProductConstnts.DesignDisplau);
            DeleteOrder deleteOrder=new DeleteOrder();
            deleteOrder.deleteOrderMethod();



    }
}
