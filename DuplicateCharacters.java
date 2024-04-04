
/*Q4:Write a Java Program to find the duplicate characters in a string.*/
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = new String();
        int count;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();

        char string[] = str.toCharArray();

        System.out.println("Duplicate characters in a given string: ");

        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;

                    string[j] = '0';
                }
            }

            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}