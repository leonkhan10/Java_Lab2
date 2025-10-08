package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        Status condition = att.getCondition();
        if (condition == Status.BURN || condition == Status.POISON || condition == Status.PARALYZE) {
            return super.calcBaseDamage(att, def) * 2;
        }
        return super.calcBaseDamage(att, def);
    }

    @Override
    protected String describe() {
        return "uses Facade";
    }
}