package DIO.basecamp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class exercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "5", "8", "9", "10");

        System.out.println("Imprima todos os numeros dessa lista de strings: "); 

        numerosAleatorios.stream().forEach(new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println(s);
        }   
        });

        numerosAleatorios.stream() 
        .map(new Function<String, Integer>() {

            @Override
            public Integer apply(String t) {
                return Integer.parseInt(t);
            }
            
        });
    }
}
