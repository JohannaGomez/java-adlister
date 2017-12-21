import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
//    Create a class named MySQLAdsDao that implements the Ads interface
//
//    This class should have a private instance property named connection of type Connection that is initialized in the constructor.
//    Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials.
//    implement the methods in the Ads interface
//    your methods should retrieve ads from the database and insert new ads into the database


////        Config config = new Config();
////        DriverManager.registerDriver(new Driver());
//        Connection connection = DriverManager.getConnection(
//                config.getUrl(),
//                config.getUser(),
//                config.getPassword()
//        );

    private Connection connection;
    List<Ad> ads = null;


    public MySQLAdsDao(Config config) throws SQLException {

        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    // get a list of all the ads

    @Override
    public List<Ad> all() {
        try {
            String selectQuery = "SELECT * FROM ads";

            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                Ad ad = new Ad(rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description"));
                ads.add(ad);
            }
        } catch (SQLException e){

        }

        return ads;
    }




    // insert a new ad and return the new ad's id
    @Override
    public Long insert(Ad ad){
        try {
            String query = "INSERT INTO ads (user_id, title, description) VALUES ('" + ad + "');";

            Statement stmt = connection.createStatement();

            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);


        } catch (SQLException e){

        }

        return null;
    }
}


