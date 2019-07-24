package Behavioral.ChainOfResponsability.Example;

import Behavioral.ChainOfResponsability.Example.ChainHandlers.DoubleAttackModifier;
import Behavioral.ChainOfResponsability.Example.ChainHandlers.IncreasedDefenseModifier;

public class BrokerChainDemo {
    public static void main(String[] args) {
        Game game = new Game();
        Creature goblin = new Creature(game, "Strong Goblin", 2, 2);
        System.out.println(goblin);
        
        // modifiers can be piled up
        IncreasedDefenseModifier defenseModifier = new IncreasedDefenseModifier(game, goblin);
        DoubleAttackModifier attackModifier = new DoubleAttackModifier(game, goblin);
        DoubleAttackModifier attackModifier2 = new DoubleAttackModifier(game, goblin);
        System.out.println(goblin);
    }
}
