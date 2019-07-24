package Behavioral.ChainOfResponsability.Exercise;

import Behavioral.ChainOfResponsability.Exercise.ChainHandlers.AttempsHandler;
import Behavioral.ChainOfResponsability.Exercise.ChainHandlers.ChainHandler;
import Behavioral.ChainOfResponsability.Exercise.ChainHandlers.PasswordHandler;
import Behavioral.ChainOfResponsability.Exercise.ChainHandlers.PermissionHandler;

import java.lang.reflect.Array;

public class Demo {
    public static void main(String[] args) {
        ChainHandler chainHandler = new AttempsHandler();
        chainHandler.linkWith(new PasswordHandler());
        String[] allowedNames = {"Oscar", "Juan"};
        chainHandler.linkWith(new PermissionHandler(allowedNames));
        App app = new App();
        app.setMiddleware(chainHandler);
        app.logIn(new User("Juan", "bananas"), 192);
        app.logIn(new User("Juan", "bananas"), 192);
        app.logIn(new User("Juan", "banana"), 192);
        app.logIn(new User("Juan", "bananas"), 192);
        app.logIn(new User("Juan", "banana"), 192);
    }
}
