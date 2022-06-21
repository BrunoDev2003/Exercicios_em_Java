package DIO.basecamp;

public class Ex1_array_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Vetor: ");
        int count =0;
        while(count < (vetor.length-1)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length-1); i == 0; i--) {
            System.out.print(vetor[count] + " ");
        }
    }
}
