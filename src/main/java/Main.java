import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static UserDao userDao = new UserDao();
    static UserRoleDao userRoleDao = new UserRoleDao();

    public static void createUser() {
        String name, lastName, role;
        Integer age;

        System.out.println("Enter name");
        name = scanner.next();
        System.out.println("Enter last name");
        lastName = scanner.next();
        System.out.println("Enter age");
        age = scanner.nextInt();
        System.out.println("Enter user role(USER/MODERATOR/ADMIN)");
        role = scanner.next();

        User user = new User(name, lastName, age, new UserRole(Role.valueOf(role)));
        userDao.createUser(user);
        System.out.println("You created a user " + user.toString());
        userDao.getLastInsertId();
    }

    public static void deleteUser() {
        Integer id;
        System.out.println("Enter id user to delete ");
        id = scanner.nextInt();
        System.out.print("You deleted ");
        userDao.getUserById(id);
        userDao.deleteUserById(id);
    }

    public static void updateUser() {
        String name, lastName, role;
        Integer age, id;
        System.out.println("Enter id to update");
        id = scanner.nextInt();
        userDao.getUserById(id);
        System.out.println("Enter new name");
        name = scanner.next();
        System.out.println("Enter new lastname");
        lastName = scanner.next();
        System.out.println("Enter new age");
        age = scanner.nextInt();
        System.out.println("Enter new user role");
        role = scanner.next();

        User user = new User(id, name, lastName, age, new UserRole(Role.valueOf(role)));
        userDao.updateUserById(user);

    }

    public static void main(String[] args) {
        System.out.println("User roles " + userRoleDao.getAllUserRoles());
        createUser();
        updateUser();
        deleteUser();
        System.out.println(userDao.getAllUsers());

    }


    /**public static void calculator(){
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
     **/
}
