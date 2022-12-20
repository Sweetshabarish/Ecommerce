package Categories.Product.Products;
public interface Product {

    void setProductId(int productId);

    double getProductId();

    //Interface for product that contains all methods for online products
    public void setPrice(int price);
    public double getPrice();
    public void setQuantity(int quantity);
    public int getQuantity();


    public void setProductName(String productName);
    public String getProductName();
    public void setProductBrand(String productBrand);
    public String getProductBrand();
    public void setProductDescription(String productDescription);
    public String getProductDescription();

    public void setProductDiscount(int productDiscount);
    public int getProductDiscount();
    public void setProductDiscountedPrice(int productDiscountedPrice);
    public int getProductDiscountedPrice();
    public String toString();
}
