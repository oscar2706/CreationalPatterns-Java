package Behavioral.ChainOfResponsability.Example.ChainHandlers;

import Behavioral.ChainOfResponsability.Example.Argument;
import Behavioral.ChainOfResponsability.Example.Creature;
import Behavioral.ChainOfResponsability.Example.Game;

public class IncreasedDefenseModifier extends CreatureModifier {
    
    public IncreasedDefenseModifier(Game game, Creature creature) {
        super(game, creature);
        
        game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name) && q.argument == Argument.DEFENSE) {
                q.result += 3;
            }
        });
    }
}
