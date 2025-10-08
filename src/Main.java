import ru.ifmo.se.pokemon.Battle;
import pokemons.*;

public class Main {
    public static void main(String[] args) {

        Battle b = new Battle();

        Raichu chuzhoi = new Raichu("Чужой", 50);
        Sharpedo khishchnik = new Sharpedo("Хищник", 50);

        b.addAlly(chuzhoi);
        b.addFoe(khishchnik);

        b.go();


//        Battle b = new Battle();
//
//        Rotom rotom = new Rotom("Rotom", 1);
//        Sharpedo sharpedo = new Sharpedo("Sharpedo", 1);
//        Pikachu pikachu = new Pikachu("Pikachu", 1);
//
//        Carvanha carvanha = new Carvanha("Carvanha", 1);
//        Picho picho = new Picho("Picho", 1);
//        Raichu raichu = new Raichu("Raichu", 1);
//
//        b.addAlly(rotom);
//        b.addAlly(sharpedo);
//        b.addAlly(pikachu);
//
//        b.addFoe(carvanha);
//        b.addFoe(picho);
//        b.addFoe(raichu);
//
//        b.go();


    }
}