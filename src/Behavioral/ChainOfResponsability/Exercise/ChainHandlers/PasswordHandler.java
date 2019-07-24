package Behavioral.ChainOfResponsability.Exercise.ChainHandlers;

import Behavioral.ChainOfResponsability.Exercise.BD;
import Behavioral.ChainOfResponsability.Exercise.User;

public class PasswordHandler extends ChainHandler {
    @Override
    public boolean check(User user, int ip) {
        if (BD.logIn(user.getName(), user.getPassword()))
            return checkNext(user, ip);
        else
            return false;
    }
}
