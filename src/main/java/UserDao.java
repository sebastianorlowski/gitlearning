import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserDao {
    private Connection connection;
    private final String databaseName = "ludzie";
    private final String tableName = "czlowieki";
    private final String user = "root";
    private final String password = "respeck";

    public UserDao() {
        init();
    }

    private void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/" + databaseName + "?" +
                    " useSSL=false", user, password);
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new LinkedList<User>();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            String query = "select * from " + tableName;
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("lastname");
                Integer age = resultSet.getInt("age");

                User user = new User(name, lastName, age);
                users.add(user);
            }


        statement.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
        }

        public void createUser(User user) {
            PreparedStatement statement;

            try{
                String query = "insert into " + tableName + " (name, lastname, age) values(?, ?," +
                        "?)";
                statement = connection.prepareStatement(query);
                statement.setString(1, user.getName());
                statement.setString(2, user.getLastName());
                statement.setInt(3, user.getAge());
                statement.execute();

                statement.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

