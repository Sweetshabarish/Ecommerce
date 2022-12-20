package Main.Orders;

import database.DetailsDatabase;
import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOrder {
    public void deleteOrderMethod() throws SQLException {
        Scanner scannerObject=new Scanner(System.in);
        t:while(true){
            System.out.println("1.Cancel the order");
            System.out.println("2. Exit");
            int choise=scannerObject.nextInt();
            switch(choise){
                case 1:
                    System.out.println("Enter the Product id");
                    int productid=scannerObject.nextInt();
                    ResultSet resultSetObject1=ExcetuteQureyThrowDatabase.connectExecuteQuery("select quantinty from ordertable where productid='"+productid+"'; ");
                    int quantintyFromOrderedTable=0;
                    int quantintyFromProductDataTable=0;
                    while(resultSetObject1.next()){
                        quantintyFromOrderedTable=resultSetObject1.getInt(1);
                        ResultSet resultSet=ExcetuteQureyThrowDatabase.connectExecuteQuery("select productquantinty from productdatatable where productid='"+productid+"';");
                        while(resultSet.next()){
                            quantintyFromProductDataTable=resultSet.getInt(1);
                            int total=quantintyFromOrderedTable+quantintyFromProductDataTable;
                            DetailsDatabase.StoreDetails("update productdatatable set productquantinty='"+total+"' where productid='"+productid+"';");

                        }

                    }
                    DetailsDatabase.StoreDetails("Delete from ordertable where productid='"+productid+"';");
                break;
                case 2:
                    break t;
                default:
                    System.out.println("Invalid Input");

            }
        }

    }
}
