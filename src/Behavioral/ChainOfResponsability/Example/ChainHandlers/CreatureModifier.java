package Behavioral.ChainOfResponsability.Example.ChainHandlers;

import Behavioral.ChainOfResponsability.Example.Creature;
import Behavioral.ChainOfResponsability.Example.Game;

public class CreatureModifier { // protected, not private!
    protected Game game;
    protected Creature creature;
    
    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }
}
