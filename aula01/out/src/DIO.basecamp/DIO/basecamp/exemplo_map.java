package DIO.basecamp;

import java.util.HashMap;
import java.util.Map;
public class exemplo_map {
    public static void main(String[] args) {
        System.out.println("Dado os modelos dos carros e seus respevtibosd consumos na estrada, faça um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("substitua o consumo do gol por 15.2 km/l");
        carrosPopulares.put("gol,", 15.2);
    }
}
