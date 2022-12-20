package Main.Orders.OrderMethods;

import Categories.Product.Products.ProductConstnts;

import java.util.ArrayList;

public class OrderView {
    public void orderViewMethod(ArrayList<OrderModel>orderModelObject){
        for(OrderModel orderModelForLoopObject:orderModelObject){
            System.out.println(ProductConstnts.DesignDisplau);
            System.out.println(ProductConstnts.productIDDisplay+orderModelForLoopObject.getProductid());
            System.out.println(ProductConstnts.productquantityDisplay+orderModelForLoopObject.getQuantinty());
            System.out.println(ProductConstnts.pricedisplay+orderModelForLoopObject.getAmount());
            System.out.println(ProductConstnts.productOrderDateDisplay+orderModelForLoopObject.getDate());
            System.out.println(ProductConstnts.productAddressDIsplay+orderModelForLoopObject.getAddress());
            System.out.println(ProductConstnts.productDeleveriyDAteDispaly+orderModelForLoopObject.getDeliveryDate());
            System.out.println(ProductConstnts.DesignDisplau);

        }

    }
}
