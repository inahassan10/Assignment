import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your password: ");
        String password = input.nextLine();
        boolean longCheck = false;
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        if (password.length() >= 8) {
            longCheck = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper = true;
            else if (ch >= 'a' && ch <= 'z')
                lower = true;
            else if (ch >= '0' && ch <= '9')
                digit = true;
            else
                special = true;
        }
        if (longCheck && upper && lower && digit && special) {
            System.out.println("your password is strong");
        } else {
            System.out.println("your password is weak");
            if (!longCheck)
                System.out.println(" your password must at least 8 characters");
            if (!upper)
                System.out.println(" your password must at least one uppercase letter");
            if (!lower)
                System.out.println(" your password must at least one lowercase letter");
            if (!digit)
                System.out.println(" your password must at least one number (0 to 9)");
            if (!special)
                System.out.println(" your password must at least one special character");
        }

    }
}