package DIO.basecamp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
        System.out.println(carrosPopulares); 

        System.out.println("confira se o modelo tuscson está no dicionário" + carrosPopulares.containsKey("gol"));

        System.out.println("Exiba o consumo do uno:" + carrosPopulares.get("uno"));


        System.out.println("exibe os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos); 

        System.out.println("Exiba o modelo mais econômico e seu consumos: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); 
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); 
        String modeloMaisEficiente ="";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) 
            modeloMaisEficiente = entry.getKey();
        }

        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
    }
}
