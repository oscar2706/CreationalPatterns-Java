package Structural.Proxy.Exercise;

import java.util.List;

public class Application implements Storage {
    private Storage db = new DB();
    public int solicitedQueries = 0;
    public int insertedUsers = 0;
    
    @Override
    public List<UserData> getAllUsers() {
        ++solicitedQueries;
        return db.getAllUsers();
    }
    
    @Override
    public List<String> getUsernames() {
        ++solicitedQueries;
        return db.getUsernames();
    }
    
    @Override
    public List<String> getAddresses() {
        ++solicitedQueries;
        return db.getAddresses();
    }
    
    @Override
    public List<UserData> getUsersWithNameLike(String searchedName) {
        ++solicitedQueries;
        return db.getUsersWithNameLike(searchedName);
    }
    
    @Override
    public List<UserData> getUsersWithAge(int age) {
        ++solicitedQueries;
        return db.getUsersWithAge(age);
    }
    
    @Override
    public void insertUser(UserData userData) {
        db.insertUser(userData);
        ++insertedUsers;
    }
    
    @Override
    public String toString() {
        return "Application{" + " solicitedQueries=" + solicitedQueries + ", insertedUsers=" + insertedUsers + '}';
    }
}
