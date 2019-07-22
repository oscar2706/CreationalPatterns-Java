package Structural.Proxy.Exercise;

import java.util.ArrayList;
import java.util.List;

public class DB implements Storage {
    List<UserData> registeredUsers = new ArrayList<>();
    
    @Override
    public List<UserData> getAllUsers() {
        return registeredUsers;
    }
    
    @Override
    public List<String> getUsernames() {
        if (registeredUsers.isEmpty())
            return null;
        List<String> names = new ArrayList<>();
        for (UserData user : registeredUsers) {
            names.add(user.getName());
        }
        return names;
    }
    
    @Override
    public List<String> getAddresses() {
        if (registeredUsers.isEmpty())
            return null;
        List<String> addresses = new ArrayList<>();
        for (UserData user : registeredUsers) {
            addresses.add(user.getAddress());
        }
        return addresses;
    }
    
    @Override
    public List<UserData> getUsersWithNameLike(String searchedName) {
        if (registeredUsers.isEmpty())
            return null;
        List<UserData> users = new ArrayList<>();
        for (UserData user : registeredUsers) {
            if (user.getName().contains(searchedName))
                users.add(user);
        }
        return users;
    }
    
    @Override
    public List<UserData> getUsersWithAge(int age) {
        if (registeredUsers.isEmpty())
            return null;
        List<UserData> users = new ArrayList<>();
        for (UserData user : registeredUsers) {
            if (user.getAge() == age)
                users.add(user);
        }
        return users;
    }
    
    @Override
    public void insertUser(UserData userData) {
        registeredUsers.add(userData);
    }
}
