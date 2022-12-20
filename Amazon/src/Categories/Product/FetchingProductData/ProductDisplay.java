package Categories.Product.FetchingProductData;

import Categories.Product.Products.ProductConstnts;

import java.util.ArrayList;

public class ProductDisplay {
    //this class method represents the view of the product details , which data will come from controller
    public void productDisplay(ArrayList<ProductModel> productModelArrayListObject){
        for(ProductModel productModelForLoopObject:productModelArrayListObject){
            System.out.println(ProductConstnts.DesignDisplau);
            System.out.println(ProductConstnts.productIDDisplay+productModelForLoopObject.ProductId);
            System.out.println("PRODUCT BRAND: "+productModelForLoopObject.productBrand);
            System.out.println(ProductConstnts.productNameDisplay+productModelForLoopObject.productName);
            System.out.println(ProductConstnts.pricedisplay+productModelForLoopObject.price);
            System.out.println(ProductConstnts.productDiscountDisplay+productModelForLoopObject.productDiscountedPercentage);
            System.out.println(ProductConstnts.productDiscountedPrice+productModelForLoopObject.productDiscount);
            System.out.println(ProductConstnts.productDescriptionDisplay+productModelForLoopObject.productDescription);
            System.out.println(ProductConstnts.productWarrentyDisplay+productModelForLoopObject.productWarranty);
            System.out.println(ProductConstnts.productquantityDisplay+productModelForLoopObject.quantity);
            System.out.println(ProductConstnts.DesignDisplau);



        }

    }
    //this class method represents the view of the product feature details , which data will come from controller
    public void productFeaturesDisplay(ArrayList<ProductModel> featureModelArrayListObject){

        System.out.println(ProductConstnts.DesignDisplau);
        System.out.println("'Features Name'           'Feature'");
        System.out.println(ProductConstnts.DesignDisplau);
        for(ProductModel productModelObjectFeatures:featureModelArrayListObject){
            System.out.printf("  %-10s               %-10s\n",productModelObjectFeatures.fetaureName,productModelObjectFeatures.fetaure   );

//            System.out.println(+ "                " +         );
        }
        System.out.println(ProductConstnts.DesignDisplay2);

    }
}
