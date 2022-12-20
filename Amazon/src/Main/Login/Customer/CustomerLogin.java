package Main.Login.Customer;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerLogin {
    static public void customerLoginMethod() throws SQLException {
        Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the username");
            String username = scanner.next();
            System.out.println("Enter the password");
            String password = scanner.next();
            Data dataObject=new Data();
            dataObject.data(username,password);

    }



    }


