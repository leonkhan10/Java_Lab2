package pokemons;

import attacks.Spark;

public class Pikachu extends Picho {
    public Pikachu(String name, int level) {
        super(name, level);
        setStats(35, 55, 40, 50, 50, 90);
        addMove(new Spark());
    }
}