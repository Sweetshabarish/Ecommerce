package Main.Orders.OrderMethods;

import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Orders {
    public static ArrayList<OrderModel> displayOrder(String displayOrderObject) throws SQLException {
        ResultSet DetailsQuery= ExcetuteQureyThrowDatabase.connectExecuteQuery(displayOrderObject);
        ArrayList<OrderModel>orderModelArrayListOBject=new ArrayList<>();
        while(DetailsQuery.next()){
            OrderModel orderModelObject=new OrderModel();
            orderModelObject.setProductid(DetailsQuery.getInt(1));
            orderModelObject.setQuantinty(DetailsQuery.getInt(2));
            orderModelObject.setAmount(DetailsQuery.getInt(3));
            orderModelObject.setDate(DetailsQuery.getString(4));
            orderModelObject.setAddress(DetailsQuery.getString(5));
            orderModelObject.setDeliveryDate(DetailsQuery.getString(6));
            orderModelArrayListOBject.add(orderModelObject);

        }
        return orderModelArrayListOBject;

    }
    public static void displayOrderQuery(String query) throws SQLException {
        ArrayList<OrderModel> orderModelOvject = displayOrder(query);
        OrderView orderViewObject=new OrderView();
        OrderController orderControllerObject=new OrderController(orderModelOvject,orderViewObject);
        orderControllerObject.UpdateOrderView(orderModelOvject);
    }


}
