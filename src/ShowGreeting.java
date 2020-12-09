import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
