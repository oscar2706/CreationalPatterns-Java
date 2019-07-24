package Behavioral.ChainOfResponsability.Exercise.ChainHandlers;

import Behavioral.ChainOfResponsability.Exercise.User;

public abstract class ChainHandler {
    private ChainHandler next;
    
    public ChainHandler linkWith(ChainHandler next) {
        this.next = next;
        return next;
    }
    
    public abstract boolean check(User user, int ip);
    
    protected boolean checkNext(User user, int ip) {
        if (next == null)
            return true;
        return next.check(user, ip);
    }
}
