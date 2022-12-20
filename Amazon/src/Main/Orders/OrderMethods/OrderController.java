package Main.Orders.OrderMethods;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

public class OrderController {
    private static ArrayList<OrderModel> orderModelsArrayListObject;
    private static OrderView orderViewObject;

    public OrderController(ArrayList<OrderModel> orderModelsArrayListObject, OrderView orderViewObject){
        this.orderModelsArrayListObject=orderModelsArrayListObject;
        this.orderViewObject=orderViewObject;
    }
    public int getProductid() {
        return orderModelsArrayListObject.get(0).getProductid();
    }

    public void setProductid(int productid) {
        orderModelsArrayListObject.get(0).setProductid(productid);
    }

    public int getQuantinty() {
        return orderModelsArrayListObject.get(0).getQuantinty();
    }

    public void setQuantinty(int quantinty) {
        orderModelsArrayListObject.get(0).setQuantinty(quantinty);
    }

    public int getAmount() {
        return orderModelsArrayListObject.get(0).getAmount();
    }

    public void setAmount(int amount) {
        orderModelsArrayListObject.get(0).setAmount(amount);
    }

    public String getDate() {
        return orderModelsArrayListObject.get(0).getDate();
    }

    public void setDate(String date) {
        orderModelsArrayListObject.get(0).setDate(date);
    }

    public String getAddress() {
        return orderModelsArrayListObject.get(0).getAddress();
    }

    public void setAddress(String address) {
        orderModelsArrayListObject.get(0).setAddress(address);
    }

    public String getDeliveryDate() {
        return orderModelsArrayListObject.get(0).getDeliveryDate();
    }

    public void setDeliveryDate(String deliveryDate) {
        orderModelsArrayListObject.get(0).setAddress(deliveryDate);
    }
    public static void UpdateOrderView(ArrayList<OrderModel> orderModelObject){
        orderViewObject.orderViewMethod(orderModelObject);
    }

}
