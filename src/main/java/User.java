public class User {
    String name;
    String lastName;
    Integer age;

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + "\n";
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

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


}
