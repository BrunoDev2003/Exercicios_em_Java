package DIO;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
        String nome;
        while(true) {
            System.out.println("Nome: "); 
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: "); 
            scan.nextInt();
        }
    }

    System.out.println("Continua aqui...");
}

}


