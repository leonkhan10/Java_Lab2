package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.Swagger;
import attacks.Facade;
import attacks.Rest;
import attacks.Thunderbolt;

public class Rotom extends Pokemon {
    public Rotom(String name, int level) {
        super(name, level);
        setStats(50, 50, 77, 95, 77, 91);
        setType(Type.ELECTRIC, Type.GHOST);
        addMove(new Swagger());
        addMove(new Facade());
        addMove(new Rest());
        addMove(new Thunderbolt());
    }
}