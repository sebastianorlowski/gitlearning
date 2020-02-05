public class User {
    private Integer id;
    private String name;
    private String lastName;
    private Integer age;
    private UserRole userRole;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public User(Integer id,String name, String lastName, Integer age, UserRole userRole) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.userRole = userRole;
    }

    public User(Integer id,String name, String lastName, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String name, String lastName, Integer age, UserRole userRole) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
