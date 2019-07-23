package Structural.Proxy.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Application implements Storage {
    private Storage db = new DB();
    public int solicitedQueries = 0;
    public int insertedUsers = 0;
    private List<UserData> userDataCache = new ArrayList<>();
    
    @Override
    public List<UserData> getAllUsers() {
        return userDataCache;
    }
    
    @Override
    public List<String> getUsernames() {
        if (userDataCache.isEmpty())
            return null;
        List<String> names = new ArrayList<>();
        for (UserData user : userDataCache) {
            names.add(user.getName());
        }
        return names;
    }
    
    @Override
    public List<String> getAddresses() {
        if (userDataCache.isEmpty())
            return null;
        List<String> addresses = new ArrayList<>();
        for (UserData user : userDataCache) {
            addresses.add(user.getAddress());
        }
        return addresses;
    }
    
    @Override
    public List<UserData> getUsersWithNameLike(String searchedName) {
        if (userDataCache.isEmpty())
            return null;
        List<UserData> users = new ArrayList<>();
        for (UserData user : userDataCache) {
            if (user.getName().contains(searchedName))
                users.add(user);
        }
        return users;
    }
    
    @Override
    public List<UserData> getUsersWithAge(int age) {
        if (userDataCache.isEmpty())
            return null;
        List<UserData> users = new ArrayList<>();
        for (UserData user : userDataCache) {
            if (user.getAge() == age)
                users.add(user);
        }
        return users;
    }
    
    @Override
    public void insertUser(UserData userData) {
        db.insertUser(userData);
        ++insertedUsers;
        userDataCache = db.getAllUsers();
        ++solicitedQueries;
    }
    
    @Override
    public String toString() {
        return "Application{" + " solicitedQueries=" + solicitedQueries + ", insertedUsers=" + insertedUsers + '}';
    }
}
