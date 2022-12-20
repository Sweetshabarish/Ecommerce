package Seller;

import Categories.Product.FetchingProductData.ProductMain;
import Categories.Product.Products.ProductConstnts;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SellerViewingProducts {
    Scanner scannerObject=new Scanner(System.in);
    public void sellerViewProductsMethod(ArrayList<Object> object) throws SQLException {

        System.out.println(ProductConstnts.DesignDisplau);
        ProductMain.productDetailsExceution("Select productid,brand,productname,productprice,productquantinty,discountpercentage,warrenty,descreption,productdiscountedprice from productdatatable where username='"+object.get(0).toString()+"';");
        System.out.println(ProductConstnts.DesignDisplau);
    }
}
