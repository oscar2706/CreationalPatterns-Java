package Behavioral.ChainOfResponsability.Exercise;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<String, User> userMap = new HashMap<>();
    
    public static boolean logIn(String name, String password) {
        userMap.put("Oscar", new User("Oscar", "123"));
        userMap.put("Juan", new User("Juan", "banana"));
        userMap.put("Leonardo", new User("Leonardo", "contraseña"));
        userMap.put("David", new User("David", "pass"));
        userMap.put("Luis", new User("Luis", "Luis"));
        User user = userMap.get(name);
        if (userMap.get(name) != null) {
            if (user.getPassword() == password)
                return true;
            else
                return false;
        } else
            return false;
    }
}
