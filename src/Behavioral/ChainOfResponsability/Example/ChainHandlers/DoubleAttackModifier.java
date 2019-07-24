package Behavioral.ChainOfResponsability.Example.ChainHandlers;

import Behavioral.ChainOfResponsability.Example.Argument;
import Behavioral.ChainOfResponsability.Example.Creature;
import Behavioral.ChainOfResponsability.Example.Game;

public class DoubleAttackModifier extends CreatureModifier implements AutoCloseable {
    private int token;
    
    public DoubleAttackModifier(Game game, Creature creature) {
        super(game, creature);
        
        token = game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name) && q.argument == Argument.ATTACK) {
                q.result *= 2;
            }
        });
    }
    
    @Override // commented out exception
    public void close() /*throws Exception*/ {
        game.queries.unsubscribe(token);
    }
}
