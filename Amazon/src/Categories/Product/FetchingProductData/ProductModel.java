package Categories.Product.FetchingProductData;

public class ProductModel {
    public int ProductId;

    public int quantity;

    public String productName;
    public String productDescription;
    public int price;
    public int productDiscount;
    public int productDiscountedPercentage;

    public String productBrand;



    public String productColor;


    public String fetaureName;
    public String fetaure;


    public String productWarranty;

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(int productDiscount) {
        this.productDiscount = productDiscount;
    }

    public int getProductDiscountedPercentage() {
        return productDiscountedPercentage;
    }

    public void setProductDiscountedPercentage(int productDiscountedPercentage) {
        this.productDiscountedPercentage = productDiscountedPercentage;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductColor() {
        return productColor;
    }

    public String getFetaureName() {
        return fetaureName;
    }

    public void setFetaureName(String fetaureName) {
        this.fetaureName = fetaureName;
    }

    public String getFetaure() {
        return fetaure;
    }

    public void setFetaure(String fetaure) {
        this.fetaure = fetaure;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }








    public String getProductWarranty() {
        return productWarranty;
    }

    public void setProductWarranty(String productWarranty) {
        this.productWarranty = productWarranty;
    }
}
