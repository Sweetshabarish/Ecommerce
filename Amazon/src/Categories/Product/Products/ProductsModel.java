package Categories.Product.Products;

public class ProductsModel {
//     productObject.setBrand(scanner.nextLine());
//    ArrayList<Object> arrayListObject=objectClassObject.addlist();
//
//
//
//        System.out.println("Enter Product Name: ");
//        productObject.setProductName(scanner.nextLine());
//        System.out.println("Enter Product Price: ");
//        productObject.setPrice(scanner.nextInt());
//        System.out.println("Enter Product Quantity: ");
//        productObject.setQuantity(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("Enter Product percentage");
//        productObject.setProductDiscount(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("Enter Product Color: ");
//        productObject.setColor(scanner.nextLine());
//        System.out.println("Enter Product Warranty: ");
//        productObject.setWarranty(scanner.nextLine());
//        System.out.println("Enter Product Discription: ");
//        productObject.setProductDescription(scanner.nextLine());
    public String Brand;
    public String ProductName;
    public int ProductPrice;
    public int ProductQuantinty;
    public int ProductDiscountPercentage;
    public int productDiscountedPrice;



    public String Warrenty;
    public String ProductDescription;
    public String FeatureName;
    public String Feature;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }
    public int getProductDiscountedPrice() {
        return productDiscountedPrice;
    }

    public void setProductDiscountedPrice(int productDiscountedPrice) {
        this.productDiscountedPrice = productDiscountedPrice;
    }
    public int getProductQuantinty() {
        return ProductQuantinty;
    }

    public void setProductQuantinty(int productQuantinty) {
        ProductQuantinty = productQuantinty;
    }

    public int getProductDiscountPercentage() {
        return ProductDiscountPercentage;
    }

    public void setProductDiscountPercentage(int productDiscountPercentage) {
        ProductDiscountPercentage = productDiscountPercentage;
    }

    public String getWarrenty() {
        return Warrenty;
    }

    public void setWarrenty(String warrenty) {
        Warrenty = warrenty;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public String getFeatureName() {
        return FeatureName;
    }

    public void setFeatureName(String featureName) {
        FeatureName = featureName;
    }

    public String getFeature() {
        return Feature;
    }

    public void setFeature(String feature) {
        Feature = feature;
    }
}
