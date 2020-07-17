import java.util.Scanner;

/* super simple chat bot.*/
public class Eliza {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        str = scanner.nextLine();
        System.out.println("Nice to meet you, " + str);

    }

}
