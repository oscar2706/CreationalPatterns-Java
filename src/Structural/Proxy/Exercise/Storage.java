package Structural.Proxy.Exercise;

import java.util.List;

public interface Storage {
    List<UserData> getAllUsers();
    List<String> getUsernames();
    List<String> getAddresses();
    List<UserData> getUsersWithNameLike(String searchedName);
    List<UserData> getUsersWithAge(int age);
    void insertUser(UserData userData);
}
