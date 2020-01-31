import java.util.Scanner;
public class Main {

    public static void calculator(){
        Integer x,y;
        System.out.println("Podaj dwie liczby ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(Calculator.addNumbers(x,y));
        System.out.println(Calculator.substractNumbers(x,y));
        System.out.println(Calculator.divineNumbers(x,y));
        System.out.println(Calculator.multiplyNumbers(x,y));
    }

    public static void user() {
        String x,y;
        Integer z;
        System.out.println("Podaj swoje dane");
        x = scanner.next();
        y = scanner.next();
        z = scanner.nextInt();
        User user = new User(x,y,z);
        System.out.println(user);

    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       calculator();
       user();

    }
}
