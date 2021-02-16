//@talhakeskin
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        rot13(input().trim());
    }

    // Accepts input from user.
    public static String input() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void rot13(String text) {
        String[] arr = (text.toLowerCase()).split(" ");
        String temp = "";
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length(); j++) {
                if((int)(arr[i].charAt(j) - 97) < 0 || (int)(arr[i].charAt(j) - 97) > 26) {
                    temp += arr[i].charAt(j); // the same ch.
                    continue;
                }

                if((int)(arr[i].charAt(j) - 97) < 13) {
                    temp += (char)((int)(arr[i].charAt(j)) + 13);
                } else {
                    temp += (char)((int)(arr[i].charAt(j)) - 13);
                }
            }

            arr[i] = temp;
            temp = "";
        }

        for(int i = 0; i < arr.length; i++) {
            temp += arr[i] + " ";
        }

        temp = temp.trim();
        System.out.println(temp);
    }
}