package attacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {

        p.setMod(Stat.HP, (int) -(p.getStat(Stat.HP) - p.getHP()));

        p.setCondition(new Effect().condition(Status.SLEEP).turns(2));
    }

    @Override
    protected String describe() {
        return "uses Rest and falls asleep to restore its health";
    }
}