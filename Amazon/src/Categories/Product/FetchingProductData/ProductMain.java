package Categories.Product.FetchingProductData;

import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductMain {
    public static void productDetailsExceution(String Query) throws SQLException {
        ArrayList<ProductModel> productModelObject = ExecuteQuery(Query);
        ProductDisplay productDisplayObject = new ProductDisplay();
        ProductController productControllerObject = new ProductController(productModelObject, productDisplayObject);
        productControllerObject.UpdateProductView(productModelObject);

    }

    public static void productFeaturesExceution(String Query) throws SQLException {
        ArrayList<ProductModel> productModelObject = ExcecuteFeatureQuery(Query);
        ProductDisplay productDisplayObject = new ProductDisplay();
        ProductController productControllerObject = new ProductController(productModelObject, productDisplayObject);

        productControllerObject.UpdateProductFeatures(productModelObject);

    }





    public static ArrayList<ProductModel> ExecuteQuery(String query) throws SQLException {

        ResultSet DetailsQuery= ExcetuteQureyThrowDatabase.connectExecuteQuery(query);
        ArrayList<ProductModel> productDetailsModelArrayListObject=new ArrayList<>();
        while(DetailsQuery.next()){
            ProductModel productDetailsModelClassObject=new ProductModel();
            productDetailsModelClassObject.setProductId(DetailsQuery.getInt(1));
            productDetailsModelClassObject.setProductBrand(DetailsQuery.getString(2));
            productDetailsModelClassObject.setProductName(DetailsQuery.getString(3));
            productDetailsModelClassObject.setPrice(DetailsQuery.getInt(4));
            productDetailsModelClassObject.setQuantity(DetailsQuery.getInt(5));

            productDetailsModelClassObject.setProductDiscountedPercentage(DetailsQuery.getInt(6));

            productDetailsModelClassObject.setProductDescription(DetailsQuery.getString(8));





            productDetailsModelClassObject.setProductWarranty(DetailsQuery.getString(7));
            productDetailsModelClassObject.setProductDiscount(DetailsQuery.getInt(9));


                productDetailsModelArrayListObject.add(productDetailsModelClassObject);



        }

        return productDetailsModelArrayListObject;
    }
public static ArrayList<ProductModel> ExcecuteFeatureQuery(String query) throws SQLException {
        ResultSet deatilsFeatureQuery=ExcetuteQureyThrowDatabase.connectExecuteQuery(query);
        ArrayList<ProductModel> productDetailsModelFeatures=new ArrayList<>();
        while(deatilsFeatureQuery.next()){
            ProductModel productModelFeaturesObject= new ProductModel();
            productModelFeaturesObject.setFetaureName(deatilsFeatureQuery.getString(1));
            productModelFeaturesObject.setFetaure(deatilsFeatureQuery.getString(2));
            productDetailsModelFeatures.add(productModelFeaturesObject);

        }
        return productDetailsModelFeatures;
}
}
