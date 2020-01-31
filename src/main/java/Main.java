import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer x,y;
        System.out.println("Podaj dwie liczby ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(Calculator.addNumbers(x,y));
        System.out.println(Calculator.substractNumbers(x,y));
    }
}
