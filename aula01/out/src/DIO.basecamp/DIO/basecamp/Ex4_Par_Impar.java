package DIO.basecamp;

import java.util.Scanner;

public class Ex4_Par_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtndNumeros;
        int numero;
        int qtndPares = 0, qtndImpares = 0;
        System.out.println("Quantidade de numeros...");
        qtndNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            count++;
        } while(count < qtndNumeros);

        System.out.println("Quantidade Par: " + qtndPares);
        System.out.println("Quantidade Ímpar: " + qtndImpares);
    }
}
