package DIO.basecamp;

public class quadrilatero {
    public static void area(double lado) {

        System.out.println("a area é igual a" + lado + lado);

    }

    public static void area(double lado1, double lado2) {

        System.out.println("a area do rentangulo: " + lado1 + lado2);

    }

    public static void area(double baseMenor, double baseMaior, double altura) {

        System.out.println("a area do trapézio:" + ((baseMenor + baseMaior)*altura)/ 2);
    }
}
