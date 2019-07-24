package Behavioral.ChainOfResponsability.Exercise.ChainHandlers;

import Behavioral.ChainOfResponsability.Exercise.User;

import java.util.HashMap;
import java.util.Map;

public class AttempsHandler extends ChainHandler {
    private Map<Integer, Integer> registeredIps = new HashMap<Integer, Integer>(1, 1);
    
    @Override
    public boolean check(User user, int ip) {
        if (registeredIps.get(ip) == null) {
            registeredIps.put(ip, 1);
            return checkNext(user, ip);
        } else if (registeredIps.get(ip) < 3) {
            int temp = registeredIps.get(ip);
            registeredIps.replace(ip, ++temp);
            return checkNext(user, ip);
        } else {
            return false;
        }
    }
}
