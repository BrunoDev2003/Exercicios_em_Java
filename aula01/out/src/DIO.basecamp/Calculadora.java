public class Calculadora {
    public static void soma(double n1, double n2) {
        double resultado = n1 + n2;

        System.out.println("a soma do " + n1 + " e " + n2 + " é igual a " + resultado);
    }    

    public static void subtracao(double n1, double n2) {
        double resultado = n1 - n2;

        System.out.println("a subtracao do " + n1 + " e " + n2 + " é igual a " + resultado);
    }

    public static void multiplicacao(double n1, double n2) {
        double resultado = n1 * n2;

        System.out.println("a multiplicacao do " + n1 + " e " + n2 + " é igual a " + resultado);
    }

    public static void divisao(double n1, double n2) {
        double resultado = n1 / n2;

        System.out.println("a divisao do " + n1 + " e " + n2 + " é igual a " + resultado);
    }
}
