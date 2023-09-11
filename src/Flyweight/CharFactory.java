package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharFactory {

    private static Map<Character, CharacterFlyweight> flyweight = new HashMap<>();

    public static CharacterFlyweight getFlyweight(char c){
        CharacterFlyweight retorno;

        if(flyweight.get(c) == null){
            retorno = new CharacterFlyweight(c);
            flyweight.put(c, retorno);
        }else {

            retorno = flyweight.get(c);
        }

        return retorno;
    }
}
