import java.util.Scanner;

public class counter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = input.nextLine();
            int uppercase = 0;
            int lowercase = 0;
            int digits = 0;
            int special = 0;
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    uppercase++;
                }
                else if (ch >= 'a' && ch <= 'z') {
                    lowercase++;
                }
                else if (ch >= '0' && ch <= '9') {
                    digits++;
                }
                else if (ch != ' ') {
                    special++;
                }
            }
            System.out.println("Uppercase letters: " + uppercase);
            System.out.println("Lowercase letters: " + lowercase);
            System.out.println("Digits: " + digits);
            System.out.println("Special characters: " + special);
        }

}