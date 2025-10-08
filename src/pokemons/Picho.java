package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.Facade;
import attacks.Rest;

public class Picho extends Pokemon {
    public Picho(String name, int level) {
        super(name, level);
        setStats(20, 40, 15, 35, 35, 60);
        setType(Type.ELECTRIC);
        addMove(new Facade());
        addMove(new Rest());
    }
}