package Categories.Product.Products.AddingProducts;



import Categories.Product.FetchingProductData.ProductModel;
import Categories.Product.Products.ProductsModel;
import database.DetailsDatabase;
import database.ExcetuteQureyThrowDatabase;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IncrementingProducts {
//    public String Brand;
//    public String ProductName;
//    public int ProductPrice;
//    public String ProductQuantinty;
//    public int ProductDiscountPercentage;
//    public String Warrenty;
//    public String ProductDescription;
//    public String FeatureName;
//    public String Feature;

    //add laptop
    public static void addProducts(String producttype, ArrayList<Object>object) throws IOException, InputMismatchException, SQLException {
        Scanner scanner = new Scanner(System.in);
        int productid = 0;

        ProductsModel productsModelObject = new ProductsModel();




        System.out.println("Enter Product Brand: ");
        productsModelObject.setBrand(scanner.next());



        System.out.println("Enter Product Name: ");
        productsModelObject.setProductName(scanner.next());
        System.out.println("Enter Product Price: ");
        productsModelObject.setProductPrice(scanner.nextInt());
        System.out.println("Enter Product Quantity: ");
        productsModelObject.setProductQuantinty(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Product percentage");
        productsModelObject.setProductDiscountPercentage(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Product Warranty: ");
        productsModelObject.setWarrenty(scanner.next());
        System.out.println("Enter Product Discription: ");
        productsModelObject.setProductDescription(scanner.next());
        int price=productsModelObject.getProductPrice();
        int dis=productsModelObject.getProductDiscountPercentage();
        int disprice= price*dis/100;
        int total=price-disprice;
        productsModelObject.setProductDiscountedPrice(total);



        //System.out.println(productsModelObject.getProductDiscountedPrice());

        String storeProductDetails = "insert into productdataTable(username,producttype,brand,productname,productprice,productquantinty,discountpercentage,warrenty,descreption,productdiscountedprice)values('"+object.get(0).toString()+"','"+producttype+"','"+ productsModelObject.getBrand() + "','" + productsModelObject.getProductName()+ "','" + productsModelObject.getProductPrice() + "','" + productsModelObject.getProductQuantinty()+ "','" + productsModelObject.getProductDiscountPercentage()+ "','"+productsModelObject.getWarrenty()+"','" + productsModelObject.getProductDescription()+ "','" +productsModelObject.getProductDiscountedPrice()+"');";
        DetailsDatabase.StoreDetails(storeProductDetails);
        //String storeProductDetails = "insert into productdataTable(username,productdiscountedprice)values('"+object.get(0).toString()+"','"+producttype+"','"+ productsModelObject.getBrand() + "','" + productsModelObject.getProductName()+ "','" + productsModelObject.getProductPrice() + "','" + productsModelObject.getProductQuantinty()+ "','" + productsModelObject.getProductDiscountPercentage()+ "','"+productsModelObject.getWarrenty()+"','" + productsModelObject.getProductDescription()+ "')";

        ResultSet resultSetObjectForDateCheck = ExcetuteQureyThrowDatabase.connectExecuteQuery("select productid from productdatatable order by productid desc limit 1;");

        while (resultSetObjectForDateCheck.next())
            productid = resultSetObjectForDateCheck.getInt(1);


       t: while(true){
            System.out.println("1.Add Feature: ");
            System.out.println("2.Exit");
            int choise =scanner.nextInt();
            switch(choise){
                case 1:{
                    System.out.println("Enetr the feature name: ");
                    productsModelObject.setFeatureName(scanner.next());

                    System.out.println("Enter the Feature: ");
                    productsModelObject.setFeature(scanner.next());

                    String storeFeturesDetails = "insert into featuredataTable(productid,featurename,feature)values('"+productid+"','" + productsModelObject.getFeatureName()+ "','" + productsModelObject.getFeature()+ "')";
                    DetailsDatabase.StoreDetails(storeFeturesDetails);

                    break;
                }
                case 2:{

                    break t;
                }
            }



        }






    }





}
