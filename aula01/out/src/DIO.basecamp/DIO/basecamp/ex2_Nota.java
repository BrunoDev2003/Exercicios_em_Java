package DIO.basecamp;

import java.util.Scanner;

public class ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota <0 | nota > 10) {
            System.out.println("Nota Inválida! tente de novo: ");
            nota = scan.nextInt();
        }
    }
}
