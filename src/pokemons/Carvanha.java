package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.DarkPulse;
import attacks.Crunch;
import attacks.Snarl;

public class Carvanha extends Pokemon {
    public Carvanha(String name, int level) {
        super(name, level);
        setStats(45, 90, 20, 65, 20, 65);
        setType(Type.WATER, Type.DARK);
        addMove(new DarkPulse());
        addMove(new Crunch());
        addMove(new Snarl());
    }
}