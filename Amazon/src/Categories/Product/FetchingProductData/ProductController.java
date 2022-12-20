package Categories.Product.FetchingProductData;

import Categories.Product.Products.Product;

import java.util.ArrayList;

public class ProductController implements Product {
    private ArrayList<ProductModel> modelObject;//creating a object for productModel class
    private static ProductDisplay displayObject;//Creating a object for ProductDisplay class
    //Creating constructor for class ProductController
    public ProductController(ArrayList<ProductModel> laptopModelObject, ProductDisplay laptopDisplayObject){
        this.modelObject =laptopModelObject;
        this.displayObject =laptopDisplayObject;
    }
    // Getter and Setter Method for controlling
    //setter method getting value from the model class(ProductModel)
    @Override
    public void setProductId(int productId) {
        modelObject.get(0).setProductId(productId);
    }

    @Override
    public double getProductId() {
        return modelObject.get(0).getProductId();
    }


    @Override
    public void setPrice(int price) {
        modelObject.get(0).setPrice(price);
    }

    @Override
    public double getPrice() {
        return modelObject.get(0).getPrice();
    }

    @Override
    public void setQuantity(int quantity) {
        modelObject.get(0).setQuantity(quantity);

    }

    @Override
    public int getQuantity() {
        return modelObject.get(0).getQuantity();
    }



    @Override
    public void setProductName(String productName) {
         modelObject.get(0).setProductName(productName);

    }

    @Override
    public String getProductName() {
        return modelObject.get(0).getProductName();
    }

    @Override
    public void setProductBrand(String productBrand) {
        modelObject.get(0).setProductBrand(productBrand);

    }

    @Override
    public String getProductBrand() {
        return modelObject.get(0).getProductBrand();
    }

    @Override
    public void setProductDescription(String productDescription) {
        
    }


    @Override
    public String getProductDescription() {
        return modelObject.get(0).getProductDescription();
    }


    @Override
    public void setProductDiscount(int productDiscount) {
        modelObject.get(0).setProductDiscount(productDiscount);

    }

    @Override
    public int getProductDiscount() {
        return modelObject.get(0).getProductDiscount();
    }

    @Override
    public void setProductDiscountedPrice(int productDiscountedPrice) {
        modelObject.get(0).setProductDiscountedPercentage(productDiscountedPrice);
    }

    @Override
    public int getProductDiscountedPrice() {
        return modelObject.get(0).getProductDiscountedPercentage();
    }
   public void setLaptopColor(String LaptopColor){
       modelObject.get(0).setProductColor(LaptopColor);
   }
   public String getLaptopColor(){
      return  modelObject.get(0).getProductColor();
   }


    public static void UpdateProductView(ArrayList<ProductModel> productModelArrayListObject){
        displayObject.productDisplay(productModelArrayListObject);
    }
    public static void UpdateProductFeatures(ArrayList<ProductModel> updateProductArrayListObject){
        displayObject.productFeaturesDisplay(updateProductArrayListObject);
    }




}
