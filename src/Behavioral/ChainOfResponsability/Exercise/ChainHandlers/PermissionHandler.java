package Behavioral.ChainOfResponsability.Exercise.ChainHandlers;

import Behavioral.ChainOfResponsability.Exercise.BD;
import Behavioral.ChainOfResponsability.Exercise.User;
import Structural.Proxy.Exercise.DB;

public class PermissionHandler extends ChainHandler {
    private String[] allowedUserNames;
    
    public PermissionHandler(String[] allowedUserNames) {
        this.allowedUserNames = allowedUserNames;
    }
    
    @Override
    public boolean check(User user, int ip) {
        if (nameInArray(user.getName())) {
            return checkNext(user, ip);
        }
        else
            return false;
    }
    
    private boolean nameInArray(String name) {
        for (String i : allowedUserNames) {
            if (i == name)
                return true;
        }
        return false;
    }
}
