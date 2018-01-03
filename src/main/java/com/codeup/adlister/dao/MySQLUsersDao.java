package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {

//    Create a class named MySQLUsersDao that implements Users. Add functionality to the DaoFactory class
//    to return an instance of the users data access object.

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }

    }



    @Override
    public User findByUsername(String username) {
        PreparedStatement stmt = null;
        try {
            String sql = "SELECT * FROM adlister_db.users WHERE username = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            if (rs.next()) {
                return new User (
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password")
                );
            }
        }catch (SQLException e) {
            throw new RuntimeException("Error retrieving user!", e);
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO adlister_db.users(username, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, user.getUsername());
            stmt.setString(2,  user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user!!!!", e);
        }
    }


}
