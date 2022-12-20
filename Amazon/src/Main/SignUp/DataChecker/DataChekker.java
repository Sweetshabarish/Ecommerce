package Main.SignUp.DataChecker;


import java.util.regex.Pattern;

import java.util.regex.Matcher;

// Driver Class
    public class DataChekker {

    // A utility function to check
    // whether a password is valid or not
    public static void isValid(String password)
            throws InvalidPasswordException {

        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 8)
                && (password.length() <= 15))) {
            throw new InvalidPasswordException(1);
        }

        // to check space
        if (password.contains(" ")) {
            throw new InvalidPasswordException(2);
        }
        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(3);
            }
        }

        // for special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            throw new InvalidPasswordException(4);
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char) i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(5);
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 90; i <= 122; i++) {

                // type casting
                char c = (char) i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(6);
            }
        }

        // The password is valid
    }

    // Driver code
    public static boolean passwordMethod(String password) {

        String password1 = password;

        try {

            isValid(password1);
            System.out.println("Valid ****");
            return true;
        } catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }


        return false;
    }

    public static boolean UserNameChekker(String username) {




            if(Pattern.matches("[a-zA-Z]+",username))

                {
                    // Do something

                    return true;
                }else

                {
                    System.out.println("Nope, Other characters detected, name must contails only name pa.");
                    return false;
                }
    }

    public static boolean validateEmailAddress(String emailAddress) {

        Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()) {

            return true;

        } else {
            System.out.println("enter valid email id");
            return false;
        }
    }

    public static boolean validateMobileNumber(String mobileNumber) {
        Pattern regexPattern = Pattern.compile("^[6-9]{1}[0-9]{9}$");
        regMatcher   = regexPattern.matcher(mobileNumber);
        if(regMatcher.matches()) {
            return true;
        } else {
            System.out.println("ENter the phone number corretly");
            return false;
        }
    }

    private static Matcher regMatcher;
}
