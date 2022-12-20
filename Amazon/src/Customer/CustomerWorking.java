package Customer;

import Categories.Product.Products.AddingProducts.ViewProducts;
import Main.Orders.OrderHistory;
import Customer.FetchingCustomerData.AccountDetailsData;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerWorking {
    static public void customerWorkingMethod(ArrayList<Object> arrayListObject) throws SQLException {
        Scanner scannerObject = new Scanner(System.in);

        t:
        while (true) {
            System.out.println();
            System.out.println("1.View Products");
            System.out.println("2.OrderHistory");
            System.out.println("3.Cart");
            System.out.println("4.View Account Details");
            System.out.println("5.EXIT");
            System.out.print("Enter Choice: ");
            int choice = scannerObject.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.println();
            switch (choice) {
                case 1:
                    ViewProducts viewProductsObject=new ViewProducts();
                    viewProductsObject.viewProductMethod(arrayListObject);

                    break;
                case 2:
                    OrderHistory orderHistoryObject=new OrderHistory();
                    orderHistoryObject.orderHistory(arrayListObject);


                    break;
                case 3:
                    CartDetailesDisplay cartDetailesDisplayObject=new CartDetailesDisplay();
                    cartDetailesDisplayObject.cartDetailsDisplayMethod(arrayListObject);


                    break;
                case 4:

                    AccountDetailsData accountDetailsDataObject=new AccountDetailsData();
                    accountDetailsDataObject.accountDetailsDataMethod(arrayListObject);

                    break;


                case 5:
                    System.out.println("!!! Thank You !!!");
                    break t;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
