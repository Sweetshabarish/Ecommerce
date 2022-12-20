package Categories.Product;

import Categories.Product.FetchingProductData.ProductMain;

import java.sql.SQLException;
import java.util.Scanner;

public class Features {
    public void featuresMethod() throws SQLException {
        Scanner scanner=new Scanner(System.in);
        t:while(true){
            System.out.println("1.Want to see features");
            System.out.println("2.Exit");
            int choise=scanner.nextInt();
            switch(choise){
                case 1:
                    System.out.println("Enter the ProductId: ");
                    int productid=scanner.nextInt();
                    ProductMain.productFeaturesExceution("select featurename,feature from featuredatatable where productid='"+productid+"';");


                break;
                case 2:
                    break t;

            }
        }
    }

}
