package Seller.FetchingSellerData;


import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Seller {
    public  static ArrayList<SellerModel> displaySeller(String disaplaySellerObject) throws SQLException {

        ResultSet DetailsQuery = ExcetuteQureyThrowDatabase.connectExecuteQuery(disaplaySellerObject);
        ArrayList<SellerModel> flowChartModelArrayListObject=new ArrayList<>();
        while (DetailsQuery.next()) {
            SellerModel sellerModelObject=new SellerModel();

            sellerModelObject.setName(DetailsQuery.getString(1));
            sellerModelObject.setUserName(DetailsQuery.getString(2));
            sellerModelObject.setPassword(DetailsQuery.getString(3));
            sellerModelObject.setEmail(DetailsQuery.getString(4));
            sellerModelObject.setPhoneNumber(DetailsQuery.getString(5));

            flowChartModelArrayListObject.add(sellerModelObject);
            //    System.out.println(DetailsQuery.getString(1) + DetailsQuery.getString(2) + DetailsQuery.getString(3) + DetailsQuery.getString(4) + DetailsQuery.getInt(5) + DetailsQuery.getInt(6) + DetailsQuery.getString(7));

        }

        return flowChartModelArrayListObject;
    }
    public static void displayCustomerQuery(String Query) throws SQLException {
        ArrayList<SellerModel> sellerModelObject=displaySeller(Query);

        SellerView sellerViewObject=new SellerView();
        SellerController sellerControllerObject=new SellerController(sellerModelObject,sellerViewObject);
        sellerControllerObject.UpdateCustomerView(sellerModelObject);

    }
}
