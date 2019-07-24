package Behavioral.ChainOfResponsability.Exercise;

import Behavioral.ChainOfResponsability.Exercise.ChainHandlers.ChainHandler;

import java.util.ArrayList;
import java.util.List;

public class App {
    private ChainHandler middleware;
    private List<User> userList = new ArrayList<>();
    
    public void addUser(User user) {
        userList.add(user);
    }
    
    public void setMiddleware(ChainHandler chainHandler) {
        middleware = chainHandler;
    }
    
    public void logIn(User user, int ipAddress) {
        boolean response = middleware.check(user, ipAddress);
        System.out.println("Login response = " + response);
    }
}
