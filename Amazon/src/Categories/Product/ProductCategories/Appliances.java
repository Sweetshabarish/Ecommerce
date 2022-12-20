package Categories.Product.ProductCategories;

import Categories.Product.Features;
import Categories.Product.FetchingProductData.ProductMain;
import Categories.Product.Products.ProductConstnts;
import Customer.IncreaceData.AddToCart.AddToCart;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Appliances {
    public void appliancesMethod(ArrayList<Object> arrayListObject) throws SQLException {
        Scanner scannerObject=new Scanner(System.in);

        System.out.println(ProductConstnts.DesignDisplau);
        ProductMain.productDetailsExceution("Select productid,brand,productname,productprice,productquantinty,discountpercentage,warrenty,descreption,productdiscountedprice from productdatatable where producttype='2';");
        Features featuresObject=new Features();
        featuresObject.featuresMethod();
        System.out.println(ProductConstnts.DesignDisplau);
        System.out.println(ProductConstnts.DesignDisplay2);
        AddToCart addToCartObject=new AddToCart();
        addToCartObject.addToCartMethod(arrayListObject.get(0).toString());
        System.out.println(ProductConstnts.DesignDisplay2);

    }


}
