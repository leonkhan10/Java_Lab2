package pokemons;

import ru.ifmo.se.pokemon.Type;
import attacks.ChargeBeam;

public class Raichu extends Pikachu {
    public Raichu(String name, int level) {
        super(name, level);
        setStats(60, 90, 55, 90, 80, 110);
        addMove(new ChargeBeam());
    }
}